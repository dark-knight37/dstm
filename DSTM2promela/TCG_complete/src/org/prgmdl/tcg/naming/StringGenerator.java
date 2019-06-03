package org.prgmdl.tcg.naming;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class StringGenerator {
	
    private static StringGenerator instance = null;

    private int counter;
    
    private Hashtable<RenamingKind,String> map;
    
    private StringGenerator() {
    }
    
    private void reset() {
    	this.map = new Hashtable<RenamingKind,String>();
    	this.map.put(RenamingKind.TRANSITION,"t");
    	this.map.put(RenamingKind.VERTEX,"v");
    	this.map.put(RenamingKind.MACHINE,"m");
    	this.counter = 0;
    }
    
	public String get() {
		return this.get("label");
	}

	public String get(String s) {
		return s + (this.counter++) + s;
	}
	
	public String get(RenamingKind k) {
		return this.get(this.map.get(k));
	}

	public static synchronized StringGenerator getStringGenerator() {
        if (StringGenerator.instance == null) {
        	StringGenerator.instance = new StringGenerator();
        	StringGenerator.instance.reset();
        }
        return StringGenerator.instance;
	}

	public RenamingKind getKind(String s) {
		RenamingKind retval = null;
		int size = s.length();
		String prefix = s.substring(0,1);
		String body = s.substring(1,size-2);
		String suffix = s.substring(size-1,size-1);
		if (prefix.equals(suffix)) {
			if (body.matches("\\d+")) {
				retval = this.getReverseKind(prefix);
			}
		}
		return retval;
	}

	private RenamingKind getReverseKind(String prefix) {
		Enumeration<RenamingKind> array = this.map.keys();
		boolean found = false;
		RenamingKind temp = null;
		while (array.hasMoreElements() && (!found)) {
			temp = array.nextElement();
			String retTemp = this.map.get(temp);
			found = retTemp.equals(prefix);
		} 
		return (found) ? temp : null;
	}
	
	public Vector<String> getValidLabels() {
		return (Vector<String>) this.map.elements(); 
	}
}
