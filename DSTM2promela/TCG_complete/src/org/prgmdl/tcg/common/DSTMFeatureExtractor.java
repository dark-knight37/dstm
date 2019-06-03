package org.prgmdl.tcg.common;

import java.util.Vector;

import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;

public class DSTMFeatureExtractor {

	public static Vector<Transition> getTransitions(DSTM d) {
		Vector<Transition> retval = new Vector<Transition>();
		for (Machine machine : d.getMachines()) {
			for (Transition trans : machine.getTransitions()) {
				retval.add(trans);
			}			
		}
		return retval;
	}
}
