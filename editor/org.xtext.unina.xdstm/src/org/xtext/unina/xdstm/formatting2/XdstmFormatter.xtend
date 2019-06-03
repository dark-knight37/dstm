/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.unina.xdstm.services.XdstmGrammarAccess
import org.xtext.unina.xdstm.xDstm.DSTM
import org.xtext.unina.xdstm.xDstm.Machine
import org.xtext.unina.xdstm.xDstm.Model
import org.xtext.unina.xdstm.xDstm.Transition
import org.xtext.unina.xdstm.xDstm.Vertex

class XdstmFormatter extends AbstractFormatter2 {
	
	@Inject extension XdstmGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		model.getInclude.format;
		for (Machine machine : model.getMachines()) {
			machine.format;
		}
		for (DSTM dSTM : model.getDstm()) {
			dSTM.format;
		}
	}

	def dispatch void format(Machine machine, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Vertex vertex : machine.getVertexes()) {
			vertex.format;
		}
		for (Transition transition : machine.getTransitions()) {
			transition.format;
		}
	}
	
	// TODO: implement for Node, Box, EnteringNode, InitialNode, ExitingNode, Fork, Join, Transition
}
