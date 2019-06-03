package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.util.Stack;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.action.node.AAssignStatement;
import org.prgmdl.dstmverifier.transition.action.node.AConserveStatement;
import org.prgmdl.dstmverifier.transition.action.node.AReceiveStatement;
import org.prgmdl.dstmverifier.transition.action.node.ASendStatement;
import org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils.ActionHelper;

import DSTM4Rail.utilities.Utils;

public class ActionTesqelGenerator extends DepthFirstAdapter {
	
	@SuppressWarnings("unused")
	private DataToTransition dh;
	
	private Stack<String> stack;
	
	private ActionHelper helper;
	
	public ActionTesqelGenerator(DataToTransition dtt) {
		this.dh = dtt;
		this.stack = new Stack<String>();
		this.helper = new ActionHelper();
	}

    public void inAAssignStatement(AAssignStatement node) {
    	String varname = node.getVar().toString().trim();
    	String vartype = this.dh.getTypeName(varname);
    	String phase = this.helper.getAssignment(varname,vartype);
    	this.stack.push(phase);
    }

    public void inAReceiveStatement(AReceiveStatement node) {
    	String chname = node.getChname().toString().trim();
    	String phase = this.helper.getMessage("read",chname);
    	VariableCatcher vc = new VariableCatcher(this.stack,this.helper,this.dh);
    	node.apply(vc);
    	this.stack.push(phase);
    }
    
    public void inAConserveStatement(AConserveStatement node) {
    	String chname = node.getChname().toString().trim();
    	String phase = helper.getMessage("check",chname);
    	VariableCatcher vc = new VariableCatcher(this.stack,this.helper,this.dh);
    	node.apply(vc);
    	this.stack.push(phase);
    }

    public void inASendStatement(ASendStatement node) {
    	String chname = node.getChname().toString().trim();
    	SendExpressionTranslator set = new SendExpressionTranslator(this.dh);
    	node.apply(set);
    	String exprList = set.getString();    	
    	MsgSendUtils msu = new MsgSendUtils(this.dh);
    	String phase = msu.sendChannel(chname,exprList);
    	phase = helper.getSend(chname,exprList,this.dh);
    	this.stack.push(phase);
    }
    
	public Vector<String> getPhases() {
		return Utils.enum2vector(this.stack.elements());
	}
}