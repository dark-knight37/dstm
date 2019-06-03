package org.xtext.unina.xdstmdata.generator;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class Helper {
	
	private Resource resource;
	
	public Helper(Resource resource) {
		this.resource = resource;
	}
	
    public void saveRecourceAsXmi() {
    	try {
    		if(resource.getContents().size()>0) {
	    		Map<String, String> saveOptions = new HashMap<String, String>();
	    		Resource xmiResource = new XMIResourceImpl(resource.getURI().appendFileExtension("xmi"));
	    		xmiResource.getContents().add(resource.getContents().get(0));
	    		saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
	    		xmiResource.save(saveOptions);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}