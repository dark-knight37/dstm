package org.prgmdl.dstmverifier.data.types;

import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.ABasicSimpletype;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclarationCompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.ACompoundSimpletype;

import DSTM4Rail.utilities.Utils;

public class MultitypeSolutor extends DepthFirstAdapter {
	
	private Hashtable<String,String> table;
	
	private String base;
	
	private DataToTransition dh;
	
	public MultitypeSolutor(String basen, DataToTransition dhh) {
		this.base = basen;
		this.table = new Hashtable<String,String>();
		this.dh = dhh;
	}
	
    public void inACompoundSimpletype(ACompoundSimpletype node) {
        String compoundName = TokenFinderFacade.definedFinder(node);
        ACompoundDeclarationCompoundDeclaration cdcd =  this.dh.getCompoundNode(compoundName);
        CompoundAnalyser ca = new CompoundAnalyser(this.base);
        ca.setDh(this.dh);
        cdcd.apply(ca);
        Vector<String> keys = Utils.enum2vector(ca.getTable().keys());
        for (String k: keys) {
        	String payload = ca.getTable().get(k);
        	this.table.put(this.base + "_" + compoundName,payload);
        }
    }
    
    public void inABasicSimpletype(ABasicSimpletype node) {
        String basicName = TokenFinderFacade.definedFinder(node);
       	this.table.put(this.base + "_" + basicName,"");
    }
    
    public Hashtable<String,String> getTable() {
    	return this.table;
    }
}