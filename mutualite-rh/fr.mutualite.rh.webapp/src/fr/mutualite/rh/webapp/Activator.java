package fr.mutualite.rh.webapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	protected Logger log = Logger.getLogger(getClass());

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;

		log.info("D�marrage de GIC...");
		System.out.println("Langue par d�faut\t: " + Locale.getDefault().getDisplayName() + "\t- Format de date : " + DateFormat.getDateTimeInstance().format(new Date()));
		Locale.setDefault(Locale.FRANCE);
		System.out.println("Langue configur�e\t: " + Locale.getDefault().getDisplayName() + "\t- Format de date : " + DateFormat.getDateTimeInstance().format(new Date()));	

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
