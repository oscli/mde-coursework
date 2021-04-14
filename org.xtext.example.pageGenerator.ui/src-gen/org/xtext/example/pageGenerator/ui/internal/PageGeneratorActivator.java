/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.pageGenerator.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;
import uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguareRuntimeModule;
import uk.ac.kcl.mdd.cw2.pageGenerator.ui.PageGeneratorLanguareUiModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PageGeneratorActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "org.xtext.example.pageGenerator.ui";
	public static final String UK_AC_KCL_MDD_CW2_PAGEGENERATOR_PAGEGENERATORLANGUARE = "uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare";
	
	private static final Logger logger = Logger.getLogger(PageGeneratorActivator.class);
	
	private static PageGeneratorActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static PageGeneratorActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (UK_AC_KCL_MDD_CW2_PAGEGENERATOR_PAGEGENERATORLANGUARE.equals(grammar)) {
			return new PageGeneratorLanguareRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (UK_AC_KCL_MDD_CW2_PAGEGENERATOR_PAGEGENERATORLANGUARE.equals(grammar)) {
			return new PageGeneratorLanguareUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}
