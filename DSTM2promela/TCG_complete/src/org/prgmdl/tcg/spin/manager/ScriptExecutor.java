package org.prgmdl.tcg.spin.manager;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.Vector;

public class ScriptExecutor {

	protected String script;

	protected Vector<String> arguments;
	
	protected File dir;

	public ScriptExecutor(String s) {
		this.script = s;
		this.arguments = new Vector<String>();
		this.dir = null;
	}

	public void addArg(String arg) {
		this.arguments.add(arg);
	}

	public int argsize() {
		return this.arguments.size();
	}

	public String getArg(int i) {
		return this.arguments.get(i);
	}

	public String getScript() {
		return script;
	}

	public void setScript(String s) {
		this.script = s;
	}

	protected String prepare() {
		String retval = this.script;
		for (String a: this.arguments) {
			retval += " " + a;
		}
		return retval;
	} 

	public String execute() throws Exception {
        String retval = null;
		String command = this.prepare();
        Runtime rt = Runtime.getRuntime();
        Process execPID = null;
        if (this.dir == null) {
            execPID = rt.exec(command);
        } else {
            execPID = rt.exec(command,null,this.dir);
        }
        execPID.waitFor();
        BufferedInputStream stream = new BufferedInputStream(execPID.getInputStream());
        byte[] buffer = new byte[100];
        stream.read(buffer);
        retval = new String(buffer);
		return retval;
	}

	public void setDir(File execdir) {
		this.dir = execdir;
	}
}