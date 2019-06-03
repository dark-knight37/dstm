package org.prgmdl.dstmverifier.data;

import java.util.Enumeration;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.finder.ChTypeFinder;
import org.prgmdl.dstmverifier.data.finder.TokenFinder;
import org.prgmdl.dstmverifier.data.node.ABasicSimpletype;
import org.prgmdl.dstmverifier.data.node.AChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclarationCompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.AEnumDeclarationEnumDeclaration;
import org.prgmdl.dstmverifier.data.node.AExternalChanDeclarationChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.AIdentifierChanName;
import org.prgmdl.dstmverifier.data.node.AIdentifierCompoundName;
import org.prgmdl.dstmverifier.data.node.AIdentifierEName;
import org.prgmdl.dstmverifier.data.node.AIdentifierMultitypeName;
import org.prgmdl.dstmverifier.data.node.AIdentifierPName;
import org.prgmdl.dstmverifier.data.node.AIdentifierVarName;
import org.prgmdl.dstmverifier.data.node.AInternalChanDeclarationChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.AParamDeclaration;
import org.prgmdl.dstmverifier.data.node.AParamDeclarationParamDeclaration;
import org.prgmdl.dstmverifier.data.node.AVariableDeclarationVariableDeclaration;
import org.prgmdl.dstmverifier.data.node.Node;
import org.prgmdl.dstmverifier.data.node.PChannelDeclaration;
import org.prgmdl.dstmverifier.data.node.TIdentifier;
import org.prgmdl.dstmverifier.data.types.EnumAnalyser;
import org.prgmdl.dstmverifier.data.types.LiteralAnalyser;

import DSTM4Rail.utilities.Utils;

public class FullAnalyser extends SimpleAnalyser implements DataToTransition {

	public boolean isParameter(String identifier) {
		boolean retval = false;
		if (this.isDefined(identifier)) {
			TIdentifier v = super.getObject(identifier);
			retval = v.parent().parent() instanceof AIdentifierPName;
		}
		return retval;
	}
	
	// Generic Section
	@Override
	public boolean isDefined(String identifier) {
		boolean retval = super.isPredefined(identifier);
		retval |= super.symbols.containsKey(identifier);
		return  retval;
	}

	// Variable Section
	protected String getVarType(AVariableDeclarationVariableDeclaration var) {
		ChTypeFinder ctf = new ChTypeFinder();
		var.apply(ctf);
		String retval = ctf.getIdentName();
		if (!ctf.found()) {
			TokenFinder tf = new TokenFinder(false,true, false, false, false);
			var.apply(tf);
			retval = (tf.noToken()) ? "" : tf.getElementAt(0).getText();
		}
		return retval;
	} 
	
	@Override
	public boolean isVarInstanceOf(String identifier, String typeName) {
		boolean retval = this.isDefined(identifier) && this.isDefined(typeName);
		retval &= this.isVariable(identifier);
		if (retval) {
			TIdentifier v = super.getObject(identifier);
			AVariableDeclarationVariableDeclaration var = (AVariableDeclarationVariableDeclaration) v.parent().parent().parent();
			String actualType = this.getVarType(var);
			retval = actualType.equals(typeName);
		}
		return retval;
	}

	
	@Override
	public boolean isChannel(String identifier) {
 		boolean retval = this.isDefined(identifier);
		if (retval) {
			TIdentifier id = super.getObject(identifier);
			retval = (id.parent().parent() instanceof AIdentifierChanName);
		}
		return retval;
	}

	@Override
	/**
	 * It verifies two stuffs:
	 * (a) if the asked identifier is defined as channel related to a multitype
	 * (b) if the typeName is used within the definition of the multitype
	 * @param identifier name of the identifier to query
	 * @param typename name of the simple type to check
	 * @return true if the conditions are both true
	 */
	public boolean isMultiTypedChannel(String identifier, String typeName) {
		boolean retval = this.isChannel(identifier);
		if (retval) {
			String mtype = this.getTypeName(identifier);
			retval = this.isMultiType(mtype);
			if (retval) {
				retval = this.isInternalToMultitype(typeName, mtype) || (mtype.equals(typeName));
			}
		}
 		return retval;
 	}
	
