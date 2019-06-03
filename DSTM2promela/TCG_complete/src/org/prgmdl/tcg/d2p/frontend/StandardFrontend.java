package org.prgmdl.tcg.d2p.frontend;

import java.util.HashMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.prgmdl.tcg.naming.NameManager;

import DSTM4Rail.*;
import DSTM4Rail.utilities.DSTMUtils;

public class StandardFrontend implements Frontend {	

	@Override
	public DSTM transform(DSTM DSTM_in, NameManager nm) {		
		DSTM DSTM_out = EcoreUtil.copy(DSTM_in);	
		HashMap<String, Node> HMFlattenedVertexes = new HashMap<String, Node>();
		HashMap<String, Transition> HMFlattenedTransitions = new HashMap<String, Transition>();
		
		//check and add the existence of needed types
		if (DSTMUtils.getTBool(DSTM_out) == null)
			DSTM_out.getTypes().add(this.createTBool());
		if (DSTMUtils.getTInteger(DSTM_out) == null)
			DSTM_out.getTypes().add(this.createTInteger());
		if (DSTMUtils.getTChanOfBool(DSTM_out) == null)
			DSTM_out.getTypes().add(this.createTChanOfBool());
		//create chTerm channels and parameters for all machines
		this.addChTermChannel(DSTM_out);
		for (Machine mch : DSTM_out.getMachines()) {
			this.addChTermParameter(mch);
			this.addChTermChannelForBoxes(mch);
		}
		//flatten machines
		for (Machine mch : DSTM_out.getMachines()) {
			this.flattenMachine(mch, HMFlattenedVertexes, HMFlattenedTransitions);
			this.addTerminationActions(mch);
		}
		//rename node and transitions
		for (Machine mch : DSTM_out.getMachines()) {
			this.renameVertexesAndTransitions(mch);
		}
		
		if(nm != null) {
			//give flattened names to the nameManager 
			for (String key : HMFlattenedTransitions.keySet()) {
				String newName = HMFlattenedTransitions.get(key).getName(); //comprising mchName
				String mchName = newName.substring(0, newName.indexOf(separator));
				newName = newName.replaceFirst(mchName + separator, "");
				nm.addFlattenedTransition(nm.reverse(mchName).getS(), key, newName);
			}
			for (String key : HMFlattenedVertexes.keySet()) {
				String newName = HMFlattenedVertexes.get(key).getName(); //comprising mchName
				String mchName = newName.substring(0, newName.indexOf(separator));
				newName = newName.replaceFirst(mchName + separator, "");
				nm.addFlattenedVertex(nm.reverse(mchName).getS(), key, newName);
			}
		}
		return DSTM_out;
	}
	
	//rename all vertexes and transitions as machine + separator + oldName, clean requirements and exiting/entering nodes
	private void renameVertexesAndTransitions(Machine mch) {
		for (Vertex v : mch.getVertexes()) {
			v.setName(v.getMachine().getName() + separator + v.getName());
			v.getRequirements().clear();
		}
		for (Transition t : mch.getTransitions()) {
			t.setName(t.getMachine().getName() + separator + t.getName());
			//remove empty fields
			if (t.getTrigger() != null && t.getTrigger().isEmpty())
				t.setTrigger(null);
			if (t.getCondition() != null && t.getCondition().isEmpty())
				t.setCondition(null);
			t.getRequirements().clear();
			t.setEntering_node(null);
			t.setExiting_node(null);
		}
	}

	//add termination actions for each transition entering an exiting node
	private void addTerminationActions(Machine mch) {
		EList<ExitingNode> exitingNodes = DSTMUtils.getExitingNodes(mch);
		for (ExitingNode exitingNode : exitingNodes) {
			EList<Transition> enteringTransitions = DSTMUtils.getEnteringTransitions(exitingNode);
			for (Transition t : enteringTransitions) {
				t.getActions().add(Helper.getTermAction(exitingNode));
			}
		}
	}
	
	//add chTerm channels for the main machine and its exiting nodes to the engine
	private void addChTermChannel(DSTM dstm) {
		this.addChTermChannel(null, dstm.getMain());
	}
	
	//add chTerm channels for all the boxes in a machine
	private void addChTermChannelForBoxes(Machine mch) {
		for (Vertex v : mch.getVertexes())
			if (v instanceof Box) 
				for (Machine instMch : ((Box) v).getInstantiation())
					this.addChTermChannel((Box) v, instMch);
	}
	
