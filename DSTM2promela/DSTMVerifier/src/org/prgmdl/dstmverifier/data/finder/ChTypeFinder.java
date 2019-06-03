package org.prgmdl.dstmverifier.data.finder;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.node.AChantVarType;

public class ChTypeFinder extends DepthFirstAdapter {

	private String type;
	
	public ChTypeFinder() {
		this.type = null;
	}
	
    public void inAChantVarType(AChantVarType node) {
		TokenFinder tf = new TokenFinder(false,true, false, false, false);
		node.apply(tf);
		type = "Chn[" + tf.getIdentName() + "]";
    }

    public String getIdentName() {
    	return this.type;
    }

	public boolean found() {
		return this.type != null;
	}
}