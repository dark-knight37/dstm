package org.prgmdl.dstmverifier.data.types;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.AEnumDeclarationEnumDeclaration;
import org.prgmdl.dstmverifier.data.node.AIdentifierLiteral;
import org.prgmdl.dstmverifier.data.node.Node;

public class LiteralAnalyser extends DepthFirstAdapter {
	
	protected AEnumDeclarationEnumDeclaration enumtype;
	
	protected String litname; 

	public LiteralAnalyser(String lit) {
		this.enumtype = null;
		this.litname = lit;
	}
	
	public void inAIdentifierLiteral(AIdentifierLiteral node) {
//		TokenFinder tf = new TokenFinder(false,true, false, false, false);
//		node.apply(tf);
//		String name = tf.getElementAt(0).getText();
		String name = node.getIdentifier().getText();
		if (name.equals(this.litname)) {
			this.enumtype = this.getEnumNode(node); 
		}
    }
	
	public AEnumDeclarationEnumDeclaration getEnumNode(AIdentifierLiteral lit) {
		Node retval = lit;
		while ((retval != null) && !(retval instanceof AEnumDeclarationEnumDeclaration)) {
			retval = retval.parent();
		}
		return (AEnumDeclarationEnumDeclaration) retval;
	}
	
	public boolean isLiteral() {
		return this.enumtype != null;
	}
	
	public String getEnumName() {
		String retval = null;
		if (this.isLiteral()) {
			retval = TokenFinderFacade.uniqueFinder(this.enumtype.getEName());
		}
		return retval;
	}
}
