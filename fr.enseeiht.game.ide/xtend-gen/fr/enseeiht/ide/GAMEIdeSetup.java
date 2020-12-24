/**
 * generated by Xtext 2.17.1
 */
package fr.enseeiht.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.enseeiht.GAMERuntimeModule;
import fr.enseeiht.GAMEStandaloneSetup;
import fr.enseeiht.ide.GAMEIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class GAMEIdeSetup extends GAMEStandaloneSetup {
  @Override
  public Injector createInjector() {
    GAMERuntimeModule _gAMERuntimeModule = new GAMERuntimeModule();
    GAMEIdeModule _gAMEIdeModule = new GAMEIdeModule();
    return Guice.createInjector(Modules2.mixin(_gAMERuntimeModule, _gAMEIdeModule));
  }
}
