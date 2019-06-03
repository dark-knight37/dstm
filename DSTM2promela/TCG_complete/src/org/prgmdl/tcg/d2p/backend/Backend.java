package org.prgmdl.tcg.d2p.backend;

import org.prgmdl.tcg.common.Promela;

import DSTM4Rail.DSTM;

public interface Backend {

	public Promela transform(DSTM model); 
	
	
}