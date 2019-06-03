package org.prgmdl.dstmverifier.data.types;

import org.prgmdl.dstmverifier.data.DataToTransition;

public class TypeAnalyserFactory {
	
	public static TypeAnalyser create(DataToTransition dh, String chName) {
/*
  		TypeAnalyser retval;
    	if (dh.isBasic(chtype)) {
    		retval = new BasicAnalyser(chName);
    	} else if (dh.isCompound(chtype)) {
    		retval = new CompoundAnalyser(chName);
    	} else {
    		retval = new MultitypeAnalyser(chName);
    	}
*/
    	String chtype = dh.getTypeName(chName);
    	return TypeAnalyserFactory.create(dh,chName,chtype);
	}
	
	public static TypeAnalyser create(DataToTransition dh, String chName, String chtype) {
		TypeAnalyser retval;
    	if (dh.isBasic(chtype)) {
    		retval = new BasicAnalyser(chName);
    	} else if (dh.isCompound(chtype)) {
    		retval = new CompoundAnalyser(chName);
    	} else {
    		retval = new MultitypeAnalyser(chName);
    		retval.setDh(dh);
    	}
    	return retval;
	}
	
	//TODO: fondere un giorno con ChnUtils
	public static String chnUnfold(String x) {
		boolean flag = x.startsWith("Chn[") && x.endsWith("]");
		if (flag) {
			x = x.substring(4,x.length()-1);
		}
		return x;
	}

}
