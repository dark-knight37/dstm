package org.prgmdl.tcg.spin;

import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.tcg.naming.NameManager;

public interface PostProcessor {
	
	public final static String separator = ".";
	
	public Vector<String> transform(Hashtable<String,String> pretesqels, NameManager nm); 
}