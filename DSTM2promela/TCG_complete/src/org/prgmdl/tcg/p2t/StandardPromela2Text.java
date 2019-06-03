package org.prgmdl.tcg.p2t;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.prgmdl.tcg.common.Promela;
import org.prgmdl.tcg.p2t.PromelaModel2Spin.main.Generate;
import org.prgmdl.tcg.p2t.engine.EngineGenerator;

import DSTM4Rail.DSTM;
import DSTM4Rail.deserializer.DSTM4RailReader;
public class StandardPromela2Text implements Promela2Text {
    private final static String INTERMEDIATE_MODEL  = "temp/intermediate.promela";
    private final static String PML_FOLDER = "pml/";
	private static final String CROSS_COMPILED = "temp/ccompiled.dstm4rail";
	@Override
	public String transform(DSTM model, Promela pml) {
		URI modelURI = URI.createFileURI(INTERMEDIATE_MODEL);
        File folder = new File(PML_FOLDER);
        List<String> arguments = new ArrayList<String>();
        Generate generator;
		try {
			generator = new Generate(modelURI, folder, arguments);
			generator.doGenerate(new BasicMonitor());
			
			
			
			
			//ENGINE GENERATION
			DSTM4RailReader reader = new DSTM4RailReader();
			DSTM compiled = reader.loadXmiModel(CROSS_COMPILED);
			 StringBuffer sb = (new EngineGenerator(compiled)).createEnginePML();
		       BufferedWriter bwr;
		       try {
		        bwr = new BufferedWriter(new FileWriter(new File(PML_FOLDER+"spin_model.pml"),true));
		              bwr.write(sb.toString());
		              bwr.flush();
		              bwr.close();
		              System.out.println("Engine PML: --- WRITING SUCCESS ---");
		       } catch (IOException e){
		       }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		String fileContent = "";
		List<String> content;
		try {
			content = Files.readAllLines(Paths.get(PML_FOLDER+"spin_model.pml"));
			for (String line : content) {
				fileContent += line + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContent;
	}

}
