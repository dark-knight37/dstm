package org.prgmdl.dstmverifier.transition.action;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.DTTHandler;
import org.prgmdl.dstmverifier.transition.action.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.action.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.action.node.Start;
import org.prgmdl.dstmverifier.transition.action.parser.Parser;
import org.prgmdl.dstmverifier.transition.action.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.exceptions.Violation;
import DSTM4Rail.utilities.PBFactory;

public class SimpleActionVerifier implements ActionVerifier {

	@Override
	public boolean verifyActions(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException{
		boolean retval = true;
		if (trans.getActions() != null) {
			if (!trans.getActions().isEmpty()) {
				DataToTransition dataHandler = null;
				try {
					dataHandler = DTTHandler.DTTFactory(PBFactory.getPBR());
				} catch (Exception e) {
					e.printStackTrace();
				}

				Start ast = null;
				int i = 0;
				Violation v = null;
				while ((i<trans.getActions().size()) && (retval)) {
					String tempAction = trans.getActions().get(i);
					if (tempAction != null) {
						if (!tempAction.equals("")) {
							StringReader ca = new StringReader(tempAction);
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
							SimpleActionAnalyser ta = new SimpleActionAnalyser(dataHandler, trans);
							ast.apply(ta);
							if (!ta.getViolations().isEmpty()) {
								v = ta.getViolations().elementAt(0);
								retval = false;
							}
						}
					}
					i++;
				}
				if (retval == false) {
					throw new ConstraintException(v.toString());
				}
			}
		}
		return retval;
	}
}

