package org.prgmdl.tcg.spin.manager;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.tcg.spin.SpinManager;

import DSTM4Rail.utilities.Utils;

public class StandardSpinManager implements SpinManager {
	
	private String iniFileName;
	
	public StandardSpinManager(String ifn) {
		super();
		this.iniFileName = ifn;
	}

	@Override
	public Hashtable<String,String> spinExecution(String model, Hashtable<String,String> nevers) throws Exception {
		String complete = model;
		Vector<String> nnames = Utils.enum2vector(nevers.keys());
		Collections.sort(nnames);
		int size = nnames.size();
		for (String n: nnames) {
			complete = complete + "\n\n" + nevers.get(n);
		}
		ModelHandler mh = new SequentialModelHandler(complete,size,this.iniFileName);
		mh.run();
		Vector<String> outs = mh.getOutputs(); 
		Hashtable<String,String> retval = new Hashtable<String,String>();
		for (int i=0; i<size; i++) {
			retval.put(nnames.get(i),outs.get(i));
		}
		return retval;
	}
}