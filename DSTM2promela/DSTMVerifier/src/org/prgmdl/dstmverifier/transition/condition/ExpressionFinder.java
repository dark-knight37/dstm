package org.prgmdl.dstmverifier.transition.condition;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.condition.node.AChnExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ADcareExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AEnumExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AFalseExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AIdExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ALenChnExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ANumExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ATrueExpr;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;

public class ExpressionFinder extends BaseConditionAnalyser {
	
	protected String type = null;
	
	protected Vector<String> types = null;
	
	public ExpressionFinder(DataToTransition dtt, Transition trans) {
		super(dtt, trans);
		this.type = null;
		this.types = new Vector<String>();
	}
	
	public ExpressionFinder(DataToTransition dtt, String machname) {
		super(dtt, machname);
		this.type = null;
		this.types = new Vector<String>();
	}
	
	public String getType() {
        this.voteTypes();
		return this.type;
	}

	protected void voteTypes() {
		String candidate = this.types.elementAt(0);
		boolean stopcondition = false;
		int i = 0;
		while ((i<this.types.size()) && (!stopcondition)) {
			stopcondition = !this.types.elementAt(i).equals(candidate);
			i++;
		}
		this.type = (stopcondition) ? null : candidate;
    }	

    public void inALenChnExpr(ALenChnExpr node) {
    	String rettype = null;
    	TokenFinder ctf = new TokenFinder();
    	node.getChnName().apply(ctf);
        String chName = ctf.getIdentName();
        if (this.dtt.isDefined(chName)) {
    		if (this.dtt.isChannel(chName)) {
    			rettype = "Int";
            }
        } else {
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, chName, ctf.getPos()));
        }
        this.types.add(rettype);
    }

    public void inAChnExpr(AChnExpr node) {
    	String rettype = null;
    	TokenFinder ctf = new TokenFinder();
    	node.getChnName().apply(ctf);
        String chName = ctf.getIdentName();
        if (this.dtt.isDefined(chName)) {
    		if (this.dtt.isChannel(chName)) {
    			rettype = this.dtt.getTypeName(chName);
            }
        } else {
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, chName, ctf.getPos()));
        }
        this.types.add("Chn["+ rettype + "]");
    }

    public void inAIdExpr(AIdExpr node) {
        String idname = node.getIdentifier().getText();
        String rettype = null;
        if (this.dtt.isDefined(idname)) {
        	rettype = this.dtt.getTypeName(idname);
        } else{
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, idname, node.getIdentifier().getPos()));
        }
        this.types.add(rettype);
    }

    public void inAEnumExpr(AEnumExpr node) {
    	String rettype = null;
    	TokenFinder etf = new TokenFinder();
    	node.getEName().apply(etf);    	
        String enumName = etf.getIdentName();
        if (this.dtt.isDefined(enumName)) {
        	TokenFinder ltf = new TokenFinder();
        	node.getLiteral().apply(ltf);
            String litName = ltf.getIdentName();
        	if (this.dtt.isEnumLiteralOf(litName, enumName)) {
        		rettype = enumName;
        	}
        } else {
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, enumName, etf.getPos()));
        }
        this.types.add(rettype);
    }
    
    public void inANumExpr(ANumExpr node) {
        this.types.add("Int");
    }
    
    public void inATrueExpr(ATrueExpr node) {
        this.types.add("Bool");
    }
    
    public void inAFalseExpr(AFalseExpr node) {
        this.types.add("Bool");
    }
    
    public void inADcareExpr(ADcareExpr node) {
        this.types.add("_");
    }
}
