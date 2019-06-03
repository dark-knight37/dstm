/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.unina.xdstmdata.services.XdstmdataGrammarAccess;

@SuppressWarnings("all")
public class XdstmdataSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XdstmdataGrammarAccess grammarAccess;
	protected AbstractElementAlias match_channel_specifier_ChnBoolKeyword_2_or_ChnIntKeyword_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XdstmdataGrammarAccess) access;
		match_channel_specifier_ChnBoolKeyword_2_or_ChnIntKeyword_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannel_specifierAccess().getChnBoolKeyword_2()), new TokenAlias(false, false, grammarAccess.getChannel_specifierAccess().getChnIntKeyword_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_channel_specifier_ChnBoolKeyword_2_or_ChnIntKeyword_1.equals(syntax))
				emit_channel_specifier_ChnBoolKeyword_2_or_ChnIntKeyword_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Chn[Int]' | 'Chn[Bool]'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_channel_specifier_ChnBoolKeyword_2_or_ChnIntKeyword_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}