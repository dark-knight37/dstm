package org.prgmdl.dstmverifier.data.types;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.AbstractAnalyser;
import org.prgmdl.dstmverifier.data.finder.TokenFinder;
import org.prgmdl.dstmverifier.data.node.AEnumDeclarationEnumDeclaration;
import org.prgmdl.dstmverifier.data.node.AIdentifierLiteral;

import DSTM4Rail.exceptions.DataViolation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.Utils;

public class EnumAnalyser extends AbstractAnalyser {
	/**
	 * It is a global buffer of symbols used to contains enum literals
	 */
	protected Vector<String> literals = new Vector<String>();

	/**
	 * It add an item to the local buffer
	 * @param ident the name of the identifier to verify
	 */
	private void addLiteral(String ident) {
		this.literals.add(ident);
	}
	
	/**
	 * It clears local buffer
	 */
	public void clear() {
		this.literals.clear();
	}

    public void inAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node) {
        this.clear();
    }

    /**
	 * For each literal, this method adds the literal to the local buffer in order to check its uniqueness
	 * @see duplicationCheck
	 * @param node node representing a literal of an enumeration
	 */
	public void inAIdentifierLiteral(AIdentifierLiteral node) {
        this.addLiteral(node.getIdentifier().getText());
    }
	
	public boolean checkDuplication() {
		return Utils.isThereDuplication(this.literals);
	}
	
	public boolean checkExistence(String literal) {
		return Utils.genericExistenceCheck(this.literals,literal);
	}
	
	/**
	 * It checks the duplication of the literals in the definition of the enumeration. In case of duplication, this method generates a violation with the DUPLIT error code. 
	 * @param node node representing an enumeration declaration
	 */
    public void outAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node) {
        if (this.checkDuplication() == true) {
        	TokenFinder finder = new TokenFinder(); 
        	node.apply(finder);
        	this.violations.add(new DataViolation(ViolationKind.DUPLIT,finder.getLine(),finder.getPos()));
        }
//        this.clear();
    }
}
