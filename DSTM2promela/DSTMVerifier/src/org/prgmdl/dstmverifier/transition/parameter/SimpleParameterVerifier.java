package org.prgmdl.dstmverifier.transition.parameter;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import org.eclipse.emf.common.util.EList;
import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.DTTHandler;
import org.prgmdl.dstmverifier.transition.parameter.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.parameter.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.parameter.node.Start;
import org.prgmdl.dstmverifier.transition.parameter.parser.Parser;
import org.prgmdl.dstmverifier.transition.parameter.parser.ParserException;

import DSTM4Rail.Box;
import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.GenericViolation;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.exceptions.Violation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.PBFactory;

public class SimpleParameterVerifier implements ParameterVerifier {

	@Override
	public boolean verifyParameterAssignment(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException {
		boolean retval = true;
		EList<String> assigns = trans.getPar_instantiation();
		Violation v = null;
		if (assigns != null) {
			if (!assigns.isEmpty()) {
				// The target of the transition must be a box
				Vertex destination = trans.getDestination();
				if (destination instanceof Box) {
					// Getting the list of the lists of the parameters
					Box box = (Box) destination;
					EList<Machine> machines = box.getInstantiation();
					if (machines.size() == assigns.size()) {
						// Creation of the data handler
						DataToTransition dataHandler = null;
						try {
							dataHandler = DTTHandler.DTTFactory(PBFactory.getPBR());
						} catch (Exception e) {
							e.printStackTrace();
						}

						Start ast = null;
						int i = 0;
						while ((i<assigns.size()) && (retval)) {
							String tempPA = assigns.get(i);
							if (tempPA != null) {
								if (!tempPA.equals("")) {
									StringReader ca = new StringReader(tempPA);
									PushbackReader a = new PushbackReader(ca);
									Lexer lexer = new Lexer(a);
									Parser parser = new Parser(lexer);
									try {
										ast = parser.parse();
									} catch (ParserException e) {
										throw new ParsingException(e.getMessage());
									} catch (LexerException e) {
										throw new LexingException(e.getMessage());
									}
									SimpleParameterAnalyser tpa = new SimpleParameterAnalyser(dataHandler, trans, machines.get(i));
									ast.apply(tpa);
									if (!tpa.getViolations().isEmpty()) {
										v = tpa.getViolations().elementAt(0);
										retval = false;
									}
								}
							}
							i++;
						}
					} else {
						retval = false;
						v = new GenericViolation(ViolationKind.DUMMY,"The cardinalities of the parameter instantiation list and the box list are not equals");
					}
				} else {
					retval = false;
					v = new GenericViolation(ViolationKind.DUMMY,"The transition should have as destination a Box");
				}
				if (retval == false) {
					throw new ConstraintException(v.toString());
				}
			}
		}
		return retval;
	}
}