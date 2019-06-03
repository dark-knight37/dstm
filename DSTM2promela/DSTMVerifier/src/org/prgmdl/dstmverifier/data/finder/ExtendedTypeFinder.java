package org.prgmdl.dstmverifier.data.finder;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.node.ABoolBasic;
import org.prgmdl.dstmverifier.data.node.ABoolVarType;
import org.prgmdl.dstmverifier.data.node.AChanBasic;
import org.prgmdl.dstmverifier.data.node.AChantBasic;
import org.prgmdl.dstmverifier.data.node.AChantVarType;
import org.prgmdl.dstmverifier.data.node.AIntBasic;
import org.prgmdl.dstmverifier.data.node.AIntVarType;
import org.prgmdl.dstmverifier.data.node.ASimpleDefined;

public class ExtendedTypeFinder extends DepthFirstAdapter {

	private Vector<String> types;
	
	boolean stopFlag = false;
	
	public ExtendedTypeFinder() {
		this.types = new Vector<String>();
		this.stopFlag = false;
	}
	
    public void inAChantVarType(AChantVarType node) {
    	if (!stopFlag) {
    		TokenFinder tf = new TokenFinder(false,true, false, false, false);
    		node.apply(tf);
    		this.types.add("Chn[" + tf.getIdentName() + "]");
    		this.stopFlag = true;
    	}
    }

    public void outAChantVarType(AChantVarType node) {
    	this.stopFlag = false;
    }

    public void inAChantBasic(AChantBasic node) {
    	if (!stopFlag) {
    		TokenFinder tf = new TokenFinder(false,true, false, false, false);
    		node.apply(tf);
    		this.types.add("Chn[" + tf.getIdentName() + "]");
    		this.stopFlag = true;
    	}
    }

    public void outAChantBasic(AChantBasic node) {
    	this.stopFlag = false;
    }

    public void inASimpleDefined(ASimpleDefined node) {
    	if (!stopFlag) {
            types.add(node.getIdentifier().getText());
    		this.stopFlag = true;
    	}
    }
    
    public void outASimpleDefined(ASimpleDefined node) {
   		this.stopFlag = false;
    }

    public void inABoolBasic(ABoolBasic node) {
    	if (!stopFlag) {
            types.add("Bool");
    		this.stopFlag = true;
    	}
    }
    
    public void outABoolBasic(ABoolBasic node) {
   		this.stopFlag = false;
    }

    public void inABoolVarType(ABoolVarType node) {
    	if (!stopFlag) {
            types.add("Bool");
    		this.stopFlag = true;
    	}
    }

    public void outABoolVarType(ABoolVarType node) {
   		this.stopFlag = false;
    }
    
    public void inAIntBasic(AIntBasic node) {
    	if (!stopFlag) {
            types.add("Int");
    		this.stopFlag = true;
    	}
    }
    
    public void outAIntBasic(AIntBasic node) {
   		this.stopFlag = false;
    }

    public void inAIntVarType(AIntVarType node) {
    	if (!stopFlag) {
            types.add("Int");
    		this.stopFlag = true;
    	}
    }

    public void outAIntVarType(AIntVarType node) {
   		this.stopFlag = false;
    }

    
    public void inAChanBasic(AChanBasic node) {
    	if (!stopFlag) {
            types.add(node.getChan().getText());
    		this.stopFlag = true;
    	}
    }

    public void outAChanBasic(AChanBasic node) {
   		this.stopFlag = false;
    }

    public Vector<String> getTypes() {
    	return this.types;
    }

	public boolean found() {
		return !this.types.isEmpty();
	}
}