package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.util.Stack;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.action.node.AIdVar;
import org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils.ActionHelper;

public class VariableCatcher extends DepthFirstAdapter {
	
	private Stack<String> stack;
	
	private ActionHelper helper;
	
	private DataToTransition dh;
	
	public VariableCatcher(Stack<String> stk, ActionHelper ah, DataToTransition dh) {
		this.stack = stk;
		this.helper = ah;
		this.dh = dh;
	}

    public void inAIdVar(AIdVar node) {
        String varname = node.getIdentifier().getText();
        String type = this.dh.getTypeName(varname);
        String phase = this.helper.getAssignment(varname,type);
        this.stack.push(phase);
    }
}