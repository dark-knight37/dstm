package org.prgmdl.dstmverifier.data.types;

import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.ABoolBasic;
import org.prgmdl.dstmverifier.data.node.AChanBasic;
import org.prgmdl.dstmverifier.data.node.AChantBasic;
import org.prgmdl.dstmverifier.data.node.AChantVarType;
import org.prgmdl.dstmverifier.data.node.AENameBasic;
import org.prgmdl.dstmverifier.data.node.AENameVarType;
import org.prgmdl.dstmverifier.data.node.AIdentifierEName;
import org.prgmdl.dstmverifier.data.node.AIdentifierENameUse;
import org.prgmdl.dstmverifier.data.node.AIdentifierMultitypeNameUse;
import org.prgmdl.dstmverifier.data.node.AIntBasic;
import org.prgmdl.dstmverifier.data.node.ASimpleDefined;

public class BasicAnalyser extends TypeAnalyser {

    public BasicAnalyser(String chName) {
		super(chName);
	}

    public void inAIdentifierEName(AIdentifierEName node) {
    	String typeName = TokenFinderFacade.definedFinder(node);
        this.signatures.put(this.baseName,typeName);
    }
    
    public void inAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node) {
    	String typeName = TokenFinderFacade.definedFinder(node);
        this.signatures.put(this.baseName,typeName);
    }

    public void inAENameVarType(AENameVarType node) {
    	String typeName = TokenFinderFacade.definedFinder(node);
        this.signatures.put(this.baseName,typeName);
    }

    public void inAENameBasic(AENameBasic node) {
    	String typeName = TokenFinderFacade.definedFinder(node);
        this.signatures.put(this.baseName,typeName);
    }

    public void inABoolBasic(ABoolBasic node) {
        this.signatures.put(this.baseName,"Bool");
    }

    public void inAIntBasic(AIntBasic node) {
        this.signatures.put(this.baseName,"Int");
    }
    
    public void inAChanBasic(AChanBasic node) {
        this.signatures.put(this.baseName,"Chn");
    }

    public void inAChantBasic(AChantBasic node) {
    	String typeName = TokenFinderFacade.typeFinder(node);
        this.signatures.put(this.baseName,typeName);
    }
    
    public void inAChantVarType(AChantVarType node) {
    	ASimpleDefined n = (ASimpleDefined) node.getDefined();
    	String core = n.getIdentifier().getText();
        this.signatures.put(this.baseName,"Chn[" + core + "]");
    }

    public String getType() {
    	String[] key = new String[1];
    	this.signatures.keySet().toArray(key);
    	return this.signatures.get(key[0]);
    }
}