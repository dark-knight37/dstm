package org.prgmdl.tcg.d2p.datautils;

import java.util.Hashtable;
import java.util.Stack;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.parameter.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.parameter.node.AAndLbop;
import org.prgmdl.dstmverifier.transition.parameter.node.AAssignStatement;
import org.prgmdl.dstmverifier.transition.parameter.node.ABoolnotExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.ABoolopExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.ACompareExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AEqEqop;
import org.prgmdl.dstmverifier.transition.parameter.node.AEqivExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AGtCmpop;
import org.prgmdl.dstmverifier.transition.parameter.node.AGteqCmpop;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdLiteral;
import org.prgmdl.dstmverifier.transition.parameter.node.AIdPar;
import org.prgmdl.dstmverifier.transition.parameter.node.ALtCmpop;
import org.prgmdl.dstmverifier.transition.parameter.node.ALteqCmpop;
import org.prgmdl.dstmverifier.transition.parameter.node.AMathopExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AMathppExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AMinusMbop;
import org.prgmdl.dstmverifier.transition.parameter.node.AMinusMinusMmop;
import org.prgmdl.dstmverifier.transition.parameter.node.ANeqEqop;
import org.prgmdl.dstmverifier.transition.parameter.node.ANestedlExpr;
import org.prgmdl.dstmverifier.transition.parameter.node.AOrLbop;
import org.prgmdl.dstmverifier.transition.parameter.node.APlusMbop;
import org.prgmdl.dstmverifier.transition.parameter.node.APlusPlusMmop;
import org.prgmdl.dstmverifier.transition.parameter.node.ASlashMbop;
import org.prgmdl.dstmverifier.transition.parameter.node.AStarMbop;

public class ParamInstantiationTranslator extends DepthFirstAdapter {
	
	private DataToTransition dh;
	
	private Stack<String> stack;
	
	private Hashtable<String,String> table;
	
	private String lvalue;
	
	public ParamInstantiationTranslator(DataToTransition dtt) {
		this.table = new Hashtable<String,String>();
		this.dh = dtt;
	}
	
    public void inAAssignStatement(AAssignStatement node) {
        this.lvalue = "";
        this.stack.clear();
    }
    
    public void outAAssignStatement(AAssignStatement node) {
    	this.table.put(lvalue,this.stack.peek());
    }
    
    public void inANestedlExpr(ANestedlExpr node) {
        StackUtils.monOp(this.stack);
    }

    public void inABoolnotExpr(ABoolnotExpr node) {
        StackUtils.monOp(this.stack,"!(");
    }

    public void inAAndLbop(AAndLbop node) {
        this.stack.push("&&");
    }

    public void inAOrLbop(AOrLbop node) {
        this.stack.push("||");
    }
    
    public void inABoolopExpr(ABoolopExpr node) {
        StackUtils.terOp(this.stack);
    }

    public void inACompareExpr(ACompareExpr node) {
        StackUtils.terOp(this.stack);
    }

    public void inAMathppExpr(AMathppExpr node) {
        StackUtils.postfixOp(this.stack);
    }

    public void inAMathopExpr(AMathopExpr node) {
        StackUtils.terOp(this.stack);
    }

    public void inAEqivExpr(AEqivExpr node) {
        StackUtils.terOp(this.stack);
    }

    public void inANeqEqop(ANeqEqop node) {
        this.stack.push("!=");
    }

    public void inAEqEqop(AEqEqop node) {
        this.stack.push("==");
    }

    public void inALteqCmpop(ALteqCmpop node) {
        this.stack.push("<=");
    }

    public void inALtCmpop(ALtCmpop node) {
        this.stack.push("<");
    }

    public void inAGtCmpop(AGtCmpop node) {
        this.stack.push(">");
    }

    public void inAGteqCmpop(AGteqCmpop node) {
        this.stack.push(">=");
    }

    public void inAPlusMbop(APlusMbop node) {
        this.stack.push("+");
    }

    public void inAStarMbop(AStarMbop node) {
        this.stack.push("*");
    }

    public void inAMinusMbop(AMinusMbop node) {
        this.stack.push("-");
    }

    public void inAMinusMinusMmop(AMinusMinusMmop node) {
        this.stack.push("--");
    }

    public void inAPlusPlusMmop(APlusPlusMmop node) {
        this.stack.push("++");
    }

    public void inASlashMbop(ASlashMbop node) {
        this.stack.push("*");
    }
    
    public void inAIdLiteral(AIdLiteral node) {
        this.stack.push(node.getIdentifier().getText());
    }

    /**
     * It sets the left term of a parameter instantiation assignment
     * @param node AST node of the parameter
     */
    public void inAIdPar(AIdPar node) {
        lvalue = node.getIdentifier().getText();
    }
	
    /**
     * It returns the mapping table
     * @return mapping table
     */
	public Hashtable<String,String> getTable() {
		return this.table;
	}
}