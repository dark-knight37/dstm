package org.prgmdl.dstmverifier.transition.trigger;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.trigger.analysis.DepthFirstAdapter;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.Violation;


/**
 *
 * @author Stefano Marrone
 * @author Matilde Vassallo
 */
public class BaseTriggerAnalyser extends DepthFirstAdapter {

	protected DataToTransition dtt;

	protected String machine;

	protected Vector<Violation> violations;
	
	public BaseTriggerAnalyser(DataToTransition dtt, Transition trans) {
		this.dtt = dtt;
		this.machine = trans.getMachine().getName();
		this.violations = new Vector<Violation>();
	}

	public Vector<Violation> getViolations() {
		return this.violations;
	}
}

