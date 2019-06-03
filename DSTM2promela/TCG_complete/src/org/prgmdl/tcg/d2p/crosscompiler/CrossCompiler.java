package org.prgmdl.tcg.d2p.crosscompiler;

import DSTM4Rail.DSTM;

public interface CrossCompiler {

	public DSTM translate(DSTM model, String data);
}
