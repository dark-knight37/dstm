package org.prgmdl.dstmverifier.data;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;

import DSTM4Rail.exceptions.Violation;

public abstract class AbstractAnalyser extends DepthFirstAdapter {
	/**
	 * It contains the list of the semantic violations
	 */
	protected Vector<Violation> violations = new Vector<Violation>();
	
	/**
	 * List of violations getter method 
	 * @return list of violations
	 */
	public Vector<Violation> getViolations() {
		return this.violations;
	}
}