	//utility function
	private void addChTermChannel(Box instantiatingBox, Machine instantiatedMachine) {
		tBasic tBool = DSTMUtils.getTBool(instantiatedMachine.getDSTM());
		//chTerm for the machine
		cInternal chTermChn = DSTM4RailFactory.eINSTANCE.createcInternal();
		if (instantiatingBox == null)
			//main machine
			chTermChn.setName(Helper.getChTermName(instantiatedMachine));
		else
			chTermChn.setName(Helper.getChTermName(instantiatingBox, instantiatedMachine));
		chTermChn.setBound(Helper.chTermBound);
		chTermChn.setChannelType(tBool);
		chTermChn.setDSTM(instantiatedMachine.getDSTM());
		//chTerm for each exiting node
		EList<ExitingNode> exitingNodes = DSTMUtils.getExitingNodes(instantiatedMachine);
		for (ExitingNode exitingNode : exitingNodes) {
			chTermChn = DSTM4RailFactory.eINSTANCE.createcInternal();
			if (instantiatingBox == null)
				//main machine
				chTermChn.setName(Helper.getChTermName(exitingNode));
			else
				chTermChn.setName(Helper.getChTermName(instantiatingBox, exitingNode));
			chTermChn.setBound(Helper.chTermBound);
			chTermChn.setChannelType(tBool);
			chTermChn.setDSTM(instantiatedMachine.getDSTM());
		}
	}
	
	//add a chTerm parameter for the machine and for all its exiting nodes
	private void addChTermParameter(Machine mch) {
		tBasic tChanOfBool = DSTMUtils.getTChanOfBool(mch.getDSTM());
		Parameter chTermParam = DSTM4RailFactory.eINSTANCE.createParameter();
		chTermParam.setName(Helper.getChTermParameterName(null));
		chTermParam.setType(tChanOfBool);
		chTermParam.setMachine(mch);
		EList<ExitingNode> exitingNodes = DSTMUtils.getExitingNodes(mch);
		for (ExitingNode exitingNode : exitingNodes) {
			chTermParam = DSTM4RailFactory.eINSTANCE.createParameter();
			chTermParam.setName(Helper.getChTermParameterName(exitingNode));
			chTermParam.setType(tChanOfBool);
			chTermParam.setMachine(mch);
		}
	}

	private tInteger createTInteger() {
		tInteger tInt = DSTM4RailFactory.eINSTANCE.createtInteger();
		tInt.setName("Int");
		return tInt;
	}
	
	private tEnum createTBool() {
		tEnum tBool = DSTM4RailFactory.eINSTANCE.createtEnum();
		tBool.setName("Bool");
		tBool.getLiterals().add("true");
		tBool.getLiterals().add("false");
		return tBool;
	}
	
	private tChannel createTChanOfBool() {
		tChannel tChan = DSTM4RailFactory.eINSTANCE.createtChannel();
		tChan.setName("Chn[Bool]");
		return tChan;
	}
	
	private void flattenMachine(Machine mch, HashMap<String, Node> HMFlattenedVertexes, HashMap<String, Transition> HMFlattenedTransitions) {
		EList<Vertex> vertexesToRemove = new BasicEList<Vertex>();
		EList<Transition> transitionsToRemove = new BasicEList<Transition>();
		EList<Node> newNodes = new BasicEList<Node>();
		//convert boxes and forks
		for (Vertex v : mch.getVertexes())
			if (v instanceof Box && !DSTMUtils.exitsAFork(v))
				this.convertIsolatedBoxIntoNode((Box) v, newNodes, vertexesToRemove);
			else if (v instanceof Fork)
				this.convertFork((Fork) v, newNodes, vertexesToRemove, transitionsToRemove, HMFlattenedVertexes, HMFlattenedTransitions);
		//convert joins
		for (Vertex v : mch.getVertexes())
			if (v instanceof Join)
				this.convertJoin((Join) v, vertexesToRemove, transitionsToRemove, HMFlattenedVertexes, HMFlattenedTransitions);
		for (Vertex v : vertexesToRemove)
			EcoreUtil.delete(v);
		for (Transition t : transitionsToRemove)
			EcoreUtil.delete(t);
		mch.getVertexes().addAll(newNodes);
	}
	
