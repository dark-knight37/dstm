package org.prgmdl.dstmverifier.data;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.finder.ExtendedTypeFinder;
import org.prgmdl.dstmverifier.data.finder.TokenFinder;
import org.prgmdl.dstmverifier.data.finder.TokenFinderFacade;
import org.prgmdl.dstmverifier.data.node.AChantBasic;
import org.prgmdl.dstmverifier.data.node.AChantVarType;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclarationCompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.AIdentifierChanName;
import org.prgmdl.dstmverifier.data.node.AIdentifierCompoundName;
import org.prgmdl.dstmverifier.data.node.AIdentifierEName;
import org.prgmdl.dstmverifier.data.node.AIdentifierMultitypeName;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.ANotation;
import org.prgmdl.dstmverifier.data.node.ASimpleDefined;
import org.prgmdl.dstmverifier.data.node.ASimpleUnique;
import org.prgmdl.dstmverifier.data.node.Node;
import org.prgmdl.dstmverifier.data.node.TIdentifier;
import org.prgmdl.dstmverifier.data.node.Token;

import DSTM4Rail.exceptions.DataViolation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.Utils;


/**
 * This analyser checks the semantic constraints on the definition of data types, channels and variables  
 * @author Stefano Marrone
 */
public class SimpleAnalyser extends AbstractAnalyser {

	/**
	 * It contains the list of the symbols that must be unique in all the data file 
	 */
	protected Hashtable<String,TIdentifier> symbols = new Hashtable<String,TIdentifier>();


	/**
	 * It contains the list of the multitype for semantic check 
	 */
	protected Hashtable<String,AMultitypeDeclarationMultitypeDeclaration> mtypes = new Hashtable<String,AMultitypeDeclarationMultitypeDeclaration>();
	
	/**
	 * It contains the list of the compound types for semantic check 
	 */
	protected Hashtable<String,ACompoundDeclarationCompoundDeclaration> ctypes = new Hashtable<String,ACompoundDeclarationCompoundDeclaration>();

	/**
	 * It return the TIdentifier object from symbol hashtable.
	 * From the Tdentifier is then possible to retrieve the kind of node
	 * @param ident the name of the identifier to extract 
	 * @return related TIdentifier in the symbol table
	 */
	protected TIdentifier getObject(String ident) {
		return this.symbols.get(ident); 
	}
	
	/**
	 * It checks if the identifier name is already present in symbol table. In the positive case, it generated a violation. The generated violation would be tagged with the DUPID tag. 
	 * @param ident the name of the identifier to verify
	 */
	protected void verifyDuplicatedIdentifier(TIdentifier ident) {
		String key = ident.getText();
		if (this.symbols.containsKey(key)) {
			this.violations.add(new DataViolation(ViolationKind.DUPID,ident.getLine(),ident.getPos()));
		} else {
			this.symbols.put(key,ident);
		}
	}

	/**
	 * It checks if the identifier name is not present in symbol table. In the positive case, it generated a violation. The generated violation would be tagged with the UNDID tag.
	 * @param ident the name of the identifier to verify
	 */
	protected void verifyUndeclaredIdentifier(TIdentifier ident) {
		String key =  ident.getText();
		if (!this.symbols.containsKey(key)) {
			this.violations.add(new DataViolation(ViolationKind.UNDID,ident.getLine(),ident.getPos()));
		}
	}

	/**
	 * It retrieves the list of identifiers related to the multiype subtypes 
	 * @param amtype multitype on which per operation is performed 
	 * @return the list of subtypes
	 */
	public static Vector<Token> getSubIdentifiersInMtype(AMultitypeDeclarationMultitypeDeclaration amtype) {
		TokenFinder iff = new TokenFinder(false,true, false, false, false);
		amtype.apply(iff);
		return iff.getTokens();
	}

	/**
	 * It retrieves the list of identifiers related to the compound sub-types 
	 * @param actype compound on which per operation is performed 
	 * @return the list of sub-types
	 */
	public static Vector<String> getSubIdentifiersInCtype(ACompoundDeclarationCompoundDeclaration actype) {
//		TokenFinder iff = new TokenFinder(false,true, false, false, true);
//		actype.apply(iff);
//		return iff.getTokens();
		ExtendedTypeFinder etf = new ExtendedTypeFinder();
		actype.apply(etf);
		return etf.getTypes();
	}	
	
