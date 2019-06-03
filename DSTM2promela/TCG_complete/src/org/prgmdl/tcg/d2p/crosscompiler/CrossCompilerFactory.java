package org.prgmdl.tcg.d2p.crosscompiler;

public class CrossCompilerFactory {

	public static CrossCompiler genSimpleCC() {
		return new TheFinalCrossCompiler(false);
	} 
	
	public static CrossCompiler genTesqelCC() {
		return new TheFinalCrossCompiler(true);
	} 	
}
