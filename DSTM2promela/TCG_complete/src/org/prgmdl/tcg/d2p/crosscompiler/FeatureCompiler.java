package org.prgmdl.tcg.d2p.crosscompiler;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;

public abstract class FeatureCompiler {
	
	protected DataToTransition dataHandler;
	
	protected String translation;
	
	protected Vector<String> phases;
	
	public FeatureCompiler(DataToTransition dh) {
		this.dataHandler = dh;
	}
	
	public abstract boolean translate(String s);
	
	public Vector<String> getPhases() {
		return this.phases;
	}
	
	public String getTranslation() {
		return this.translation;
	}
	
	protected void reset() {
		this.translation = "";
		this.phases = new Vector<String>();
	} 
}