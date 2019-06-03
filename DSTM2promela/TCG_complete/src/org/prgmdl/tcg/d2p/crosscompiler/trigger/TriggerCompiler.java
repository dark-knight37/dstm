package org.prgmdl.tcg.d2p.crosscompiler.trigger;

import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.trigger.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.trigger.node.Start;
import org.prgmdl.dstmverifier.transition.trigger.parser.Parser;
import org.prgmdl.tcg.d2p.crosscompiler.FeatureCompiler;

public class TriggerCompiler extends FeatureCompiler {

	public TriggerCompiler(DataToTransition dh) {
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
			System.out.print("TRIG/" + s + " --> ");
			ast = parser.parse();
			TriggerTranslator tt = new TriggerTranslator(dataHandler);
			ast.apply(tt);
			this.translation = tt.getString();
			TriggerTesqelGenerator ttg = new TriggerTesqelGenerator(dataHandler);
			ast.apply(ttg);
			this.phases = ttg.getPhases();
			retval = true;
			System.out.println(this.translation);
		} catch (Exception e) {
			retval = false;
			e.printStackTrace();
			System.exit(0);
		}
		return retval;
	}	
}