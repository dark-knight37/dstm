package org.prgmdl.dstmverifier.transition.condition;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.DTTHandler;
import org.prgmdl.dstmverifier.transition.condition.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.condition.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.condition.node.Start;
import org.prgmdl.dstmverifier.transition.condition.parser.Parser;
import org.prgmdl.dstmverifier.transition.condition.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.exceptions.Violation;
import DSTM4Rail.utilities.PBFactory;

public class SimpleConditionVerifier implements ConditionVerifier {

	public boolean verifyCondition(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException{
		boolean retval = true;
		if (trans.getCondition() != null) {
			if (!trans.getCondition().equals("")) {
				retval = false;
				DataToTransition dataHandler = null;
				try {
					dataHandler = DTTHandler.DTTFactory(PBFactory.getPBR());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				// CONDITION PARSER
				StringReader ca = new StringReader(trans.getCondition());
				PushbackReader a = new PushbackReader(ca);
				Lexer lexer = new Lexer(a);
				Parser parser = new Parser(lexer);
				Start ast;
				try {
					ast = parser.parse();
				} catch (ParserException e) {
					throw new ParsingException(e.getMessage());
				} catch (LexerException e) {
					throw new LexingException(e.getMessage());
				}
				
				SimpleConditionAnalyser ta = new SimpleConditionAnalyser(dataHandler, trans);
				ast.apply(ta);

				if (!ta.getViolations().isEmpty()) {
					Violation v = ta.getViolations().elementAt(0);
					throw new ConstraintException(v.toString());
				} else {
					retval = true;
				}
			}
		}
		return retval;
	}
}
