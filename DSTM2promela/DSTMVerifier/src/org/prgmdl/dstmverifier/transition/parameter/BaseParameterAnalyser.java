package org.prgmdl.dstmverifier.transition.parameter;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.parameter.analysis.DepthFirstAdapter;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.Violation;


/**
 *
 * @author Stefano Marrone
 */
public class BaseParameterAnalyser extends DepthFirstAdapter {

	protected DataToTransition dtt;

	protected String machine;

	protected Vector<Violation> violations;
	
	public BaseParameterAnalyser(DataToTransition dtt, Transition trans) {
		this.dtt = dtt;
		this.machine = trans.getMachine().getName();
		this.violations = new Vector<Violation>();
	}

	public BaseParameterAnalyser(DataToTransition dtt2, String machname) {
		this.dtt = dtt2;
		this.machine = machname;
		this.violations = new Vector<Violation>();
	}

	public Vector<Violation> getViolations() {
		return this.violations;
	}
	
	public boolean addViolations(Vector<Violation> temp) {
		for (int i = 0; i < temp.size(); i++) {
			this.violations.add(temp.elementAt(i));
		}
		return temp.size() > 0;
	}
}

