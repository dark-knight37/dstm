package org.prgmdl.dstmverifier.transition.parameter;

import java.util.Vector;

import org.prgmdl.dstmverifier.transition.parameter.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdChname;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdEName;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdLiteral;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdPar;
import org.prgmdl.dstmverifier.transition.parameter.node.Token;

public class TokenFinder extends DepthFirstAdapter {
	
	private Vector<Token> tokens = new Vector<Token>();
	
	
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
	
    public void inAIdPar(AIdPar node) {
        this.tokens.add(node.getIdentifier());
    }

    public void inAIdChname(AIdChname node) {
        this.tokens.add(node.getIdentifier());
    }
    
    public void inAIdEName(AIdEName node) {
        this.tokens.add(node.getIdentifier());
    }
    
    public void inAIdLiteral(AIdLiteral node) {
        this.tokens.add(node.getIdentifier());
    }

}