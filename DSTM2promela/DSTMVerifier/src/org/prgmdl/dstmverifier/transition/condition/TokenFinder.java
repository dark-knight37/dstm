package org.prgmdl.dstmverifier.transition.condition;

import java.util.Vector;

import org.prgmdl.dstmverifier.transition.condition.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.condition.node.ABoolBasic;
import org.prgmdl.dstmverifier.transition.condition.node.AChIdChname;
import org.prgmdl.dstmverifier.transition.condition.node.AChnBasic;
import org.prgmdl.dstmverifier.transition.condition.node.AChnIdChnName;
import org.prgmdl.dstmverifier.transition.condition.node.AEIdEName;
import org.prgmdl.dstmverifier.transition.condition.node.AIntBasic;
import org.prgmdl.dstmverifier.transition.condition.node.ALIdLiteral;
import org.prgmdl.dstmverifier.transition.condition.node.AVarIdVarName;
import org.prgmdl.dstmverifier.transition.condition.node.Token;

public class TokenFinder extends DepthFirstAdapter {
	
	private Vector<Token> tokens = new Vector<Token>();
	
    public void inAIntBasic(AIntBasic node) {
        tokens.add(node.getInt());
    }

    public void inABoolBasic(ABoolBasic node) {
        tokens.add(node.getBool());
    }

    public void inAChnBasic(AChnBasic node) {
        tokens.add(node.getChn());
    }

    public void inAVarIdVarName(AVarIdVarName node){
        tokens.add(node.getIdentifier());
    }

    public void inAChIdChname(AChIdChname node) {
        tokens.add(node.getIdentifier());
    }

    public void inALIdLiteral(ALIdLiteral node) {
        tokens.add(node.getIdentifier());
    }

    public void inAEIdEName(AEIdEName node) {
        tokens.add(node.getIdentifier());
    }
	
    public void inAChnIdChnName(AChnIdChnName node) {
        tokens.add(node.getIdentifier());
    }

    public Vector<Token> getTokens() {
    	return this.tokens;
    }

    public Token getElementAt(int index) {
    	return tokens.elementAt(index);
    }

    public int getTIsNumber() {
    	return this.tokens.size();
    }
    
    public Vector<String> getTiNames() {
    	Vector<String> retval = new Vector<String>();
    	for (int i = 0; i<tokens.size(); i++) {
    		retval.add(tokens.elementAt(i).getText());
    	}
    	return retval;
    }
    
    public int getPos() {
    	return this.tokens.elementAt(0).getPos();
    }

    public int getLine() {
    	return this.tokens.elementAt(0).getLine();
    }
    
    public String getIdentName() {
    	return this.tokens.elementAt(0).getText();
    }

	public boolean noToken() {
		return this.tokens.size() == 0;
	}
}