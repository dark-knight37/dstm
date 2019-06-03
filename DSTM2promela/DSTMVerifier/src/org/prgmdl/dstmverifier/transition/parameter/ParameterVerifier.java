package org.prgmdl.dstmverifier.transition.parameter;

import java.io.IOException;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public interface ParameterVerifier {


	public boolean verifyParameterAssignment(Transition trans, DSTM model, String declarations) throws LexingException, ParsingException, ConstraintException, IOException; 
}