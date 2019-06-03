package org.prgmdl.tcg.p2t.engine;

import java.util.Hashtable;

import org.eclipse.emf.common.util.EList;

import DSTM4Rail.Channel;
import DSTM4Rail.DSTM;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.Type;
import DSTM4Rail.Vertex;
import DSTM4Rail.cExternal;
import DSTM4Rail.tBasic;
import DSTM4Rail.tChannel;
import DSTM4Rail.tCompound;
import DSTM4Rail.tEnum;
import DSTM4Rail.tInteger;
import DSTM4Rail.tMultiType;
import DSTM4Rail.tSimpleType;

public class EngineGenerator {
	
	private final DSTM DSTM_in;
	private Hashtable<String, Integer> chnLenghtHash = new Hashtable<String, Integer>();
	private Hashtable<String, Type> nameTypeHash = new Hashtable<String, Type>();
	
	public EngineGenerator(DSTM DSTM_in) {
		this.DSTM_in = DSTM_in;
		for (Type t : DSTM_in.getTypes()) {
			nameTypeHash.put(t.getName(), t);
		}
	}
	
	public StringBuffer createEnginePML() {
		StringBuffer sb = new StringBuffer();
		//proctype name
		sb.append("active proctype Engine() {\n\n");
		//PidMain variable
		sb.append("\tpid PidMain;\n");
		sb.append("\tbyte i;\n");
		sb.append("\n");
		//temp variables
		sb.append("\t//Temp Variables\n");
		sb.append("\tmtype temp;\n");
		for (Channel chn : DSTM_in.getChannels()) {
			if(chn instanceof cExternal) {
				if(chn.getChannelType() instanceof tSimpleType)
					sb.append("\t" + generateTempVariablesForSimpleType(chn.getName(), chn.getChannelType()));
				else {
					//multitype
					for (tSimpleType st : ((tMultiType) (chn.getChannelType())).getComposedBy()) {
						sb.append("\t" + generateTempVariablesForSimpleType(chn.getName() + "_" + st.getName(), st));
					}
				}
			}
		}
		{
			String parametersOfMain = "";
			//chterm main machine
			parametersOfMain = "\tchTerm_" + DSTM_in.getMain().getName();
			sb.append("\tchan chTerm_" + DSTM_in.getMain().getName() + " = [MAX_PROC] of {bit};\n");
			for (Vertex ex : DSTM_in.getMain().getVertexes()) {
				if (ex instanceof ExitingNode) {
					parametersOfMain += ",chTerm_" + ex.getName();
					sb.append("\tchan chTerm_" + ex.getName() + " = [MAX_PROC] of {bit};\n");
				}
			}
			//run main machine
			sb.append("\tPidMain = run " + DSTM_in.getMain().getName() + "(_pid," + DSTMUtils.getInitialNode(DSTM_in.getMain()).getName() + "," + parametersOfMain + ");\n");
		}
		sb.append("ChildrenMatrix[_pid].children[PidMain]=1;\n");
		sb.append("\n");
		//generation of first messages
		sb.append("\t//Generation of first messages\n");
		for(Channel chn : DSTM_in.getChannels()) {
			if(chn instanceof cExternal) {
				if (chn.getChannelType() instanceof tSimpleType) {
					String line = chn.getName() + "!0";
					int numOf0 = chnLenghtHash.get(chn.getName());
					for (int i=0; i<numOf0; i++)
						line += ",0";
					sb.append(line + ";\n");
				} else {
					//multitype
					for (tSimpleType st : ((tMultiType) (chn.getChannelType())).getComposedBy()) {
						String line = chn.getName() + "_" + st.getName() + "!0";
						int numOf0 = chnLenghtHash.get(chn.getName() + "_" + st.getName());
						for (int i=0; i<numOf0; i++)
							line += ",0";
						sb.append(line + ";\n");
					}
				}
			}
		}
		
		sb.append("\n");
		sb.append("\tprintf(\"<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?>\\n\");\n");
		sb.append("\tprintf(\"<tesqel:TestSequence xmlns:tesqel=\\\"tesqel\\\">\\n\");\n");
		sb.append("\tprintf(\"<initial>" + DSTMUtils.getInitialNode(DSTM_in.getMain()).getName() +"</initial>\\n\");\n");
		
		//generation label
		sb.append("\n");
		sb.append("\tnextStep:\n");
		sb.append("\t\tatomic {\n");
		
		
		//generation of messages
		for(Channel chn : DSTM_in.getChannels()) {
			if(chn instanceof cExternal) {
				sb.append("\t\t//MESSAGES ON " +  chn.getName() + "\n");
				//non deterministic value generation
				if(chn.getChannelType() instanceof tSimpleType) {
					sb.append("\t\tif\n");
					sb.append("\t\t:: (len(" + chn.getName() + ")==1) ->\n");
					sb.append("\t\t\tif\n");
					sb.append("\t\t\t:: (1) ->\n");
					sb.append(generateNDSimpleChannel(chn.getName(), chn.getChannelType()));
					sb.append("\t\t\t:: (1) ->\n");
					String line = chn.getName() + "!0";
					int numOf0 = chnLenghtHash.get(chn.getName());
					for (int i=0; i<numOf0; i++)
						line += ",0";
					sb.append("\t\t\t\t" + line + ";\n");
					sb.append("\t\t\tfi;\n");
					sb.append("\t\t:: else ->\n");
					sb.append("\t\t\tprintf(\"<IOmessage channel=\\\"" + chn.getName() + "\\\" direction=\\\"fromSystem\\\"/>\\n\");\n");
					sb.append("\t\tfi;\n");
					line = chn.getName() + "?temp";
					for (int i=1; i<=numOf0; i++)
						line += ",temp_" + chn.getName() + "_" + i;
					sb.append("\t\t" + line + ";\n");
				} else {
					//multitype
					tMultiType mt = (tMultiType) chn.getChannelType();
					String line = "\t\t:: ("; 
					sb.append("\t\tif\n");
					for (Type st : mt.getComposedBy()) {
						line += "len(" + chn.getName() + "_" + st.getName() + ") + ";
					}
					line = line.substring(0, line.length() - 3); //remove last ' + '
					sb.append(line + " == " + mt.getComposedBy().size() + ") ->\n");
					sb.append("\t\t\tif\n");
					for (Type st : mt.getComposedBy()) {
						sb.append("\t\t\t:: (1) ->\n");
						sb.append(generateNDSimpleChannel(chn.getName() + "_" + st.getName(), st));			
						for (Type stOthers : mt.getComposedBy()) {
							if (!stOthers.equals(st)) {
								line = chn.getName() + "_" + stOthers.getName()+ "!0";
								int numOf0 = chnLenghtHash.get(chn.getName() + "_" + stOthers.getName());
								for (int i=0; i<numOf0; i++)
									line += ",0";
								sb.append("\t\t\t\t" + line + ";\n");
							}
						}
					}				
					sb.append("\t\t\t:: (1) ->\n");
					for (Type st : mt.getComposedBy()) {
						line = chn.getName() + "_" + st.getName()+ "!0";
						int numOf0 = chnLenghtHash.get(chn.getName() + "_" + st.getName());
						for (int i=0; i<numOf0; i++)
							line += ",0";
						sb.append("\t\t\t\t" + line + ";\n");
					}
					sb.append("\t\t\tfi;\n");
					sb.append("\t\t:: else ->\n");
					sb.append("\t\t\tprintf(\"<IOmessage channel=\\\"" + chn.getName() + "\\\" direction=\\\"fromSystem\\\"/>\\n\");\n");
					sb.append("\t\tfi;\n");
					for (Type st : mt.getComposedBy()) {
						line = chn.getName() + "_" + st.getName() + "?temp";
						int numOf0 = chnLenghtHash.get(chn.getName() + "_" + st.getName());
						for (int i=1; i<=numOf0; i++)
							line += ",temp_" + chn.getName() + "_" + st.getName() + "_"+ i;
						sb.append("\t\t" + line + ";\n");
					}					
				}
				sb.append("\n");
			}
		}
		

		sb.append("			updateState=0\n");
		sb.append("\t\t\tHasFired=0;\n");
		sb.append("\t\t\tisFirstDescent=1;\n");
		sb.append("\t\t\tfor (i : 0 .. MAX_PROC-1){\n");
		sb.append("\t\t\t\tHasExecuted[i]=0;\n");
		sb.append("\t\t\t\tdescendantExecuted[i]=0;\n");
		sb.append("				HasToken[i] = ChildrenMatrix[_pid].children[i];\n");
		sb.append("\t\t\t}\n");
		sb.append("\t\t\tprintf(\"\\n\\n<compoundFiring>\\n\\n\");\n");
		sb.append("\t\t}\n");
		sb.append("\t\tgoto waitTimeout;\n");
		sb.append("\t\t\n");
		sb.append("\tnextPhase: //a phase includes phase1 (descent) and phase2 (backprop)\n");
		sb.append("\t\tatomic {\n");
		sb.append("\t\tupdateState=0;\n");
		sb.append("\t\tHasFired=0;\n");
		sb.append("\t\tfor ( i : 0 .. MAX_PROC - 1){\r\n" + 
				"				// give token to engine's children\r\n" + 
				"				HasToken[i] = ChildrenMatrix[_pid].children[i];\r\n" + 
				"			}\n");
		sb.append("\t\tisFirstDescent = 0; //It's at least the second\n");
		sb.append("\t}\n");
		sb.append("\t\tgoto waitTimeout;\n");
		sb.append("\n");
		sb.append("\twaitTimeout:\n");
		sb.append("\t\tdo\n");
		sb.append("\t\t\t:: timeout -> //deadlock\n");
		sb.append("\t\t\t\tif\n");
		sb.append("\t\t\t\t\t:: (HasFired==0 && isFirstDescent==1) -> goto abort;\n");
		sb.append("\t\t\t\t\t:: (HasFired==0 && isFirstDescent==0 && updateState==0) -> \n");
		sb.append("\t\t\t\t\t\tatomic{\n");
		sb.append("\t\t\t\t\t\tupdateState=1;\n");
		sb.append("\t\t\t\t\t\t	//goto nextStep;\n");
		sb.append("\t\t\t\t\t}\n");
		sb.append("\t\t\t\t:: (HasFired==0 && isFirstDescent==0 && updateState==1) -> \n");
		sb.append("\t\t\t\t\tatomic{\n");
		sb.append("				printf(\"\\n\\n</compoundFiring>\\n\\n\");\n");
		sb.append("\t\t\t\t\t\t	goto nextStep;\n");
		sb.append("						}\n");
		sb.append("\t\t\t\t\t:: (HasFired==1 && updateState==0) -> updateState=1;\n");
		sb.append("\t\t\t\t\t:: (HasFired==1 && updateState==1) -> goto nextPhase;\n");
		sb.append("\t\t\t\tfi;\n");
		sb.append("\t\tod;\n");
		sb.append("\n");
		sb.append("\tabort:\n");
		sb.append("		atomic {\n");
		sb.append("			dyingPid[_pid]=1;\n");
		sb.append("		}\n");
		sb.append("}\n");
		
		//return
		return sb;
	}

