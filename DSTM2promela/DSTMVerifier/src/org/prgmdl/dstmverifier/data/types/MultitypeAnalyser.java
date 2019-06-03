package org.prgmdl.dstmverifier.data.types;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.AMultiType;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.ASimpletypeListSimpletypeList;
import org.prgmdl.dstmverifier.data.node.Node;

public class MultitypeAnalyser extends TypeAnalyser {
	
	protected Vector<String> suffixes;
	
    public MultitypeAnalyser(String chname) {
		super(chname);
		this.suffixes = new Vector<String>();
	}
    
    public void inASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node) {
        String typeName = TokenFinderFacade.definedFinder(node);
        CompoundAnalyser ca = new CompoundAnalyser(typeName);
        ca.setDh(this.dh);
        
        Node xxx = this.dh.getTypeNode(node.toString().trim());
        xxx.apply(ca);
        
//        node.apply(ca);
        String key = this.baseName + "_" + typeName;
        String temp = ca.getType();
        this.signatures.put(key,temp);
        this.suffixes.add("_" + typeName);
    }
    
    public void inAMultiType(AMultiType node) {
    	if (this.dh != null) {
    		String name = TokenFinderFacade.definedFinder(node);
    		AMultitypeDeclarationMultitypeDeclaration amdmd = this.dh.getMultitypeNode(name);
    		MultitypeSolutor mta = new MultitypeSolutor(this.baseName,this.dh);
    		amdmd.apply(mta);
    		this.signatures.putAll(mta.getTable());
    	}
    }

    
    public Vector<String> getSuffix() { 
		return this.suffixes;
    }

}