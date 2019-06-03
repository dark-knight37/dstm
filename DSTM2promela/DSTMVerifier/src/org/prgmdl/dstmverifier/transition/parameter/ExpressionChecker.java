package org.prgmdl.dstmverifier.transition.parameter;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.parameter.node.ABoolnotExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.ABoolopExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.ACompareExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AEnumExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AEqivExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AFaAtomic;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdAtomic;
import org.prgmdl.dstmverifier.transition.parameter.node.ALenchnAtomic;
import org.prgmdl.dstmverifier.transition.parameter.node.AMathopExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AMathppExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.ANumAtomic;
import org.prgmdl.dstmverifier.transition.parameter.node.ATrAtomic;
import org.prgmdl.dstmverifier.transition.parameter.node.Node;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.Utils;

public class ExpressionChecker extends BaseParameterAnalyser {
	
	protected String type = null;
	
	protected Vector<String> types = null;
	
	protected boolean step;
	
	public ExpressionChecker(DataToTransition dtt, Transition trans) {
		super(dtt, trans);
		this.type = null;
		this.types = new Vector<String>();
		this.step = true;
	}
	
	public ExpressionChecker(DataToTransition dtt, String machname) {
		super(dtt, machname);
		this.type = null;
		this.types = new Vector<String>();
		this.step = true;
	}
	
	public String getType() {
		this.type = this.voteTypes();
        return this.type;
	}

	protected String voteTypes() {
		boolean stopcondition = this.types.isEmpty();
		String candidate = null;;
		if (!stopcondition) {
			candidate = this.types.elementAt(0);
			stopcondition = (candidate == null);
			int i = 0;
			while ((i<this.types.size()) && (!stopcondition)) {
				stopcondition = !this.types.elementAt(i).equals(candidate);
				i++;
			}			
		}
		return (stopcondition) ? null : candidate;
    }
	
	public void inAEnumExpr(AEnumExpr node) {
	    if (step == true) {
	    	step = false;
			TokenFinder etf = new TokenFinder();
		    node.getEName().apply(etf);
		    String typename = etf.getIdentName();
		    if (this.dtt.isDefined(typename)) {
		        TokenFinder ltf = new TokenFinder();
		        node.getLiteral().apply(ltf);
		        String litname = ltf.getIdentName();
		        if (this.dtt.isEnumLiteralOf(litname, typename)) {
		        	this.types.add(typename);
		        } else {
		        	this.violations.add(new TransitionViolation(ViolationKind.ME, typename, etf.getPos()));
		        }
		    } else {
		    	this.violations.add(new TransitionViolation(ViolationKind.UNDID, typename, etf.getPos()));
		    }
	    }
	}
	
	protected boolean boolcheck(Node node) {
        ExpressionChecker bc = new ExpressionChecker(this.dtt,this.machine);
        node.apply(bc);
        String type = bc.getType(); 
        return ((type != null) && type.equals("Bool"));
	}
	
	protected boolean intcheck(Node node) {
        ExpressionChecker ic = new ExpressionChecker(this.dtt,this.machine);
        node.apply(ic);
        String type = ic.getType(); 
        return ((type != null) && type.equals("Int"));
	}

	public void inABoolnotExpr(ABoolnotExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typetoadd = null;
			if (boolcheck(node.getExpr())) {
				typetoadd = "Bool";
			} else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
		    }
	        this.types.add(typetoadd);
	    }
    }

    public void inABoolopExpr(ABoolopExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typetoadd = null;
			if (boolcheck(node.getFirst()) && boolcheck(node.getSecond())) {
				typetoadd = "Bool";
			} else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
		    }
	        this.types.add(typetoadd);
	    }
    }

    public void inAMathopExpr(AMathopExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typeToAdd = null;
	        boolean check = intcheck(node.getFirst()) && intcheck(node.getSecond());
	        if (check) {
	        	typeToAdd = "Int";
	        } else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
	        }
	    	this.types.add(typeToAdd);
	    }
    }

    public void inAMathppExpr(AMathppExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typeToAdd = null;
	        boolean check = intcheck(node.getExpr());
	        if (check) {
	        	typeToAdd = "Int";
	        } else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
	        }
	    	this.types.add(typeToAdd);
	    }
    }

    public void inAEqivExpr(AEqivExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typeToAdd = null;
	        ExpressionChecker lc = new ExpressionChecker(this.dtt,this.machine);
	        node.getFirst().apply(lc);
	        String ltype = lc.getType(); 
	        ExpressionChecker rc = new ExpressionChecker(this.dtt,this.machine);
	        node.getSecond().apply(rc);
	        String rtype = rc.getType();
	        if ((ltype != null) && (rtype != null)) {
		        if (ltype.equals(rtype)) {
		        	typeToAdd = "Bool";
		        } else {
			    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
		        }
	        } else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
	        }
	    	this.types.add(typeToAdd);
	    }
    }

    public void inACompareExpr(ACompareExpr node) {
	    if (step == true) {
	    	step = false;
	    	String typeToAdd = null;
	        boolean check = intcheck(node.getFirst()) && intcheck(node.getSecond());
	        if (check) {
	        	typeToAdd = "Bool";
	        } else {
		    	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 0));
	        }
	    	this.types.add(typeToAdd);
	    }
    }
    
    public void inALenchnAtomic(ALenchnAtomic node) {
	    if (step == true) {
	    	step = false;
	    	this.types.add("Int");
	    }
    }

    public void inANumAtomic(ANumAtomic node) {
	    if (step == true) {
	    	step = false;
	    	this.types.add("Int");
	    }
    }

    public void inAFaAtomic(AFaAtomic node) {
	    if (step == true) {
	    	step = false;
	    	this.types.add("Bool");
	    }
    }

    public void inATrAtomic(ATrAtomic node) {
	    if (step == true) {
	    	step = false;
	    	this.types.add("Bool");
	    }
    }

    public void inAIdAtomic(AIdAtomic node) {
	    if (step == true) {
	    	step = false;
	        String idname = node.getIdentifier().getText();
	        if (this.dtt.isDefined(idname)) {
	        	String typename = this.dtt.getTypeName(idname);
	        	
	        	//CODICE modificato forse instabile
	        	if (this.dtt.isChannel(idname)) {
	        		typename = Utils.envelopeTypeInChn(typename);
	        	}
	        	
		    	this.types.add(typename);
	        } else {
		    	this.types.add(null);
	        }
	    }
    }
}