package org.prgmdl.dstmverifier.data;

import java.io.IOException;

import org.prgmdl.dstmverifier.data.lexer.LexerException;
import org.prgmdl.dstmverifier.data.parser.ParserException;

import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

/**
 * This interface is responsible of verifying the declaration of the types, variables and channels of the model inserted by means of a text.
 * @author Stefano Marrone
 */
public interface DataVerifier {
	
	/**
	 * This method verifies the declaration of the types, variables and channels of the model inserted by means of a text.
	 * @param declarations PushbackReader containing the text to verify
	 * @return true if the operation ends correctly (without errors), false otherwise
	 * @throws ParserException an exception due to grammatical mistakes
	 * @throws LexerException an exception due to lexical mistakes
	 * @throws ConstraintException an exception due to violations of some constraints as: undefined type, variable redefinition, type redefinition, etc.
	 * @throws IOException an exception due to missing or unreachable file system resource
	 * @author Stefano Marrone
	 * @throws LexingException 
	 * @throws ParsingException 
	 */
	public boolean verifyData(String declarations) throws LexingException, ParsingException, ConstraintException, IOException; 

}
