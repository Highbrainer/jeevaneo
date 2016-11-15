package fr.mutualite.rh.webapp;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.glassfish.jersey.servlet.WebComponent;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		
		System.out.println("YO");

//		Logger.getLogger("org.eclipse.jetty.util.log").setLevel(Level.OFF);
//		Logger.getLogger("org.glassfish.jersey.internal.Errors").setLevel(Level.SEVERE);
//		Logger.getLogger("org.glassfish.jersey.internal.Errors").severe("Alors??");
//		
//		
//		java.util.logging.Logger jerseyLogger =
//		        java.util.logging.Logger.getLogger(WebComponent.class.getName());
//		jerseyLogger.setFilter(new Filter() {
//		    @Override
//		    public boolean isLoggable(LogRecord record) {
//		        boolean isLoggable = true;
//		        if (record.getMessage().contains("Only resource methods using @FormParam")) {
//		            isLoggable = false;
//		        }
//		        return isLoggable;
//		    }
//		});
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
