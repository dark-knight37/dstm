package org.prgmdl.tcg.d2p.crosscompiler.trigger;

import java.util.Stack;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.trigger.TokenFinder;
import org.prgmdl.dstmverifier.transition.trigger.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessageAtomic;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessagetypeAtomic;
import org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils.TriggerHelper;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;

import DSTM4Rail.utilities.Utils;

public class TriggerTesqelGenerator extends DepthFirstAdapter {

	@SuppressWarnings("unused")
	private DataToTransition dh;
	
	private Stack<String> stack;
	
	private TriggerHelper helper;
	
	public TriggerTesqelGenerator(DataToTransition dtt) {
		this.dh = dtt;
		this.stack = new Stack<String>();
		this.helper = new TriggerHelper();
	}
		
    public void outAMessageAtomic(AMessageAtomic node) {
    	TokenFinder tf = new TokenFinder();
    	node.getVar().apply(tf);
    	String chname = tf.getName();
		String phase = this.prepareChannel(chname);
    	this.stack.push(phase);
    }
    
    public void outAMessagetypeAtomic(AMessagetypeAtomic node) {
       	TokenFinder tf = new TokenFinder();
    	node.getVar().apply(tf);
    	String chname = tf.getName();
		String phase = this.prepareChannel(chname);
    	this.stack.push(phase);
    }

	public Vector<String> getPhases() {
		return Utils.enum2vector(this.stack.elements());
	}
	
	private String prepareChannel(String chname) {
		String phase = "if ";
		Vector<String> actualChannels = ChannelUtils.getActualChannelNames(chname,this.dh);
		for (String p: actualChannels) {
			phase += ":: atomic {(" + p + "?[1,_]) -> " + this.helper.getMessage(p) + "} "; 
		}
		phase += ":: atomic {else -> skip;} fi";
		return phase;
	}
}