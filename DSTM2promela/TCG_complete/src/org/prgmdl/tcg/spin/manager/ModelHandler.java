package org.prgmdl.tcg.spin.manager;

import java.util.Vector;

public abstract class ModelHandler {
	
	protected Vector<String> pretesqels;
	
	protected String neverNum; 
	
	protected String fileContent;

	protected String ifname;
	
	public ModelHandler(String complete, int size, String ifn) {		
		this.neverNum = (new Integer(size)).toString();
		this.fileContent = complete;
		this.pretesqels = new Vector<String>();
		this.ifname = ifn;
	}
	
	public abstract void run() throws Exception;
	
	public Vector<String> getOutputs() { 
		return this.pretesqels;
	}
}