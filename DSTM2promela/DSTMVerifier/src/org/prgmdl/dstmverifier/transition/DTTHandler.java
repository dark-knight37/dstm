package org.prgmdl.dstmverifier.transition;

import java.io.IOException;
import java.io.PushbackReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.FullAnalyser;
import org.prgmdl.dstmverifier.data.lexer.Lexer;
import org.prgmdl.dstmverifier.data.lexer.LexerException;
import org.prgmdl.dstmverifier.data.node.Start;
import org.prgmdl.dstmverifier.data.parser.Parser;
import org.prgmdl.dstmverifier.data.parser.ParserException;

public class DTTHandler {
	
	public static DataToTransition DTTFactory(PushbackReader pb) throws ParserException, LexerException, IOException {
		Lexer lexer = new Lexer(pb); 
		Parser parser = new Parser(lexer); 
		Start ast = parser.parse();
		FullAnalyser sem = new FullAnalyser();
		ast.apply(sem);
		return sem;
	}
}
