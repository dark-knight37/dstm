package org.prgmdl.merge;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import DSTM4Rail.Channel;
import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailFactory;
import DSTM4Rail.Machine;
import DSTM4Rail.Parameter;
import DSTM4Rail.Transition;
import DSTM4Rail.Type;
import DSTM4Rail.Variable;
import DSTM4Rail.cExternal;
import DSTM4Rail.cInternal;
import DSTM4Rail.tBasic;
import DSTM4Rail.tChannel;
import DSTM4Rail.tCompound;
import DSTM4Rail.tEnum;
import DSTM4Rail.tInteger;
import DSTM4Rail.tMultiType;

public class DataManipulatorImpl implements DSTMDataManipulator {
	private DSTM dstm;

	/* simple types */
	private Hashtable<String, Type> types = new Hashtable<String, Type>();

	private Hashtable<String, Type> compoundTypes = new Hashtable<String, Type>();
	private Hashtable<String, Vector<String>> compoundLiterals = new Hashtable<String, Vector<String>>();

	/* Multitypes */
	private Hashtable<String, Type> multitypes = new Hashtable<String, Type>();
	private Hashtable<String, Vector<String>> multitypesComponents = new Hashtable<String, Vector<String>>();

	/* variable */
	private Hashtable<String, String> variablesType = new Hashtable<String, String>();
	private Hashtable<String, Variable> variables = new Hashtable<String, Variable>();

	/* Parameters */
	private Hashtable<String, Parameter> parameters = new Hashtable<String, Parameter>();
	private Hashtable<String, String> parameterType = new Hashtable<String, String>();
	private Hashtable<String, String> parameterMachine = new Hashtable<String, String>();
	private ArrayList<String> parameterOrderVector = new ArrayList<String>();

	/* Channel */
	private Hashtable<String, String> channelsType = new Hashtable<String, String>();
	private Hashtable<String, Channel> channels = new Hashtable<String, Channel>();
	private Hashtable<String, Integer> channelsBound = new Hashtable<String, Integer>();
	private Hashtable<String, tChannel> composedTChannels = new Hashtable<String, tChannel>();
	private ArrayList<String> channelsOrderVector = new ArrayList<String>();
	/* Constructor */
	public DataManipulatorImpl(DSTM dstm) {
		super();

		this.dstm = dstm;
		// cleaning of the dstm model
		clean();

		// By default a Int and Boolean types are added to the DSTM model
		tInteger intType = DSTM4RailFactory.eINSTANCE.createtInteger();
		tEnum booleanType = DSTM4RailFactory.eINSTANCE.createtEnum();
		intType.setName("Int");
		booleanType.setName("Bool");
		booleanType.getLiterals().add("false");
		booleanType.getLiterals().add("true");
		this.types.put("Int", intType);
		this.types.put("Bool", booleanType);
	}

	// get the instance of manipulated DSTM
	public DSTM getDSTM() {
		return this.dstm;
	}

	public boolean clean() {
		boolean cleaned = false;
		// Variables
		while (!this.dstm.getGlobal_variables().isEmpty()) {
			EcoreUtil.delete(this.dstm.getGlobal_variables().get(0), true);
			cleaned = true;
		}

		// types
		while (!this.dstm.getTypes().isEmpty()) {
			EcoreUtil.delete(this.dstm.getTypes().get(0), true);
			cleaned = true;
		}

		// channels
		while (!this.dstm.getChannels().isEmpty()) {
			EcoreUtil.delete(this.dstm.getChannels().get(0), true);
			cleaned = true;
		}

		// parameters
		for (Machine machine : this.dstm.getMachines()) {
			while (!machine.getParameters().isEmpty()) {
				EcoreUtil.delete(machine.getParameters().get(0));
			}

		}
		return cleaned;
	}

	public boolean addEnum(String name, Vector<String> literals) {
		tEnum newEnumType = DSTM4RailFactory.eINSTANCE.createtEnum();
		newEnumType.setName(name);
		for (String literal : literals) {
			newEnumType.getLiterals().add(literal);
		}
		this.types.put(name, newEnumType);
		return true;
	}

	public boolean addCompound(String name, java.util.Vector<String> types) {
		tCompound compound = DSTM4RailFactory.eINSTANCE.createtCompound();
		compound.setName(name);

		this.compoundTypes.put(name, compound);
		this.compoundLiterals.put(name, types);
		return true;

	}

