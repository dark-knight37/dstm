package org.prgmdl.tcg.spin.manager;

import org.prgmdl.tcg.common.OptimizationLevel;
import org.prgmdl.tcg.spin.SpinManager;

public class SpinManagerFactory {

	public static SpinManager genStandardSM(String inifile) {
		return new StandardSpinManager(inifile);
	} 
	
	public static SpinManager genAdvancedSM(String inifile) {
		return new AdvancedSpinManager(inifile);
	}
	
	public static SpinManager genSM(String f, OptimizationLevel ol) {
		SpinManager retval = null;
		if (ol == OptimizationLevel.None) {
			retval = genStandardSM(f);
		} else if (ol == OptimizationLevel.TransitionCov) {
			retval = genAdvancedSM(f);
		}
		return retval;
	}
}