	private void convertFork(Fork fork, EList<Node> newNodes, EList<Vertex> vertexesToRemove, EList<Transition> transitionsToRemove, 
			HashMap<String, Node> HMFlattenedVertexes, HashMap<String, Transition> HMFlattenedTransitions) {
		Node targetNode;
		String newNodeName = "";
		String addTransitionName = "";
		EList<String> addTransitionActions = new BasicEList<String>();
		boolean isAsynch = false;
		Transition asynchTransition = null;
		EList<Transition> listExitingForkTrans = DSTMUtils.getExitingTransitions(fork);
		EList<Transition> listEnteringForkTrans = DSTMUtils.getEnteringTransitions(fork);
		//create new names and, generate actions, calculate isAsynch
		for (Transition t : listExitingForkTrans) {
			newNodeName += Frontend.separator + t.getDestination().getName();
			addTransitionName += Frontend.separator + t.getName();
			if (!(t.getDestination() instanceof Box)) {
				isAsynch = true;
				asynchTransition = t;
			}
		}
		for (Transition t : listExitingForkTrans) {
			if (t.getDestination() instanceof Box) {
				addTransitionActions.addAll(Helper.getMachineRunActions(t,isAsynch));
			}
		}
		//create node for a synchronous fork or get target node for asynchronous fork
		if(isAsynch)
			targetNode = (Node) asynchTransition.getDestination();
		else {
			targetNode	= DSTM4RailFactory.eINSTANCE.createNode();
			newNodes.add(targetNode);
		}
		//remove separator from new names
		newNodeName = newNodeName.replaceFirst(Frontend.separator, "");
		addTransitionName = addTransitionName.replaceFirst(Frontend.separator, "");
		//insert target nodes into HMFlattenedVertexes, remove them from the machine
		vertexesToRemove.add(fork);
		for (Transition t : listExitingForkTrans) {
			HMFlattenedVertexes.put(t.getDestination().getName(), targetNode);
			if (t.getDestination() instanceof Box)
				vertexesToRemove.add(t.getDestination());
		}
		//set new names, add actions to transitions
		targetNode.setName(newNodeName);
		for (Transition t : listEnteringForkTrans) {
			String oldName = t.getName();
			t.setName(oldName + Frontend.separator + addTransitionName);
			t.getActions().addAll(addTransitionActions);
			t.setDestination(targetNode);
			HMFlattenedTransitions.put(oldName, t);
		}
		//insert exiting fork transitions into HMFlattenedTransitions (the first as default), remove them from the machine
		for (Transition t : listExitingForkTrans) {
			HMFlattenedTransitions.put(t.getName(), listEnteringForkTrans.get(0));
		}
		//remove exiting fork transitions
		transitionsToRemove.addAll(listExitingForkTrans);
	}
	
