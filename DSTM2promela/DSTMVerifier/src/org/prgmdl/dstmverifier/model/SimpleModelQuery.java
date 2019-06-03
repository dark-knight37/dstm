package org.prgmdl.dstmverifier.model;

import DSTM4Rail.Box;
import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Node;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;

public class SimpleModelQuery implements ModelQuery {
	
	private DSTM model;
	
	public SimpleModelQuery(DSTM d) {
		this.model = d;
	}

	@Override
	public boolean isTransition(String machineName, String transitionName) {
		return this.internalCheck(machineName,transitionName,ModelElementKind.TRANSITION);
	}

	@Override
	public boolean isState(String machineName, String nodeName) {
		return this.internalCheck(machineName,nodeName,ModelElementKind.TRANSITION);
	}

	@Override
	public boolean isBox(String machineName,String boxName) {
		return this.internalCheck(machineName,boxName,ModelElementKind.TRANSITION);
	}
	
	private boolean internalCheck(String machineName, String itemName, ModelElementKind mek) {
		boolean retval = false;
		int mSize = this.model.getMachines().size();
		int mIndex = 0;
		while ((mIndex < mSize) && (!retval)) {
			Machine m = this.model.getMachines().get(mIndex);
			String actualMachineName = m.getName();
			if (actualMachineName.equals(machineName)) {
				if (mek == ModelElementKind.TRANSITION) {
					retval = this.transitionCheck(m,itemName);
				} else if (mek == ModelElementKind.NODE) {
					retval = this.stateCheck(m,itemName);
				} else if (mek == ModelElementKind.BOX) {
					retval = this.boxCheck(m,itemName);
				}
			}
			mIndex++;
		}
		return retval;

	}
	
	private boolean transitionCheck(Machine m, String itemName) {
		boolean retval = false;
		int tSize = m.getTransitions().size();
		int tIndex = 0;
		while ((tIndex < tSize) && (!retval)) {
			Transition t = m.getTransitions().get(tIndex);
			String actualTransitionName = t.getName();
			retval = actualTransitionName.equals(itemName);
			tIndex++;
		}
		return retval;
	}

	private boolean stateCheck(Machine m, String itemName) {
		boolean retval = false;
		int tSize = m.getTransitions().size();
		int tIndex = 0;
		while ((tIndex < tSize) && (!retval)) {
			Vertex v = m.getVertexes().get(tIndex);
			if (v instanceof Node) {
				String actualNodeName = v.getName();
				retval = actualNodeName.equals(itemName);
			}
			tIndex++;
		}
		return retval;
	}

	private boolean boxCheck(Machine m, String itemName) {
		boolean retval = false;
		int tSize = m.getTransitions().size();
		int tIndex = 0;
		while ((tIndex < tSize) && (!retval)) {
			Vertex v = m.getVertexes().get(tIndex);
			if (v instanceof Box) {
				String actualNodeName = v.getName();
				retval = actualNodeName.equals(itemName);
			}
			tIndex++;
		}
		return retval;
	}
}