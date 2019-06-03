package org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils;

public class OrderGenerator {
	
	private static int order = 0;
	
	public static int get() {
		return order++;
	}
	
	public static void reset() {
		order = 0;
	}
}