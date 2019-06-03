package test;

import org.prgmdl.tcg.d2p.crosscompiler.CrossCompiler;
import org.prgmdl.tcg.d2p.crosscompiler.CrossCompilerFactory;

import DSTM4Rail.DSTM;
import DSTM4Rail.deserializer.DSTM4RailReader;
import DSTM4Rail.utilities.Utils;

public class CC_Test {
	public static void main(String[] args) throws Exception {
		DSTM4RailReader drr = new DSTM4RailReader();
		DSTM m = drr.loadXmiModel(args[0]);
		String data = Utils.file2string(args[1]); 
		CrossCompiler cc = CrossCompilerFactory.genSimpleCC();		
		DSTM compiled = cc.translate(m,data);
		drr.writeXmiModel(compiled,args[2]);
		cc= CrossCompilerFactory.genTesqelCC();		
		compiled = cc.translate(m,data);
		drr.writeXmiModel(compiled,args[3]);
	}
}
