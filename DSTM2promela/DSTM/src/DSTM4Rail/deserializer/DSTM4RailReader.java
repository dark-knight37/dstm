package DSTM4Rail.deserializer;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;

public class DSTM4RailReader {

	public DSTM loadXmiModel(String uri) {
		// initialize model package
		DSTM4RailPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the dstm4rail extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dstm4rail", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// get the resource from the xmi model
//		System.out.println(uri);
		Resource resource = resSet.getResource(URI.createURI(uri), true);
		// Get the first model element (DSTM in this case)
		DSTM dstm = (DSTM) resource.getContents().get(0);
		return dstm;
	}
	
	public boolean writeXmiModel(DSTM dstm, String filename){
		boolean result = false;		   
		DSTM4RailPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dstm4rail", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(filename));
		resource.getContents().add(dstm);

		try{
			resource.save(Collections.EMPTY_MAP);
			result = true;
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return result;
	}


	public static void main(String[] args) {
		

	}

}
