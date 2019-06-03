package org.prgmdl.tcg.d2p.frontend;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import DSTM4Rail.Box;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.Machine;
import DSTM4Rail.Parameter;
import DSTM4Rail.Transition;
import DSTM4Rail.Type;
import DSTM4Rail.tChannel;
import DSTM4Rail.tMultiType;
import DSTM4Rail.tSimpleType;
import DSTM4Rail.utilities.DSTMUtils;

public class Helper {
	
	public final static int chTermBound = -1;
	
	public final static String CCPrefix = "#"; //added by frontend implementation ONLY for conditions
	private final static String BackendSplitChTerm = "#";
	private final static String engineName = "Engine";
	private final static String chTermName = "chTerm";
	private final static String parInstSeparator = ";";
	private final static String parInstAssignement = "=";
	
	//action for exiting machines
	public static String getTermAction(ExitingNode exitingNode) {
		String ret = null;
		if(exitingNode != null)
			ret = CCPrefix +  chTermName + Frontend.separator + exitingNode.getName() + "!1";
		return ret;
	}
	
	//chTerm PARAMETER MANAGEMENT
	public static String getChTermParameterName(ExitingNode exitingNode) {
		String ret = chTermName;
		if(exitingNode != null)
			//specific exiting node
			ret += Frontend.separator + exitingNode.getName();
		return ret;
	}
	
	public static String getChTermName(Machine mainMachine) {
		return getChTermName(null, mainMachine, null);
	}
	
	public static String getChTermName(ExitingNode mainMchExitingNode) {
		return getChTermName(null, null, mainMchExitingNode);
	}
	
	public static String getChTermName(Box instantiatingBox, Machine instantiatedMachine) {
		return getChTermName(instantiatingBox, instantiatedMachine, null);
	}
	
	public static String getChTermName(Box instantiatingBox, ExitingNode instMchExitingNode) {
		return getChTermName(instantiatingBox, null, instMchExitingNode);
	}
	
	//utility method
	private static String getChTermName(Box instantiatingBox, Machine instantiatedMachine, ExitingNode instMchExitingNode) {
		String ret = chTermName;
		if(instantiatingBox != null)
			//under a box
			ret += Frontend.separator + instantiatingBox.getName();
		if(instMchExitingNode != null)
			//specific exiting node
			ret += Frontend.separator + instMchExitingNode.getMachine().getName() + Frontend.separator + instMchExitingNode.getName();
		else
			ret += Frontend.separator + instantiatedMachine.getName();
		//add container machine
		ret += BackendSplitChTerm;
		if(instantiatingBox != null) {
			//not main machine
			ret += instantiatingBox.getMachine().getName();
		} else {
			//main machine
			ret += engineName;
		}
		return ret;
	}
	//END chTerm PARAMETER MANAGEMENT
	
	public static EList<String> getMachineRunActions(Transition t, boolean asynchTransition) {
		EList<String> ret = new BasicEList<String>();
		Box b = (Box) t.getDestination();
		if (t.getEntering_node() != null) {
			//target box can instantiate only 1 machine
			Machine instMch = b.getInstantiation().get(0);
			String parInstantion = null;
			if (t.getPar_instantiation().size() == 1)
				parInstantion = t.getPar_instantiation().get(0);
			if(asynchTransition) {
				ret.add(CCPrefix + "PidTemp=run " + instMch.getName() + "(parent," + instMch.getName() + Frontend.separator + t.getEntering_node().getName() + parseParameters(parInstantion, b, instMch) + ")");
				ret.add(CCPrefix + "ChildrenMatrix[parent].children[PidTemp]=1");
			} else {
				ret.add(CCPrefix + "PidTemp=run " + instMch.getName() + "(_pid," + instMch.getName() + Frontend.separator + t.getEntering_node().getName() + parseParameters(parInstantion, b, instMch) + ")");
				ret.add(CCPrefix + "ChildrenMatrix[_pid].children[PidTemp]=1");
			}
			ret.add(CCPrefix + "HasToken[PidTemp]=1");
		} else {
			Machine instMch;
			String parInstantion = null;			
			for (int i = 0; i < b.getInstantiation().size(); i++) {
				instMch = b.getInstantiation().get(i);			
				if (t.getPar_instantiation().size() > i)
					parInstantion = t.getPar_instantiation().get(i);
				if(asynchTransition) {
					ret.add(CCPrefix + "PidTemp=run " + instMch.getName() + "(parent," + instMch.getName() + Frontend.separator + DSTMUtils.getInitialNode(instMch).getName() + parseParameters(parInstantion, b, instMch) + ")");
					ret.add(CCPrefix + "ChildrenMatrix[parent].children[PidTemp]=1");
				} else {
					ret.add(CCPrefix + "PidTemp=run " + instMch.getName() + "(_pid," + instMch.getName() + Frontend.separator + DSTMUtils.getInitialNode(instMch).getName() + parseParameters(parInstantion, b, instMch) + ")");
					ret.add(CCPrefix + "ChildrenMatrix[_pid].children[PidTemp]=1");
				}
				ret.add(CCPrefix + "HasToken[PidTemp]=1");
			}
		}
		return ret;
	}
	
