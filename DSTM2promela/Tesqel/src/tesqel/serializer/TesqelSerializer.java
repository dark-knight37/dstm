package tesqel.serializer;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tesqel.TesqelPackage;
import tesqel.TestSequence;


public class TesqelSerializer {
	
	
	public TestSequence deserialize(String uri) {
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(uri), true);
		TestSequence testCase = (TestSequence) resource.getContents().get(0);
		return testCase;
		
		
	}

	public boolean serialize(TestSequence testcase, String filename){
		boolean result = false;		   
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(filename));
		resource.getContents().add(testcase);
		try{
			resource.save(Collections.EMPTY_MAP);
			result = true;
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return result;
	}
}
