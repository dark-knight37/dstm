package org.prgmdl.dstmverifier.transition.action;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.node.AComplexExprlist;
import org.prgmdl.dstmverifier.transition.action.node.AComplexExtvarlist;
import org.prgmdl.dstmverifier.transition.action.node.ASimpleExprlist;
import org.prgmdl.dstmverifier.transition.action.node.ASimpleExtvarlist;
import org.prgmdl.dstmverifier.transition.action.node.Node;
import org.prgmdl.dstmverifier.transition.action.node.PExpr;

import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;


/**
 * This class is responsible of extract a list of expression from an expression list.
 * @author Stefano Marrone
 */
public class ListExtractor extends BaseActionAnalyser {

	/**
	 * Vector of expressions.
	 */
	protected Vector<String> types;
	
	public ListExtractor(DataToTransition dtt2, String machname) {
		super(dtt2, machname);
		types = new Vector<String>();
	}
	
	protected void addExpr(PExpr e) {
		ExpressionChecker ec = new ExpressionChecker(this.dtt, this.machine);
		e.apply(ec);
		types.add(ec.getType());
		this.addViolations(ec.getViolations());
	}
	
	protected void addVar(Node e) {
    	TokenFinder tf = new TokenFinder();
    	e.apply(tf);
    	String varname = tf.getIdentName();
    	String typename = null;
    	if (varname.equals("_")) {
    		typename = varname;
    	} else {
        	if (this.dtt.isDefined(varname)) {
            	if (this.dtt.isVariable(varname)) {
            		typename = this.dtt.getTypeName(varname);
            	} else {
            		this.violations.add(new TransitionViolation(ViolationKind.ME, varname, tf.getPos()));
            	}
        	} else {
        		this.violations.add(new TransitionViolation(ViolationKind.UNDID, varname, tf.getPos()));
        	}
    		
    	}
    	types.add(typename);
	}

	public void inASimpleExprlist(ASimpleExprlist node) {
        this.addExpr(node.getExpr());
    }
    
    public void inAComplexExprlist(AComplexExprlist node) {
        this.addExpr(node.getExpr());
    }

    public void inASimpleExtvarlist(ASimpleExtvarlist node) {
    	this.addVar(node.getExtvar());
    }
    
    public void inAComplexExtvarlist(AComplexExtvarlist node) {
    	this.addVar(node.getExtvar());
    }

    public Vector<String> getTypes() {
    	return this.types;
    }

}