	protected String getChannelType(PChannelDeclaration chn) {
		TokenFinder tf = new TokenFinder(false,true, false, false, false);
		chn.apply(tf);
		return tf.getElementAt(0).getText();
	} 



	@Override
	public boolean isType(String identifier) {
 		return this.isMultiType(identifier) || this.isCompoundType(identifier) || this.isBasicType(identifier);
	}

	protected boolean isBasicType(String identifier) {
 		boolean retval = identifier.equals("Int") || identifier.equals("Bool");
 		if (!retval) {
 			if (super.isChnType(identifier)) {
 	 			retval = true;
 			} else if (this.isDefined(identifier)) {
 				TIdentifier id = super.getObject(identifier);
 				retval = (id == null) ? false : (id.parent().parent() instanceof AIdentifierEName);
 			}
 		}
		return retval;
	}

	protected boolean isCompoundType(String identifier) {
 		boolean retval = this.isDefined(identifier); 
 		if (retval) {
 			TIdentifier id = super.getObject(identifier);
 			retval = (id == null) ? false : (id.parent().parent() instanceof AIdentifierCompoundName);
		}
		return retval;
	}

	@Override
	public boolean isEnumLiteralOf(String identifier, String typeName) {
		boolean retval = this.isDefined(typeName);
 		if (retval) {
			TIdentifier ty = super.getObject(typeName);
			retval = (ty.parent().parent() instanceof AIdentifierEName);
	 		if (retval) {
	 			AEnumDeclarationEnumDeclaration ed = (AEnumDeclarationEnumDeclaration) ty.parent().parent().parent();  
	 			EnumAnalyser ea = new EnumAnalyser();
	 			ed.apply(ea);
 				retval = ea.checkExistence(identifier);
			}
		}
		return retval;
	}

	@Override
	public boolean isChanInstanceOf(String identifier, String typeName) {
		boolean retval = this.isDefined(identifier) && this.isChannel(identifier);
		if (!typeName.equals("_")) {
			retval &= this.isDefined(typeName);
			if (retval) {
				TIdentifier v = super.getObject(identifier);
				PChannelDeclaration chn = (PChannelDeclaration) v.parent().parent().parent();
				String actualType = this.getChannelType(chn);
				retval = actualType.equals(typeName);
			}
		}
		return retval;
	}

	@Override
	public boolean isVariable(String identifier) {
 		boolean retval = this.isDefined(identifier);
		if (retval) {
			TIdentifier id = super.getObject(identifier);
			retval = (id.parent().parent() instanceof AIdentifierVarName);
		}
		return retval;
	}

	@Override
	public boolean isParameter(String identifier, String machineName) {
		boolean retval = false;
		if (this.isDefined(identifier)) {
			TIdentifier v = super.getObject(identifier);
			Node n = v.parent().parent().parent();
			if (n instanceof AParamDeclarationParamDeclaration) {
				AParamDeclarationParamDeclaration pad = (AParamDeclarationParamDeclaration) v.parent().parent().parent();
				TokenFinder tf = new TokenFinder(false,false,true, false, false);
				pad.apply(tf);
				retval = tf.getElementAt(0).getText().equals(machineName);
			}
		}
		return retval;
	}

	@Override
	/**
	 * This method checks if a simple type name is used within the definition of a multitype
	 * @param typeName name of the type to check as defined and simple
	 * @param multitypeName name of the type to check as defined and multitype
	 * @return true if the conditions are fulfilled
	 */
	public boolean isInternalToMultitype(String typeName, String multiTypeId) {
		boolean retval = (this.isSimpleType(typeName) || this.isCompound(typeName))&& this.isMultiType(multiTypeId);
		if (retval) {
			Vector<String> signature = this.getSignatureFromMtype(this.mtypes.get(multiTypeId));
			retval = Utils.genericExistenceCheck(signature, typeName);
		}
		return retval;
	}

