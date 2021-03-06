/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.pageGenerator.ui.internal.PageGeneratorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PageGeneratorLanguareExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PageGeneratorActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PageGeneratorActivator activator = PageGeneratorActivator.getInstance();
		return activator != null ? activator.getInjector(PageGeneratorActivator.UK_AC_KCL_MDD_CW2_PAGEGENERATOR_PAGEGENERATORLANGUARE) : null;
	}

}
