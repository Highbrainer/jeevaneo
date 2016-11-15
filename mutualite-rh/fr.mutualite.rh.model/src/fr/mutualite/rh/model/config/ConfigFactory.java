/**
 */
package fr.mutualite.rh.model.config;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.config.ConfigPackage
 * @generated
 */
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = fr.mutualite.rh.model.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

	public static Configuration readDefaultConfiguration() throws IOException {
		String configFilename = System.getProperty("config", "/etc/mutualite-rh/mutualite-rh.config");
		File file = new File(configFilename);
		ResourceSet rs = new ResourceSetImpl();
		Configuration configuration;
		if (!file.exists()) {
			// initialize file with default values;
			configuration = ConfigFactory.eINSTANCE.createConfiguration();
			configuration.setJdbcPassword(null);
			configuration.setJdbcUser(null);
			Resource resource = rs.createResource(URI.createFileURI(configFilename));
			resource.getContents().add(configuration);
			resource.save(Collections.EMPTY_MAP);
		} else {
			Resource resource = rs.getResource(URI.createURI(file.toURI().toASCIIString()), true);
			configuration = (Configuration) resource.getContents().get(0);
		}
		return configuration;
	}
	


} //ConfigFactory
