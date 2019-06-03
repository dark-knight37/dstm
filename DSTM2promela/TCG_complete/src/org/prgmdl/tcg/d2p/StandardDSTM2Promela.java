package org.prgmdl.tcg.d2p;

import org.prgmdl.tcg.common.Promela;
import org.prgmdl.tcg.d2p.backend.Backend;
import org.prgmdl.tcg.d2p.backend.StandardBackend;
import org.prgmdl.tcg.d2p.crosscompiler.CrossCompiler;
import org.prgmdl.tcg.d2p.crosscompiler.CrossCompilerFactory;
import org.prgmdl.tcg.d2p.frontend.Frontend;
import org.prgmdl.tcg.d2p.frontend.StandardFrontend;
import org.prgmdl.tcg.naming.NameManager;

import DSTM4Rail.DSTM;
import DSTM4Rail.deserializer.DSTM4RailReader;

public class StandardDSTM2Promela implements DSTM2Promela {

	private static final String CROSS_COMPILED = "temp/ccompiled.dstm4rail";
	private static final String FLATTENED = "temp/flattened.dstm4rail";
	
	@Override
	public Promela transform(DSTM merged, String data, NameManager nm) {
		Frontend fe = new StandardFrontend();
		DSTM flattened = fe.transform(merged, nm);
		DSTM4RailReader writer = new DSTM4RailReader();
		writer.writeXmiModel(flattened, FLATTENED);
		CrossCompiler cc = CrossCompilerFactory.genTesqelCC();
//		CrossCompiler cc = CrossCompilerFactory.genSimpleCC();
		DSTM compiled = cc.translate(flattened, data);
		writer.writeXmiModel(compiled, CROSS_COMPILED);
		Backend be = new StandardBackend();
		Promela p = be.transform(compiled);
		return p;
	}
	
}