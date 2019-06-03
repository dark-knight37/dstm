package test;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.prgmdl.tcg.spin.StandardPostProcessor;

import tesqel.TesqelFactory;
import tesqel.TesqelPackage;
import tesqel.TestSequence;

public class PostProcessor_Test {
	
	private static final String pretesqelFolder = "D://modello porfy//secondo tentativo//pretesqel//";
	private static final String tesqelFolder = "D://modello porfy//secondo tentativo//tesqel//";
//	private static final String tesqelFolder = "model_test//tesqel//";
	
	private static final String inifile = "properties.ini";
	
	public static void main(String[] args) throws Exception {
		Hashtable<String, String> pretesqels = new Hashtable<String, String>();
		File folder = new File(pretesqelFolder);
		int i = 0;
		File[] files = folder.listFiles();
		
		//TEST_88937
		//in caso di più di 100000 file, lanciare più volte l'esecuzione. 
		// decommentare il seguente codice e modificare il valore iniziale
		// dell'indice i a riga 62 per evitare sovrascrittura di file.
		// Il for a riga 47 deve lavorare sul nuovo vettore files1
//		System.out.println(files.length);
//		File[] files1 = new File[100000]; //220941 totali
//		for (int j = 0; j < files1.length; j++) {
//			files1[j] = files[j+0];
//		}
		
		for (File file : files) {
			String fileContent = "";
			List<String> content = Files.readAllLines(Paths.get(file.getPath()));
			for (String line : content) {
				fileContent += line + "\n";
			}
			pretesqels.put("never_" + i++, fileContent);
		}
		
		//post processor
		Vector<String> tests = new StandardPostProcessor(inifile).transform(pretesqels,null);
		
		// create tesqel folder if not exists
		File directory = new File(tesqelFolder);
		if (!directory.exists()) {
	        directory.mkdir();
		}
		
		i = 0;
		for (String string : tests) {
			PrintWriter pw = new PrintWriter(tesqelFolder + "TEST_" + (i++) + ".tesqel");
			pw.write(string);
			pw.close();
		}
	}
}
