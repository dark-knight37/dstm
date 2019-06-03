package org.prgmdl.tcg.d2p.frontend;

import org.prgmdl.tcg.naming.NameManager;

import DSTM4Rail.DSTM;

public interface Frontend {
	
	public final static String separator = "_";
	
	public DSTM transform(DSTM model, NameManager nm); 
}