	private boolean checkChnTuple(String item, Vector<String> typeName) {
		boolean retval = false;
		Vector<Vector<String>> expandedTypes = new Vector<Vector<String>>(); 
		String itemType = this.getTypeName(item);		
		boolean ctrlFlag = true;
		if (ctrlFlag == true) {
			// Building of the expanded list
			Node n = this.getObject(itemType);
			if (this.isMultiType(itemType)) {
				AMultitypeDeclarationMultitypeDeclaration at = (AMultitypeDeclarationMultitypeDeclaration) n.parent().parent().parent();
				Vector<String> temp = this.getSignatureFromMtype(at);
				for (int i=0; i<temp.size(); i++) {
					Node m = this.getObject(temp.elementAt(i));
					Node ppp = m.parent().parent().parent();
					if (ppp instanceof ACompoundDeclarationCompoundDeclaration) {
						expandedTypes.add(this.getSignatureFromStype((ACompoundDeclarationCompoundDeclaration)ppp));
//					} else if () {
					} else {
						/*
						DefinedFinder df = new DefinedFinder();
						ppp.apply(df);
						expandedTypes.add(df.getTokens());
						*/
						Vector<String> vTmp = new Vector<String>();
						TIdentifier ident = (TIdentifier) m;
						vTmp.add(ident.getText());
						expandedTypes.add(vTmp);
					}
				}
			} else if (this.isBasic(itemType)) {
				Vector<String> temp = new Vector<String>();
				temp.add(itemType);
				expandedTypes.add(temp);
			} else {
				ACompoundDeclarationCompoundDeclaration acd = (ACompoundDeclarationCompoundDeclaration) n.parent().parent().parent();  
				expandedTypes.add(this.getSignatureFromStype(acd));
			}
			// Comparisons
			int i = 0;
			String s0 = Utils.getSignature(typeName); 
			while ((retval == false) && (i<expandedTypes.size())) {
				String s1 = Utils.getSignature(expandedTypes.elementAt(i));
				retval = Utils.signatureComparison(s1,s0);
				i++;
			}			
		}
		return retval;
	}
	
	private boolean checkParTuple(String item, Vector<String> typeName) {
		boolean retval = false;
		Vector<Vector<String>> expandedTypes = new Vector<Vector<String>>(); 
		String itemType = this.getTypeName(item);
		
		boolean ctrlFlag = true;
		if (!this.isChannel(item)) {
			// Start the checks for the parameter
			ctrlFlag = itemType.startsWith("Chn");
			if (ctrlFlag == true) {
				itemType = Utils.extractTypeFromChn(itemType);
			}
		}

		if (ctrlFlag == true) {
			// Building of the expanded list
			Node n = this.getObject(itemType);
			if (this.isMultiType(itemType)) {
				AMultitypeDeclarationMultitypeDeclaration at = (AMultitypeDeclarationMultitypeDeclaration) n.parent().parent().parent();
				Vector<String> temp = this.getSignatureFromMtype(at);
				for (int i=0; i<temp.size(); i++) {
					Node m = this.getObject(temp.elementAt(i));
					ACompoundDeclarationCompoundDeclaration st = (ACompoundDeclarationCompoundDeclaration) m.parent().parent().parent();  
					expandedTypes.add(this.getSignatureFromStype(st));
				}
			} else if (this.isBasic(itemType)) {
				Vector<String> temp = new Vector<String>();
				temp.add(itemType);
				expandedTypes.add(temp);
			} else {
				ACompoundDeclarationCompoundDeclaration acd = (ACompoundDeclarationCompoundDeclaration) n.parent().parent().parent();  
				expandedTypes.add(this.getSignatureFromStype(acd));
			}
			// Comparisons
			int i = 0;
			String s0 = Utils.getSignature(typeName); 
			while ((retval == false) && (i<expandedTypes.size())) {
				String s1 = Utils.getSignature(expandedTypes.elementAt(i));
				retval = Utils.signatureComparison(s1,s0);
				i++;
			}
			
		}
		return retval;
	}

