package org.prgmdl.dstmverifier;

import java.io.IOException;

import org.prgmdl.dstmverifier.data.SimpleDataVerifier;
import org.prgmdl.dstmverifier.model.Validator;
import org.prgmdl.dstmverifier.transition.action.SimpleActionVerifier;
import org.prgmdl.dstmverifier.transition.condition.SimpleConditionVerifier;
import org.prgmdl.dstmverifier.transition.parameter.SimpleParameterVerifier;
import org.prgmdl.dstmverifier.transition.trigger.SimpleTriggerVerifier;

import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public class SimpleDSTMVerifier implements DSTMVerifier {

	/**
	 * When true, debug information are printed on the console
	 */
	private boolean verbose;

	/**
	 * Constuctor with arguments
	 * @param verboseFlag it  
	 */
	public SimpleDSTMVerifier(boolean verboseFlag) {
		this.verbose = verboseFlag;
	}

	/**
	 * Default constuctor
	 */
	public SimpleDSTMVerifier() {
		this.verbose = false;
	}

	@SuppressWarnings("resource")
	public boolean verify(DSTM dstm, String dataSpecification) throws LexingException, ParsingException, ConstraintException, IOException {
		boolean retval = false;
		// Data Specification
		SimpleDataVerifier proxyD = new SimpleDataVerifier();
		this.debug("Data -- " + proxyD.verifyData(dataSpecification));
		// Model
		Validator proxyM = new Validator();
		this.debug("Model -- " + proxyM.verifyModel(dstm));

		// Loop on transitions
		retval = false;
		boolean callFlag = false;
		for (Machine machine : dstm.getMachines()) {
			for (Transition trans : machine.getTransitions()) {
				if(!trans.getName().equals("") && trans.getName()!=null && trans.getMachine().getName()!=null) {
					this.debug(trans.getName() + " of " + machine.getName());
					// Trigger
					SimpleTriggerVerifier proxyT = new SimpleTriggerVerifier();
					callFlag = proxyT.verifyTrigger(trans,dstm,dataSpecification);
					this.debug("\ttrigger -- " + callFlag);
					// Condition
					SimpleConditionVerifier proxyC = new SimpleConditionVerifier();
					callFlag = proxyC.verifyCondition(trans,dstm,dataSpecification);
					this.debug("\tcondition -- " + callFlag);
					// Actions
					SimpleActionVerifier proxyA = new SimpleActionVerifier();
					callFlag = proxyA.verifyActions(trans,dstm,dataSpecification);
					this.debug("\tactions -- " + callFlag);
					// Parameter Instantiation
					SimpleParameterVerifier proxyP = new SimpleParameterVerifier();
					callFlag = proxyP.verifyParameterAssignment(trans,dstm,dataSpecification);
					this.debug("\tparameter instantiation -- " + callFlag);
				}			
			}
		}
		retval = true;
		return retval;
	}

	/**
	 * This function prints the argument on the console if the object is in the "debug" mode (i.e., verbose == true)
	 * @param s string to print
	 */
	private void debug(String s) {
		if (this.verbose == true) {
			System.out.println(s);
		}
	}
}