	/**
	 * It checks if there is an Mtype in the definition of another MType. In case, it generates a violation with the MTINMT code.
	 */
	protected void mtypeInMtype() {
		Enumeration<String> keys = this.mtypes.keys();
		while (keys.hasMoreElements()) {
			AMultitypeDeclarationMultitypeDeclaration node = this.mtypes.get(keys.nextElement());
			Vector<Token> tis = SimpleAnalyser.getSubIdentifiersInMtype(node);
			int size = tis.size();
			int i = 0; 
			boolean vFlag = false;
			while ((vFlag == false) && (i<size)) {
				vFlag = this.mtypes.containsKey(tis.elementAt(i).getText());
				if (vFlag) {
					this.violations.add(new DataViolation(ViolationKind.MTINMT,tis.elementAt(i).getLine(),tis.elementAt(i).getPos()));
				}
				i++;
			}
		}
	}

	
	/**
	 * It extracts the signature of a Mtype     
	 */
	protected Vector<String> getSignatureFromMtype(AMultitypeDeclarationMultitypeDeclaration amtype) {
		TokenFinder iff = new TokenFinder(false,true, false, false, false);
		amtype.apply(iff);
		return iff.getTiNames();
	}
	
	protected Vector<String> getSignatureFromStype(ACompoundDeclarationCompoundDeclaration astype) {
		TokenFinder iff = new TokenFinder(false,true, false, false, true);
		astype.apply(iff);
		return iff.getTiNames();
	}
	
	/**
	 * It checks if every Mtypes does not contain duplication in its definition. In case, it generates a violation with the DUPMTY code.     
	 */
	protected void duplicationInMtype() {
		Enumeration<String> keys = this.mtypes.keys();
		while (keys.hasMoreElements()) {
			AMultitypeDeclarationMultitypeDeclaration amtype = this.mtypes.get(keys.nextElement());
			TokenFinder iff = new TokenFinder(false,true, false, false, false);
			amtype.apply(iff);
			Vector<String> identList = iff.getTiNames();
			boolean vFlag = Utils.isThereDuplication(identList);
			if (vFlag) {
				TokenFinder local = new TokenFinder();
				amtype.apply(local);
				this.violations.add(new DataViolation(ViolationKind.DUPMTY,local.getLine(),local.getPos()));
			}
		}
	} 

	/**
	 * It checks if all the Mtypes have different signature. In case, it generates a violation with the SIGMTY code.
	 */
	protected void signtureInMtype() {
		Enumeration<String> keys = this.mtypes.keys();
		Vector<String> signatures = new Vector<String>();
		while (keys.hasMoreElements()) {
			Vector<String> identList = this.getSignatureFromMtype(this.mtypes.get(keys.nextElement()));
			signatures.add(Utils.getSignature(identList));
		}
		if (Utils.isThereDuplication(signatures)) {
			this.violations.add(new DataViolation(ViolationKind.SIGMTY,0,0));
		}
	} 
	
	/**
	 * It checks if there is a Ctype/Mtype in the definition of another CType. In case, it generates a violation with the CMINCNP code.   
	 */
	protected void mctypeInCtype() {
		Enumeration<String> keys = this.ctypes.keys();
		while (keys.hasMoreElements()) {
			ACompoundDeclarationCompoundDeclaration key = this.ctypes.get(keys.nextElement());
			Vector<String> tis = SimpleAnalyser.getSubIdentifiersInCtype(key);
			int size = tis.size();
			int i = 0; 
			boolean vFlag = false;
			while ((vFlag == false) && (i<size)) {
				String temp = tis.elementAt(i);
				vFlag = this.mtypes.containsKey(temp) || this.ctypes.containsKey(temp);
				if (vFlag) {
					this.violations.add(new DataViolation(ViolationKind.CMINCNP,0,0));
				}
				i++;
			}
		}
	} 

	/**
	 * It checks if all the Ctypes have different signature. In case, it generates a violation with the SIGCNP code.
	 */
	protected void signtureInCtype() {
		Enumeration<String> keys = this.ctypes.keys();
		Vector<String> signatures = new Vector<String>();
		while (keys.hasMoreElements()) {
			ACompoundDeclarationCompoundDeclaration actype = this.ctypes.get(keys.nextElement());
			TokenFinder iff = new TokenFinder(false,true, false, false, false);
			actype.apply(iff);
			Vector<String> identList = iff.getTiNames();
			signatures.add(Utils.getSignature(identList));
		}
		if (Utils.isThereDuplication(signatures)) {
			this.violations.add(new DataViolation(ViolationKind.SIGCNP,0,0));
		}
	} 

