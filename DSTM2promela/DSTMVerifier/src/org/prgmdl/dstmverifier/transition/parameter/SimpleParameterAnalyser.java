package org.prgmdl.dstmverifier.transition.parameter;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.parameter.node.AAssignStatement;
import org.prgmdl.dstmverifier.transition.parameter.node.Start;

import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.GenericViolation;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.Utils;


/**
 * 
 * @author Stefano Marrone
 */
public class SimpleParameterAnalyser extends BaseParameterAnalyser {
	
	private Machine target;
	
	private Vector<String> actualParamList;
	
	public SimpleParameterAnalyser(DataToTransition dtt, Transition trans, Machine m) {
		super(dtt, trans);
		this.target = m;
		actualParamList = new Vector<String>();
	}

    public void outStart(Start node) {
        // List length checking
    	Vector<String> declaredParams = dtt.declaredParameters(this.target.getName());
    	if (declaredParams.size() == actualParamList.size()) {
    		// Check for duplication
    		if (Utils.isThereDuplication(actualParamList)) {
            	this.violations.add(new GenericViolation(ViolationKind.DUMMY, "Not fair list - message to refine"));
    		}
    	} else {
        	this.violations.add(new GenericViolation(ViolationKind.DUMMY, "Message to refine"));
    	}
    }

	public void inAAssignStatement(AAssignStatement node) {
		TokenFinder vtf = new TokenFinder();
		node.getPar().apply(vtf);
	    String idname = vtf.getIdentName();
	    if (this.dtt.isDefined(idname)) {
	    	if (this.dtt.isParameter(idname, this.target.getName())) {
	        	String idtype = this.dtt.getTypeName(idname);
	        	ExpressionChecker ef = new ExpressionChecker(this.dtt, this.machine);
	        	node.getExpr().apply(ef);
	        	String exprtype = ef.getType();
	        	if ((idtype == null) || (exprtype == null)) {
	            	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
	        	} else if (idtype.equals(exprtype)) {
	        		actualParamList.add(idname);
	        	} else {
	            	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
	        	}
	    	} else {
	        	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
	    	}
	    } else {
	    	this.violations.add(new TransitionViolation(ViolationKind.UNDID, idname, vtf.getPos()));
	    }
	}
	
}
