package org.prgmdl.dstmverifier.transition.condition;

import java.util.Vector;

import org.prgmdl.dstmverifier.transition.condition.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.condition.node.AComplexTrmlist;
import org.prgmdl.dstmverifier.transition.condition.node.ASimpleTrmlist;
import org.prgmdl.dstmverifier.transition.condition.node.PExpr;

/**
 * This class is responsible of extract a list of expression from an expression list.
 * @author Stefano Marrone
 */
public class ExpressionListFinder extends DepthFirstAdapter {

	/**
	 * Vector of expressions.
	 */
	protected Vector<PExpr> expressions;
	
	/**
	 * Default constructor.
	 */
	public ExpressionListFinder() {
		this.expressions = new Vector<PExpr>();
	}
	
	/**
	 * This methods retrieves the list of expressions in a expression list.
	 * @return vector of expressions
	 */
	public Vector<PExpr> getExpressions() {
		return this.expressions;
	}
	
	/**
	 * This methods extract a term from a expression term and run recursively the search on the remaining list.
	 */
    public void inASimpleTrmlist(ASimpleTrmlist node) {
        expressions.add(node.getExpr());
    }

	/**
	 * This methods extract a term from a expression term and run recursively the search on the remaining list.
	 */
    public void inAComplexTrmlist(AComplexTrmlist node) {
        expressions.add(node.getExpr());
    }
}
