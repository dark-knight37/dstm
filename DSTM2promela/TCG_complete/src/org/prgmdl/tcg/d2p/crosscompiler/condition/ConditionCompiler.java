package org.prgmdl.tcg.d2p.crosscompiler.condition;

import java.io.PushbackReader;
import java.io.StringReader;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.condition.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.condition.node.Start;
import org.prgmdl.dstmverifier.transition.condition.parser.Parser;
import org.prgmdl.tcg.d2p.crosscompiler.FeatureCompiler;
import org.prgmdl.tcg.d2p.crosscompiler.trigger.TriggerTesqelGenerator;
import org.prgmdl.tcg.d2p.crosscompiler.trigger.TriggerTranslator;

public class ConditionCompiler extends FeatureCompiler {

	public ConditionCompiler(DataToTransition dh) {
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
			System.out.print("COND/" + s + " --> ");
			ast = parser.parse();
			ConditionTranslator ct = new ConditionTranslator(dataHandler);
			ast.apply(ct);
			this.translation = ct.getString();
			System.out.println(this.translation);
			ConditionTesqelGenerator ctg = new ConditionTesqelGenerator(dataHandler);
			ast.apply(ctg);
			this.phases = ctg.getPhases();
			System.out.println("#TSQL -->" + this.phases.toString());
			retval = true;
			System.out.println("OK " + s);
			System.out.println();
		} catch (Exception e) {
			retval = false;
			e.printStackTrace();
		}
		return retval;
	}
}
