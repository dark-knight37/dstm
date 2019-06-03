package org.prgmdl.tcg.d2p.backend;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.prgmdl.tcg.common.Promela;

import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;

public class StandardBackend implements Backend{
	public final static String SOURCE_MODEL = "temp/source.dstm4rail";
	public final static String INTERMEDIATE_MODEL  = "temp/intermediate.promela";

	@Override
	public Promela transform(DSTM model) {
		DSTM4RailPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dstm4rail", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(SOURCE_MODEL));
		resource.getContents().add(model);
		try {
			resource.save(Collections.EMPTY_MAP);
			DSTM2PromelaM2M cls = new DSTM2PromelaM2M();
			cls.generateFile(new String[]{SOURCE_MODEL, INTERMEDIATE_MODEL});
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return null;
	}

}
