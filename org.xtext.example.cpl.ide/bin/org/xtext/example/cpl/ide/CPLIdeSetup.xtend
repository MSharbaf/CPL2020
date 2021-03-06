/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.cpl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.cpl.CPLRuntimeModule
import org.xtext.example.cpl.CPLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CPLIdeSetup extends CPLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CPLRuntimeModule, new CPLIdeModule))
	}
	
}
