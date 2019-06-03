package org.prgmdl.tcg.tespel2never;

import java.util.Hashtable;
import java.util.Vector;

public abstract class Abstract2Never implements Tespel2Never {

	@Override
	public Hashtable<String, String> generate(Vector<String> items) {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		int counter = 0;
		for (String i: items) {
			retval.put(i, this.generate(i,counter));
			counter++;
		}
		return retval;
	}

	protected abstract String generate(String i, int counter);
}
