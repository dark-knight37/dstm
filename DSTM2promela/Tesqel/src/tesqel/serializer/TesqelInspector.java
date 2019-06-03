package tesqel.serializer;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

import tesqel.CompoundFiring;
import tesqel.Firing;
import tesqel.TestSequence;
import DSTM4Rail.utilities.IniReader;

public class TesqelInspector {
	
	protected String tempfilename;

	public TesqelInspector(String inifile) throws Exception {
		IniReader ir = new IniReader(inifile);
		this.tempfilename = ir.get("temptesqel");
	} 
	
	public Vector<String> getCoveredTransition(String ts) throws Exception {
		PrintWriter pw = new PrintWriter(this.tempfilename);
		pw.write(ts);
		pw.close();
		TesqelSerializer slzr = new TesqelSerializer();
		TestSequence test = slzr.deserialize(this.tempfilename);
		Vector<String> retval = this.getTransitionsVector(test);
		Files.deleteIfExists(Paths.get(this.tempfilename));
		return retval;
	}
	
	private Vector<String> getTransitionsVector(TestSequence tc) {
		Vector<String> retval = new Vector<String>();
		for (CompoundFiring c : tc.getCompoundFiring()) {
			for (Firing f : c.getFiring()) {
				for (String t : f.getTransition()) {
					if (!retval.contains(t)) {
						retval.add(t);
					}
				}
			}
		}
		return retval;
	}
}