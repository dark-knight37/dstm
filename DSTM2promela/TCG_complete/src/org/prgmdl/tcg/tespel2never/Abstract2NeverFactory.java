package org.prgmdl.tcg.tespel2never;

import java.util.Collections;
import java.util.Vector;

import org.prgmdl.tcg.common.RequestKind;
import org.prgmdl.tcg.d2p.frontend.Frontend;
import org.prgmdl.tcg.naming.NameManager;

import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;

public class Abstract2NeverFactory {
	
	//separator character, used to identify uniquely transitions, 
	//reported in the form MachineName.TransitionName
	private final char separator = '.';
	
	private Vector<String> items;
	private NameManager nm;
	
	public Abstract2NeverFactory(NameManager nm) {
		this.items = new Vector<String>();
		this.nm = nm;
	}
	
	public Abstract2Never factory(DSTM model, RequestKind request, Vector<String> input) {
		this.items.clear();
		Abstract2Never retval = null;
		switch (request) {
			case Requirements:
				if (input != null && input.size() > 0)
					for (Machine mch : model.getMachines())
						for (Transition trans : mch.getTransitions())
							for (String requirement : trans.getRequirements()) {
								if (!requirement.isEmpty() && input.contains(requirement)) {
									String newItem;
									if (this.nm != null)
										newItem = this.nm.getPMLTransitionName(mch.getName(), trans.getName());
									else
										newItem = mch.getName() + Frontend.separator + trans.getName();
									if (newItem != null && !this.items.contains(newItem))
										this.items.add(newItem);
								}
				} else {
					for (Machine mch : model.getMachines()) {
						for (Transition trans : mch.getTransitions()) {
							if (trans.getRequirements().size() > 0) {
								String newItem;
								if (this.nm != null)
									newItem = this.nm.getPMLTransitionName(mch.getName(), trans.getName());
								else
									newItem = mch.getName() + Frontend.separator + trans.getName();
								if (newItem != null && !this.items.contains(newItem))
									this.items.add(newItem);
							}
						}
					}
				}
				retval = new Cover2Never();
				break;
			case Transitions:
				if (input != null && input.size() > 0) {
					for (String s : input) {
						int indexOfPoint = s.indexOf('.');
						if (indexOfPoint > 0 && indexOfPoint < s.length()) {
						String mchName = s.substring(0, indexOfPoint);
						String transName = s.substring(s.indexOf(separator) + 1);
							if (mchName != null && mchName.length()>0 
									&& transName != null && transName.length()>0) {
								String newItem;
								if (this.nm != null)
									newItem = this.nm.getPMLTransitionName(mchName, transName);
								else
									newItem = mchName + Frontend.separator + transName;
								if (newItem != null && !this.items.contains(newItem))
									this.items.add(newItem);
							}
						}
					}
				} else {
					for (Machine mch : model.getMachines()) {
						for (Transition trans : mch.getTransitions()) {
							String newItem;
							if (this.nm != null)
								newItem = this.nm.getPMLTransitionName(mch.getName(), trans.getName());
							else
								newItem = mch.getName() + Frontend.separator + trans.getName();
							if (newItem != null && !this.items.contains(newItem))
								this.items.add(newItem);
						}
					}
				}
				retval = new Cover2Never();
				break;
			case Specifications:
				break;
			default:
				break;
		}
		return retval;
	}
	
	public Vector<String> getItems() {
		Collections.sort(this.items);
		return this.items;
	}
	
}
