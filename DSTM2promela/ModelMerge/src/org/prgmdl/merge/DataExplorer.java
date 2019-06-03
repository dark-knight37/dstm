package org.prgmdl.merge;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.data.finder.DefinedFinder;
import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.AEnumDeclaration;
import org.prgmdl.dstmverifier.data.node.AExternalChanDeclarationChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.AInternalChanDeclarationChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.AParamDeclaration;
import org.prgmdl.dstmverifier.data.node.AVariableDeclaration;
import org.prgmdl.dstmverifier.data.node.Start;

import DSTM4Rail.DSTM;

public class DataExplorer extends DepthFirstAdapter {
	
	protected DSTMDataManipulator m;
	
	public DataExplorer(DSTMDataManipulator newM) {
		this.m = newM;
	}
	
	public DSTM getDSTM() {
		return this.m.getDSTM();
	}

	public void inStart(Start node) {
        this.m.clean();
    }

    public void outStart(Start node) {
        this.m.finalise();
    }
    
    public void inAParamDeclaration(AParamDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
        String type = TokenFinderFacade.typeFinder(node);
        String mach = TokenFinderFacade.externalFinder(node);
        this.m.addParameter(name, type, mach);
    }

    public void inACompoundDeclaration(ACompoundDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
        DefinedFinder df = new DefinedFinder();
        node.apply(df);
        Vector<String> types = df.getTokens();
//      System.out.println("name :"+name+"\ntypes :"+types+"\n");
        this.m.addCompound(name, types);
    }

    public void inAEnumDeclaration(AEnumDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
        Vector<String> lits = TokenFinderFacade.literalListFinder(node);
        this.m.addEnum(name, lits);
    }
    
    
    public void inAMultitypeDeclaration(AMultitypeDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
        Vector<String> types = TokenFinderFacade.definedListFinder(node);
        this.m.addMultitype(name, types);
    }
    
    public void inAVariableDeclaration(AVariableDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
        String type = TokenFinderFacade.typeFinder(node);
        this.m.addVariable(name, type);
    }
    
    public void inAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node) {
    	String name = TokenFinderFacade.uniqueFinder(node);
//    	System.out.println("channel in input: "+name);
    	String type = TokenFinderFacade.definedFinder(node);
    	this.m.addExtChannel(name, type);
    }

    public void inAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node) {
        String name = TokenFinderFacade.uniqueFinder(node);
//      System.out.println("channel in input: "+name);
        String type = TokenFinderFacade.definedFinder(node);
        int bound = new Integer(node.getNumbers().getText()).intValue(); 
        this.m.addIntChannel(name, type, bound);		
    }
}
