package org.prgmdl.dstmverifier.transition.trigger;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.DTTHandler;
import org.prgmdl.dstmverifier.transition.trigger.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.trigger.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.trigger.node.Start;
import org.prgmdl.dstmverifier.transition.trigger.parser.Parser;
import org.prgmdl.dstmverifier.transition.trigger.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.exceptions.Violation;
import DSTM4Rail.utilities.PBFactory;

public class SimpleTriggerVerifier implements TriggerVerifier {

	@Override
	public boolean verifyTrigger(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException {
		boolean retval = true;
		if (trans.getTrigger() != null) {
			if (!trans.getTrigger().equals("")) {
				retval = false;
				
				DataToTransition dataHandler = null;
				try {
					dataHandler = DTTHandler.DTTFactory(PBFactory.getPBR());
				} catch (org.prgmdl.dstmverifier.data.parser.ParserException e) {
					e.printStackTrace();
				} catch (org.prgmdl.dstmverifier.data.lexer.LexerException e) {
					e.printStackTrace();
				}
				
				// Parsing of the trigger
				StringReader ca = new StringReader(trans.getTrigger());
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

				SimpleTriggerAnalyser sta = new SimpleTriggerAnalyser(dataHandler, trans);
				ast.apply(sta);

				if (!sta.getViolations().isEmpty()) {
					Violation v = sta.getViolations().elementAt(0);
					throw new ConstraintException(v.toString());
				} else {
					retval = true;
				}
			}
		}
		return retval;
	}
}
