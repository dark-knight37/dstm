package org.prgmdl.dstmverifier.transition.condition;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.condition.node.ACompopAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.AEquiopAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.ASizecondAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.ATrmlistAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.Node;
import org.prgmdl.dstmverifier.transition.condition.node.PExpr;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;


/**
 * 
 * @author Stefano Marrone
 */
public class SimpleConditionAnalyser extends BaseConditionAnalyser {

	public SimpleConditionAnalyser(DataToTransition dtt, Transition trans) {
		super(dtt, trans);
	}
	
	private String getTermType(Node n) {
        ExpressionFinder finder = new ExpressionFinder(this.dtt, this.machine);
        n.apply(finder);
        String retval = finder.getType(); 
        return retval;
	}
	
    public void inAEquiopAtomic(AEquiopAtomic node) {
    	boolean vFlg = true;
    	String ltype = this.getTermType(node.getLval());
    	String rtype = this.getTermType(node.getRval());
    	if ((ltype != null) && (rtype != null)) {
    		vFlg = !rtype.equals(ltype);
    	} 
    	if (vFlg) {
    		this.violations.add(new TransitionViolation(ViolationKind.ME,null,5));
    	}
    }

    public void inACompopAtomic(ACompopAtomic node) {
    	boolean vFlg = true;
    	String ltype = this.getTermType(node.getLval());
    	String rtype = this.getTermType(node.getRval());
    	if ((ltype != null) && (rtype != null)) {
    		vFlg = !((rtype.equals(ltype) && rtype.equals("Int")));
    	} 
    	if (vFlg) {
    		this.violations.add(new TransitionViolation(ViolationKind.ME,null,6));
    	}
    }
	
    public void inASizecondAtomic(ASizecondAtomic node) {
    	TokenFinder finder = new TokenFinder();
    	node.getChname().apply(finder);
        String chname = finder.getTiNames().get(0);
        if (!this.dtt.isDefined(chname)) {
        	this.violations.add(new TransitionViolation(ViolationKind.NTAC, chname, finder.getPos()));
        } 
    }
    
    public void inATrmlistAtomic(ATrmlistAtomic node) {
    	TokenFinder finder = new TokenFinder();
    	node.getChname().apply(finder);
        String chname = finder.getTiNames().get(0);
        if (!this.dtt.isDefined(chname)) {
        	this.violations.add(new TransitionViolation(ViolationKind.NTAC, chname, finder.getPos()));
        } else {
        	ExpressionListFinder elf = new ExpressionListFinder();
        	node.getTrmlist().apply(elf);
        	Vector<PExpr> express = elf.getExpressions();
        	int len = express.size();
        	Vector<String> types = new Vector<String>();
        	boolean flag = true;
        	int i = 0;
        	while ((i<len) && (flag)) {
        		ExpressionFinder ef = new ExpressionFinder(this.dtt, this.machine);
        		express.elementAt(i).apply(ef);
        		String tempType =  ef.getType();
        		types.add(tempType);
        		this.addViolations(ef.getViolations());
        		flag = (ef.getType() != null);
        		i++;
        	}
        	if (flag) {
            	// Matching of the type list with the declaration of a channel/parameter
        		if (this.dtt.isChannel(chname)) {
            		flag = this.dtt.isChanInstanceOf(chname, types);
        		} else if (this.dtt.isParameter(chname, this.machine)) {
        			flag = this.dtt.isParInstanceOf(chname, types);
        		} else {
        			flag = false;
        		}
        	}
        	if (!flag) {
            	this.violations.add(new TransitionViolation(ViolationKind.ME, null, 7));        		
        	}
        } 
    }
    
}

