package org.prgmdl.dstmverifier.data.types;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.ABasicSimpletype;
import org.prgmdl.dstmverifier.data.node.ACompoundSimpletype;
import org.prgmdl.dstmverifier.data.node.AMultiType;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.ASimpletypeListSimpletypeList;
import org.prgmdl.dstmverifier.data.node.Node;

public class SpecialisedMultitypeAnalyser extends MultitypeAnalyser {
	
    public SpecialisedMultitypeAnalyser(String chname) {
		super(chname);
	}
    
    public void inASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node) {
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

    public void outACompoundSimpletype(ACompoundSimpletype node) {
        String typeName = TokenFinderFacade.definedFinder(node.getCompoundNameUse());
        this.suffixes.add("_" + typeName);
    }

    public void inABasicSimpletype(ABasicSimpletype node) {
        String typeName = TokenFinderFacade.definedFinder(node.getBasic());
        this.suffixes.add("_" + typeName);
    }    
}