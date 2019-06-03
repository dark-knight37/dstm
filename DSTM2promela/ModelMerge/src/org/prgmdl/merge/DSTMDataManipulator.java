package org.prgmdl.merge;

import java.util.Vector;

import DSTM4Rail.DSTM;

public interface DSTMDataManipulator {

	public DSTM getDSTM(); 
	
	/**
	 * 
	 * @return
	 */
	public boolean clean();
		
	/**
	 * 
	 * @return
	 */
	public boolean addEnum(String name, Vector<String> literals);
	
	/**
	 * 
	 * @return
	 */
	public boolean addCompound(String name, Vector<String> types);
	
	/**
	 * 
	 * @return
	 */
	public boolean addMultitype(String name, Vector<String> types);
	
	/**
	 * 
	 * @return
	 */
	public boolean addVariable(String name, String type);

	/**
	 * 
	 * @return
	 */
	public boolean addParameter(String name, String type, String machine);
	
	/**
	 * 
	 * @return
	 */
	public boolean addExtChannel(String name, String type);

	/**
	 * 
	 * @return
	 */
	public boolean addIntChannel(String name, String type, int bound);
	
	/**
	 * 
	 * @return
	 */
	public boolean finalise();
}