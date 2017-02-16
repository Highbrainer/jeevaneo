/**
 */
package fr.mutualite.rh.conges;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.conges.CongesFactory
 * @model kind="package"
 * @generated
 */
public interface CongesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conges";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mutualite.fr/conges/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conges";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CongesPackage eINSTANCE = fr.mutualite.rh.conges.impl.CongesPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.conges.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.conges.impl.EmployeImpl
	 * @see fr.mutualite.rh.conges.impl.CongesPackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__MATRICULE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ETABLISSEMENT = 2;

	/**
	 * The feature id for the '<em><b>Conges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__CONGES = 3;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.conges.impl.CongeImpl <em>Conge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.conges.impl.CongeImpl
	 * @see fr.mutualite.rh.conges.impl.CongesPackageImpl#getConge()
	 * @generated
	 */
	int CONGE = 1;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGE__DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGE__FIN = 1;

	/**
	 * The number of structural features of the '<em>Conge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.conges.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see fr.mutualite.rh.conges.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.conges.Employe#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see fr.mutualite.rh.conges.Employe#getMatricule()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.conges.Employe#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.conges.Employe#getNom()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.conges.Employe#getEtablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etablissement</em>'.
	 * @see fr.mutualite.rh.conges.Employe#getEtablissement()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Etablissement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.conges.Employe#getConges <em>Conges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conges</em>'.
	 * @see fr.mutualite.rh.conges.Employe#getConges()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Conges();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.conges.Conge <em>Conge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conge</em>'.
	 * @see fr.mutualite.rh.conges.Conge
	 * @generated
	 */
	EClass getConge();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.conges.Conge#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debut</em>'.
	 * @see fr.mutualite.rh.conges.Conge#getDebut()
	 * @see #getConge()
	 * @generated
	 */
	EAttribute getConge_Debut();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.conges.Conge#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin</em>'.
	 * @see fr.mutualite.rh.conges.Conge#getFin()
	 * @see #getConge()
	 * @generated
	 */
	EAttribute getConge_Fin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CongesFactory getCongesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.conges.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.conges.impl.EmployeImpl
		 * @see fr.mutualite.rh.conges.impl.CongesPackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__MATRICULE = eINSTANCE.getEmploye_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NOM = eINSTANCE.getEmploye_Nom();

		/**
		 * The meta object literal for the '<em><b>Etablissement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__ETABLISSEMENT = eINSTANCE.getEmploye_Etablissement();

		/**
		 * The meta object literal for the '<em><b>Conges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__CONGES = eINSTANCE.getEmploye_Conges();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.conges.impl.CongeImpl <em>Conge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.conges.impl.CongeImpl
		 * @see fr.mutualite.rh.conges.impl.CongesPackageImpl#getConge()
		 * @generated
		 */
		EClass CONGE = eINSTANCE.getConge();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONGE__DEBUT = eINSTANCE.getConge_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONGE__FIN = eINSTANCE.getConge_Fin();

	}

} //CongesPackage
