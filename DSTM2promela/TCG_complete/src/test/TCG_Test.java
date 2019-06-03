package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.prgmdl.tcg.StandardTCG;
import org.prgmdl.tcg.TestCaseGenerator;
import org.prgmdl.tcg.common.RequestKind;

import tesqel.TesqelPackage;
import tesqel.TestSequence;
import DSTM4Rail.DSTM;
import DSTM4Rail.deserializer.DSTM4RailReader;


public class TCG_Test {

//	public static String inDSTMmodel = "model_test//source//default.dstm4rail";
//	public static String inDATAmodel = "model_test//source//default.dstm4rail_dataflow";
	
//	public static String inDSTMmodel = "model_test//source//cruisecontrolnol.dstm4rail";
//	public static String inDATAmodel = "model_test//source//cruisecontrolnol.dstm4rail_dataflow";
	
//	public static String inDSTMmodel = "model_test//source//CaseStudy.dstm4rail";
//	public static String inDATAmodel = "model_test//source//CaseStudy.dstm4rail_dataflow";
	
	public static String inDSTMmodel = "model_test//model.xdstm.dstm4rail";
	public static String inDATAmodel = "model_test//data.xdstmdata";

//	public static String inDSTMmodel = "model_test//source//prelationTest.dstm4rail";
//	public static String inDATAmodel = "model_test//source//prelationTest.dstm4rail_dataflow";

//	public static String inDSTMmodel = "model_test//CaseStudy.dstm4rail";
//	public static String inDATAmodel = "model_test//CaseStudy.dstm4rail_dataflow";
	
//	public static String inDSTMmodel = "model_test//source//modbus.xdstm.dstm4rail";
//	public static String inDATAmodel = "model_test//source//modbus.xdstmdata";
	
	public static String outFolder = "model_test//";
	
	
	
	public static void main(String[] args) throws Exception {
		DSTM DSTM_in = new DSTM4RailReader().loadXmiModel(inDSTMmodel);
		System.out.println("--- MODEL LOADED ---");
		BufferedReader reader = new BufferedReader(new FileReader(inDATAmodel));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while( (line = reader.readLine()) != null ) {
			stringBuilder.append(line);
		    stringBuilder.append(ls);
		}
		reader.close();
		System.out.println("--- DATA LOADED ---");
		
		TestCaseGenerator tcg = new StandardTCG();
//		((StandardTCG) tcg).justcompile();
		
		Vector<String> testSequences = tcg.generate(DSTM_in, stringBuilder.toString(), RequestKind.Transitions);
		
		createFolderIfNotExists(outFolder);
		
		if(testSequences!=null) {
		for (String ts : testSequences) {
			PrintWriter pw = new PrintWriter(outFolder + "temp.tesqel");
			pw.write(ts);
			pw.flush();
			pw.close();
			TesqelPackage.eINSTANCE.eClass();
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("tesqel", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.getResource(URI.createURI(outFolder + "temp.tesqel"), true);
			Files.deleteIfExists(Paths.get(outFolder + "temp.tesqel"));
			TestSequence test = (TestSequence) resource.getContents().get(0);
			TesqelPackage.eINSTANCE.eClass();
			resSet = new ResourceSetImpl();
			resource = resSet.createResource(URI.createFileURI(outFolder + test.getName() + ".tesqel"));
			resource.getContents().add(test);
			resource.save(Collections.EMPTY_MAP);
		}
		}
	}

	private static void createFolderIfNotExists(String outFolder) {
		File directory = new File(outFolder);
		// if the directory does not exist, create it
		if (!directory.exists()) {
	        directory.mkdir();
		}
	}
}
