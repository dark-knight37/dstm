package org.prgmdl.dstmverifier.data.finder;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.node.ABoolBasic;
import org.prgmdl.dstmverifier.data.node.AChantBasic;
import org.prgmdl.dstmverifier.data.node.AIdentifierLiteral;
import org.prgmdl.dstmverifier.data.node.AIntBasic;
import org.prgmdl.dstmverifier.data.node.ASimpleDefined;

import DSTM4Rail.utilities.Utils;

public class DefinedFinder extends DepthFirstAdapter {
	
	protected Vector<String> tokens = new Vector<String>();
	
    public void inASimpleDefined(ASimpleDefined node) {
    	String temp = node.getIdentifier().getText();
    	if (node.parent() instanceof AChantBasic) {
    		temp = Utils.envelopeTypeInChn(temp);
    	}
    	this.tokens.add(temp);
    }
    
    public void inABoolBasic(ABoolBasic node) {
    	tokens.add("Bool");
    }
    
    public void inAIntBasic(AIntBasic node) {
        tokens.add("Int");
    }
        
    public void inAIdentifierLiteral(AIdentifierLiteral node) {
    	tokens.add(node.getIdentifier().getText());
    }
    
    public Vector<String> getTokens() {
    	return this.tokens;
    }

    public String getElementAt(int index) {
    	return tokens.elementAt(index);
    }

    public int getTIsNumber() {
    	return this.tokens.size();
    }
    
	public boolean noToken() {
		return this.tokens.size() == 0;
	}
}