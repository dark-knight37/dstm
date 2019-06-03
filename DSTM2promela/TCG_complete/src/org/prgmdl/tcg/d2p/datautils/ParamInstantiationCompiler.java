package org.prgmdl.tcg.d2p.datautils;

import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.types.MultitypeAnalyser;
import org.prgmdl.dstmverifier.transition.parameter.lexer.Lexer;
import org.prgmdl.dstmverifier.transition.parameter.node.Start;
import org.prgmdl.dstmverifier.transition.parameter.parser.Parser;

public class ParamInstantiationCompiler {

	protected DataToTransition dataHandler;
	
	protected Hashtable<String,String> paramTranslation;
	
	public ParamInstantiationCompiler(DataToTransition dh) {
		this.dataHandler = dh;
		this.paramTranslation = new Hashtable<String,String>();
	}

	public void translate(String s) {
		StringReader ca = new StringReader(s);
		PushbackReader a = new PushbackReader(ca);
		Lexer lexer = new Lexer(a);
		Parser parser = new Parser(lexer);
		Start ast = null;
		try {
			ast = parser.parse();
			ParamInstantiationTranslator pta = new ParamInstantiationTranslator(dataHandler);
			ast.apply(pta);
			this.paramTranslation = pta.getTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Hashtable<String,String> get(String paramName) {
		Hashtable<String,String> retval = new Hashtable<String,String>();
		String paramType = this.dataHandler.getTypeName(paramName);
		String rval = this.paramTranslation.get(paramName);
		retval.put(paramName,rval);
		if (this.dataHandler.isMultiTypedChannel(paramName, paramType)) {
			retval.clear();
			MultitypeAnalyser mta = new MultitypeAnalyser(rval);
			AMultitypeDeclarationMultitypeDeclaration node = this.dataHandler.getMultitypeNode(rval);
			node.apply(mta);
			Vector<String> suffixes = mta.getSuffix(); 
			for (String temp: suffixes) {
				retval.put(paramName + temp,rval + temp);
			}
		}
		return retval;
	}
}
