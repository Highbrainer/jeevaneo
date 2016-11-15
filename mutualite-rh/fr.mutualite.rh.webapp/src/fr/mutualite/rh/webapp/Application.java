package fr.mutualite.rh.webapp;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.err.println("Hello!");
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.err.println("Bye!");

	}

}
