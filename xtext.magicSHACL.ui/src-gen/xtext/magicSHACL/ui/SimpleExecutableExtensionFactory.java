/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import xtext.magicSHACL.ui.internal.MagicSHACLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SimpleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MagicSHACLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MagicSHACLActivator activator = MagicSHACLActivator.getInstance();
		return activator != null ? activator.getInjector(MagicSHACLActivator.XTEXT_MAGICSHACL_SIMPLE) : null;
	}

}
