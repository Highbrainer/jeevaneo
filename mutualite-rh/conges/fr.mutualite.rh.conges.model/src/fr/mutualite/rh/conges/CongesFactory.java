/**
 */
package fr.mutualite.rh.conges;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.conges.CongesPackage
 * @generated
 */
public interface CongesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CongesFactory eINSTANCE = fr.mutualite.rh.conges.impl.CongesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employe</em>'.
	 * @generated
	 */
	Employe createEmploye();

	/**
	 * Returns a new object of class '<em>Conge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conge</em>'.
	 * @generated
	 */
	Conge createConge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CongesPackage getCongesPackage();

} //CongesFactory