	// public boolean addCompound(String name, Vector<String> types) {
	// tCompound compound = DSTM4RailFactory.eINSTANCE.createtCompound();
	// compound.setName(name);
	// for (String tBasic : types) {
	// boolean found = false;
	// for(int i=0;i<this.dstm.getTypes().size() && !found; i++){
	// Type elem = this.dstm.getTypes().get(i);
	// if(elem.getName().compareTo(tBasic)==0){
	// found = true;
	// if(elem.getClass().toString().contains("tInteger")){
	// tInteger tInt = DSTM4RailFactory.eINSTANCE.createtInteger((tInteger)
	// elem);
	// tInt.setName(elem.getName());
	// this.types.put(elem.getName(), tInt);
	// }else if(elem.getClass().toString().contains("tEnum")){
	// tEnum tEnum = DSTM4RailFactory.eINSTANCE.createtEnum();
	// tEnum.setName(elem.getName());
	// EList<String> literals = ((tEnum) elem).getLiterals();
	// this.types.put(tEnum.getName(), tEnum);
	// for (String string : literals) {
	// tEnum.getLiterals().add(string);
	// }
	// }else{
	// tChannel tChan = DSTM4RailFactory.eINSTANCE.createtChannel();
	// tChan.setName(elem.getName());
	// EList<String> literals = ((tChannel) elem).getChannel_names();
	//
	// for (String string : literals) {
	// tChan.getChannel_names().add(string);
	// }
	//
	// }
	// }
	// }
	//
	// }
	// compound.setDSTM(this.dstm);
	// this.types.put(name, compound);
	// return true;
	// }

	public boolean addMultitype(String name, Vector<String> types) {
		tMultiType multiType = DSTM4RailFactory.eINSTANCE.createtMultiType();
		multiType.setName(name);
		this.multitypes.put(name, multiType);
		this.multitypesComponents.put(name, types);
		return true;
	}

	public boolean addVariable(String name, String type) {
		Variable newVar = DSTM4RailFactory.eINSTANCE.createVariable();
		newVar.setName(name);
		this.variables.put(name, newVar);
		this.variablesType.put(name, type);
		return true;

	}

	public boolean addParameter(String name, String type, String machine) {
		Parameter param = DSTM4RailFactory.eINSTANCE.createParameter();
		param.setName(name);
		this.parameters.put(name, param);
		this.parameterType.put(name, type);
		this.parameterMachine.put(name, machine);
		this.parameterOrderVector.add(name);
		return true;
	}

	public boolean addExtChannel(String name, String type) {
		Channel chn = DSTM4RailFactory.eINSTANCE.createcExternal();
		chn.setName(name);
		this.channels.put(name, chn);
		this.channelsType.put(name, type);
		this.channelsBound.put(name, -1);
		this.channelsOrderVector.add(name);
		return true;
	}

	public boolean addIntChannel(String name, String type, int bound) {
		Channel chn = DSTM4RailFactory.eINSTANCE.createcInternal();
		chn.setName(name);
		this.channelsOrderVector.add(name);
		this.channels.put(name, chn);
		this.channelsType.put(name, type);
		this.channelsBound.put(name, bound);
		return true;
	}