	private void convertJoin(Join jn, EList<Vertex> vertexesToRemove, EList<Transition> transitionsToRemove, 
			HashMap<String, Node> HMFlattenedVertexes, HashMap<String, Transition> HMFlattenedTransitions) {
		//classification of entering join transitions
		Transition internalEnteringJoinTrans = null;
		EList<Transition> listPreemptiveTransFromBox = new BasicEList<Transition>();
		EList<Transition> listAllTransFromBox = new BasicEList<Transition>();
		EList<Transition> listEnteringJoinTrans = DSTMUtils.getEnteringTransitions(jn);
		EList<Transition> listExitingJoinTrans = DSTMUtils.getExitingTransitions(jn);
		String addTransitionName = "";
		String addTransitionCondition = ""; //termination condition for non-preemptive trans of the form ' && TERM COND'
		String addTransitionConditionForPreemptive = ""; //termination condition for preemptive trans of the form ' && TERM COND'
		EList<String> addTransitionActions = new BasicEList<String>();
		for (Transition t : listEnteringJoinTrans) {
			addTransitionName += Frontend.separator + t.getName();
			if (t.getSource() instanceof Box) {
				if (t.isIs_preemptive()) {
					listPreemptiveTransFromBox.add(t);
					addTransitionConditionForPreemptive += " && " + Helper.getMachineTerminationCondition(t);
				} else {
					addTransitionCondition += " && " + Helper.getMachineTerminationCondition(t);
				}
				addTransitionActions.addAll(Helper.getMachineTerminationActions(t));
				listAllTransFromBox.add(t);
			} else
				internalEnteringJoinTrans = t;
		}
		if (!addTransitionCondition.isEmpty()) {
			addTransitionCondition = addTransitionCondition.replaceFirst(" && ", "");
		}
		if (!addTransitionConditionForPreemptive.isEmpty()) {
			addTransitionConditionForPreemptive = addTransitionConditionForPreemptive.replaceFirst(" && ", "");
		}
		//remove separator from new names
		addTransitionName = addTransitionName.replaceFirst(Frontend.separator, "");
		Node sourceNode = HMFlattenedVertexes.get(listAllTransFromBox.get(0).getSource().getName());
		if ((internalEnteringJoinTrans == null || !internalEnteringJoinTrans.isIs_preemptive()) && listPreemptiveTransFromBox.isEmpty()) {
			//CASE 1: no preemption
			for (Transition exitingTrans : listExitingJoinTrans) {
				String oldName = exitingTrans.getName();
				exitingTrans.setSource(sourceNode);
				exitingTrans.setName(addTransitionName + Frontend.separator + oldName);
				if (internalEnteringJoinTrans != null) 
					exitingTrans.setTrigger(internalEnteringJoinTrans.getTrigger());
				if (internalEnteringJoinTrans != null && internalEnteringJoinTrans.getCondition() != null && !internalEnteringJoinTrans.getCondition().isEmpty())
					exitingTrans.setCondition(internalEnteringJoinTrans.getCondition() + "&&" + Helper.CCPrefix + addTransitionCondition);
				else {
					exitingTrans.setCondition(Helper.CCPrefix + addTransitionCondition);
				}
				exitingTrans.getActions().addAll(0, addTransitionActions);
				HMFlattenedTransitions.put(oldName, exitingTrans);
			}
		} else if ((internalEnteringJoinTrans == null || !internalEnteringJoinTrans.isIs_preemptive()) && !listPreemptiveTransFromBox.isEmpty()) {
			//CASE 2: preemption from box
			for (Transition exitingTrans : listExitingJoinTrans) {
				String oldName = exitingTrans.getName();
				exitingTrans.setSource(sourceNode);
				exitingTrans.setName(addTransitionName + Frontend.separator + oldName);
				if (internalEnteringJoinTrans != null) 
					exitingTrans.setTrigger(internalEnteringJoinTrans.getTrigger());
				if (internalEnteringJoinTrans != null && internalEnteringJoinTrans.getCondition() != null && !internalEnteringJoinTrans.getCondition().isEmpty())
					exitingTrans.setCondition(internalEnteringJoinTrans.getCondition() + "&&" + Helper.CCPrefix + addTransitionConditionForPreemptive);
				else {
					exitingTrans.setCondition(Helper.CCPrefix + addTransitionConditionForPreemptive);
				}
				exitingTrans.getActions().addAll(0, addTransitionActions);
				HMFlattenedTransitions.put(oldName, exitingTrans);
			}
		} else if (internalEnteringJoinTrans != null && internalEnteringJoinTrans.isIs_preemptive()) {
			//CASE 3: preemption from internal node
			for (Transition exitingTrans : listExitingJoinTrans) {
				String oldName = exitingTrans.getName();
				exitingTrans.setSource(sourceNode);
				exitingTrans.setName(addTransitionName + Frontend.separator + oldName);
				exitingTrans.setTrigger(internalEnteringJoinTrans.getTrigger());
				exitingTrans.setCondition(internalEnteringJoinTrans.getCondition());
				exitingTrans.getActions().addAll(0, addTransitionActions);
				HMFlattenedTransitions.put(oldName, exitingTrans);
			}
		}
		//insert exiting fork transitions into HMFlattenedTransitions (the first as default), remove them from the machine
		for (Transition t : listEnteringJoinTrans) {
			HMFlattenedTransitions.put(t.getName(), listExitingJoinTrans.get(0));
		}
		//remove join from the machine
		vertexesToRemove.add(jn);
		//remove entering join transitions
		transitionsToRemove.addAll(listEnteringJoinTrans);
	}

	private void convertIsolatedBoxIntoNode(Box box, EList<Node> newNodes, EList<Vertex> vertexesToRemove) {
		Node newNode = DSTM4RailFactory.eINSTANCE.createNode();
		newNode.setName(box.getName());
		EList<Transition> enteringTrans = DSTMUtils.getEnteringTransitions(box);
		for (Transition t : enteringTrans) {
			t.getActions().addAll(Helper.getMachineRunActions(t,false));
			t.getPar_instantiation().clear();
			t.setDestination(newNode);
		}
		EList<Transition> exitingTrans = DSTMUtils.getExitingTransitions(box);
		for (Transition t : exitingTrans) {
			if (t.getTrigger()!=null && !t.getTrigger().isEmpty()) {
				//return by interrupt
				t.setCondition(null);
				t.getActions().addAll(Helper.getMachineTerminationActions(t));
			} else {
				//return by default or exiting
				t.setTrigger(null);
				t.setCondition(Helper.CCPrefix + Helper.getMachineTerminationCondition(t));
				t.getActions().addAll(Helper.getMachineTerminationActions(t));
			}
			t.setSource(newNode);
		}
		newNodes.add(newNode);
		vertexesToRemove.add(box);
	}
}
