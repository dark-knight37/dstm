package org.prgmdl.tcg.d2p.crosscompiler.trigger;

import java.util.Hashtable;
import java.util.Stack;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.trigger.TokenFinder;
import org.prgmdl.dstmverifier.transition.trigger.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.trigger.node.AAndopBinop;
import org.prgmdl.dstmverifier.transition.trigger.node.ABinaryTerm;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessageAtomic;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessagetypeAtomic;
import org.prgmdl.dstmverifier.transition.trigger.node.ANestedTerm;
import org.prgmdl.dstmverifier.transition.trigger.node.AOropBinop;
import org.prgmdl.dstmverifier.transition.trigger.node.AUnaryTerm;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;
import org.prgmdl.tcg.d2p.datautils.StackUtils;

public class TriggerTranslator extends DepthFirstAdapter {

	private DataToTransition dh;
	
	private Stack<String> stack;
	
	public TriggerTranslator(DataToTransition dtt) {
		this.dh = dtt;
		this.stack = new Stack<String>();
	}
	
	public String getString() {
		return this.stack.peek();
	}
	
    public void outAMessageAtomic(AMessageAtomic node) {
    	TokenFinder tf = new TokenFinder();
    	node.getVar().apply(tf);
    	String chname = tf.getName();
    	Hashtable<String,Integer> table = ChannelUtils.extractActualChannels(chname,this.dh);
    	String translation = ChannelUtils.composeTrigger(table,this.dh);
    	this.stack.push(translation);
    }
    
    public void outAMessagetypeAtomic(AMessagetypeAtomic node) {
       	TokenFinder tf = new TokenFinder();
    	node.getVar().apply(tf);
    	String chname = tf.getName();
    	tf = new TokenFinder();
    	node.getSimpletype().apply(tf);
    	String channelToSet = chname + "_" + tf.getName();
    	Hashtable<String,Integer> table = ChannelUtils.extractActualChannels(chname,this.dh);
    	String translation = ChannelUtils.choiceComposeTrigger(table,channelToSet);
        this.stack.push(translation); 
    }
    
    public void outANestedTerm(ANestedTerm node) {
    	StackUtils.monOp(this.stack);
    }
    
    public void outAUnaryTerm(AUnaryTerm node) {
    	StackUtils.monOp(this.stack,"(!");
    }

    public void outABinaryTerm(ABinaryTerm node) {
    	StackUtils.terOp(this.stack);
    }

    public void outAAndopBinop(AAndopBinop node) {
        this.stack.push("&&");
    }

    public void outAOropBinop(AOropBinop node) {
        this.stack.push("||");
    }
}