	private StringBuffer generateTempVariablesForSimpleType(String chnName, Type st) {
		StringBuffer sb = new StringBuffer();
		if (st instanceof tEnum && st.getName().compareTo("Bool")!=0) {
			sb.append("mtype temp_" + chnName + "_1;\n");
			chnLenghtHash.put(chnName, 1);
		} else if (st instanceof tEnum && st.getName().compareTo("Bool")==0) {
			sb.append("bit temp_" + chnName + "_1;\n");
			chnLenghtHash.put(chnName, 1);
		} else if (st instanceof tInteger) {
			sb.append("int temp_" + chnName + "_1;\n");
			chnLenghtHash.put(chnName, 1);
		} else if (st instanceof tChannel) {
			if(st.getName().compareTo("Chn")==0) {
				//generic channel
				sb.append("chan temp_" + chnName + "_1;\n");
				chnLenghtHash.put(chnName, 1);
			} else {
				//take channel type
				Type t = nameTypeHash.get(st.getName().substring(st.getName().indexOf("["), st.getName().indexOf("]")));
				if(t instanceof tMultiType) {
					String baseName = "chan temp_ " + chnName + "_";
					EList<tSimpleType> composedBy = ((tMultiType) t).getComposedBy();
					for (int i = 1; 1 <= composedBy.size(); i++) {
						sb.append(baseName + (i++) + ";\n");
					}
					chnLenghtHash.put(chnName, composedBy.size());
				} else {
					sb.append("chan temp_" + chnName + "_1;\n");
					chnLenghtHash.put(chnName, 1);
				}
			}
		} else if (st instanceof tCompound) {
			int i = 1;
			for (tBasic bt : ((tCompound) st).getSubtypes()) {
				if (bt instanceof tEnum && bt.getName().compareTo("Bool")!=0) {
					sb.append("mtype temp_" + chnName + "_" + (i++) + ";\n");
				} else if (bt instanceof tEnum && bt.getName().compareTo("Bool")==0) {
					sb.append("bit temp_" + chnName + "_" + (i++) + ";\n");
				} else if (bt instanceof tInteger) {
					sb.append("int temp_" + chnName + "_" + (i++) + ";\n");
				} else if (bt instanceof tChannel) {
					if(st.getName().compareTo("Chn")==0)
						//generic channel
						sb.append("chan temp_" + chnName + "_" + (i++) + ";\n");
					else {
						//take channel type
						Type t = nameTypeHash.get(st.getName().substring(st.getName().indexOf("["), st.getName().indexOf("]")));
						if(t instanceof tMultiType) {
							String baseName = "chan temp_ " + chnName + "_";
							EList<tSimpleType> composedBy = ((tMultiType) t).getComposedBy();
							for (int j = 1; j <= composedBy.size(); j++) {
								sb.append(baseName + (i++) + ";\n");
							}
						} else {
							sb.append("chan temp_" + chnName + "_" + (i++) + ";\n");
						}
					}
				}
			}
			chnLenghtHash.put(chnName, --i);
		}
		return sb;
	}
	
