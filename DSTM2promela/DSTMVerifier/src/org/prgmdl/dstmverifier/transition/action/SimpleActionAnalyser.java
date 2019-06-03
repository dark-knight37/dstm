package org.prgmdl.dstmverifier.transition.action;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.node.AAssignStatement;
import org.prgmdl.dstmverifier.transition.action.node.AConserveStatement;
import org.prgmdl.dstmverifier.transition.action.node.AReceiveStatement;
import org.prgmdl.dstmverifier.transition.action.node.ASendStatement;
import org.prgmdl.dstmverifier.transition.action.node.Node;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;

/**
 * This is the main semantic analyser for the actions. 
 * @author Stefano Marrone
 */
public class SimpleActionAnalyser extends BaseActionAnalyser {
	
	/**
	 * Inherited constructor.
	 * @param dtt DataTotrigger broker needed to get data information
	 * @param trans transition (needed to get the name of the machine)
	 */
	public SimpleActionAnalyser(DataToTransition dtt, Transition trans) {
		super(dtt, trans);
	}
	
	/**
	 * Inherited constructor.
	 * @param dtt DataTotrigger broker needed to get data information
	 * @param mname name of the machine
	 */
	public SimpleActionAnalyser(DataToTransition dtt, String mname) {
		super(dtt, mname);
	}

	public void inAAssignStatement(AAssignStatement node) {
    	TokenFinder vtf = new TokenFinder();
    	node.getVar().apply(vtf);
        String idname = vtf.getIdentName();
        if (this.dtt.isDefined(idname)) {
        	if (this.dtt.isVariable(idname) || this.dtt.isParameter(idname, this.machine)) {
            	String idtype = this.dtt.getTypeName(idname);
            	ExpressionChecker ef = new ExpressionChecker(this.dtt, this.machine);
            	node.getExpr().apply(ef);
            	String exprtype = ef.getType();
            	if ((idtype == null) || (exprtype == null)) {
                	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
            	} else if (!idtype.equals(exprtype)) {
                	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
            	}
        	} else {
            	this.violations.add(new TransitionViolation(ViolationKind.ME, idname, vtf.getPos()));
        	}
        } else {
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, idname, vtf.getPos()));
        }
    }

	protected void manageList(Node item, Node list, boolean internal) {
		TokenFinder ctf = new TokenFinder();
    	item.apply(ctf);
        String itemname = ctf.getIdentName();
        if (this.dtt.isDefined(itemname)) {
        	if (this.dtt.isChannel(itemname) || this.dtt.isParameter(itemname, this.machine)) {
            	if (!internal || this.dtt.isInternalChannel(itemname)) {
            		ListExtractor le = new ListExtractor(this.dtt, this.machine);
            		list.apply(le);
            		Vector<String> listtypes = le.getTypes();
            		this.addViolations(le.getViolations());
            		boolean chFlag = this.dtt.isChanInstanceOf(itemname, listtypes);
            		boolean prFlag = this.dtt.isParInstanceOf(itemname, listtypes); 
                	if (!chFlag && !prFlag) {
                    	this.violations.add(new TransitionViolation(ViolationKind.ME, itemname, ctf.getPos()));
                	}
            	} else {
                	this.violations.add(new TransitionViolation(ViolationKind.INIC, itemname, ctf.getPos()));
            	}
        	} else {
            	this.violations.add(new TransitionViolation(ViolationKind.INCP, itemname, ctf.getPos()));
        	}
        } else {
        	this.violations.add(new TransitionViolation(ViolationKind.UNDID, itemname, ctf.getPos()));
        }

	}
	
    public void inASendStatement(ASendStatement node) {
    	this.manageList(node.getChname(), node.getExprlist(),false);
    }
    
    public void inAReceiveStatement(AReceiveStatement node) {
    	this.manageList(node.getChname(), node.getExtvarlist(),true);
    }
    
    public void inAConserveStatement(AConserveStatement node) {
    	this.manageList(node.getChname(), node.getExtvarlist(),false);
    }
}