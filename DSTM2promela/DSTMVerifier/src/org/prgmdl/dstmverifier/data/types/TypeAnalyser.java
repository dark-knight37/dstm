package org.prgmdl.dstmverifier.data.types;

import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;

public abstract class TypeAnalyser extends DepthFirstAdapter {

	protected Hashtable<String,String> signatures; 
	
	protected String baseName;
	
	protected DataToTransition dh;
	
	public TypeAnalyser(String chName) {
		this.signatures = new Hashtable<String,String>();
		this.baseName = chName;
	}
	
    public Hashtable<String,String> getTable() {
    	return signatures;
    }

    public Hashtable<String,Integer> getCounterTable() {
    	Hashtable<String,Integer> retval = new Hashtable<String,Integer>();
    	Hashtable<String,String> sign = getTable();
    	String[] keys = new String[sign.size()];
    	sign.keySet().toArray(keys);
    	for (int i = 0; i < keys.length; i++) {
    		String signTemp = sign.get(keys[i]);
    		int temp = this.getSignatureLen(signTemp);
    		retval.put(keys[i],temp);
    	}
    	return retval;
    }
    
    public boolean isValid() {
    	return (this.getCounterTable().size() > 0);
    }
    
    protected int getSignatureLen(String signature) {
    	StringTokenizer st = new StringTokenizer(signature,",");
    	return st.countTokens();
    }
    
    public Vector<String> getSuffix() {
    	Vector<String> retval = new Vector<String>(); 
		return retval;
    }
    
	public DataToTransition getDh() {
		return dh;
	}

	public void setDh(DataToTransition dh) {
		this.dh = dh;
	}
}
