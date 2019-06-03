package org.prgmdl.tcg.naming;

import DSTM4Rail.DSTM;

public interface NameManager {
	
	public ReverseString reverse(String s);
	
	public DSTM renameModel(DSTM mdl);
	
	public void addFlattenedTransition (String mchName, String renamedTrans, String flattenedTrans);
	
	public void addFlattenedVertex (String mchName, String renamedVertex, String flattenedVertex);
	
	public String getPMLTransitionName (String mchName, String originalTransName);
	
	public String getPMLVertexName (String mchName, String originalVertName);
}
