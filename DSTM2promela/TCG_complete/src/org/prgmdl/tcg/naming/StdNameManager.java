package org.prgmdl.tcg.naming;

import java.util.Hashtable;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.prgmdl.tcg.d2p.frontend.Frontend;

import DSTM4Rail.DSTM;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;

public class StdNameManager implements NameManager {
	
	/**
	 * The first column is the renamed key, the second column is the original name
	 */
	private Hashtable<String,String> reverseMap;
	/**
	 * The first column is the original name, the second column is the renamed name
	 * For transitions or vertexes the key is given by machineName + separator + name
	 */
	private static String separator = "_";
	private Hashtable<String, String> machineMap;
	private Hashtable<String, String> transitionMap;
	private Hashtable<String, String> vertexMap;
		
	private StringGenerator sgen;

	public StdNameManager() {
		this.reverseMap = new Hashtable<String,String>();
		this.machineMap = new Hashtable<String,String>();
		this.transitionMap = new Hashtable<String,String>();
		this.vertexMap = new Hashtable<String,String>();
		this.sgen = StringGenerator.getStringGenerator();
	}

	@Override
	public ReverseString reverse(String s) {
		RenamingKind retKind = this.sgen.getKind(s);
		String retStr = this.reverseMap.get(s); 
		return new ReverseString(retStr,retKind);
	}
		
	@Override
	public DSTM renameModel(DSTM mdl) {
		DSTM DSTM_out = EcoreUtil.copy(mdl);
		for (Machine machine : DSTM_out.getMachines()) {
			for (Vertex vertex : machine.getVertexes())
				vertex.setName(this.renameVertex(vertex.getName(), vertex.getMachine().getName()));
			for (Transition trans : machine.getTransitions())
				trans.setName(this.renameTransition(trans.getName(), trans.getMachine().getName()));
			machine.setName(this.renameMachine(machine.getName()));
		}
		return DSTM_out;
	}
	
	private String renameTransition(String transName, String mchName) {
		String ret = this.rename(transName, RenamingKind.TRANSITION);
		this.transitionMap.put(mchName + separator + transName, ret);
		return ret;
	}
	
	private String renameVertex(String vertName, String mchName) {
		String ret = this.rename(vertName, RenamingKind.VERTEX);
		this.vertexMap.put(mchName + separator + vertName, ret);
		return ret;
	}
	
	private String renameMachine(String mchName) {
		String ret = this.rename(mchName, RenamingKind.MACHINE);
		this.machineMap.put(mchName, ret);
		return ret;
	}
	
	private String rename(String s, RenamingKind kind) {
		String retval = this.sgen.get(kind);
		this.reverseMap.put(retval,s);
		return retval;
	}

	@Override
	public void addFlattenedTransition(String mchName, String renamedTrans, String flattenedTrans) {
		String originalName = this.reverseMap.get(renamedTrans);
		this.transitionMap.replace(mchName + separator + originalName, flattenedTrans);
	}

	@Override
	public void addFlattenedVertex(String mchName, String renamedVertex, String flattenedVertex) {
		String originalName = this.reverseMap.get(renamedVertex);
		this.vertexMap.replace(mchName + separator + originalName, flattenedVertex);		
	}

	@Override
	public String getPMLTransitionName(String mchName, String originalTransName) {
		String mchPMLName = this.machineMap.get(mchName);
		String transPMLName = this.transitionMap.get(mchName + separator + originalTransName);
		if (mchPMLName == null || transPMLName == null)
			return null;
		return mchPMLName + Frontend.separator + transPMLName;
	}

	@Override
	public String getPMLVertexName(String mchName, String originalVertName) {
		String mchPMLName = this.machineMap.get(mchName);
		String vertPMLName = this.vertexMap.get(mchName + separator + originalVertName);
		if (mchPMLName == null || vertPMLName == null)
			return null;
		return mchPMLName + Frontend.separator + vertPMLName;
	}

}
