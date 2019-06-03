package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

import org.prgmdl.tcg.StandardTCG;
import org.prgmdl.tcg.TestCaseGenerator;
import org.prgmdl.tcg.common.OptimizationLevel;
import org.prgmdl.tcg.common.RequestKind;

import DSTM4Rail.DSTM;
import DSTM4Rail.deserializer.DSTM4RailReader;

public class TheUltimateTCGTester {

	public static void main(String[] args) throws Exception {
		DSTM mdl = new DSTM4RailReader().loadXmiModel(args[0]);
		System.out.println("--- DSTM MODEL LOADED ---");
		BufferedReader reader = new BufferedReader(new FileReader(args[1]));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while( (line = reader.readLine()) != null ) {
			stringBuilder.append(line);
		    stringBuilder.append(ls);
		}
		reader.close();
		System.out.println("--- DATA LOADED ---");
		RequestKind rk = RequestKind.Transitions;
		Vector<String> items = null;
		//TODO management degli argomenti
		if (args.length >= 4) {
			rk = reqKindGen(args[3]);
		}
		if (args.length >= 5) {
			items = unmrshl(args[4]);
		}
		
		TestCaseGenerator tcg = new StandardTCG();
		((StandardTCG) tcg).setOptimLevel(OptimizationLevel.TransitionCov);
//		((StandardTCG) tcg).justcompile();
		Vector<String> testSequences = tcg.generate(mdl, stringBuilder.toString(),rk,items);
		int counter = 0;
		String outfilename = args[2];
		if (testSequences != null) {
			for (int i=0; i<testSequences.size(); i++) {
				String ts = testSequences.get(i);
				String tsname = changefilename(outfilename,i);
				PrintWriter pw = new PrintWriter(tsname);
				pw.write(ts);
				pw.close();
				if (ts.startsWith("ERROR")) {
					counter++;
				}
			}
		}
		// Printing the summary
		String outcome = ":)";
		if (counter > 0) {
			outcome = ":(";;
		}
		System.out.println(outcome);
	}
	
	private static Vector<String> unmrshl(String s) {
		Vector<String> retval = new Vector<String>();
		StringTokenizer st = new StringTokenizer(s,";");
		while (st.hasMoreTokens()) {
			retval.add(st.nextToken());
		}
		return retval;
	}

	private static RequestKind reqKindGen(String s) {
		RequestKind retval = null;
		if (s.equals("R")) {
			retval = RequestKind.Requirements; 
		} else if (s.equals("T")) {
			retval = RequestKind.Transitions; 
		} else if (s.equals("S")) {
			retval = RequestKind.Specifications; 
		}
		return retval;
	}

	private static String changefilename(String name, int i) {
		int index = name.lastIndexOf(".");
		String retval = name.substring(0,index);
		retval += "_" + i;
		retval += name.substring(index);
		return retval;
	} 	
}