	public boolean finalise() {
		Enumeration<Type> typesToAdd = this.types.elements();
		while (typesToAdd.hasMoreElements()) {
			Type newType = typesToAdd.nextElement();

			this.dstm.getTypes().add(newType);
			newType.setDSTM(this.dstm);
		}

		boolean hasElements = false;
		Enumeration<Channel> tChannelName = this.channels.elements();
		tChannel tChan = DSTM4RailFactory.eINSTANCE.createtChannel();
		tChan.setName("Chn");
		while (tChannelName.hasMoreElements()) {
			hasElements = true;
			String name = tChannelName.nextElement().getName();
			tChan.getChannel_names().add(name);

		}
		if (hasElements) {
			this.dstm.getTypes().add(tChan);
			tChan.setDSTM(dstm);
		}

		Enumeration<Channel> tChannelName_2 = this.channels.elements();
		while (tChannelName_2.hasMoreElements()) {
			Channel chnTemp = tChannelName_2.nextElement();
			String tChanName = "Chn[" + this.channelsType.get(chnTemp.getName()) + "]";
			if (this.composedTChannels.get(tChanName) == null) {
				tChannel composedTChan = DSTM4RailFactory.eINSTANCE.createtChannel();
				composedTChan.setName(tChanName);
				composedTChan.getChannel_names().add(chnTemp.getName());
				this.composedTChannels.put(tChanName, composedTChan);
			} else {
				this.composedTChannels.get(tChanName).getChannel_names()
						.add(chnTemp.getName());
			}
		}

		Enumeration<tChannel> tComposedChannels = this.composedTChannels.elements();
		while (tComposedChannels.hasMoreElements()) {
			tChannel tChanElem = tComposedChannels.nextElement();
			this.dstm.getTypes().add(tChanElem);
			tChanElem.setDSTM(this.dstm);
		}
		
		Enumeration<Type> compoundToAdd = this.compoundTypes.elements();
		while (compoundToAdd.hasMoreElements()) {
			tCompound tComp = (tCompound) compoundToAdd.nextElement();
			for (String tBasic: this.compoundLiterals.get(tComp.getName())) {
				boolean found = false;
				for (int i = 0; i < this.dstm.getTypes().size() && !found; i++) {
					Type elem = this.dstm.getTypes().get(i);
					if (elem.getName().compareTo(tBasic) == 0) {
						found = true;
						if (elem.getClass().toString().contains("tInteger")) {
							tInteger tInt = DSTM4RailFactory.eINSTANCE.createtInteger();

							tInt.setName(elem.getName());
							tComp.getSubtypes().add(tInt);
						} else if (elem.getClass().toString().contains("tEnum")) {
							tEnum tEnum = DSTM4RailFactory.eINSTANCE.createtEnum();
							tEnum.setName(elem.getName());
							EList<String> literals = ((tEnum) elem).getLiterals();							
							for (String string : literals) {
								tEnum.getLiterals().add(string);
							}
							tComp.getSubtypes().add(tEnum);
						} else if  (elem.getClass().toString().contains("tChannel")){
							tChannel tChan1 = DSTM4RailFactory.eINSTANCE.createtChannel();
							tChan1.setName(elem.getName());
							EList<String> literals = ((tChannel) elem).getChannel_names();

							for (String string : literals) {
								tChan1.getChannel_names().add(string);
							}
							tComp.getSubtypes().add(tChan1);

						}
					}

				}
			}
			tComp.setDSTM(this.dstm);
			this.dstm.getTypes().add(tComp);
		}

		Enumeration<Type> multiTypeToAdd = this.multitypes.elements();
		while (multiTypeToAdd.hasMoreElements()) {
			
			tMultiType multiTypeNew = (tMultiType) multiTypeToAdd.nextElement();
			Vector<String> simpleTypes = this.multitypesComponents.get(multiTypeNew.getName());
			for (String simpleType : simpleTypes) {

				boolean found = false;
				for (int i = 0; i < this.dstm.getTypes().size() && !found; i++) {
					Type elem = this.dstm.getTypes().get(i);
					if (elem.getName().compareTo(simpleType) == 0) {
						found = true;
						if (elem.getClass().toString().contains("tInteger")) {
							tInteger tInt = DSTM4RailFactory.eINSTANCE.createtInteger();
							tInt.setName(simpleType);
							//this.types.put(elem.getName(), tInt);
							multiTypeNew.getComposedBy().add(tInt);
						} else if (elem.getClass().toString().contains("tEnum")) {
							tEnum tEnum = DSTM4RailFactory.eINSTANCE.createtEnum();
							tEnum.setName(simpleType);
							EList<String> literals = ((tEnum) elem).getLiterals();
							
							for (String string : literals) {
								tEnum.getLiterals().add(string);
							}
							multiTypeNew.getComposedBy().add(tEnum);
						} else if(elem.getClass().toString().contains("tChannel")){
							tChannel tChan1 = DSTM4RailFactory.eINSTANCE.createtChannel();
							
							tChan1.setName(simpleType);
							EList<String> literals = ((tChannel) elem).getChannel_names();

							for (String string : literals) {
								tChan1.getChannel_names().add(string);
							}
							multiTypeNew.getComposedBy().add(tChan1);

						} else {
							tCompound tComp = DSTM4RailFactory.eINSTANCE.createtCompound();
							tComp.setName(elem.getName());
							EList<tBasic> basics = ((tCompound) elem).getSubtypes();

							for (tBasic basic : basics) {
								if (basic.getClass().toString().contains("tInteger")) {
									tInteger tInt = DSTM4RailFactory.eINSTANCE.createtInteger();
									tInt.setName(basic.getName());
									tComp.getSubtypes().add(tInt);
								} else if (basic.getClass().toString().contains("tEnum")) {
									tEnum tEnum = DSTM4RailFactory.eINSTANCE.createtEnum();
									tEnum.setName(basic.getName());		
									EList<String> literals = ((tEnum) basic).getLiterals();							
									for (String string : literals) {
										tEnum.getLiterals().add(string);
									}
									tComp.getSubtypes().add(tEnum);
								} else {
									tChannel tChanComp = DSTM4RailFactory.eINSTANCE
											.createtChannel();
									tChanComp.setName(basic.getName());
									EList<String> literals = ((tChannel) basic)
											.getChannel_names();

									for (String string : literals) {
										tChanComp.getChannel_names().add(string);
									}
									tComp.getSubtypes().add(tChanComp);

								}
							}
							multiTypeNew.getComposedBy().add(tComp);
							

						}
					}

				}
			}
			multiTypeNew.setDSTM(this.dstm);
			this.dstm.getTypes().add(multiTypeNew);
		}
			

		Enumeration<Variable> variablesToAdd = this.variables.elements();
		while (variablesToAdd.hasMoreElements()) {
			Variable var = variablesToAdd.nextElement();
			String varType = (this.variablesType.get(var.getName()));
			boolean found = false;
			for (int i=0; i<this.dstm.getTypes().size() && !found; i++) {
				if (this.dstm.getTypes().get(i).getName().compareTo(varType)==0 ) {
					found = true;
					var.setType((tBasic) this.dstm.getTypes().get(i));
					var.setDSTM(this.dstm);
					this.dstm.getGlobal_variables().add(var);
				}
			}
		
			
		}

		for(int j=0;j<this.parameterOrderVector.size();j++){
			//Parameter par = parametersToAdd.nextElement();
			Parameter par = this.parameters.get(this.parameterOrderVector.get(j));
			String parType = (this.parameterType.get(par.getName()));
			boolean found = false;
			for (int i=0; i<this.dstm.getTypes().size() && !found; i++) {
				if (this.dstm.getTypes().get(i).getName().compareTo(parType)==0) {
					found = true;
					par.setType((tBasic) this.dstm.getTypes().get(i));
				}
			}
			for (Machine machine : this.dstm.getMachines()) {
				if (machine.getName().compareTo(this.parameterMachine.get(par.getName())) == 0) {
					par.setMachine(machine);
					machine.getParameters().add(par);
				}
			}
		}

		for(int j=0;j<channelsOrderVector.size();j++){
			Channel chnNew = this.channels.get(channelsOrderVector.get(j));
			if (this.channelsBound.get(chnNew.getName()) == -1) {
				cExternal cExt = (cExternal) chnNew;
				String chType = this.channelsType.get(chnNew.getName());
				boolean found = false;
				for (int i=0; i<this.dstm.getTypes().size() && !found; i++) {
					if (this.dstm.getTypes().get(i).getName().compareTo(chType)==0) {
						found = true;
						cExt.setChannelType(this.dstm.getTypes().get(i));
					}
				}
				this.dstm.getChannels().add(cExt);
				cExt.setDSTM(this.dstm);
			} else {
				cInternal cInt = (cInternal) chnNew;
				String chType = this.channelsType.get(chnNew.getName());
				boolean found = false;
				for (int i=0; i<this.dstm.getTypes().size() && !found; i++) {
					if (this.dstm.getTypes().get(i).getName().compareTo(chType)==0) {
						found = true;
						cInt.setChannelType(this.dstm.getTypes().get(i));
					}
				}
				cInt.setBound(this.channelsBound.get(cInt.getName()));
				this.dstm.getChannels().add(cInt);
				cInt.setDSTM(this.dstm);
			}

		}
		this.splitActions();
		return true;
	}
	
	private void splitActions() {
		for (Machine m : this.dstm.getMachines()) {
			for (Transition t : m.getTransitions()) {
				if(!t.getName().equals("") && t.getName()!=null && t.getMachine().getName()!=null) {
					// Actions
					Vector<String> list = new Vector<String>();
					for (int i = 0; i < t.getActions().size(); i++) {
						String actions = t.getActions().get(i);
						if (actions != null) {
							if (!actions.equals("")) {
								StringTokenizer stkz = new StringTokenizer(actions,";");
								while (stkz.hasMoreTokens()) {
									String buffer = stkz.nextToken();
									list.add(buffer);
								}
							} else {
								list.add("");
							}
						}
					}
					t.getActions().clear();
					t.getActions().addAll(list);
				}			
			}
		}
	} 

}
