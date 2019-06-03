package org.prgmdl.dstmverifier.data;

import java.io.IOException;

import org.prgmdl.dstmverifier.data.lexer.Lexer;
import org.prgmdl.dstmverifier.data.lexer.LexerException;
import org.prgmdl.dstmverifier.data.node.Start;
import org.prgmdl.dstmverifier.data.parser.Parser;
import org.prgmdl.dstmverifier.data.parser.ParserException;
import org.prgmdl.dstmverifier.data.types.EnumAnalyser;

import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.exceptions.Violation;
import DSTM4Rail.utilities.PBFactory;


public class SimpleDataVerifier implements DataVerifier {

	/**
	 * This method verifies the declaration of the types, variables and channels of the model inserted by means of a text.
	 * @see DataVerifier
	 * @author Stefano Marrone
	 */
	public boolean verifyData(String declarations) throws ParsingException, LexingException, ConstraintException, IOException {
		boolean retval = false;
		PBFactory.attach(declarations);
		Lexer lexer = new Lexer (PBFactory.getPBR()); 
		Parser parser = new Parser(lexer); 
		Start ast;
		try {
			ast = parser.parse();
		} catch (ParserException e) {
			throw new ParsingException(e.getMessage());
		} catch (LexerException e) {
			throw new LexingException(e.getMessage());
		}
		SimpleAnalyser sem = new SimpleAnalyser();
		ast.apply(sem);
		if (!sem.getViolations().isEmpty()) {
			Violation v = sem.getViolations().elementAt(0);
			throw new ConstraintException(v.toString());
		} else {
			EnumAnalyser ean = new EnumAnalyser();
			ast.apply(ean);
			if (!ean.getViolations().isEmpty()) {
				Violation v = ean.getViolations().elementAt(0);
				throw new ConstraintException(v.toString());
			} else {
				retval = true;
			}
			retval = true;
		}
		return retval;
	}	
}