package org.prgmdl.tcg;

import java.io.IOException;
import java.util.Vector;

import org.prgmdl.tcg.common.RequestKind;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public interface TestCaseGenerator {
	
	
	/**
	 * This method generates the test cases, in tesqel format, for the requested items
	 * 
	 * @param model
	 * DSTM model
	 * 
	 * @param data
	 * DSTM data file
	 * 
	 * @param request
	 * RequestKind.Requirements: the items are unique requirement identifiers  
	 * RequestKind.Specifications: TODO
	 * RequestKind.Transitions: the the items are unique transition identifiers 
	 * (of the form MachineName.TransitionName 
	 * 
	 * @param input
	 * list of items
	 * 
	 * @return
	 * a set of test cases
	 * 
	 * @throws LexingException
	 * @throws ParsingException
	 * @throws ConstraintException
	 * @throws IOException
	 */
	public Vector<String> generate(DSTM model, String data, RequestKind request, Vector<String> input) throws LexingException, ParsingException, ConstraintException, IOException;
	
	public Vector<String> generate(DSTM model, String data, RequestKind request) throws LexingException, ParsingException, ConstraintException, IOException;
}
