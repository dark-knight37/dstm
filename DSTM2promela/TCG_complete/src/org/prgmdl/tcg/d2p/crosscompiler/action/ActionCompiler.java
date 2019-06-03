package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.action.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.action.node.Start;
import org.prgmdl.dstmverifier.transition.action.parser.Parser;
import org.prgmdl.tcg.d2p.crosscompiler.FeatureCompiler;

public class ActionCompiler extends FeatureCompiler {

	public ActionCompiler(DataToTransition dh) {
		super(dh);
	}

	@Override
	public boolean translate(String s) {
		this.reset();
		boolean retval = false;
		StringReader sr = new StringReader(s);
		PushbackReader pbr = new PushbackReader(sr);
		Lexer lexer = new Lexer(pbr);
		Parser parser = new Parser(lexer);
		Start ast = null;
		try {
			System.out.print("ACT/" + s + " --> ");
			ast = parser.parse();
			ActionTranslator at = new ActionTranslator(dataHandler);
			ast.apply(at);
			this.translation = at.getString();
			System.out.println(this.translation);
			ActionTesqelGenerator atg = new ActionTesqelGenerator(dataHandler);
			ast.apply(atg);
			this.phases = atg.getPhases();
//			System.out.println("#TSQL -->" + this.phases.toString());
//			System.out.println("OK " + s);
//			System.out.println();
			retval = true;
		} catch (Exception e) {
			retval = false;
			e.printStackTrace();
		}
		return retval;
	}	
}