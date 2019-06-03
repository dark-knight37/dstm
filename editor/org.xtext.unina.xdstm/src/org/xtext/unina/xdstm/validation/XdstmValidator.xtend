/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.validation

import org.eclipse.xtext.validation.Check
import org.xtext.unina.xdstm.xDstm.Box
import org.xtext.unina.xdstm.xDstm.DSTM
import org.xtext.unina.xdstm.xDstm.EnteringNodeAbs
import org.xtext.unina.xdstm.xDstm.ExitingNode
import org.xtext.unina.xdstm.xDstm.Fork
import org.xtext.unina.xdstm.xDstm.InitialNode
import org.xtext.unina.xdstm.xDstm.Join
import org.xtext.unina.xdstm.xDstm.Machine
import org.xtext.unina.xdstm.xDstm.Model
import org.xtext.unina.xdstm.xDstm.Node
import org.xtext.unina.xdstm.xDstm.Transition
import org.xtext.unina.xdstm.xDstm.Vertex
import org.xtext.unina.xdstm.xDstm.XDstmPackage

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XdstmValidator extends AbstractXdstmValidator {

	@Check(NORMAL)
	def checkImport(Model model) {
		var include = model.include.importURI as String;
		if (!new IncludeHelper().checkIncludedFile(include))
			warning("The dataFile does not exists, DSTM verifier is disabled!", XDstmPackage.Literals.MODEL__INCLUDE);
	}

	@Check(FAST)
	def checkMachineName(Machine machine) {
		var model = machine.eContainer;
		var mName = machine.name;
		for (Machine m : (model as Model).machines) {
			if (!m.equals(machine) && m.name.compareTo(mName) == 0)
				error("Machines cannot have the same name", XDstmPackage.Literals.MACHINE__NAME);
		}
	}

	@Check(FAST)
	def checkMainMachine(DSTM dstm) {
		var mMain = dstm.main;
		if (!dstm.machines.contains(mMain)) {
			error("Main Machine is not in DSTM machines list", XDstmPackage.Literals.DSTM__MAIN);
		}
	}

	@Check(NORMAL)
	def checkVertexNumber(Machine machine) {
		var count = 0 as int;
		for (Vertex v : machine.vertexes) {
			if (v instanceof InitialNode || v instanceof Node || v instanceof ExitingNode)
				count++;
		}
		if (machine.vertexes.size <= 1)
			error("At least two vertexes must be present in a machine", XDstmPackage.Literals.MACHINE__VERTEXES);
		if (count < 2)
			error("These vertexes must be present: one InitialNode and another between Node or ExitingNode",
				XDstmPackage.Literals.MACHINE__VERTEXES);
	}

	@Check(FAST)
	def checkTransitionName(Transition transition) {
		var machine = transition.eContainer;
		var tName = transition.name;
		for (Transition t : (machine as Machine).transitions) {
			if (!t.equals(transition) && t.name.compareTo(tName) == 0)
				error("Transitions cannot have the same name", XDstmPackage.Literals.TRANSITION__NAME);
		}
	}
	
	@Check(FAST)
	def checkTriggerConditionActions(Transition transition) {
		var include = (transition.eContainer.eContainer as Model).include.importURI as String;
		if (new IncludeHelper().checkIncludedFile(include)) {
			var verifier = new DSTMVerifierStub();
			//trigger
			if (!verifier.verifyTrigger(transition, transition.eContainer.eContainer as Model, include)) {
				warning("The triggr is not valid!", XDstmPackage.Literals.TRANSITION__TRIGGER);
			}
			//condition
			if (!verifier.verifyCondition(transition, transition.eContainer.eContainer as Model, include)) {
				warning("The condition is not valid!", XDstmPackage.Literals.TRANSITION__CONDITION);
			}
			//actions
			var i = 0;
			for (act : transition.actions) {
				if (!verifier.verifyAction(transition, transition.eContainer.eContainer as Model, include, i)) {
					warning("The action #"+ i +" is not valid!", XDstmPackage.Literals.TRANSITION__ACTIONS);
				}
				i++;	
			}
		}
	}
	
	@Check(FAST)
	def checkTransitionDecoration(Transition transition) {
		var found = false;
		/* IMPLICIT */
		if (transition.source instanceof EnteringNodeAbs && (transition.destination instanceof Node || transition.destination instanceof ExitingNode)) {
			found = true;
			if (transition.trigger !== null)
				error("Transition " + transition.name + " (implicit) cannot have trigger",
					XDstmPackage.Literals.TRANSITION__NAME);
			if (transition.condition !== null)
				error("Transition " + transition.name + " (implicit) cannot have condition",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* INTERNAL */
		if (transition.source instanceof Node && (transition.destination instanceof Node || transition.destination instanceof ExitingNode)) {
			found = true;
			if (transition.trigger === null && transition.condition === null)
				warning("Transition " + transition.name + " (internal) has neither trigger nor condition",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* ENTERING FORK */
		if (transition.source instanceof Node && transition.destination instanceof Fork) {
			found = true;
			if (transition.trigger === null && transition.condition === null)
				warning("Transition " + transition.name + " (entering fork) has neither trigger nor condition",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* ASYNCHRONOUS FORK */
		if (transition.source instanceof Fork && (transition.destination instanceof Node || transition.destination instanceof ExitingNode)) {
			found = true;
			if (transition.trigger !== null)
				error("Transition " + transition.name + " (asynchronous fork) cannot have trigger",
					XDstmPackage.Literals.TRANSITION__NAME);
			if (transition.condition !== null)
				error("Transition " + transition.name + " (asynchronous fork) cannot have condition",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* ENTERING JOIN */
		if (transition.source instanceof Node && transition.destination instanceof Join) {
			found = true;
			if (transition.actions.length !== 0)
				error("Transition " + transition.name + " (entering join) cannot have actions",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* EXITING JOIN */
		if (transition.source instanceof Join && (transition.destination instanceof Node || transition.destination instanceof ExitingNode)) {
			found = true;
			if (transition.trigger !== null)
				error("Transition " + transition.name + " (exiting join) cannot have trigger",
					XDstmPackage.Literals.TRANSITION__NAME);
			if (transition.condition !== null)
				error("Transition " + transition.name + "  (exiting join) cannot have condition",
					XDstmPackage.Literals.TRANSITION__NAME);
		}
		/* RETURN BY DEFAULT, RETURN BY EXITING AND RETURN BY INTERRUPT*/
		if (transition.source instanceof Box && transition.destination instanceof Join) {
			if (transition.trigger !== null) {
				found = true;
				if (transition.is_preemptive === false)
					error("Transition " + transition.name + " (return by interrupt) must be preemptive",
						XDstmPackage.Literals.TRANSITION__NAME);
				if (transition.condition !== null)
					error("Transition " + transition.name + " (return by interrupt) cannot have condition",
						XDstmPackage.Literals.TRANSITION__NAME);
				if (transition.actions.length > 0)
					error("Transition " + transition.name + " (return by interrupt) cannot have actions",
						XDstmPackage.Literals.TRANSITION__NAME);
			} else {
				if (transition.exiting_node === null) {
					found = true;
					if (transition.condition !== null)
						error("Transition " + transition.name + " (return by default) cannot have condition",
							XDstmPackage.Literals.TRANSITION__NAME);
					if (transition.actions.length > 0)
						error("Transition " + transition.name + " (return by default) cannot have actions",
							XDstmPackage.Literals.TRANSITION__NAME);
				} else {
					found = true;
					if (transition.condition !== null)
						error("Transition " + transition.name + " (return by exiting) cannot have condition",
							XDstmPackage.Literals.TRANSITION__NAME);
					if (transition.actions.length > 0)
						error("Transition " + transition.name + " (return by exiting) cannot have actions",
							XDstmPackage.Literals.TRANSITION__NAME);
				}
			}
		}
		if (transition.source instanceof Box &&
			(transition.destination instanceof Node || transition.destination instanceof ExitingNode ||  
				transition.destination instanceof Box || transition.destination instanceof Fork)) {
			if (transition.trigger !== null) {
				found = true;
				if (transition.condition !== null)
					error("Transition " + transition.name + " (return by interrupt) cannot have condition",
						XDstmPackage.Literals.TRANSITION__NAME);
			} else {
				if (transition.exiting_node === null) {
					found = true;
					if (transition.condition !== null)
						error("Transition " + transition.name + " (return by default) cannot have condition",
							XDstmPackage.Literals.TRANSITION__NAME);
				} else {
					found = true;
					if (transition.condition !== null)
						error("Transition " + transition.name + " (return by exiting) cannot have condition",
							XDstmPackage.Literals.TRANSITION__NAME);
				}
			}
		}
		/* CALL BY ENTERING AND CALL BY DEFAULT */
		if ((transition.source instanceof Node || transition.source instanceof Box) &&
			transition.destination instanceof Box) {
			found = true;
		}
		if ((transition.source instanceof Fork || transition.source instanceof Join) &&
			transition.destination instanceof Box) {
			if (transition.entering_node === null) {
				found = true;
				if (transition.trigger !== null)
					error("Transition " + transition.name + " (call by default) cannot have trigger",
						XDstmPackage.Literals.TRANSITION__NAME);
				if (transition.condition !== null)
					error("Transition " + transition.name + " (call by default) cannot have condition",
						XDstmPackage.Literals.TRANSITION__NAME);
			} else {
				found = true;
				if (transition.trigger !== null)
					error("Transition " + transition.name + " (call by entering) cannot have trigger",
						XDstmPackage.Literals.TRANSITION__NAME);
				if (transition.condition !== null)
					error("Transition " + transition.name + " (call by entering) cannot have condition",
						XDstmPackage.Literals.TRANSITION__NAME);
			}
		}
		if (!found) {
			error("The class of the transition " + transition.name + " has not been recognized!",
				XDstmPackage.Literals.TRANSITION__NAME);
		}
	}

	@Check(FAST)
	def BoxInstantiation_ExitingNode_Constraint(Transition transition) {
		if (!(transition.source instanceof Box) && transition.exiting_node !== null) {
			error("Only transitions exiting a box can specify an exiting node",
					XDstmPackage.Literals.TRANSITION__EXITING_NODE);
		}
		if (transition.source instanceof Box && transition.exiting_node !== null) {
			var box = transition.source as Box
			if (box.instantiation.length > 1)
				error("The transition cannot specify an exiting node since the box " + box.name + " instantiates more than one machine",
					XDstmPackage.Literals.TRANSITION__SOURCE);
			
			var exitingNode = transition.exiting_node
			var m = (transition.source as Box).instantiation.get(0) as Machine
			if (!m.vertexes.contains(exitingNode))
				error("The exiting node is not declared in the machine instantiated by the box " + (transition.source as Box).name,
					XDstmPackage.Literals.TRANSITION__EXITING_NODE);
		}
	}

	@Check(FAST)
	def BoxInstantiation_EnteringNode_Constraint(Transition transition) {
		if (!(transition.destination instanceof Box) && transition.entering_node !== null) {
			error("Only transitions entering a box can specify an entering node",
					XDstmPackage.Literals.TRANSITION__ENTERING_NODE);
		}
		if (transition.destination instanceof Box && transition.entering_node !== null) {
			var box = transition.destination as Box
			if (box.instantiation.length > 1)
				error("The transition cannot specify an entering node since the box " + box.name + " instantiates more than one machine",
					XDstmPackage.Literals.TRANSITION__DESTINATION);
			
			var enteringNode = transition.entering_node
			var m = (transition.destination as Box).instantiation.get(0) as Machine
			if (!m.vertexes.contains(enteringNode))
				error("The entering node is not declared in the machine instantiated by the Box " + (transition.destination as Box).name,
					XDstmPackage.Literals.TRANSITION__ENTERING_NODE);
		}
	}

	@Check(NORMAL)
	def checkBoxInstantation(Box box) {
		var count = 0
		var model = box.eContainer.eContainer as Model
		var dstm = model.dstm 
		for (Machine m : box.instantiation) {
			for (DSTM d : dstm)
				if (!(d.machines.contains(m)))
					count++;
		}
		if (count >= 1)
			error("One or more machines are not in DSTM machines list", XDstmPackage.Literals.BOX__INSTANTIATION)
	}
	
	@Check(FAST)
	def checkUsedVertex(Vertex vertex) {
		var machine = vertex.eContainer as Machine;
		for (Transition t : machine.transitions) {
			if (t.source === vertex || t.destination === vertex) {
				return;
			}
		}
		var structuralFeature = XDstmPackage.Literals.NODE__NAME;
		if (vertex instanceof Node) {
			structuralFeature = XDstmPackage.Literals.NODE__NAME;
		} else if (vertex instanceof Box) {
			structuralFeature = XDstmPackage.Literals.BOX__NAME;
		} else if (vertex instanceof EnteringNodeAbs) {
			structuralFeature = XDstmPackage.Literals.ENTERING_NODE_ABS__NAME;
		} else if (vertex instanceof ExitingNode) {
			structuralFeature = XDstmPackage.Literals.EXITING_NODE__NAME;
		} else if (vertex instanceof Fork) {
			structuralFeature = XDstmPackage.Literals.FORK__NAME;
		} else if (vertex instanceof Join) {
			structuralFeature = XDstmPackage.Literals.JOIN__NAME;
		}
		warning("The node is never reached!", structuralFeature);
	}
	
	@Check(FAST)
	def checkVertexName(Vertex vertex) {
		var machine = vertex.eContainer;
		var vName = '';
		var structuralFeature = XDstmPackage.Literals.NODE__NAME;
		if (vertex instanceof Node) {
			vName = (vertex as Node).name;
			structuralFeature = XDstmPackage.Literals.NODE__NAME;
		} else if (vertex instanceof Box) {
			vName = (vertex as Box).name;
			structuralFeature = XDstmPackage.Literals.BOX__NAME;
		} else if (vertex instanceof EnteringNodeAbs) {
			vName = (vertex as EnteringNodeAbs).name;
			structuralFeature = XDstmPackage.Literals.ENTERING_NODE_ABS__NAME;
		} else if (vertex instanceof ExitingNode) {
			vName = (vertex as ExitingNode).name;
			structuralFeature = XDstmPackage.Literals.EXITING_NODE__NAME;
		} else if (vertex instanceof Fork) {
			vName = (vertex as Fork).name;
			structuralFeature = XDstmPackage.Literals.FORK__NAME;
		} else if (vertex instanceof Join) {
			vName = (vertex as Join).name;
			structuralFeature = XDstmPackage.Literals.JOIN__NAME;
		}
		for (Vertex v : (machine as Machine).vertexes) {
			if (!v.equals(vertex)) {
				var vName2 = '';
				try {
					vName2 = (v as Node).name;
				} catch (Exception e) {
					try {
						vName2 = (v as Box).name;
					} catch (Exception e1) {
						try {
							vName2 = (v as EnteringNodeAbs).name;
						} catch (Exception e2) {
							try {
								vName2 = (v as ExitingNode).name;
							} catch (Exception e3) {
								try {
									vName2 = (v as Fork).name;
								} catch (Exception e4) {
									try {
										vName2 = (v as Join).name;
									} catch (Exception e5) {
									}
								}
							}
						}
					}
				}
				/*if (v instanceof Node) {
				 * 	vName2 = (v as Node).name;
				 * } else if (v instanceof Box) {
				 * 	vName2 = (v as Box).name;
				 * } else if (vertex instanceof EnteringNodeAbs) {
				 * 	vName2 = (v as EnteringNodeAbs).name;
				 * } else if (v instanceof ExitingNode) {
				 * 	vName2 = (v as ExitingNode).name;
				 * } else if (v instanceof Fork) {
				 * 	vName2 = (v as Fork).name;
				 * } else if (v instanceof Join) {
				 * 	vName2 = (v as Join).name;
				 }*/
				if (vName2.compareTo(vName) == 0)
					error("Vertexes cannot have the same name", structuralFeature);
			}
		}
	}

	@Check(NORMAL)
	def checkUniqueInitialNode(Machine machine) {
		var initialNodes = 0;
		for (Vertex v : machine.vertexes) {
			if (v instanceof InitialNode)
				initialNodes++;
		}
		if (initialNodes < 1) {
			error("One initial node is needed in each machine", XDstmPackage.Literals.MACHINE__NAME);
		} else if (initialNodes > 1) {
			error("Only one initial node is admitted in each machine", XDstmPackage.Literals.MACHINE__NAME);
		}
	}

	@Check(NORMAL)
	def checkOutgoingTransitionsEnteringNodes(Machine machine) {
		var outgoingTransitions = 0;
		for (Vertex v : machine.vertexes) {
			if (v instanceof EnteringNodeAbs) {
				outgoingTransitions = 0;
				for (Transition t : machine.transitions) {
					if (t.source.equals(v))
						outgoingTransitions++;
				}
				if (outgoingTransitions < 1) {
					error(
						"There is no transition exiting from the entering node " + v.name + ": one is needed",
						XDstmPackage.Literals.MACHINE__NAME
					);
				} else if (outgoingTransitions > 1) {
					error(
						"There are " + outgoingTransitions + " transitions exiting from the entering node " + v.name +
							": only one is admitted",
						XDstmPackage.Literals.MACHINE__NAME
					);
				}
			}
		}
	}

	@Check(FAST)
	def OneAsynchronousForkConstraint(Fork fork) {
		var m = fork.eContainer() as Machine
		var count = 0;
		for (trans : m.transitions) {
			if (trans.source===fork && !(trans.destination instanceof Box))
				count++;
		}
		if(count > 1)
			error("There is more then one asynchronous fork transition exiting from this box", XDstmPackage.Literals.FORK__NAME)
	}

	@Check(FAST)
	def checkJoinIsPreemptive(Transition transition) {
		if (transition.is_preemptive === true && !(transition.destination instanceof Join)) {
			error("Only entering join transitions can be preemptive", XDstmPackage.Literals.TRANSITION__IS_PREEMPTIVE)
		}
	}

}
