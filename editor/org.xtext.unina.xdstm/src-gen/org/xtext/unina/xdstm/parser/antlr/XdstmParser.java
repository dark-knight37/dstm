/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.unina.xdstm.parser.antlr.internal.InternalXdstmParser;
import org.xtext.unina.xdstm.services.XdstmGrammarAccess;

public class XdstmParser extends AbstractAntlrParser {

	@Inject
	private XdstmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXdstmParser createParser(XtextTokenStream stream) {
		return new InternalXdstmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public XdstmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XdstmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
