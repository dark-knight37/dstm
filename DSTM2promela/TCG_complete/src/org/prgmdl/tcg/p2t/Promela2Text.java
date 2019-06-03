package org.prgmdl.tcg.p2t;

import org.prgmdl.tcg.common.Promela;

import DSTM4Rail.DSTM;

public interface Promela2Text {

	public String transform(DSTM model, Promela pml); 
}