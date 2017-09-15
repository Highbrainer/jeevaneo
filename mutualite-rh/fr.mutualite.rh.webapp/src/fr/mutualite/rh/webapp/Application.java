package fr.mutualite.rh.webapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.err.println("Démarrage...");
		
		Locale.setDefault(Locale.FRANCE);
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.err.println("Shutdown");

	}
}
