package org.prgmdl.dstmverifier.transition.action;

import java.io.IOException;

import org.prgmdl.dstmverifier.transition.action.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.action.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public interface ActionVerifier {
	/**
	 * This method verifies the validity of the action strings.
	 * @param trans instance of a concrete class implementing the Transition interface related to the transition whose actions are to verify
	 * @param model instance of a concrete class implementing the DSTM interface related to the model verify and transform
	 * @param declarations PushbackReader containing the set of the declarations of datatypes and variables
	 * @return true if the operation ends correctly (without errors), false otherwise
	 * @throws ParserException an exception due to grammatical mistakes
	 * @throws LexerException an exception due to lexical mistakes
	 * @throws ConstraintException an exception due to violations of some constraints as: undeclared variable, type mismatching, etc.
	 * @author Stefano Marrone
	 * @throws transition.action.parser.ParserException 
	 * @throws org.prgmdl.dstmverifier.transition.action.lexer.LexerException 
	 */
	public boolean verifyActions(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException,IOException; 
}
