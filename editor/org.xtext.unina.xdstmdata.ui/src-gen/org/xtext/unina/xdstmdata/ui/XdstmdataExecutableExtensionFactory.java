/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.unina.xdstmdata.ui.internal.XdstmdataActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XdstmdataExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XdstmdataActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XdstmdataActivator activator = XdstmdataActivator.getInstance();
		return activator != null ? activator.getInjector(XdstmdataActivator.ORG_XTEXT_UNINA_XDSTMDATA_XDSTMDATA) : null;
	}

}