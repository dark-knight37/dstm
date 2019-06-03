package org.prgmdl.dstmverifier.data.types;

import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.node.ABasicListBasicList;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclarationCompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.AListsBasicList;
import org.prgmdl.dstmverifier.data.node.Node;

public class CompoundAnalyser extends TypeAnalyser {
	
	protected Vector<String> expansion;
	
	private boolean expansionFlag;
	
	public CompoundAnalyser(String chName) {
		super(chName);
		this.expansion = new Vector<String>();
		this.expansionFlag = false;
	}

	public void inABasicListBasicList(ABasicListBasicList node) {
        BasicAnalyser ba = new BasicAnalyser("");
        node.apply(ba);
        String type = ba.getType();
        this.add(type);
    }
	
    public Hashtable<String,String> getTable() {
    	Hashtable<String,String> retval = signatures;
    	if (this.expansionFlag) {
    		int size = this.expansion.size();
    		String temp = "[";
    		for (int i=0; i<size; i++) {
    			temp += this.expansion.elementAt(i) + ",";
    		}
    		temp = temp.substring(0,temp.length()-1) + "]";
    		retval = new Hashtable<String,String>();
    		String [] temptemp = new String[1]; 
        	this.signatures.keySet().toArray(temptemp);
    		retval.put(temptemp[0],temp);
    	}
    	return retval;
    }

	private void add(String type) {
        if (this.dh.isMultiType(type)) {
        	this.expansionFlag = true;
			SpecialisedMultitypeAnalyser mta = new SpecialisedMultitypeAnalyser("");
			mta.setDh(this.dh);
			Node t = this.dh.getTypeNode(type);
			t.apply(mta);
			Vector<String> tkeys = mta.getSuffix();
			for (String ss: tkeys) {
	        	this.expansion.add(ss);
			}
        } else {
        	this.expansion.add(type);
        }
	}

	public void outAListsBasicList(AListsBasicList node) {
        BasicAnalyser ba = new BasicAnalyser("");
        node.getBasic().apply(ba);
        this.add(ba.getType());
    }

	public void outACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node) {
    	String temp = node.getBasicList().toString().trim().replace(" ","");
    	this.signatures.put(this.baseName,temp);
    }
    
    public String getType() {
    	String[] key = new String[1];
    	this.signatures.keySet().toArray(key);
    	return this.signatures.get(key[0]);
    }
}