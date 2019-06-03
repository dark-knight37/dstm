package org.prgmdl.tcg.d2p;

import org.prgmdl.tcg.common.Promela;
import org.prgmdl.tcg.naming.NameManager;

import DSTM4Rail.DSTM;

public interface DSTM2Promela {
	
	public Promela transform(DSTM merged, String data, NameManager nm);
	
}
