package org.prgmdl.dstmverifier.transition.condition;

import java.io.IOException;

import org.prgmdl.dstmverifier.transition.condition.lexer.LexerException;
import org.prgmdl.dstmverifier.transition.condition.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public interface ConditionVerifier {
	/**
	 * This method verifies the validity of the condition string.
	 * @param trans instance of a concrete class implementing the Transition interface related to the transition whose condition is to verify
	 * @param model instance of a concrete class implementing the DSTM interface related to the model verify and transform
	 * @param declarations PushbackReader containing the set of the declarations of datatypes and variables
	 * @return true if the operation ends correctly (without errors), false otherwise
	 * @throws ParserException an exception due to grammatical mistakes
	 * @throws LexerException an exception due to lexical mistakes
	 * @throws ConstraintException an exception due to violations of some constraints as: undeclared variable, type mismatching, etc.
	 * @author Stefano Marrone
	 */
	public boolean verifyCondition(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException; 
}