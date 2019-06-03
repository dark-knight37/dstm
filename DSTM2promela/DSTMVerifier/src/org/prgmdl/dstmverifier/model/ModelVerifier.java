package org.prgmdl.dstmverifier.model;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.ConstraintException;

/**
 * 
 * @author Stefano Marrone
 */
public interface ModelVerifier {
	/**
	 * This method verifies the constraints. The prerequisite of this method is that the DSTM model is enriched with all the dataflow parts (i.e., types,
	 * variables, channels and parameters. 
	 * @param model instance of a concrete class implementing the DSTM interface related to the model verify and transform
	 * @return true if the operation ends correctly (without errors), false otherwise
	 * @throws ConstraintException an exception due to violations of constraints such as: respect of the taxonomy of transition, correct usage of boxes, etc.
	 * @author Stefano Marrone
	 */
	public boolean verifyModel(DSTM model) throws ConstraintException; 
}