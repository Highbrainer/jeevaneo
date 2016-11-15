package fr.mutualite.rh.model.util;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	private static Activator instance = null;
	
	public static Activator getDefault() {
		return instance;
	}
	
	private JsonGenerator jsonGenerator = new JsonGeneratorImpl();

	public JsonGenerator getJsonGenerator() {
		return jsonGenerator;
	}

	public void setJsonGenerator(JsonGenerator jsonGenerator) {
		this.jsonGenerator = jsonGenerator;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		instance = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		instance = null;
		Activator.context = null;
	}

}
