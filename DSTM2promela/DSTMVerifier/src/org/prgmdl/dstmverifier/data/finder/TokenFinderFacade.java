package org.prgmdl.dstmverifier.data.finder;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.node.ACompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.Node;

public class TokenFinderFacade {
	
	public static String uniqueFinder(Node node) {
	    TokenFinder tf;
	    tf = new TokenFinder(true,false,false, false, false);
	    node.apply(tf);
	    return tf.getTiNames().elementAt(0);
	}

	public static String definedFinder(Node node) {
		Vector<String> list = TokenFinderFacade.definedListFinder(node);
	    return list.elementAt(0); 
	}

	public static String typeFinder(Node node) {
		String retval = null;
	    ChTypeFinder ctf = new ChTypeFinder();
	    node.apply(ctf);
	    if (ctf.found()) {
	    	retval = ctf.getIdentName();
	    } else {
	    	retval = TokenFinderFacade.definedListFinder(node).elementAt(0);
	    }
	    return retval;
	}

	public static Vector<String> definedListFinder(Node node) {
	    TokenFinder tf;
	    tf = new TokenFinder(false,true,false, false, false);
	    node.apply(tf);
	    return tf.getTiNames();
	}

	public static String externalFinder(Node node) {
	    TokenFinder tf;
	    tf = new TokenFinder(false,false,true, false, false);
	    node.apply(tf);
	    return tf.getTiNames().elementAt(0);
	}

	public static Vector<String> literalListFinder(Node node) {
	    TokenFinder tf;
	    tf = new TokenFinder(false,false,false,true, false);
	    node.apply(tf);
	    return tf.getTiNames();
	}

	public static Vector<String> adhocListFinder(ACompoundDeclaration node) {
	    TokenFinder tf;
	    tf = new TokenFinder(false,true,false, false, false);
	    node.apply(tf);
	    return tf.getTiNames();
	}
}
