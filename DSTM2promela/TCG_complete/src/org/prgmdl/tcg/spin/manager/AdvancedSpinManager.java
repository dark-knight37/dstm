package org.prgmdl.tcg.spin.manager;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.tcg.spin.PostProcessor;
import org.prgmdl.tcg.spin.SpinManager;
import org.prgmdl.tcg.spin.StandardPostProcessor;

import tesqel.serializer.TesqelInspector;
import DSTM4Rail.random.Dice;
import DSTM4Rail.utilities.Utils;

public class AdvancedSpinManager implements SpinManager {
	
	private String iniFileName;
	
	public AdvancedSpinManager(String ifn) {
		super();
		this.iniFileName = ifn;
	}

	@Override
	public Hashtable<String,String> spinExecution(String model, Hashtable<String,String> nevers) throws Exception {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		Vector<String> nnames = Utils.enum2vector(nevers.keys());
		Collections.sort(nnames);
		SpinManager ssm = SpinManagerFactory.genStandardSM(this.iniFileName);
		PostProcessor pp = new StandardPostProcessor(this.iniFileName);
		while (nnames.size() > 0) {
			// Choosing a victim 
			int size = nnames.size();
			Dice d = new Dice(size);
			int index = d.roll();
			String candidate = nnames.get(index);
			System.out.print("Size = " + size);
			System.out.print("\t");
			System.out.print("Candidate = " + candidate);
			System.out.print("\t");
			String never = nevers.get(candidate);
			// Running SpinManager on the victim
			Hashtable<String,String> osht = new Hashtable<String,String>();
			osht.put(candidate,never);
			Hashtable<String,String> retht = ssm.spinExecution(model,osht);
			// Postprocess the results of the victim
			String tsql = pp.transform(retht,null).get(0);
			retval.put(candidate,retht.get(candidate));
			// Extract the covered transitions from the results
			TesqelInspector ti = new TesqelInspector(this.iniFileName);
			Vector<String> covered = ti.getCoveredTransition(tsql);
			System.out.print("Covered");
			for (String ct: covered) {
				System.out.print("\t" + ct);
			}
			System.out.print("\n");
			
			covered = this.getCleanNames(covered);
			// Analyse the covered transition			
			for (String ct: covered) {
				for (int j=nnames.size()-1; j>=0; j--) {
					if (nnames.get(j).contains(ct)) {
						nnames.remove(j);
					}
				}
			}
		}
		return retval;
	}
	
	private Vector<String> getCleanNames(Vector<String> dotnoted) {
		for (int i=0; i<dotnoted.size(); i++) {
			String t = dotnoted.get(i);
			int dotidx = t.indexOf(".");
			String tname = t.substring(dotidx + 1);
			dotnoted.set(i,tname);
		}
		return dotnoted;
	}

}