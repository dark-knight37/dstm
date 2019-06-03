package org.prgmdl.merge;

import java.io.IOException;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

/**
 * This interface is responsible of verifying the constraints a DSTM model must fulfill before acting the model transformations to Promela
 * @author Stefano Marrone
 */
public interface ModelMerge {
	/**
	 * ... 
	 * @author Stefano Marrone
	 * @throws IOException 
	 * @throws LexerException 
	 * @throws ParserException 
	 * @throws ConstraintException 
	 */
	public DSTM mergeModel(DSTM model, String declarations) throws LexingException, ParsingException, IOException; 
}