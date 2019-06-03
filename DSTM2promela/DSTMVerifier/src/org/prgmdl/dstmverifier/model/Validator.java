package org.prgmdl.dstmverifier.model;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import DSTM4Rail.DSTM;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.InitialNode;
import DSTM4Rail.Machine;
import DSTM4Rail.Node;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.ModelViolation;
import DSTM4Rail.exceptions.Violation;

public class Validator implements ModelVerifier {

	protected Vector<Violation> violations;

	public Validator() {
		super();
		this.violations = new Vector<Violation>();
	}

	@Override
	public boolean verifyModel(DSTM model) throws ConstraintException {
		boolean retval = true;

		//UNNAMED ELEMENT
		for (Machine machine : model.getMachines()) {
			if(machine.getName()==null || machine.getName().isEmpty()){
				Violation v = new ModelViolation("UNMDELEM", "Machine", (EObject) machine);
				this.violations.add(v);
				retval = false;
			}else{
				for (Vertex vertex : machine.getVertexes()) {
					if(vertex.getName()==null || vertex.getName().isEmpty()){
						Violation v = new ModelViolation("UNMDELEM", "Vertex", (EObject) vertex);
						this.violations.add(v);
						retval = false;
					}
				}
				for (Transition trans : machine.getTransitions()) {
					if(trans.getName()==null || trans.getName().isEmpty()){
						Violation v = new ModelViolation("UNMDELEM", "Transition", (EObject) trans);
						this.violations.add(v);
						retval = false;
					}
				}
			}
		}

		//UNIQUE InitialNode
		for (Machine machine : model.getMachines()) {
			int count = 0;
			for (Vertex vertex : machine.getVertexes()) {
				if(vertex.getClass().getName().compareTo("DSTM4Rail.impl.InitialNodeImpl")==0){
					count++;
					if(count>1){
						Violation v = new ModelViolation("UNQINIT",  "Machine", (EObject) machine);
						this.violations.add(v);
						retval = false;
					}				
				}
			}
		}

		//AUTOLOOP
		for (Machine machine : model.getMachines()) {
			for (Transition transition : machine.getTransitions()) {
				if(transition.getDestination().getClass().getName().compareTo("DSTM4Rail.impl.InitialNodeImpl")==0){
					Violation v = new ModelViolation("SLFINIT",  "Transition", (EObject) transition);
					this.violations.add(v);
					retval = false;
				}				
			}
		}

		
		
		//EXISTING INITIAL NODE
		for (Machine machine : model.getMachines()) {
			EList<Vertex> vertexes = machine.getVertexes();
			boolean initialFound = false;
			boolean nodeFound = false;
			if (vertexes.size() < 2) {
				Violation v = new ModelViolation("ATLEAST2NODE", "Node", (EObject) vertexes);
				this.violations.add(v);
				retval = false;
			} else {
				for (int i = 0; i < vertexes.size() && !(initialFound && nodeFound); i++) {
					if (vertexes.get(i) instanceof InitialNode) {
						initialFound = true;
					}else if(vertexes.get(i) instanceof Node){
						nodeFound=true;
					}else if(vertexes.get(i) instanceof ExitingNode);
				}
				if (!initialFound) {
					Violation v = new ModelViolation("EXSINIT", "Node", null);
					this.violations.add(v);
					retval = false;
				}else if(initialFound && !nodeFound){
					Violation v = new ModelViolation("EXSNODE", "Node", null);
					this.violations.add(v);
					retval = false;
				}
			}
		}
		
		
		//TRANSITIONS and MACHINE NAMES CONSTRAINT
		for (Machine machine : model.getMachines()) {
			for (Vertex internalVert : machine.getVertexes()) {
				for (Transition internalTrans : machine.getTransitions()) {
					if(internalTrans.getName().equalsIgnoreCase(internalVert.getName())){
						Violation v = new ModelViolation("NODENAMENOTUNQ",  "Transition", (EObject) internalTrans);
						this.violations.add(v);
						retval = false;
					}
					
				}
			}
		}
		
		
		//SPECIAL CHARS ON NODE NAME
		//VERTEXES
		for (Machine machine : model.getMachines()) {
			for (Vertex internalVert : machine.getVertexes()) {
				for(int i=0;i<internalVert.getName().length();i++){
					if(!Character.isLetterOrDigit(internalVert.getName().charAt(i)) && !(internalVert.getName().charAt(i)=='_')){
						Violation v = new ModelViolation("CHARNOTALLOWEDNODE",  "Node", (EObject) internalVert);
							this.violations.add(v);
							retval = false;
							}
						}

					}
				}
		//TRANSITIONS
		for (Machine machine : model.getMachines()) {
			for (Transition internalTrans : machine.getTransitions()) {
				for(int i=0;i<internalTrans.getName().length();i++){
					if(!Character.isLetterOrDigit(internalTrans.getName().charAt(i)) && !(internalTrans.getName().charAt(i)=='_')){
						Violation v = new ModelViolation("CHARNOTALLOWEDTRANS",  "Transition", (EObject) internalTrans);
							this.violations.add(v);
							retval = false;
							}
						}

					}
				}
		
		if (!this.violations.isEmpty()) {
			throw new ConstraintException(this.violations.elementAt(0).toString());
		}
		return retval;
	}
}
