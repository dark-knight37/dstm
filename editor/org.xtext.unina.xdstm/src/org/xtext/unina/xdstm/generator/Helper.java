package org.xtext.unina.xdstm.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.xtext.unina.xdstm.xDstm.Box;
import org.xtext.unina.xdstm.xDstm.EnteringNode;
import org.xtext.unina.xdstm.xDstm.EnteringNodeAbs;
import org.xtext.unina.xdstm.xDstm.ExitingNode;
import org.xtext.unina.xdstm.xDstm.Fork;
import org.xtext.unina.xdstm.xDstm.InitialNode;
import org.xtext.unina.xdstm.xDstm.Join;
import org.xtext.unina.xdstm.xDstm.Machine;
import org.xtext.unina.xdstm.xDstm.Model;
import org.xtext.unina.xdstm.xDstm.Node;
import org.xtext.unina.xdstm.xDstm.Transition;
import org.xtext.unina.xdstm.xDstm.Vertex;

public class Helper {
	
	private Resource resource;
	private Model model;
	
	public Helper(Resource resource) {
		this.resource = resource;
		this.model = (Model) resource.getContents().get(0);
	}
	
    public void saveRecourceAsXmi() {
    	try {
    		Map<String, String> saveOptions = new HashMap<String, String>();
    		Resource xmiResource = new XMIResourceImpl(resource.getURI().appendFileExtension("xmi"));
    		xmiResource.getContents().add(model);
    		saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
    		xmiResource.save(saveOptions);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static DSTM4Rail.DSTM convertToDSTM4Rail(Model model) {
    	DSTM4Rail.DSTM dstm3 = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createDSTM();
    	dstm3.setName(model.getDstm().get(0).getName());
    	for (Machine m : model.getDstm().get(0).getMachines()) {
    		DSTM4Rail.Machine mch3 = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createMachine();
    		if (model.getDstm().get(0).getMain().equals(m))
    			dstm3.setMain(mch3);
    		mch3.setName(m.getName());
			dstm3.getMachines().add(mch3);
			for (Vertex v : m.getVertexes()) {
				if (v instanceof Node) {
					DSTM4Rail.Node n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createNode();
					n.setName(((Node) v).getName());
					n.getRequirements().addAll(((Node) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Box) {
					DSTM4Rail.Box n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createBox();
					n.setName(((Box) v).getName());
					n.getRequirements().addAll(((Box) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof InitialNode) {
					DSTM4Rail.InitialNode n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createInitialNode();
					n.setName(((InitialNode) v).getName());
					n.getRequirements().addAll(((InitialNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof EnteringNode) {
					DSTM4Rail.EnteringNode n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createEnteringNode();
					n.setName(((EnteringNode) v).getName());
					n.getRequirements().addAll(((EnteringNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof ExitingNode) {
					DSTM4Rail.ExitingNode n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createExitingNode();
					n.setName(((ExitingNode) v).getName());
					n.getRequirements().addAll(((ExitingNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Fork) {
					DSTM4Rail.Fork n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createFork();
					n.setName(((Fork) v).getName());
					n.getRequirements().addAll(((Fork) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Join) {
					DSTM4Rail.Join n = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createJoin();
					n.setName(((Join) v).getName());
					n.getRequirements().addAll(((Join) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				}
			}
    	}
    	for (Machine m : model.getDstm().get(0).getMachines()) {
    		DSTM4Rail.Machine mch3 = getMachineFromName(m.getName(), dstm3);
    		if (mch3!= null) {
				for (Vertex v : m.getVertexes()) {
					if (v instanceof Box) {
						DSTM4Rail.Box n = (DSTM4Rail.Box) getVertexFromName(((Box) v).getName(), mch3);
						for (Machine minst : ((Box) v).getInstantiation()) {
							n.getInstantiation().add(getMachineFromName(minst.getName(), dstm3));
						}
					}
				}
				for (Transition t : m.getTransitions()) {
					DSTM4Rail.Transition t3 = DSTM4Rail.DSTM4RailFactory.eINSTANCE.createTransition();
					t3.setName(t.getName());
					t3.setSource(getVertexFromName(getVertexName((Vertex)t.getSource()),mch3));
					t3.setDestination(getVertexFromName(getVertexName((Vertex)t.getDestination()),mch3));
					t3.setTrigger(t.getTrigger());
					t3.setCondition(t.getCondition());
					t3.getActions().addAll(t.getActions());
					t3.getPar_instantiation().addAll(t.getPar_instantiation());
					t3.setIs_preemptive(t.isIs_preemptive());
					t3.getRequirements().addAll(t.getRequirements().getRequirements());
					if(t.getSource() instanceof Box && t.getExiting_node()!=null) {
						t3.setExiting_node((DSTM4Rail.ExitingNode) getVertexFromName(t.getExiting_node().getName(), ((DSTM4Rail.Box) t3.getSource()).getInstantiation().get(0)));
					}
					if(t.getDestination() instanceof Box && t.getEntering_node()!=null) {
						t3.setEntering_node((DSTM4Rail.EnteringNode) getVertexFromName(t.getEntering_node().getName(), ((DSTM4Rail.Box) t3.getDestination()).getInstantiation().get(0)));
					}
					mch3.getTransitions().add(t3);
				}
    		}
    	}
    	return dstm3;
    }
    
    public void generateDSTM4Rail() {
    	DSTM4Rail.DSTM dstm3 = convertToDSTM4Rail(this.model);
    	try {
    		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    		Map<String,Object> m = reg.getExtensionToFactoryMap();
    		m.put("DSTM4Rail", new XMIResourceFactoryImpl());
    		ResourceSet resSet = new ResourceSetImpl();
    		Resource resourcedstm3 = resSet.createResource(resource.getURI().appendFileExtension("dstm4rail"));
    		resourcedstm3.getContents().add(dstm3);
    		resourcedstm3.save(Collections.EMPTY_MAP);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

	private static DSTM4Rail.Machine getMachineFromName(String name, DSTM4Rail.DSTM dstm3) {
		DSTM4Rail.Machine ret = null;
    	Iterator<DSTM4Rail.Machine> it = dstm3.getMachines().iterator();
    	while (ret == null && it.hasNext()) {
    		DSTM4Rail.Machine mch = it.next();
    		if (mch.getName().compareTo(name) == 0) {
    			ret = mch; 
    		}
    	}
    	return ret;
    }
    
    private static DSTM4Rail.Vertex getVertexFromName(String name, DSTM4Rail.Machine machine3) {
    	DSTM4Rail.Vertex ret = null;
    	Iterator<DSTM4Rail.Vertex> it = machine3.getVertexes().iterator();
    	while (ret == null && it.hasNext()) {
    		DSTM4Rail.Vertex ver = it.next();
    		if (ver.getName().compareTo(name) == 0) {
    			ret = ver; 
    		}
    	}
    	return ret;
    }
    
    /*private String getVertexName(Vertex v) {
    	if (v instanceof Node) {
			return ((Node) v).getName();
		} else if (v instanceof Box) {
			return ((Box) v).getName();
		} else if (v instanceof EnteringNodeAbs) {
			return ((EnteringNodeAbs) v).getName();
		} else if (v instanceof ExitingNode) {
			return ((ExitingNode) v).getName();
		} else if (v instanceof Fork) {
			return ((Fork) v).getName();
		} else if (v instanceof Join) {
			return ((Join) v).getName();
		}
    	return null;
    }*/
    
    //******************************* DSTM *********************************************
    public void generateDSTM3() {
    	dstm.DSTM dstm3 = dstm.DstmFactory.eINSTANCE.createDSTM();
    	dstm3.setName(model.getDstm().get(0).getName());
    	for (Machine m : model.getDstm().get(0).getMachines()) {
    		dstm.Machine mch3 = dstm.DstmFactory.eINSTANCE.createMachine();
    		if (model.getDstm().get(0).getMain().equals(m))
    			dstm3.setMain(mch3);
    		mch3.setName(m.getName());
			dstm3.getMachines().add(mch3);
			for (Vertex v : m.getVertexes()) {
				if (v instanceof Node) {
					dstm.Node n = dstm.DstmFactory.eINSTANCE.createNode();
					n.setName(((Node) v).getName());
					n.getRequirements().addAll(((Node) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Box) {
					dstm.Box n = dstm.DstmFactory.eINSTANCE.createBox();
					n.setName(((Box) v).getName());
					n.getRequirements().addAll(((Box) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof InitialNode) {
					dstm.InitialNode n = dstm.DstmFactory.eINSTANCE.createInitialNode();
					n.setName(((InitialNode) v).getName());
					n.getRequirements().addAll(((InitialNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof EnteringNode) {
					dstm.EnteringNode n = dstm.DstmFactory.eINSTANCE.createEnteringNode();
					n.setName(((EnteringNode) v).getName());
					n.getRequirements().addAll(((EnteringNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof ExitingNode) {
					dstm.ExitingNode n = dstm.DstmFactory.eINSTANCE.createExitingNode();
					n.setName(((ExitingNode) v).getName());
					n.getRequirements().addAll(((ExitingNode) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Fork) {
					dstm.Fork n = dstm.DstmFactory.eINSTANCE.createFork();
					n.setName(((Fork) v).getName());
					n.getRequirements().addAll(((Fork) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				} else if (v instanceof Join) {
					dstm.Join n = dstm.DstmFactory.eINSTANCE.createJoin();
					n.setName(((Join) v).getName());
					n.getRequirements().addAll(((Join) v).getRequirements().getRequirements());
					mch3.getVertexes().add(n);
				}
			}
    	}
    	for (Machine m : model.getDstm().get(0).getMachines()) {
    		dstm.Machine mch3 = this.getMachineFromName(m.getName(), dstm3);
    		if (mch3!= null) {
				for (Vertex v : m.getVertexes()) {
					if (v instanceof Box) {
						dstm.Box n = (dstm.Box) getVertexFromName(((Box) v).getName(), mch3);
						for (Machine minst : ((Box) v).getInstantiation()) {
							n.getInstantiation().add(getMachineFromName(minst.getName(), dstm3));
						}
					}
				}
				for (Transition t : m.getTransitions()) {
					dstm.Transition t3 = dstm.DstmFactory.eINSTANCE.createTransition();
					t3.setName(t.getName());
					t3.setSource(getVertexFromName(getVertexName((Vertex)t.getSource()),mch3));
					t3.setDestination(getVertexFromName(getVertexName((Vertex)t.getDestination()),mch3));
					t3.setTrigger(t.getTrigger());
					t3.setCondition(t.getCondition());
					t3.getActions().addAll(t.getActions());
					t3.getPar_instantiation().addAll(t.getPar_instantiation());
					t3.setIs_preemptive(t.isIs_preemptive());
					t3.getRequirements().addAll(t.getRequirements().getRequirements());
					if(t.getSource() instanceof Box && t.getExiting_node()!=null) {
						t3.setExiting_node((dstm.ExitingNode) getVertexFromName(t.getExiting_node().getName(), ((dstm.Box) t3.getSource()).getInstantiation().get(0)));
					}
					if(t.getDestination() instanceof Box && t.getEntering_node()!=null) {
						t3.setEntering_node((dstm.EnteringNode) getVertexFromName(t.getEntering_node().getName(), ((dstm.Box) t3.getDestination()).getInstantiation().get(0)));
					}
					mch3.getTransitions().add(t3);
				}
    		}
    	}
    	try {
    		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    		Map<String,Object> m = reg.getExtensionToFactoryMap();
    		m.put("dstm", new XMIResourceFactoryImpl());
    		ResourceSet resSet = new ResourceSetImpl();
    		Resource resourcedstm3 = resSet.createResource(resource.getURI().appendFileExtension("dstm"));
    		resourcedstm3.getContents().add(dstm3);
    		resourcedstm3.save(Collections.EMPTY_MAP);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

	private dstm.Machine getMachineFromName(String name, dstm.DSTM dstm3) {
    	dstm.Machine ret = null;
    	Iterator<dstm.Machine> it = dstm3.getMachines().iterator();
    	while (ret == null && it.hasNext()) {
    		dstm.Machine mch = it.next();
    		if (mch.getName().compareTo(name) == 0) {
    			ret = mch; 
    		}
    	}
    	return ret;
    }
    
    private dstm.Vertex getVertexFromName(String name, dstm.Machine machine3) {
    	dstm.Vertex ret = null;
    	Iterator<dstm.Vertex> it = machine3.getVertexes().iterator();
    	while (ret == null && it.hasNext()) {
    		dstm.Vertex ver = it.next();
    		if (ver.getName().compareTo(name) == 0) {
    			ret = ver; 
    		}
    	}
    	return ret;
    }
    
    private static String getVertexName(Vertex v) {
    	if (v instanceof Node) {
			return ((Node) v).getName();
		} else if (v instanceof Box) {
			return ((Box) v).getName();
		} else if (v instanceof EnteringNodeAbs) {
			return ((EnteringNodeAbs) v).getName();
		} else if (v instanceof ExitingNode) {
			return ((ExitingNode) v).getName();
		} else if (v instanceof Fork) {
			return ((Fork) v).getName();
		} else if (v instanceof Join) {
			return ((Join) v).getName();
		}
    	return null;
    }
}