	public static EList<String> getMachineTerminationActions(Transition t) {
		EList<String> ret = new BasicEList<String>();
		Box b = (Box) t.getSource();
		//cleaning chTerm action of the form chTerm_boxName_machineName_exitingNode?_
		//action of the form chTerm_boxName_machineName!1
		if (t.getExiting_node() != null) {
			Machine m = b.getInstantiation().get(0);
			ret.add(CCPrefix + chTermName + Frontend.separator + b.getName() + Frontend.separator + 
					m.getName() + Frontend.separator + t.getExiting_node().getName() + "?_");
			ret.add(CCPrefix + chTermName + Frontend.separator + b.getName() + Frontend.separator + m.getName() + "!1");
		} else {
			for (Machine m : b.getInstantiation()) {
				List<ExitingNode> exitingNodes = DSTMUtils.getExitingNodes(m);
				if (!exitingNodes.isEmpty()) {
					String actTemp = CCPrefix + "if ";
					for (ExitingNode ex : exitingNodes) {
						String chTName = chTermName + Frontend.separator + b.getName() + Frontend.separator + 
								m.getName() + Frontend.separator + ex.getName();
						actTemp += "::(" + chTName + "?[1]) -> " + chTName + "?_; ";
					}
					actTemp += ":: else -> skip; fi";
					ret.add(actTemp);
				}
				ret.add(CCPrefix + chTermName + Frontend.separator + b.getName() + Frontend.separator + m.getName() + "!1");
			}
		}
		return ret;
	}
	
	public static String getMachineTerminationCondition(Transition t) {
		String ret = "";
		//condition of the form chTerm_boxName_machineName?[1] (if no entering node is specified) 
		//or of the form chTerm_boxName_machineName_exitingNode?[1] (if an entering node is specified)
		Box b = (Box) t.getSource();
		if (t.getExiting_node() != null)
			//only 1 machine is allowed
			ret = chTermName + Frontend.separator + b.getName() + Frontend.separator + b.getInstantiation().get(0).getName() + 
				Frontend.separator + t.getExiting_node().getName() + "?[1]";
		else {
			for (Machine m : b.getInstantiation()) {
				List<ExitingNode> exitingNodes = DSTMUtils.getExitingNodes(m);
				if (!exitingNodes.isEmpty()) {
					ret += " && (";
					String retTemp = "";
					for (ExitingNode ex : exitingNodes) {
						retTemp += " || " + chTermName + Frontend.separator + b.getName() + Frontend.separator + m.getName() + 
								Frontend.separator + ex.getName() + "?[1]";
					}
					//remove first '||'
					retTemp = retTemp.substring(4);
					ret += retTemp + ")";
				}
			}
			//remove first '&&'
			if (ret.length() > 4)
				ret = ret.substring(4);
		}
		return ret;
	}
	
	public static String parseParameters(String parInstantion, Box b, Machine m) {
		String ret = "";
		HashMap<String, String> parAssignment = new HashMap<String, String>();
		if (parInstantion != null) {
			String[] assignmentList  = parInstantion.split(parInstSeparator);
			//create an hash map with the assignments
			parAssignment = new HashMap<String, String>();
			for (String s : assignmentList) {
				String[] keyValue = s.split(parInstAssignement);
				parAssignment.put(keyValue[0].trim(), keyValue[1].trim());
			}
		}
		//create run string
		for (Parameter p : m.getParameters()) {
			if (parAssignment.containsKey(p.getName())) {
				//p is present in the assignment list
				if (p.getType() instanceof tChannel && p.getType().getName().startsWith("Chn[") && p.getType().getName().endsWith("]"))  {
					//typed channel
					int startIndex = p.getType().getName().indexOf("[");
					String mTypeName = p.getType().getName().substring(startIndex + 1, p.getType().getName().length() - 1);
					boolean found = false;
					Iterator<Type> typeIter = m.getDSTM().getTypes().iterator();
					Type type = null;
					while (!found && typeIter.hasNext()) {
						type = typeIter.next();
						if (type.getName().equals(mTypeName)) {
							found  = true;
							if (type instanceof tMultiType) {
								//is a multityped channel
								EList<tSimpleType> subtypes = ((tMultiType) type).getComposedBy();
								for (tSimpleType tST : subtypes) {
									ret += "," + parAssignment.get(p.getName()) + Frontend.separator + tST.getName();
								}
							} else {
								//is a simple typed channel
								ret += "," + parAssignment.get(p.getName());
							}
						}
					}
				} else {
					String parValue = parAssignment.get(p.getName());
					int indexOfTwoPoints = parValue.indexOf("::");
					if (indexOfTwoPoints > 0)
						//enumerative type
						parValue = parValue.substring(indexOfTwoPoints + 2);
					ret += "," + parValue;
				}
			} else {
				//p is a chTerm param
				String[] chTermName = p.getName().split(Frontend.separator);
				if (chTermName.length == 1)
					//chTerm of the machine
					ret += "," + chTermName[0] + Frontend.separator + b.getName() + Frontend.separator + m.getName();
				else if (chTermName.length == 2)
					//chTerm of a specific exiting node
					ret += "," + chTermName[0] + Frontend.separator + b.getName() + Frontend.separator + m.getName() + Frontend.separator + chTermName[1];
			}
		}
		return ret;
	}
}
