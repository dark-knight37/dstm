package org.prgmdl.dstmverifier.data;

import java.io.IOException;

import org.prgmdl.dstmverifier.data.lexer.Lexer;
import org.prgmdl.dstmverifier.data.lexer.LexerException;
import org.prgmdl.dstmverifier.data.node.Start;
import org.prgmdl.dstmverifier.data.parser.Parser;
import org.prgmdl.dstmverifier.data.parser.ParserException;

import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;
import DSTM4Rail.utilities.PBFactory;

public class FullAnalyserFactory {

	public static FullAnalyser factory(String declarations) throws IOException, ParsingException, LexingException {
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
		FullAnalyser fam = new FullAnalyser();
		ast.apply(fam);
		return fam;
	}
}