	/**
	 * It checks if the identifier is unique
	 * @param node node representing the identifier for which the uniqueness must be tested
	 */
    public void inASimpleUnique(ASimpleUnique node) {
        this.verifyDuplicatedIdentifier(node.getIdentifier());
    }

	/**
	 * It checks if the identifier has been already defined 
	 * @param node node representing the identifier for which the definition must be tested
	 */
    public void outASimpleDefined(ASimpleDefined node) {
        this.verifyUndeclaredIdentifier(node.getIdentifier());
    }
    
	/**
	 * It adds the compound in the related hash-table 
	 * @param node node representing the compound
	 */
    public void inACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node) {
    	TokenFinder finder = new TokenFinder();
    	node.apply(finder);
    	String identName = finder.getIdentName();
    	this.ctypes.put(identName,node);
    }
    
	/**
	 * It adds the multitype in the related hash-table 
	 * @param node node representing the multitype
	 */
    public void inAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node) {
    	TokenFinder finder = new TokenFinder();
    	node.apply(finder);
    	String identName = finder.getIdentName();
    	this.mtypes.put(identName,node);
    }
    
    private void natChecking(Node node) {
    	String typeName = TokenFinderFacade.definedFinder(node);
//    	String typeName = TokenFinderFacade.typeFinder(node);
    	boolean flag = typeName.equals("Chn") || typeName.equals("Int") || typeName.equals("Bool");   
    	if (!flag) {
    		TIdentifier id = this.symbols.get(typeName);
    		flag |= (id.parent().parent() instanceof AIdentifierMultitypeName); 
    		flag |= (id.parent().parent() instanceof AIdentifierCompoundName); 
    		flag |= (id.parent().parent() instanceof AIdentifierEName); 
    		if (!flag) {
    			this.violations.add(new DataViolation(ViolationKind.NAT,id.getLine(),id.getPos()));            	
    		}
    	}
    }

	/**
	 * It verifies that the channel is defined over a type and not over a variable/parameter
	 * @param node node representing the channel definition
	 */
    public void outAChantBasic(AChantBasic node) {
    	this.natChecking(node);
    }

	/**
	 * It verifies that the channel is defined over a type and not over a variable/parameter
	 * @param node node representing the channel definition
	 */
    public void outAChantVarType(AChantVarType node) {
        this.natChecking(node);
    }

    
    
	/**
	 * As an exiting point from the entire AST exploration, this method invokes the following checks:
	 * <UL>
	 *  <LI> each tMultiType must not contain tMultiTypes (MTINMT);
	 *  <LI> each tMultiType must not contain the same type more than one time (it should be possible to distinguish between subtypes)	(DUPMTY);
	 *  <LI> it is not possible that two tMultiTypes have the same internal structure (in terms of ordered list of subtypes) (SIGMTY);
	 *  <LI> each tCompound must not contain tCompunds and tMultiTypes (CMINCNP);
	 *  <LI> it is not possible that two tCompunds have the same internal structure (in terms of ordered list of subtypes)	(SIGCNP).
	 * </UL>
	 * @param node node representing root of the AST
	 */
    public void outANotation(ANotation node) {
		mtypeInMtype();
		duplicationInMtype();
		signtureInMtype();
		mctypeInCtype();
		signtureInCtype();
   	}

	public boolean isPredefined(String identifier) {
		return identifier.equals("Int") || identifier.equals("Bool");
	}

	// Debug purposes only
    public void inANotation(ANotation node) {
        defaultIn(node);
    }

	public boolean isChnType(String identifier) {
		boolean retval = identifier.startsWith("Chn[") && identifier.endsWith("]");
		if (retval) {
			String temp = identifier.substring(4,identifier.length()-1);
			retval = this.symbols.containsKey(temp);
		}
		return retval;
	}

    public void outAIdentifierChanName(AIdentifierChanName node) {
    	String chname = TokenFinderFacade.uniqueFinder(node);
    	if (chname.contains("_")) {
    		this.violations.add(new DataViolation(ViolationKind.USCN,0,0));
    	}
    }
    


}