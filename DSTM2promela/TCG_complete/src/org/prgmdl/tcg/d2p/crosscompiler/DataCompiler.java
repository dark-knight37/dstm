package org.prgmdl.tcg.d2p.crosscompiler;

import java.util.Vector;

public interface DataCompiler {

	public void setData(String data);
	
	public void action(String s);
	
	public void trigger(String s);

	public void condition(String s);
	
	public String getTransaltion();
	
	public Vector<String> getPhases();
}
