package org.prgmdl.dstmverifier.data.finder;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.node.ABoolBasic;
import org.prgmdl.dstmverifier.data.node.ABoolVarType;
import org.prgmdl.dstmverifier.data.node.AChanBasic;
import org.prgmdl.dstmverifier.data.node.AChantBasic;
import org.prgmdl.dstmverifier.data.node.AIdentifierLiteral;
import org.prgmdl.dstmverifier.data.node.AIntBasic;
import org.prgmdl.dstmverifier.data.node.AIntVarType;
import org.prgmdl.dstmverifier.data.node.ASimpleDefined;
import org.prgmdl.dstmverifier.data.node.ASimpleExtSymbol;
import org.prgmdl.dstmverifier.data.node.ASimpleUnique;
import org.prgmdl.dstmverifier.data.node.TIdentifier;
import org.prgmdl.dstmverifier.data.node.Token;

import DSTM4Rail.utilities.Utils;

public class TokenFinder extends DepthFirstAdapter {
	
	protected boolean definedFlag;
	
	protected boolean uniqueFlag;
	
	protected boolean externalFlag;
	
	protected boolean literalFlag;
	
	protected boolean channelFlag;
	
	protected boolean backDefinedFlag;
	
	protected Vector<Token> tokens = new Vector<Token>();
	
	public TokenFinder() {
		this.definedFlag = true;
		this.uniqueFlag = true;
		this.externalFlag = true;
		this.literalFlag = true;
		this.channelFlag = true;
		this.backDefinedFlag = false;
	}
	
	public TokenFinder(boolean uf, boolean df, boolean ef, boolean lf, boolean cf) {
		this.definedFlag = df;
		this.uniqueFlag = uf;
		this.externalFlag = ef;
		this.literalFlag = lf;
		this.channelFlag = cf;
	}

	public void inASimpleUnique(ASimpleUnique node) {
    	if (this.uniqueFlag) {
            tokens.add(node.getIdentifier());
    	}
    }
    
    public void inASimpleDefined(ASimpleDefined node) {
    	if (this.definedFlag) {
            tokens.add(node.getIdentifier());
    	}
    }

    public void inAChantBasic(AChantBasic node) {
    	if (this.channelFlag) {
    		TokenFinder ultrafinder = new TokenFinder(false,true,false,false,false);
    		node.apply(ultrafinder);
    		String pezzName = Utils.envelopeTypeInChn(ultrafinder.getIdentName());
    		TIdentifier pezzotToken = new TIdentifier(pezzName);
            tokens.add(pezzotToken);
    		this.backDefinedFlag = this.definedFlag;
            this.definedFlag = false;       
    	}
    }

    public void outAChantBasic(AChantBasic node) {
    	if (this.channelFlag) {
    		this.definedFlag = this.backDefinedFlag;
    	}
    }
    
    public void inABoolBasic(ABoolBasic node) {
    	if (this.definedFlag) {
            tokens.add(node.getBool());
    	}
    }
    
    public void inABoolVarType(ABoolVarType node) {
    	if (this.definedFlag) {
            tokens.add(node.getBool());
    	}
    }

    
    public void inAIntBasic(AIntBasic node) {
    	if (this.definedFlag) {
            tokens.add(node.getInt());
    	}
    }
    
    public void inAIntVarType(AIntVarType node) {
    	if (this.definedFlag) {
            tokens.add(node.getInt());
    	}
    }


    public void inAChanBasic(AChanBasic node) {
    	if (this.definedFlag) {
            tokens.add(node.getChan());
    	}
    }
    
    public void inAIdentifierLiteral(AIdentifierLiteral node) {
    	if (this.literalFlag) {
            tokens.add(node.getIdentifier());
    	}
    }

    
    public void inASimpleExtSymbol(ASimpleExtSymbol node) {
        if (this.externalFlag) {
        	this.tokens.add(node.getIdentifier());
        }
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