	@Override
	/**
	 * It verifies if the asked identifier is defined as a channel belonging to a type. More specifically:
	 * (a) if the identifier is a channel of a simple (basic or compound), it checks that the passed list of types is exactly the simple type of the channel
	 * i.e.  typeName = [Int,T] --> the type of the channel is a simple defined as <Int,T>;
	 * (b) if the identifier is a channel of a multitype, it checks that the passed list of types is one of the simple type on which the multitype is defined on
	 * i.e.  typeName = [Int,T] --> the type of the channel is a multitype defined as {<Int,T>, Y};
	 * @param identifier name of the channel to query
	 * @param typename list of the type names composing the simple type
	 * @return true if all the conditions are verified, false otherwise
	 */
	public boolean isChanInstanceOf(String channel, Vector<String> typeName) {
		boolean sanityCheck = this.isDefined(channel) && this.isChannel(channel);
		boolean retval = (sanityCheck) ? this.checkChnTuple(channel, typeName) : false;
		return retval;
	}

	@Override
	public boolean isMultiType(String identifier) {
 		boolean retval = this.isDefined(identifier); 
 		if (retval) {
			TIdentifier id = super.getObject(identifier);
			retval = (id == null) ? false : (id.parent().parent() instanceof AIdentifierMultitypeName);
 		}
		return retval;
	}

	@Override
	public boolean isCompound(String identifier) {
		return this.isCompoundType(identifier);
	}

	@Override
	public boolean isBasic(String identifier) {
		return this.isBasicType(identifier);
	}

	@Override
	public boolean isSimpleType(String identifier) {
		return this.isBasic(identifier) || this.isCompound(identifier);
	}

	@Override
	public boolean isParInstanceOf(String identifier, String typeName) {
		boolean retval = false;
		if (this.isDefined(identifier)) {
			TIdentifier v = super.getObject(identifier);
			AParamDeclarationParamDeclaration pad = (AParamDeclarationParamDeclaration) v.parent().parent().parent();
			TokenFinder tf = new TokenFinder(false,true,false, false, false);
			pad.apply(tf);
			retval = tf.getElementAt(0).getText().equals(typeName);
		}
		return retval;
	}

	public boolean isParInstanceOf(String identifier, Vector<String> typeName) {
		boolean sanityCheck = this.isDefined(identifier) && this.isParameter(identifier);
		boolean retval = (sanityCheck) ? this.checkParTuple(identifier, typeName) : false;
		return retval;
	}

	@Override
	public boolean isInternalChannel(String identifier) {
 		boolean retval = this.isDefined(identifier) && this.isChannel(identifier);
		if (retval) {
			TIdentifier id = super.getObject(identifier);
			retval = (id.parent().parent().parent() instanceof AInternalChanDeclarationChannelDeclaration);
		}
		return retval;
	}

	@Override
	public boolean isExternalChannel(String identifier) {		
 		boolean retval = this.isDefined(identifier) && this.isChannel(identifier);
		if (retval) {
			TIdentifier id = super.getObject(identifier);
			retval = (id.parent().parent().parent() instanceof AExternalChanDeclarationChannelDeclaration);
		}
		return retval;
	}
	
	

	@Override
	public String getTypeName(String idf) {
		idf = idf.trim();
		String retval = null;
		if (!this.isBoolConstant(idf)) {
			boolean flag = this.isVariable(idf) || this.isParameter(idf) || this.isChannel(idf);
			if (flag) {
				TIdentifier id = super.getObject(idf);
				Node hook = id.parent().parent().parent();
				ChTypeFinder ctf = new ChTypeFinder();
				hook.apply(ctf);
				retval = ctf.getIdentName();
				if (!ctf.found()) {
					TokenFinder tf = new TokenFinder(false,true, false, false, false);
					hook.apply(tf);
					retval = tf.getElementAt(0).getText();
				}
			} else {
				LiteralAnalyser la = new LiteralAnalyser(idf);
				Node root = this.root();
				root.apply(la);
				retval = la.getEnumName();  
			}
			
		} else {
			retval = "Bool";
		}
		return retval;
	}

	private boolean isBoolConstant(String idf) {
		return idf.equals("true") || idf.equals("false");
	}

	private Node root() {
		Node p = this.symbols.get(this.symbols.keys().nextElement());
		Node s = null;
		do {
			s = p;
			p = p.parent();
		} while (p != null);
		return s;
	}