	private StringBuffer generateNDSimpleChannel(String chnName, Type channelType) {
		StringBuffer sb = new StringBuffer();
		if (channelType instanceof tEnum) {
			sb.append(generateNDVariable("temp_" + chnName + "_1", (tEnum) channelType));
			if(channelType.getName().compareTo("Bool")!=0)
				sb.append("\t\t\t\tprintf(\"<IOmessage channel=\\\"" + chnName + "[%d]\\\" message=\\\"&lt;%e>\\\"/>\\n\"," + chnName + ",temp_" + chnName + "_1);\n");
			else
				sb.append("\t\t\t\tprintf(\"<IOmessage channel=\\\"" + chnName + "[%d]\\\" message=\\\"&lt;%d>\\\"/>\\n\"," + chnName + ",temp_" + chnName + "_1);\n");
			sb.append("\t\t\t\t" + chnName + "!1," + "temp_" + chnName + "_1;\n");
		} else if (channelType instanceof tChannel) {
			sb.append(generateNDVariable("temp_" + chnName + "_1", (tChannel) channelType));
			sb.append("\t\t\t\tprintf(\"<IOmessage channel=\\\"" + chnName + "[%d]\\\" message=\\\"&lt;%e>\\\"/>\\n\"," + chnName + ",temp_" + chnName + "_1);\n");
			sb.append("\t\t\t\t" + chnName + "!1," + "temp_" + chnName + "_1;\n");
		} else if (channelType instanceof tInteger) {
			sb.append(generateNDVariable("temp_" + chnName + "_1", (tInteger) channelType));
			sb.append("\t\t\t\tprintf(\"<IOmessage channel=\\\"" + chnName + "[%d]\\\" message=\\\"&lt;%d>\\\"/>\\n\"," + chnName + ",temp_" + chnName + "_1);\n");
			sb.append("\t\t\t\t" + chnName + "!1," + "temp_" + chnName + "_1;\n");
		} else if (channelType instanceof tCompound) {
			int i = 1;
			String generated = "printf(\"<IOmessage channel=\\\"" + chnName + "[%d]\\\" message=\\\"&lt;";
			String varNames = "";
			for (tBasic bt : ((tCompound) channelType).getSubtypes()) {
				if (bt instanceof tEnum) {
					sb.append(generateNDVariable("temp_" + chnName + "_" + i, (tEnum) bt));
					if(channelType.getName().compareTo("Bool")!=0)
						generated += "%e,";
					else
						generated += "%d,";
					varNames += "temp_" + chnName + "_" + (i++) + ",";
				} else if (bt instanceof tChannel) {
					if(bt.getName().compareTo("Chn")==0) {
						//generic channel
						sb.append(generateNDVariable("temp_" + chnName + "_" + i, (tChannel) bt));
						generated += "%e,";
						varNames += "temp_" + chnName + "_" + (i++) + ",";
					} else {
						//take channel type
						Type t = nameTypeHash.get(bt.getName().substring(bt.getName().indexOf("["), bt.getName().indexOf("]")));
						if(t instanceof tMultiType) {
							EList<tSimpleType> composedBy = ((tMultiType) t).getComposedBy();
							for (int j = 1; j <= composedBy.size(); j++) {
								sb.append(generateNDVariable("temp_" + chnName + "_" + i, (tChannel) bt));
								generated += "%e,";
								varNames += "temp_" + chnName + "_" + (i++) + ",";
							}
						} else {
							sb.append(generateNDVariable("temp_" + chnName + "_" + i, (tChannel) bt));
							generated += "%e,";
							varNames += "temp_" + chnName + "_" + (i++) + ",";
						}
					}
				} else if (bt instanceof tInteger) {
					sb.append(generateNDVariable("temp_" + chnName + "_" + i, (tInteger) bt));
					generated += "%d,";
					varNames += "temp_" + chnName + "_" + (i++) + ",";
				}
			}
			generated = generated.substring(0, generated.length() - 1); //remove last ','
			varNames = varNames.substring(0, varNames.length() - 1); //remove last ','
			generated += ">\\\"/>\\n\"," + chnName + "," + varNames + ");\n";
			sb.append("\t\t\t\t" + generated);
			sb.append("\t\t\t\t" + chnName + "!1," + varNames +";\n");
		}
		return sb;
	}
	
