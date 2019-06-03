package org.prgmdl.dstmverifier.transition.trigger;

import org.prgmdl.dstmverifier.transition.trigger.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.trigger.node.ABoolBasic;
import org.prgmdl.dstmverifier.transition.trigger.node.AChnBasic;
import org.prgmdl.dstmverifier.transition.trigger.node.AIntBasic;
import org.prgmdl.dstmverifier.transition.trigger.node.ASimpleDefined;
import org.prgmdl.dstmverifier.transition.trigger.node.Token;

public class TokenFinder extends DepthFirstAdapter {
	
	Token id = null;

    public int getPos() {
    	return this.id.getPos();
    }

    public String getName() {
    	return this.id.getText();
    }

	public boolean noToken() {
		return (this.id == null);
	}
	
    public void inAIntBasic(AIntBasic node) {
        id = node.getInt();
    }

    public void inASimpleDefined(ASimpleDefined node) {
        id = node.getIdentifier();
    }
    
    public void inABoolBasic(ABoolBasic node) {
        id = node.getBool();
    }

    public void inAChnBasic(AChnBasic node) {
        id = node.getChn();
    }
}