	@Override
	public Vector<String> declaredParameters(String machine) {
		Vector<String> retval = new Vector<String>();
		Enumeration<String> sym = this.symbols.keys();
		while (sym.hasMoreElements()) {
			String temp = sym.nextElement();
			if (this.isParameter(temp,machine)) {
				retval.add(temp);
			}
		}
		return retval;
	}
	
	public ACompoundDeclarationCompoundDeclaration getCompoundNode(String name) {
		return this.ctypes.get(name);
	}
	
	public AMultitypeDeclarationMultitypeDeclaration getMultitypeNode(String name) {
		return this.mtypes.get(name);
	}
	
	public ABasicSimpletype getBasicNode(String name) {
		ABasicSimpletype retval = null;
		Node startnode = this.symbols.get(name);
		boolean contflag = true;
		boolean safetyflag = (startnode != null);
		while (safetyflag && contflag) {
			contflag = !(startnode instanceof ABasicSimpletype);
			if (contflag == true) {
				startnode = startnode.parent();
				safetyflag = (startnode != null);
			}
		}
		if (!contflag) {
			retval = (ABasicSimpletype) startnode;
		}
		return retval;
/*
 * 		Node retval = this.symbols.get(name);
		boolean contflag = !(retval instanceof ABasicSimpletype);
		boolean safetyflag = (retval != null);
		while () {
			retval = retval.parent();
			
			contflag = !(retval instanceof ABasicSimpletype);
		}
		return (ABasicSimpletype) retval;
*/
	}
	
	public AChannelDeclaration getBasicChanNode(String name) {
		AChannelDeclaration retval = null;
		Node startnode = this.symbols.get(name);
		boolean contflag = true;
		boolean safetyflag = (startnode != null);
		while (safetyflag && contflag) {
			contflag = !(startnode instanceof AChannelDeclaration);
			if (contflag == true) {
				startnode = startnode.parent();
				safetyflag = (startnode != null);
			}
		}
		if (!contflag) {
			retval = (AChannelDeclaration) startnode;
		}
		return retval;
	}
	
	

	@Override
	public Node getTypeNode(String name) {
		Node retval = null;
		if (this.isMultiType(name) == true) {
			retval = this.getMultitypeNode(name);
		} else if (this.isCompound(name) == true) {
			retval = this.getCompoundNode(name);
		} else if (this.isParameter(name)) {
			retval = this.getBasicParamNode(name);
		} else {
			retval = this.getBasicNode(name);
			if (retval == null) {
				retval = this.getBasicChanNode(name);				
			}				
		}
		return retval;
	}

	private Node getBasicParamNode(String name) {
		AParamDeclaration retval = null;
		Node startnode = this.symbols.get(name);
		boolean contflag = true;
		boolean safetyflag = (startnode != null);
		while (safetyflag && contflag) {
			contflag = !(startnode instanceof AParamDeclaration);
			if (contflag == true) {
				startnode = startnode.parent();
				safetyflag = (startnode != null);
			}
		}
		if (!contflag) {
			retval = (AParamDeclaration) startnode;
		}
		return retval;
	}

	@Override
	public Vector<String> getChannels(String type) {
		Vector<String> retval = new Vector<String>();
		for (String symbol: this.symbols.keySet()) {
			if (this.isChannel(symbol)) {
				String actualType = this.getTypeName(symbol);
				if (actualType.equals(type)) {
					retval.add(symbol);
				}
			}
		}
		return retval;
	}
}


/*

	@Override
	public String getTypeName(String identifier) {
		ChTypeFinder ctf = new ChTypeFinder();
		var.apply(ctf);
		String retval = ctf.getIdentName();
		if (!ctf.found()) {
			TokenFinder tf = new TokenFinder(false,true, false, false);
			var.apply(tf);
			retval = (tf.noToken()) ? "" : tf.getElementAt(0).getText();
		}
		return retval;

		
		TokenFinder tf = new TokenFinder(false, true, false, false);
		boolean flag = this.isVariable(identifier) || this.isParameter(identifier) || this.isChannel(identifier); 
		if (flag) {
			TIdentifier id = super.getObject(identifier);
			Node hook = id.parent().parent().parent();
			hook.apply(tf);
		}
		String retval = tf.getElementAt(0).getText();
		return retval;
	}

*/