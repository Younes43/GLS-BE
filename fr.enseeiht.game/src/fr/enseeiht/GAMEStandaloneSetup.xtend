/*
 * generated by Xtext 2.17.1
 */
package fr.enseeiht


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GAMEStandaloneSetup extends GAMEStandaloneSetupGenerated {

	def static void doSetup() {
		new GAMEStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
