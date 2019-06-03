package org.prgmdl.tcg.spin;

import java.util.Hashtable;

public interface SpinManager {

	public Hashtable<String,String> spinExecution(String model, Hashtable<String,String> neverclaims) throws Exception;
}