/**
 */
package fr.mutualite.rh.model.dto;

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
 * @see fr.mutualite.rh.model.dto.DtoFactory
 * @model kind="package"
 * @generated
 */
public interface DtoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mutualite.fr/mut/1.0/dto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtoPackage eINSTANCE = fr.mutualite.rh.model.dto.impl.DtoPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl <em>Formulaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.impl.FormulaireImpl
	 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getFormulaire()
	 * @generated
	 */
	int FORMULAIRE = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__PRENOM = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__MATRICULE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Diplomes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__DIPLOMES = 3;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Poste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__POSTE = 5;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__RESPONSABLE = 6;

	/**
	 * The feature id for the '<em><b>Mene Par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__MENE_PAR = 7;

	/**
	 * The feature id for the '<em><b>Entretien</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__ENTRETIEN = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__DATE = 9;

	/**
	 * The feature id for the '<em><b>Date Precedent Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__DATE_PRECEDENT_ENTRETIEN = 10;

	/**
	 * The feature id for the '<em><b>Anciennete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__ANCIENNETE = 11;

	/**
	 * The feature id for the '<em><b>Date Entree Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE__DATE_ENTREE_ENTREPRISE = 12;

	/**
	 * The number of structural features of the '<em>Formulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Formulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULAIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.dto.impl.UIEmployeImpl <em>UI Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.impl.UIEmployeImpl
	 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getUIEmploye()
	 * @generated
	 */
	int UI_EMPLOYE = 1;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMPLOYE__PRENOM = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMPLOYE__MATRICULE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMPLOYE__NOM = 2;

	/**
	 * The number of structural features of the '<em>UI Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMPLOYE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl <em>UI Session Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.impl.UISessionFormationImpl
	 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getUISessionFormation()
	 * @generated
	 */
	int UI_SESSION_FORMATION = 2;

	/**
	 * The feature id for the '<em><b>Quand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION__QUAND = 0;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION__DUREE = 1;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION__LIBELLE = 2;

	/**
	 * The feature id for the '<em><b>Organisme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION__ORGANISME = 3;

	/**
	 * The feature id for the '<em><b>Dpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION__DPC = 4;

	/**
	 * The number of structural features of the '<em>UI Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>UI Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_SESSION_FORMATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.dto.Formulaire <em>Formulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulaire</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire
	 * @generated
	 */
	EClass getFormulaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getPrenom()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getMatricule()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getNom()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getDiplomes <em>Diplomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diplomes</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDiplomes()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Diplomes();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getService()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Service();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getPoste <em>Poste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poste</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getPoste()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Poste();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsable</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getResponsable()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Responsable();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getMenePar <em>Mene Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mene Par</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getMenePar()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_MenePar();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.dto.Formulaire#getEntretien <em>Entretien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entretien</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getEntretien()
	 * @see #getFormulaire()
	 * @generated
	 */
	EReference getFormulaire_Entretien();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDate()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Date();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Precedent Entretien</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_DatePrecedentEntretien();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getAnciennete <em>Anciennete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anciennete</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getAnciennete()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_Anciennete();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise <em>Date Entree Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Entree Entreprise</em>'.
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise()
	 * @see #getFormulaire()
	 * @generated
	 */
	EAttribute getFormulaire_DateEntreeEntreprise();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.dto.UIEmploye <em>UI Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Employe</em>'.
	 * @see fr.mutualite.rh.model.dto.UIEmploye
	 * @generated
	 */
	EClass getUIEmploye();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UIEmploye#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fr.mutualite.rh.model.dto.UIEmploye#getPrenom()
	 * @see #getUIEmploye()
	 * @generated
	 */
	EAttribute getUIEmploye_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UIEmploye#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see fr.mutualite.rh.model.dto.UIEmploye#getMatricule()
	 * @see #getUIEmploye()
	 * @generated
	 */
	EAttribute getUIEmploye_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UIEmploye#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.model.dto.UIEmploye#getNom()
	 * @see #getUIEmploye()
	 * @generated
	 */
	EAttribute getUIEmploye_Nom();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.dto.UISessionFormation <em>UI Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Session Formation</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation
	 * @generated
	 */
	EClass getUISessionFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UISessionFormation#getQuand <em>Quand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quand</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation#getQuand()
	 * @see #getUISessionFormation()
	 * @generated
	 */
	EAttribute getUISessionFormation_Quand();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UISessionFormation#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation#getDuree()
	 * @see #getUISessionFormation()
	 * @generated
	 */
	EAttribute getUISessionFormation_Duree();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UISessionFormation#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation#getLibelle()
	 * @see #getUISessionFormation()
	 * @generated
	 */
	EAttribute getUISessionFormation_Libelle();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UISessionFormation#getOrganisme <em>Organisme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisme</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation#getOrganisme()
	 * @see #getUISessionFormation()
	 * @generated
	 */
	EAttribute getUISessionFormation_Organisme();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.dto.UISessionFormation#isDpc <em>Dpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dpc</em>'.
	 * @see fr.mutualite.rh.model.dto.UISessionFormation#isDpc()
	 * @see #getUISessionFormation()
	 * @generated
	 */
	EAttribute getUISessionFormation_Dpc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtoFactory getDtoFactory();

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
		 * The meta object literal for the '{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl <em>Formulaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.dto.impl.FormulaireImpl
		 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getFormulaire()
		 * @generated
		 */
		EClass FORMULAIRE = eINSTANCE.getFormulaire();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__PRENOM = eINSTANCE.getFormulaire_Prenom();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__MATRICULE = eINSTANCE.getFormulaire_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__NOM = eINSTANCE.getFormulaire_Nom();

		/**
		 * The meta object literal for the '<em><b>Diplomes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__DIPLOMES = eINSTANCE.getFormulaire_Diplomes();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__SERVICE = eINSTANCE.getFormulaire_Service();

		/**
		 * The meta object literal for the '<em><b>Poste</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__POSTE = eINSTANCE.getFormulaire_Poste();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__RESPONSABLE = eINSTANCE.getFormulaire_Responsable();

		/**
		 * The meta object literal for the '<em><b>Mene Par</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__MENE_PAR = eINSTANCE.getFormulaire_MenePar();

		/**
		 * The meta object literal for the '<em><b>Entretien</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULAIRE__ENTRETIEN = eINSTANCE.getFormulaire_Entretien();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__DATE = eINSTANCE.getFormulaire_Date();

		/**
		 * The meta object literal for the '<em><b>Date Precedent Entretien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__DATE_PRECEDENT_ENTRETIEN = eINSTANCE.getFormulaire_DatePrecedentEntretien();

		/**
		 * The meta object literal for the '<em><b>Anciennete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__ANCIENNETE = eINSTANCE.getFormulaire_Anciennete();

		/**
		 * The meta object literal for the '<em><b>Date Entree Entreprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULAIRE__DATE_ENTREE_ENTREPRISE = eINSTANCE.getFormulaire_DateEntreeEntreprise();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.dto.impl.UIEmployeImpl <em>UI Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.dto.impl.UIEmployeImpl
		 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getUIEmploye()
		 * @generated
		 */
		EClass UI_EMPLOYE = eINSTANCE.getUIEmploye();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_EMPLOYE__PRENOM = eINSTANCE.getUIEmploye_Prenom();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_EMPLOYE__MATRICULE = eINSTANCE.getUIEmploye_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_EMPLOYE__NOM = eINSTANCE.getUIEmploye_Nom();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl <em>UI Session Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.dto.impl.UISessionFormationImpl
		 * @see fr.mutualite.rh.model.dto.impl.DtoPackageImpl#getUISessionFormation()
		 * @generated
		 */
		EClass UI_SESSION_FORMATION = eINSTANCE.getUISessionFormation();

		/**
		 * The meta object literal for the '<em><b>Quand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SESSION_FORMATION__QUAND = eINSTANCE.getUISessionFormation_Quand();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SESSION_FORMATION__DUREE = eINSTANCE.getUISessionFormation_Duree();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SESSION_FORMATION__LIBELLE = eINSTANCE.getUISessionFormation_Libelle();

		/**
		 * The meta object literal for the '<em><b>Organisme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SESSION_FORMATION__ORGANISME = eINSTANCE.getUISessionFormation_Organisme();

		/**
		 * The meta object literal for the '<em><b>Dpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_SESSION_FORMATION__DPC = eINSTANCE.getUISessionFormation_Dpc();

	}

} //DtoPackage
