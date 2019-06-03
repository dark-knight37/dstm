package org.prgmdl.dstmverifier;

import java.io.IOException;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public interface DSTMVerifier {
	public boolean verify(DSTM dstm, String dataSpecifications) throws LexingException, ParsingException, ConstraintException, IOException; 
}
