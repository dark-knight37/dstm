package org.prgmdl.dstmverifier.model;

public interface ModelQuery {

	public boolean isTransition(String machineName, String transitionName);

	public boolean isState(String machineName, String stateName);

	public boolean isBox(String machineName, String boxName);
}