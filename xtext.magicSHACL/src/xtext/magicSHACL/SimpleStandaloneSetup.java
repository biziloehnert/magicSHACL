/*
 * generated by Xtext 2.24.0
 */
package xtext.magicSHACL;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SimpleStandaloneSetup extends SimpleStandaloneSetupGenerated {

	public static void doSetup() {
		new SimpleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
