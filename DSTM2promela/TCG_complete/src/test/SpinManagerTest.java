package test;

import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.tcg.spin.SpinManager;
import org.prgmdl.tcg.spin.manager.StandardSpinManager;

import DSTM4Rail.utilities.Utils;


public class SpinManagerTest {
	public static void main(String[] args) throws Exception {
		// Model string generation
		String pmlString = Utils.file2string(args[0]);
	    
		// Never claims string generation	    
		int size = args.length;
		Hashtable<String,String> neverTable = new Hashtable<String,String>();
		for (int i=1; i<size; i++) {
			String nname = "never" + (i - 1);
			String npayload = Utils.file2string(args[i]);
			neverTable.put(nname,npayload);
		}

		SpinManager sm = new StandardSpinManager("property.ini");
		Hashtable<String,String> pretesqels = sm.spinExecution(pmlString,neverTable);
		Vector<String> keys = Utils.enum2vector(pretesqels.keys());
		for (int j=0; j<keys.size(); j++) {
			System.out.println("******");
			System.out.println(pretesqels.get(keys.elementAt(j)));		
		}
	}
}
