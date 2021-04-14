/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.mdd.cw2.pageGenerator.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguareRuntimeModule;
import uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguareStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PageGeneratorLanguareIdeSetup extends PageGeneratorLanguareStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PageGeneratorLanguareRuntimeModule(), new PageGeneratorLanguareIdeModule()));
	}
	
}