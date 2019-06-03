package org.prgmdl.tcg.spin.manager;

import java.io.File;
import java.io.PrintWriter;

import DSTM4Rail.utilities.IniReader;
import DSTM4Rail.utilities.Utils;

public class SequentialModelHandler extends ModelHandler {
	
	private String tempDir;
	
	private String spinScript;
	
	private String prepareScript;
	
	public SequentialModelHandler(String complete, int size, String ifn) {
		super(complete,size,ifn);
		IniReader reader = null;
		try {
			reader = new IniReader(super.ifname);
			this.tempDir = reader.get("tempdir");
			this.spinScript = reader.get("script"); 
			this.prepareScript = reader.get("prepare"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() throws Exception {
		this.prepare();
		String results = this.execute();
		this.process(results);
	}
	
	private void process(String results) throws Exception {
		int n = (new Integer(this.neverNum)).intValue();
		// Change directory
		String olddirname = System.getProperty("user.dir");
		File newdir = new File(this.tempDir).getAbsoluteFile();
		System.setProperty("user.dir",newdir.getAbsolutePath());
		for (int i=0; i<n; i++) {
			String pretsq = Utils.file2string(this.tempDir + "/pretesqel_n" + i + ".log");
			this.pretesqels.add(pretsq); 
		}
		// Re-change directoy
		File olddir = new File(olddirname).getAbsoluteFile();
		System.setProperty("user.dir",olddir.getAbsolutePath());
	}

	private String execute() throws Exception {
		// Script execution
		File execdir = new File(this.tempDir).getAbsoluteFile();
		ScriptExecutor se = new ScriptExecutor(this.spinScript);
		se.setDir(execdir);
		se.addArg("input.pml");
		se.addArg(this.neverNum);
		String retval = se.execute();
		return retval;
	}

	private void prepare() throws Exception {
		ScriptExecutor se = new ScriptExecutor(this.prepareScript);
		se.addArg(this.tempDir);
		se.addArg(this.spinScript);
		se.execute();
		PrintWriter writer = new PrintWriter(this.tempDir + "/input.pml", "UTF-8");
        writer.println(this.fileContent);
        writer.close();
	}	
}