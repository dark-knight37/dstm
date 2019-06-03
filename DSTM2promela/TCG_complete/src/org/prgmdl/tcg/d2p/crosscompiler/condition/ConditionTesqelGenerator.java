package org.prgmdl.tcg.d2p.crosscompiler.condition;

import java.util.Stack;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.condition.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.condition.node.AChIdChname;
import org.prgmdl.dstmverifier.transition.condition.node.AVarIdVarName;
import org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils.ConditionHelper;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;

import DSTM4Rail.utilities.Utils;

public class ConditionTesqelGenerator extends DepthFirstAdapter {

	@SuppressWarnings("unused")
	private DataToTransition dh;
	
	private Stack<String> stack;
	
	private ConditionHelper helper;
	
	public ConditionTesqelGenerator(DataToTransition dtt) {
		this.dh = dtt;
    	this.helper = new ConditionHelper();
		this.stack = new Stack<String>();
	}

    public void outAVarIdVarName(AVarIdVarName node) {
        String varname = node.getIdentifier().getText();
        String phase = helper.getVarValue(varname);
        this.stack.push(phase);
    }

    public void outAChIdChname(AChIdChname node) {
    	String phase = "";
        String chname = node.getIdentifier().getText();
		Vector<String> actualChannels = ChannelUtils.getActualChannelNames(chname,this.dh);
		for (String p: actualChannels) {
	        phase += this.helper.getIsFullEmptyNempty(p) + "\n";
		}
		phase = phase.substring(0,phase.length()-2);
        this.stack.push(phase);
    }

    public Vector<String> getPhases() {
		return Utils.enum2vector(this.stack.elements());
	}
}