	private StringBuffer generateNDVariable(String varName, tEnum en) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t\t\t\tif\n");
		for (String literal : en.getLiterals()) {
			sb.append("\t\t\t\t:: " + varName + "=" + literal + ";\n");
		}
		sb.append("\t\t\t\tfi;\n");
		return sb;
	}
	
	private StringBuffer generateNDVariable(String varName, tChannel ch) {
		StringBuffer sb = new StringBuffer();
		sb.append("\t\t\t\tif\n");
		for (String chName : ch.getChannel_names()) {
			sb.append("\t\t\t\t:: " + varName + "=" + chName + ";\n");
		}
		sb.append("\t\t\t\tfi;\n");
		return sb;
	}
	
	private StringBuffer generateNDVariable(String varName, tInteger in) {
		StringBuffer sb = new StringBuffer();
		//DUMMY IMPLEMENTATION: it generates 0 for integer fields or specific values for the SCP model
		if(varName.contains("_MSessionEstablished_3"))
			sb.append("\t\t\t\t" + varName + " = 1\n");
		else if(varName.contains("_MSessionEstablished_4"))
			sb.append("\t\t\t\t" + varName + " = 1\n");
		else if(varName.contains("_MMovementAuthority_2"))
			sb.append("\t\t\t\t" + varName + " = 10\n");
		else
			sb.append("\t\t\t\t" + varName + " = 0\n");
		return sb;
	}
}
