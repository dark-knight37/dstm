/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractXdstmdataValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage.eINSTANCE);
		return result;
	}
	
}