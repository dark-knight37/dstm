package org.prgmdl.tcg.d2p.crosscompiler.action;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.node.ASendStatement;

public class SendExpressionTranslator extends ActionTranslator {
	
	public SendExpressionTranslator(DataToTransition dtt) {
		super(dtt);
	}
	
    public void outASendStatement(ASendStatement node) {
        String exprList = this.stack.pop();
        this.stack.clear();
        this.stack.push(exprList);
    }

	public String getString() {
		String retval = this.stack.peek();
		return retval;
	}
}