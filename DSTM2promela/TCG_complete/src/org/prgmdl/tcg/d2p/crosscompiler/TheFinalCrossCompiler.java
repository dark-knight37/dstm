package org.prgmdl.tcg.d2p.crosscompiler;

import java.util.Vector;

import org.eclipse.emf.common.util.BasicEList;
import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.DTTHandler;
import org.prgmdl.tcg.common.DSTMFeatureExtractor;
import org.prgmdl.tcg.d2p.crosscompiler.action.ActionCompiler;
import org.prgmdl.tcg.d2p.crosscompiler.condition.ConditionCompiler;
import org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils.OrderGenerator;
import org.prgmdl.tcg.d2p.crosscompiler.trigger.TriggerCompiler;

import DSTM4Rail.DSTM;
import DSTM4Rail.Transition;
import DSTM4Rail.utilities.PBFactory;
import DSTM4Rail.utilities.Utils;

public class TheFinalCrossCompiler implements CrossCompiler {

	private ActionCompiler acomp;
	
	private ConditionCompiler ccomp;
	
	private TriggerCompiler tcomp;

	private boolean tflag;
	
	public void setData(String data) {
		try {
			PBFactory.attach(data);
			DataToTransition dataHandler = DTTHandler.DTTFactory(PBFactory.getPBR());
			this.acomp = new ActionCompiler(dataHandler);
			this.ccomp = new ConditionCompiler(dataHandler);
			this.tcomp = new TriggerCompiler(dataHandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public TheFinalCrossCompiler(boolean tflag) {
		this.setData("");
		this.tflag = tflag;
	}
	
	public DSTM translate(DSTM model, String data) {
		this.setData(data);
		Vector<Transition> trans = DSTMFeatureExtractor.getTransitions(model);
		for (Transition t: trans) {
			OrderGenerator.reset();
			Vector<String> tphs = this.translateTrigger(t);
			Vector<String> cphs = this.translateCondition(t);
			Vector<String> aphs = this.translateActions(t); 
			Vector<String> phs = new Vector<String>();
			t.getActions().clear();
			if (this.tflag == true) {
				phs.addAll(tphs);
				phs.addAll(cphs);
			}
			phs.addAll(aphs);
			t.getActions().addAll(phs);
		}
		return model;
	}
	
	private Vector<String> translateActions(Transition t) {
		Vector<String> retval = new Vector<String>();
		BasicEList<String> temp = new BasicEList<String>(t.getActions());
		if (temp != null) {
			t.getActions().clear();
			for (String s: temp) {
				if (s != null) {
					if (!s.equals("")) {
						if (s.startsWith("#")) {
							s = s.substring(1,s.length());
							retval.add(s);
						} else {
							if (this.acomp.translate(s)) {
								retval.add(this.acomp.getTranslation());
								if (this.tflag == true) {
									retval.addAll(this.acomp.getPhases());
								}
							}
						}
					}
					t.getActions().add(s);
				}
			}
		}
		retval = Utils.cleanVector(retval);
		return retval;
	}

	private Vector<String> translateCondition(Transition t) {
		Vector<String> retval = new Vector<String>();
		String s = t.getCondition();
		if (s != null) {
			if (!s.equals("")) {
				if (s.startsWith("#")) {
					s = s.substring(1,s.length());
				} else {
					if (this.ccomp.translate(s)) {
						s = this.ccomp.getTranslation();
						retval = this.ccomp.getPhases();
					}
				}
				t.setCondition(s);
			}
		}
		return retval;
	}

	private Vector<String> translateTrigger(Transition t) {
		Vector<String> retval = new Vector<String>();
		String s = t.getTrigger();
		if (s != null) {
			if (!s.equals("")) {
				if (this.tcomp.translate(s)) {
					s = this.tcomp.getTranslation();
					t.setTrigger(s);
					retval = this.tcomp.getPhases();
				}
			}
		}
		return retval;
	}
}
