package org.prgmdl.merge;

import java.io.IOException;
import java.io.PushbackReader;

import org.prgmdl.dstmverifier.data.lexer.Lexer;
import org.prgmdl.dstmverifier.data.lexer.LexerException;
import org.prgmdl.dstmverifier.data.node.Start;
import org.prgmdl.dstmverifier.data.parser.Parser;
import org.prgmdl.dstmverifier.data.parser.ParserException;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.utilities.PBFactory;

public class SimpleModelMerge implements ModelMerge {

	public DSTM mergeModel(DSTM model, String declarations) throws LexingException, ParsingException, IOException {
		DSTM retval = null;
		PushbackReader decs = PBFactory.getPBR(declarations);
		DataManipulatorImpl ddm = new DataManipulatorImpl(model);
		DataExplorer de = new DataExplorer(ddm);		
		Lexer lexer = new Lexer(decs); 
		Parser parser = new Parser(lexer); 
		Start ast;
		try {
			ast = parser.parse();
		} catch (ParserException e) {
			throw new ParsingException(e.getMessage());
		} catch (LexerException e) {
			throw new LexingException(e.getMessage());
		}
		ast.apply(de);
		retval = de.getDSTM();
		return retval;
	}
}