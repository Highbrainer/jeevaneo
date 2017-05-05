/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fr.mutualite.rh.model.MutFactory
 * @model kind="package"
 * @generated
 */
public interface MutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mutualite.fr/mut/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mut";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MutPackage eINSTANCE = fr.mutualite.rh.model.impl.MutPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EtablissementImpl <em>Etablissement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EtablissementImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEtablissement()
	 * @generated
	 */
	int ETABLISSEMENT = 17;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EmployeImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmploye()
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
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Nom Jeune Fille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NOM_JEUNE_FILLE = 3;

	/**
	 * The feature id for the '<em><b>Date Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DATE_NAISSANCE = 4;

	/**
	 * The feature id for the '<em><b>Date Embauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DATE_EMBAUCHE = 5;

	/**
	 * The feature id for the '<em><b>Diplomes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DIPLOMES = 6;

	/**
	 * The feature id for the '<em><b>Etablissement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ETABLISSEMENT = 7;

	/**
	 * The feature id for the '<em><b>Affectations Emploi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__AFFECTATIONS_EMPLOI = 8;

	/**
	 * The feature id for the '<em><b>Affectation Emploi Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__AFFECTATION_EMPLOI_COURANTE = 9;

	/**
	 * The feature id for the '<em><b>Affectations Classification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__AFFECTATIONS_CLASSIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Affectation Classification Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE = 11;

	/**
	 * The feature id for the '<em><b>Sessions Formation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SESSIONS_FORMATION = 12;

	/**
	 * The feature id for the '<em><b>Entretiens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ENTRETIENS = 13;

	/**
	 * The feature id for the '<em><b>Entretiens Menes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ENTRETIENS_MENES = 14;

	/**
	 * The feature id for the '<em><b>Date Sortie Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__DATE_SORTIE_ENTREPRISE = 15;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__RESPONSABLE = 16;

	/**
	 * The feature id for the '<em><b>Subalternes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__SUBALTERNES = 17;

	/**
	 * The feature id for the '<em><b>Etablissements En Responsabilite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE = 18;

	/**
	 * The feature id for the '<em><b>Entreteneurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ENTRETENEURS = 19;

	/**
	 * The feature id for the '<em><b>Employes Entretenus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__EMPLOYES_ENTRETENUS = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__LABEL = 21;

	/**
	 * The feature id for the '<em><b>Etablissements Entretenus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__ETABLISSEMENTS_ENTRETENUS = 22;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 23;

	/**
	 * The operation id for the '<em>Has Valid Affectation Emploi Courante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___HAS_VALID_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Has One And Only One Affectation Emploi Courante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Has One And Only One Affectation Classification Courante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Has Valid Affectation Classification Courante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Responsable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___RESPONSABLE = 4;

	/**
	 * The operation id for the '<em>Entreteneurs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE___ENTRETENEURS = 5;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.AffectationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 1;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__DATE_DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__DATE_FIN = 1;

	/**
	 * The feature id for the '<em><b>Emploi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION__EMPLOI = 2;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EmploiImpl <em>Emploi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EmploiImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmploi()
	 * @generated
	 */
	int EMPLOI = 2;

	/**
	 * The feature id for the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOI__INTITULE = 0;

	/**
	 * The number of structural features of the '<em>Emploi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOI_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emploi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.AffectationClassificationImpl <em>Affectation Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.AffectationClassificationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAffectationClassification()
	 * @generated
	 */
	int AFFECTATION_CLASSIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_CLASSIFICATION__DATE_DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_CLASSIFICATION__DATE_FIN = 1;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_CLASSIFICATION__CLASSIFICATION = 2;

	/**
	 * The number of structural features of the '<em>Affectation Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_CLASSIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Affectation Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_CLASSIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.FormationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 4;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__LIBELLE = 0;

	/**
	 * The feature id for the '<em><b>Sessionformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SESSIONFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Dpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DPC = 2;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.OrganismeFormationImpl <em>Organisme Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.OrganismeFormationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getOrganismeFormation()
	 * @generated
	 */
	int ORGANISME_FORMATION = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISME_FORMATION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISME_FORMATION__FORMATIONS = 1;

	/**
	 * The number of structural features of the '<em>Organisme Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISME_FORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organisme Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISME_FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.SessionFormationImpl <em>Session Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.SessionFormationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSessionFormation()
	 * @generated
	 */
	int SESSION_FORMATION = 6;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION__DATE_DEBUT = 0;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION__DATE_FIN = 1;

	/**
	 * The feature id for the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION__DUREE = 2;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION__EMPLOYES = 3;

	/**
	 * The feature id for the '<em><b>Appreciations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION__APPRECIATIONS = 4;

	/**
	 * The number of structural features of the '<em>Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EntretienImpl <em>Entretien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EntretienImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEntretien()
	 * @generated
	 */
	int ENTRETIEN = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN__DATE = 0;

	/**
	 * The feature id for the '<em><b>Meneur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN__MENEUR = 1;

	/**
	 * The feature id for the '<em><b>En Cours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN__EN_COURS = 2;

	/**
	 * The feature id for the '<em><b>Fake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN__FAKE = 3;

	/**
	 * The feature id for the '<em><b>Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN__SCAN = 4;

	/**
	 * The number of structural features of the '<em>Entretien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Employe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN___EMPLOYE = 0;

	/**
	 * The operation id for the '<em>Has Valid Meneur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Entretien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl <em>Entretien Professionnel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EntretienProfessionnelImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEntretienProfessionnel()
	 * @generated
	 */
	int ENTRETIEN_PROFESSIONNEL = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__DATE = ENTRETIEN__DATE;

	/**
	 * The feature id for the '<em><b>Meneur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__MENEUR = ENTRETIEN__MENEUR;

	/**
	 * The feature id for the '<em><b>En Cours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EN_COURS = ENTRETIEN__EN_COURS;

	/**
	 * The feature id for the '<em><b>Fake</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__FAKE = ENTRETIEN__FAKE;

	/**
	 * The feature id for the '<em><b>Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__SCAN = ENTRETIEN__SCAN;

	/**
	 * The feature id for the '<em><b>Evolution Depuis Dernier Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN = ENTRETIEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commentaire Bilan Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__COMMENTAIRE_BILAN_FORMATION = ENTRETIEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evolution Souhaitee Dans Emploi Actuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL = ENTRETIEN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evolution Souhaitee Dans Nouvel Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI = ENTRETIEN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Echeance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__ECHEANCE = ENTRETIEN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Evolution Souhaitee Competences Acquises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES = ENTRETIEN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Evolution Souhaitee Competences Requises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES = ENTRETIEN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Evolution Souhaitee Moyens Realisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION = ENTRETIEN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Autres Actions Developpement Competences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES = ENTRETIEN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Perspectives Evolution Professionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE = ENTRETIEN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Perspectives Evolution Professionnelle Competences Associees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES = ENTRETIEN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Adequation Projet Pro Besoins Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE = ENTRETIEN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Adequation Projet Pro Besoins Entreprise Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE = ENTRETIEN_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Rencontre Rh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH = ENTRETIEN_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rencontre Rh Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE = ENTRETIEN_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Synthese</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__SYNTHESE = ENTRETIEN_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Appreciations Session Formation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__APPRECIATIONS_SESSION_FORMATION = ENTRETIEN_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Souhaits Formation Salarie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_SALARIE = ENTRETIEN_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Souhaits Formation Evaluateur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_EVALUATEUR = ENTRETIEN_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Entretien Professionnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL_FEATURE_COUNT = ENTRETIEN_FEATURE_COUNT + 19;

	/**
	 * The operation id for the '<em>Employe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL___EMPLOYE = ENTRETIEN___EMPLOYE;

	/**
	 * The operation id for the '<em>Has Valid Meneur</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP = ENTRETIEN___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Has Valid Synthese</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL___HAS_VALID_SYNTHESE__DIAGNOSTICCHAIN_MAP = ENTRETIEN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entretien Professionnel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRETIEN_PROFESSIONNEL_OPERATION_COUNT = ENTRETIEN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl <em>Appreciation Session Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAppreciationSessionFormation()
	 * @generated
	 */
	int APPRECIATION_SESSION_FORMATION = 9;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION__VALEUR = 0;

	/**
	 * The feature id for the '<em><b>Session Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION__SESSION_FORMATION = 1;

	/**
	 * The feature id for the '<em><b>Id Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION__ID_FORMATION = 2;

	/**
	 * The feature id for the '<em><b>Libelle Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION__LIBELLE_FORMATION = 3;

	/**
	 * The feature id for the '<em><b>Date Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION__DATE_FORMATION = 4;

	/**
	 * The number of structural features of the '<em>Appreciation Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Appreciation Session Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPRECIATION_SESSION_FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl <em>Souhait Formation Evaluateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSouhaitFormationEvaluateur()
	 * @generated
	 */
	int SOUHAIT_FORMATION_EVALUATEUR = 10;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_EVALUATEUR__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_EVALUATEUR__ID = 1;

	/**
	 * The number of structural features of the '<em>Souhait Formation Evaluateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_EVALUATEUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Souhait Formation Evaluateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_EVALUATEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl <em>Souhait Formation Salarie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSouhaitFormationSalarie()
	 * @generated
	 */
	int SOUHAIT_FORMATION_SALARIE = 11;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_SALARIE__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Avis Evaluateur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_SALARIE__ID = 2;

	/**
	 * The number of structural features of the '<em>Souhait Formation Salarie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_SALARIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Souhait Formation Salarie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUHAIT_FORMATION_SALARIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.MutualiteImpl <em>Mutualite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.MutualiteImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getMutualite()
	 * @generated
	 */
	int MUTUALITE = 12;

	/**
	 * The feature id for the '<em><b>Etablissements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE__ETABLISSEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Emplois</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE__EMPLOIS = 1;

	/**
	 * The feature id for the '<em><b>Effectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE__EFFECTIF = 2;

	/**
	 * The feature id for the '<em><b>Organismes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE__ORGANISMES = 3;

	/**
	 * The feature id for the '<em><b>Utilisateurs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE__UTILISATEURS = 4;

	/**
	 * The number of structural features of the '<em>Mutualite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mutualite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EtablissementsImpl <em>Etablissements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EtablissementsImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEtablissements()
	 * @generated
	 */
	int ETABLISSEMENTS = 13;

	/**
	 * The feature id for the '<em><b>Etablissements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS__ETABLISSEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Etablissements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Etablissements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EmploisImpl <em>Emplois</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EmploisImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmplois()
	 * @generated
	 */
	int EMPLOIS = 14;

	/**
	 * The feature id for the '<em><b>Emplois</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOIS__EMPLOIS = 0;

	/**
	 * The number of structural features of the '<em>Emplois</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOIS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emplois</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.EffectifImpl <em>Effectif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.EffectifImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEffectif()
	 * @generated
	 */
	int EFFECTIF = 15;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIF__EMPLOYES = 0;

	/**
	 * The number of structural features of the '<em>Effectif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Effectif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.OrganismesImpl <em>Organismes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.OrganismesImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getOrganismes()
	 * @generated
	 */
	int ORGANISMES = 16;

	/**
	 * The feature id for the '<em><b>Organisme Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISMES__ORGANISME_FORMATIONS = 0;

	/**
	 * The number of structural features of the '<em>Organismes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISMES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Organismes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISMES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT__EMPLOYES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT__RESPONSABLE = 3;

	/**
	 * The feature id for the '<em><b>Entreteneurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT__ENTRETENEURS = 4;

	/**
	 * The number of structural features of the '<em>Etablissement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Etablissement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.UtilisateurImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getUtilisateur()
	 * @generated
	 */
	int UTILISATEUR = 18;

	/**
	 * The feature id for the '<em><b>Employe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__EMPLOYE = 0;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__LOGIN = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ROLES = 2;

	/**
	 * The number of structural features of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.impl.UtilisateursImpl <em>Utilisateurs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.impl.UtilisateursImpl
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getUtilisateurs()
	 * @generated
	 */
	int UTILISATEURS = 19;

	/**
	 * The feature id for the '<em><b>Utilisateurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEURS__UTILISATEURS = 0;

	/**
	 * The number of structural features of the '<em>Utilisateurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEURS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Utilisateurs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEURS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.ClassificationStatut <em>Classification Statut</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.ClassificationStatut
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getClassificationStatut()
	 * @generated
	 */
	int CLASSIFICATION_STATUT = 20;


	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.Appreciation <em>Appreciation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.Appreciation
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAppreciation()
	 * @generated
	 */
	int APPRECIATION = 21;

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.Avis <em>Avis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.Avis
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAvis()
	 * @generated
	 */
	int AVIS = 22;


	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.Role
	 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 23;


	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Etablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etablissement</em>'.
	 * @see fr.mutualite.rh.model.Etablissement
	 * @generated
	 */
	EClass getEtablissement();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Etablissement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.model.Etablissement#getNom()
	 * @see #getEtablissement()
	 * @generated
	 */
	EAttribute getEtablissement_Nom();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Etablissement#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employes</em>'.
	 * @see fr.mutualite.rh.model.Etablissement#getEmployes()
	 * @see #getEtablissement()
	 * @generated
	 */
	EReference getEtablissement_Employes();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Etablissement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.mutualite.rh.model.Etablissement#getId()
	 * @see #getEtablissement()
	 * @generated
	 */
	EAttribute getEtablissement_Id();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Etablissement#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see fr.mutualite.rh.model.Etablissement#getResponsable()
	 * @see #getEtablissement()
	 * @generated
	 */
	EReference getEtablissement_Responsable();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Etablissement#getEntreteneurs <em>Entreteneurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entreteneurs</em>'.
	 * @see fr.mutualite.rh.model.Etablissement#getEntreteneurs()
	 * @see #getEtablissement()
	 * @generated
	 */
	EReference getEtablissement_Entreteneurs();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateur</em>'.
	 * @see fr.mutualite.rh.model.Utilisateur
	 * @generated
	 */
	EClass getUtilisateur();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Utilisateur#getEmploye <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employe</em>'.
	 * @see fr.mutualite.rh.model.Utilisateur#getEmploye()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_Employe();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Utilisateur#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see fr.mutualite.rh.model.Utilisateur#getLogin()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Login();

	/**
	 * Returns the meta object for the attribute list '{@link fr.mutualite.rh.model.Utilisateur#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see fr.mutualite.rh.model.Utilisateur#getRoles()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Roles();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Utilisateurs <em>Utilisateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateurs</em>'.
	 * @see fr.mutualite.rh.model.Utilisateurs
	 * @generated
	 */
	EClass getUtilisateurs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Utilisateurs#getUtilisateurs <em>Utilisateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Utilisateurs</em>'.
	 * @see fr.mutualite.rh.model.Utilisateurs#getUtilisateurs()
	 * @see #getUtilisateurs()
	 * @generated
	 */
	EReference getUtilisateurs_Utilisateurs();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see fr.mutualite.rh.model.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see fr.mutualite.rh.model.Employe#getMatricule()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see fr.mutualite.rh.model.Employe#getPrenom()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.model.Employe#getNom()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Nom();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getNomJeuneFille <em>Nom Jeune Fille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Jeune Fille</em>'.
	 * @see fr.mutualite.rh.model.Employe#getNomJeuneFille()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_NomJeuneFille();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getDateNaissance <em>Date Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Naissance</em>'.
	 * @see fr.mutualite.rh.model.Employe#getDateNaissance()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_DateNaissance();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getDateEmbauche <em>Date Embauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Embauche</em>'.
	 * @see fr.mutualite.rh.model.Employe#getDateEmbauche()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_DateEmbauche();

	/**
	 * Returns the meta object for the attribute list '{@link fr.mutualite.rh.model.Employe#getDiplomes <em>Diplomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diplomes</em>'.
	 * @see fr.mutualite.rh.model.Employe#getDiplomes()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Diplomes();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Employe#getEtablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etablissement</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEtablissement()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Etablissement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Employe#getAffectationsEmploi <em>Affectations Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectations Emploi</em>'.
	 * @see fr.mutualite.rh.model.Employe#getAffectationsEmploi()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_AffectationsEmploi();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Employe#getAffectationEmploiCourante <em>Affectation Emploi Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affectation Emploi Courante</em>'.
	 * @see fr.mutualite.rh.model.Employe#getAffectationEmploiCourante()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_AffectationEmploiCourante();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Employe#getAffectationsClassification <em>Affectations Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affectations Classification</em>'.
	 * @see fr.mutualite.rh.model.Employe#getAffectationsClassification()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_AffectationsClassification();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Employe#getAffectationClassificationCourante <em>Affectation Classification Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affectation Classification Courante</em>'.
	 * @see fr.mutualite.rh.model.Employe#getAffectationClassificationCourante()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_AffectationClassificationCourante();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getSessionsFormation <em>Sessions Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions Formation</em>'.
	 * @see fr.mutualite.rh.model.Employe#getSessionsFormation()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_SessionsFormation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Employe#getEntretiens <em>Entretiens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entretiens</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEntretiens()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Entretiens();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getEntretiensMenes <em>Entretiens Menes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entretiens Menes</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEntretiensMenes()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_EntretiensMenes();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getDateSortieEntreprise <em>Date Sortie Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Sortie Entreprise</em>'.
	 * @see fr.mutualite.rh.model.Employe#getDateSortieEntreprise()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_DateSortieEntreprise();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Employe#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see fr.mutualite.rh.model.Employe#getResponsable()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Responsable();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getSubalternes <em>Subalternes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subalternes</em>'.
	 * @see fr.mutualite.rh.model.Employe#getSubalternes()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Subalternes();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getEtablissementsEnResponsabilite <em>Etablissements En Responsabilite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Etablissements En Responsabilite</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEtablissementsEnResponsabilite()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_EtablissementsEnResponsabilite();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getEntreteneurs <em>Entreteneurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entreteneurs</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEntreteneurs()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_Entreteneurs();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getEmployesEntretenus <em>Employes Entretenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employes Entretenus</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEmployesEntretenus()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_EmployesEntretenus();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Employe#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.mutualite.rh.model.Employe#getLabel()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Label();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.Employe#getEtablissementsEntretenus <em>Etablissements Entretenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Etablissements Entretenus</em>'.
	 * @see fr.mutualite.rh.model.Employe#getEtablissementsEntretenus()
	 * @see #getEmploye()
	 * @generated
	 */
	EReference getEmploye_EtablissementsEntretenus();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#hasValidAffectationEmploiCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Affectation Emploi Courante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Affectation Emploi Courante</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#hasValidAffectationEmploiCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmploye__HasValidAffectationEmploiCourante__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#hasOneAndOnlyOneAffectationEmploiCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One And Only One Affectation Emploi Courante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One And Only One Affectation Emploi Courante</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#hasOneAndOnlyOneAffectationEmploiCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmploye__HasOneAndOnlyOneAffectationEmploiCourante__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#hasOneAndOnlyOneAffectationClassificationCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has One And Only One Affectation Classification Courante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has One And Only One Affectation Classification Courante</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#hasOneAndOnlyOneAffectationClassificationCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmploye__HasOneAndOnlyOneAffectationClassificationCourante__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#hasValidAffectationClassificationCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Affectation Classification Courante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Affectation Classification Courante</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#hasValidAffectationClassificationCourante(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEmploye__HasValidAffectationClassificationCourante__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#responsable() <em>Responsable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Responsable</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#responsable()
	 * @generated
	 */
	EOperation getEmploye__Responsable();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Employe#entreteneurs() <em>Entreteneurs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entreteneurs</em>' operation.
	 * @see fr.mutualite.rh.model.Employe#entreteneurs()
	 * @generated
	 */
	EOperation getEmploye__Entreteneurs();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see fr.mutualite.rh.model.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Affectation#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see fr.mutualite.rh.model.Affectation#getDateDebut()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Affectation#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see fr.mutualite.rh.model.Affectation#getDateFin()
	 * @see #getAffectation()
	 * @generated
	 */
	EAttribute getAffectation_DateFin();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Affectation#getEmploi <em>Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emploi</em>'.
	 * @see fr.mutualite.rh.model.Affectation#getEmploi()
	 * @see #getAffectation()
	 * @generated
	 */
	EReference getAffectation_Emploi();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Emploi <em>Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emploi</em>'.
	 * @see fr.mutualite.rh.model.Emploi
	 * @generated
	 */
	EClass getEmploi();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Emploi#getIntitule <em>Intitule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intitule</em>'.
	 * @see fr.mutualite.rh.model.Emploi#getIntitule()
	 * @see #getEmploi()
	 * @generated
	 */
	EAttribute getEmploi_Intitule();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.AffectationClassification <em>Affectation Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation Classification</em>'.
	 * @see fr.mutualite.rh.model.AffectationClassification
	 * @generated
	 */
	EClass getAffectationClassification();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AffectationClassification#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see fr.mutualite.rh.model.AffectationClassification#getDateDebut()
	 * @see #getAffectationClassification()
	 * @generated
	 */
	EAttribute getAffectationClassification_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AffectationClassification#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see fr.mutualite.rh.model.AffectationClassification#getDateFin()
	 * @see #getAffectationClassification()
	 * @generated
	 */
	EAttribute getAffectationClassification_DateFin();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AffectationClassification#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see fr.mutualite.rh.model.AffectationClassification#getClassification()
	 * @see #getAffectationClassification()
	 * @generated
	 */
	EAttribute getAffectationClassification_Classification();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see fr.mutualite.rh.model.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Formation#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see fr.mutualite.rh.model.Formation#getLibelle()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Libelle();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Formation#getSessionformation <em>Sessionformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sessionformation</em>'.
	 * @see fr.mutualite.rh.model.Formation#getSessionformation()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Sessionformation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Formation#isDpc <em>Dpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dpc</em>'.
	 * @see fr.mutualite.rh.model.Formation#isDpc()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Dpc();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.OrganismeFormation <em>Organisme Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisme Formation</em>'.
	 * @see fr.mutualite.rh.model.OrganismeFormation
	 * @generated
	 */
	EClass getOrganismeFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.OrganismeFormation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see fr.mutualite.rh.model.OrganismeFormation#getNom()
	 * @see #getOrganismeFormation()
	 * @generated
	 */
	EAttribute getOrganismeFormation_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.OrganismeFormation#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formations</em>'.
	 * @see fr.mutualite.rh.model.OrganismeFormation#getFormations()
	 * @see #getOrganismeFormation()
	 * @generated
	 */
	EReference getOrganismeFormation_Formations();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.SessionFormation <em>Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Formation</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation
	 * @generated
	 */
	EClass getSessionFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SessionFormation#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation#getDateFin()
	 * @see #getSessionFormation()
	 * @generated
	 */
	EAttribute getSessionFormation_DateFin();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SessionFormation#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation#getDateDebut()
	 * @see #getSessionFormation()
	 * @generated
	 */
	EAttribute getSessionFormation_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SessionFormation#getDuree <em>Duree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duree</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation#getDuree()
	 * @see #getSessionFormation()
	 * @generated
	 */
	EAttribute getSessionFormation_Duree();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.SessionFormation#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employes</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation#getEmployes()
	 * @see #getSessionFormation()
	 * @generated
	 */
	EReference getSessionFormation_Employes();

	/**
	 * Returns the meta object for the reference list '{@link fr.mutualite.rh.model.SessionFormation#getAppreciations <em>Appreciations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appreciations</em>'.
	 * @see fr.mutualite.rh.model.SessionFormation#getAppreciations()
	 * @see #getSessionFormation()
	 * @generated
	 */
	EReference getSessionFormation_Appreciations();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Entretien <em>Entretien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entretien</em>'.
	 * @see fr.mutualite.rh.model.Entretien
	 * @generated
	 */
	EClass getEntretien();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Entretien#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.mutualite.rh.model.Entretien#getDate()
	 * @see #getEntretien()
	 * @generated
	 */
	EAttribute getEntretien_Date();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.Entretien#getMeneur <em>Meneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meneur</em>'.
	 * @see fr.mutualite.rh.model.Entretien#getMeneur()
	 * @see #getEntretien()
	 * @generated
	 */
	EReference getEntretien_Meneur();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Entretien#isEnCours <em>En Cours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>En Cours</em>'.
	 * @see fr.mutualite.rh.model.Entretien#isEnCours()
	 * @see #getEntretien()
	 * @generated
	 */
	EAttribute getEntretien_EnCours();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Entretien#isFake <em>Fake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fake</em>'.
	 * @see fr.mutualite.rh.model.Entretien#isFake()
	 * @see #getEntretien()
	 * @generated
	 */
	EAttribute getEntretien_Fake();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.Entretien#getScan <em>Scan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scan</em>'.
	 * @see fr.mutualite.rh.model.Entretien#getScan()
	 * @see #getEntretien()
	 * @generated
	 */
	EAttribute getEntretien_Scan();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Entretien#employe() <em>Employe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employe</em>' operation.
	 * @see fr.mutualite.rh.model.Entretien#employe()
	 * @generated
	 */
	EOperation getEntretien__Employe();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.Entretien#hasValidMeneur(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Meneur</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Meneur</em>' operation.
	 * @see fr.mutualite.rh.model.Entretien#hasValidMeneur(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntretien__HasValidMeneur__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.EntretienProfessionnel <em>Entretien Professionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entretien Professionnel</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel
	 * @generated
	 */
	EClass getEntretienProfessionnel();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionDepuisDernierEntretien <em>Evolution Depuis Dernier Entretien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Depuis Dernier Entretien</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionDepuisDernierEntretien()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionDepuisDernierEntretien();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getCommentaireBilanFormation <em>Commentaire Bilan Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commentaire Bilan Formation</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getCommentaireBilanFormation()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_CommentaireBilanFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansEmploiActuel <em>Evolution Souhaitee Dans Emploi Actuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Souhaitee Dans Emploi Actuel</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansEmploiActuel()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionSouhaiteeDansEmploiActuel();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansNouvelEmploi <em>Evolution Souhaitee Dans Nouvel Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Souhaitee Dans Nouvel Emploi</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansNouvelEmploi()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionSouhaiteeDansNouvelEmploi();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEcheance <em>Echeance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Echeance</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEcheance()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_Echeance();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesAcquises <em>Evolution Souhaitee Competences Acquises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Souhaitee Competences Acquises</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesAcquises()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionSouhaiteeCompetencesAcquises();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesRequises <em>Evolution Souhaitee Competences Requises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Souhaitee Competences Requises</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesRequises()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionSouhaiteeCompetencesRequises();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeMoyensRealisation <em>Evolution Souhaitee Moyens Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evolution Souhaitee Moyens Realisation</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeMoyensRealisation()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_EvolutionSouhaiteeMoyensRealisation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getAutresActionsDeveloppementCompetences <em>Autres Actions Developpement Competences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autres Actions Developpement Competences</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getAutresActionsDeveloppementCompetences()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_AutresActionsDeveloppementCompetences();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelle <em>Perspectives Evolution Professionnelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perspectives Evolution Professionnelle</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelle()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_PerspectivesEvolutionProfessionnelle();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelleCompetencesAssociees <em>Perspectives Evolution Professionnelle Competences Associees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perspectives Evolution Professionnelle Competences Associees</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelleCompetencesAssociees()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_PerspectivesEvolutionProfessionnelleCompetencesAssociees();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#isAdequationProjetProBesoinsEntreprise <em>Adequation Projet Pro Besoins Entreprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adequation Projet Pro Besoins Entreprise</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#isAdequationProjetProBesoinsEntreprise()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_AdequationProjetProBesoinsEntreprise();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getAdequationProjetProBesoinsEntrepriseCommentaire <em>Adequation Projet Pro Besoins Entreprise Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adequation Projet Pro Besoins Entreprise Commentaire</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getAdequationProjetProBesoinsEntrepriseCommentaire()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_AdequationProjetProBesoinsEntrepriseCommentaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#isRencontreRh <em>Rencontre Rh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rencontre Rh</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#isRencontreRh()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_RencontreRh();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getRencontreRhCommentaire <em>Rencontre Rh Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rencontre Rh Commentaire</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getRencontreRhCommentaire()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_RencontreRhCommentaire();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.EntretienProfessionnel#getSynthese <em>Synthese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthese</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getSynthese()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EAttribute getEntretienProfessionnel_Synthese();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.EntretienProfessionnel#getAppreciationsSessionFormation <em>Appreciations Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appreciations Session Formation</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getAppreciationsSessionFormation()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EReference getEntretienProfessionnel_AppreciationsSessionFormation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.EntretienProfessionnel#getSouhaitsFormationSalarie <em>Souhaits Formation Salarie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Souhaits Formation Salarie</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getSouhaitsFormationSalarie()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EReference getEntretienProfessionnel_SouhaitsFormationSalarie();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.EntretienProfessionnel#getSouhaitsFormationEvaluateur <em>Souhaits Formation Evaluateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Souhaits Formation Evaluateur</em>'.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#getSouhaitsFormationEvaluateur()
	 * @see #getEntretienProfessionnel()
	 * @generated
	 */
	EReference getEntretienProfessionnel_SouhaitsFormationEvaluateur();

	/**
	 * Returns the meta object for the '{@link fr.mutualite.rh.model.EntretienProfessionnel#hasValidSynthese(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Valid Synthese</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Valid Synthese</em>' operation.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel#hasValidSynthese(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntretienProfessionnel__HasValidSynthese__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.AppreciationSessionFormation <em>Appreciation Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appreciation Session Formation</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation
	 * @generated
	 */
	EClass getAppreciationSessionFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getValeur()
	 * @see #getAppreciationSessionFormation()
	 * @generated
	 */
	EAttribute getAppreciationSessionFormation_Valeur();

	/**
	 * Returns the meta object for the reference '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation <em>Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session Formation</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation()
	 * @see #getAppreciationSessionFormation()
	 * @generated
	 */
	EReference getAppreciationSessionFormation_SessionFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getIdFormation <em>Id Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Formation</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getIdFormation()
	 * @see #getAppreciationSessionFormation()
	 * @generated
	 */
	EAttribute getAppreciationSessionFormation_IdFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getLibelleFormation <em>Libelle Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle Formation</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getLibelleFormation()
	 * @see #getAppreciationSessionFormation()
	 * @generated
	 */
	EAttribute getAppreciationSessionFormation_LibelleFormation();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getDateFormation <em>Date Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Formation</em>'.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getDateFormation()
	 * @see #getAppreciationSessionFormation()
	 * @generated
	 */
	EAttribute getAppreciationSessionFormation_DateFormation();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.SouhaitFormationEvaluateur <em>Souhait Formation Evaluateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Souhait Formation Evaluateur</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationEvaluateur
	 * @generated
	 */
	EClass getSouhaitFormationEvaluateur();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SouhaitFormationEvaluateur#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationEvaluateur#getTexte()
	 * @see #getSouhaitFormationEvaluateur()
	 * @generated
	 */
	EAttribute getSouhaitFormationEvaluateur_Texte();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SouhaitFormationEvaluateur#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationEvaluateur#getId()
	 * @see #getSouhaitFormationEvaluateur()
	 * @generated
	 */
	EAttribute getSouhaitFormationEvaluateur_Id();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.SouhaitFormationSalarie <em>Souhait Formation Salarie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Souhait Formation Salarie</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationSalarie
	 * @generated
	 */
	EClass getSouhaitFormationSalarie();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationSalarie#getTexte()
	 * @see #getSouhaitFormationSalarie()
	 * @generated
	 */
	EAttribute getSouhaitFormationSalarie_Texte();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getAvisEvaluateur <em>Avis Evaluateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avis Evaluateur</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationSalarie#getAvisEvaluateur()
	 * @see #getSouhaitFormationSalarie()
	 * @generated
	 */
	EAttribute getSouhaitFormationSalarie_AvisEvaluateur();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.mutualite.rh.model.SouhaitFormationSalarie#getId()
	 * @see #getSouhaitFormationSalarie()
	 * @generated
	 */
	EAttribute getSouhaitFormationSalarie_Id();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Mutualite <em>Mutualite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutualite</em>'.
	 * @see fr.mutualite.rh.model.Mutualite
	 * @generated
	 */
	EClass getMutualite();

	/**
	 * Returns the meta object for the containment reference '{@link fr.mutualite.rh.model.Mutualite#getEtablissements <em>Etablissements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Etablissements</em>'.
	 * @see fr.mutualite.rh.model.Mutualite#getEtablissements()
	 * @see #getMutualite()
	 * @generated
	 */
	EReference getMutualite_Etablissements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.mutualite.rh.model.Mutualite#getEmplois <em>Emplois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emplois</em>'.
	 * @see fr.mutualite.rh.model.Mutualite#getEmplois()
	 * @see #getMutualite()
	 * @generated
	 */
	EReference getMutualite_Emplois();

	/**
	 * Returns the meta object for the containment reference '{@link fr.mutualite.rh.model.Mutualite#getEffectif <em>Effectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effectif</em>'.
	 * @see fr.mutualite.rh.model.Mutualite#getEffectif()
	 * @see #getMutualite()
	 * @generated
	 */
	EReference getMutualite_Effectif();

	/**
	 * Returns the meta object for the containment reference '{@link fr.mutualite.rh.model.Mutualite#getOrganismes <em>Organismes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organismes</em>'.
	 * @see fr.mutualite.rh.model.Mutualite#getOrganismes()
	 * @see #getMutualite()
	 * @generated
	 */
	EReference getMutualite_Organismes();

	/**
	 * Returns the meta object for the containment reference '{@link fr.mutualite.rh.model.Mutualite#getUtilisateurs <em>Utilisateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Utilisateurs</em>'.
	 * @see fr.mutualite.rh.model.Mutualite#getUtilisateurs()
	 * @see #getMutualite()
	 * @generated
	 */
	EReference getMutualite_Utilisateurs();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Etablissements <em>Etablissements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etablissements</em>'.
	 * @see fr.mutualite.rh.model.Etablissements
	 * @generated
	 */
	EClass getEtablissements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Etablissements#getEtablissements <em>Etablissements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etablissements</em>'.
	 * @see fr.mutualite.rh.model.Etablissements#getEtablissements()
	 * @see #getEtablissements()
	 * @generated
	 */
	EReference getEtablissements_Etablissements();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Emplois <em>Emplois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emplois</em>'.
	 * @see fr.mutualite.rh.model.Emplois
	 * @generated
	 */
	EClass getEmplois();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Emplois#getEmplois <em>Emplois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emplois</em>'.
	 * @see fr.mutualite.rh.model.Emplois#getEmplois()
	 * @see #getEmplois()
	 * @generated
	 */
	EReference getEmplois_Emplois();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Effectif <em>Effectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effectif</em>'.
	 * @see fr.mutualite.rh.model.Effectif
	 * @generated
	 */
	EClass getEffectif();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Effectif#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employes</em>'.
	 * @see fr.mutualite.rh.model.Effectif#getEmployes()
	 * @see #getEffectif()
	 * @generated
	 */
	EReference getEffectif_Employes();

	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.Organismes <em>Organismes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organismes</em>'.
	 * @see fr.mutualite.rh.model.Organismes
	 * @generated
	 */
	EClass getOrganismes();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.mutualite.rh.model.Organismes#getOrganismeFormations <em>Organisme Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisme Formations</em>'.
	 * @see fr.mutualite.rh.model.Organismes#getOrganismeFormations()
	 * @see #getOrganismes()
	 * @generated
	 */
	EReference getOrganismes_OrganismeFormations();

	/**
	 * Returns the meta object for enum '{@link fr.mutualite.rh.model.ClassificationStatut <em>Classification Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification Statut</em>'.
	 * @see fr.mutualite.rh.model.ClassificationStatut
	 * @generated
	 */
	EEnum getClassificationStatut();

	/**
	 * Returns the meta object for enum '{@link fr.mutualite.rh.model.Appreciation <em>Appreciation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appreciation</em>'.
	 * @see fr.mutualite.rh.model.Appreciation
	 * @generated
	 */
	EEnum getAppreciation();

	/**
	 * Returns the meta object for enum '{@link fr.mutualite.rh.model.Avis <em>Avis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Avis</em>'.
	 * @see fr.mutualite.rh.model.Avis
	 * @generated
	 */
	EEnum getAvis();

	/**
	 * Returns the meta object for enum '{@link fr.mutualite.rh.model.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see fr.mutualite.rh.model.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MutFactory getMutFactory();

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
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EtablissementImpl <em>Etablissement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EtablissementImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEtablissement()
		 * @generated
		 */
		EClass ETABLISSEMENT = eINSTANCE.getEtablissement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLISSEMENT__NOM = eINSTANCE.getEtablissement_Nom();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLISSEMENT__EMPLOYES = eINSTANCE.getEtablissement_Employes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLISSEMENT__ID = eINSTANCE.getEtablissement_Id();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLISSEMENT__RESPONSABLE = eINSTANCE.getEtablissement_Responsable();

		/**
		 * The meta object literal for the '<em><b>Entreteneurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLISSEMENT__ENTRETENEURS = eINSTANCE.getEtablissement_Entreteneurs();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.UtilisateurImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getUtilisateur()
		 * @generated
		 */
		EClass UTILISATEUR = eINSTANCE.getUtilisateur();

		/**
		 * The meta object literal for the '<em><b>Employe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__EMPLOYE = eINSTANCE.getUtilisateur_Employe();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__LOGIN = eINSTANCE.getUtilisateur_Login();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__ROLES = eINSTANCE.getUtilisateur_Roles();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.UtilisateursImpl <em>Utilisateurs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.UtilisateursImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getUtilisateurs()
		 * @generated
		 */
		EClass UTILISATEURS = eINSTANCE.getUtilisateurs();

		/**
		 * The meta object literal for the '<em><b>Utilisateurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEURS__UTILISATEURS = eINSTANCE.getUtilisateurs_Utilisateurs();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EmployeImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmploye()
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
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__PRENOM = eINSTANCE.getEmploye_Prenom();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NOM = eINSTANCE.getEmploye_Nom();

		/**
		 * The meta object literal for the '<em><b>Nom Jeune Fille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NOM_JEUNE_FILLE = eINSTANCE.getEmploye_NomJeuneFille();

		/**
		 * The meta object literal for the '<em><b>Date Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DATE_NAISSANCE = eINSTANCE.getEmploye_DateNaissance();

		/**
		 * The meta object literal for the '<em><b>Date Embauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DATE_EMBAUCHE = eINSTANCE.getEmploye_DateEmbauche();

		/**
		 * The meta object literal for the '<em><b>Diplomes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DIPLOMES = eINSTANCE.getEmploye_Diplomes();

		/**
		 * The meta object literal for the '<em><b>Etablissement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ETABLISSEMENT = eINSTANCE.getEmploye_Etablissement();

		/**
		 * The meta object literal for the '<em><b>Affectations Emploi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__AFFECTATIONS_EMPLOI = eINSTANCE.getEmploye_AffectationsEmploi();

		/**
		 * The meta object literal for the '<em><b>Affectation Emploi Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__AFFECTATION_EMPLOI_COURANTE = eINSTANCE.getEmploye_AffectationEmploiCourante();

		/**
		 * The meta object literal for the '<em><b>Affectations Classification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__AFFECTATIONS_CLASSIFICATION = eINSTANCE.getEmploye_AffectationsClassification();

		/**
		 * The meta object literal for the '<em><b>Affectation Classification Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE = eINSTANCE.getEmploye_AffectationClassificationCourante();

		/**
		 * The meta object literal for the '<em><b>Sessions Formation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__SESSIONS_FORMATION = eINSTANCE.getEmploye_SessionsFormation();

		/**
		 * The meta object literal for the '<em><b>Entretiens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ENTRETIENS = eINSTANCE.getEmploye_Entretiens();

		/**
		 * The meta object literal for the '<em><b>Entretiens Menes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ENTRETIENS_MENES = eINSTANCE.getEmploye_EntretiensMenes();

		/**
		 * The meta object literal for the '<em><b>Date Sortie Entreprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__DATE_SORTIE_ENTREPRISE = eINSTANCE.getEmploye_DateSortieEntreprise();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__RESPONSABLE = eINSTANCE.getEmploye_Responsable();

		/**
		 * The meta object literal for the '<em><b>Subalternes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__SUBALTERNES = eINSTANCE.getEmploye_Subalternes();

		/**
		 * The meta object literal for the '<em><b>Etablissements En Responsabilite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE = eINSTANCE.getEmploye_EtablissementsEnResponsabilite();

		/**
		 * The meta object literal for the '<em><b>Entreteneurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ENTRETENEURS = eINSTANCE.getEmploye_Entreteneurs();

		/**
		 * The meta object literal for the '<em><b>Employes Entretenus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__EMPLOYES_ENTRETENUS = eINSTANCE.getEmploye_EmployesEntretenus();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__LABEL = eINSTANCE.getEmploye_Label();

		/**
		 * The meta object literal for the '<em><b>Etablissements Entretenus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYE__ETABLISSEMENTS_ENTRETENUS = eINSTANCE.getEmploye_EtablissementsEntretenus();

		/**
		 * The meta object literal for the '<em><b>Has Valid Affectation Emploi Courante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___HAS_VALID_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmploye__HasValidAffectationEmploiCourante__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has One And Only One Affectation Emploi Courante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmploye__HasOneAndOnlyOneAffectationEmploiCourante__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has One And Only One Affectation Classification Courante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmploye__HasOneAndOnlyOneAffectationClassificationCourante__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Has Valid Affectation Classification Courante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEmploye__HasValidAffectationClassificationCourante__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___RESPONSABLE = eINSTANCE.getEmploye__Responsable();

		/**
		 * The meta object literal for the '<em><b>Entreteneurs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPLOYE___ENTRETENEURS = eINSTANCE.getEmploye__Entreteneurs();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.AffectationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__DATE_DEBUT = eINSTANCE.getAffectation_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION__DATE_FIN = eINSTANCE.getAffectation_DateFin();

		/**
		 * The meta object literal for the '<em><b>Emploi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFECTATION__EMPLOI = eINSTANCE.getAffectation_Emploi();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EmploiImpl <em>Emploi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EmploiImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmploi()
		 * @generated
		 */
		EClass EMPLOI = eINSTANCE.getEmploi();

		/**
		 * The meta object literal for the '<em><b>Intitule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOI__INTITULE = eINSTANCE.getEmploi_Intitule();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.AffectationClassificationImpl <em>Affectation Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.AffectationClassificationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAffectationClassification()
		 * @generated
		 */
		EClass AFFECTATION_CLASSIFICATION = eINSTANCE.getAffectationClassification();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION_CLASSIFICATION__DATE_DEBUT = eINSTANCE.getAffectationClassification_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION_CLASSIFICATION__DATE_FIN = eINSTANCE.getAffectationClassification_DateFin();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFECTATION_CLASSIFICATION__CLASSIFICATION = eINSTANCE.getAffectationClassification_Classification();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.FormationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__LIBELLE = eINSTANCE.getFormation_Libelle();

		/**
		 * The meta object literal for the '<em><b>Sessionformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SESSIONFORMATION = eINSTANCE.getFormation_Sessionformation();

		/**
		 * The meta object literal for the '<em><b>Dpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DPC = eINSTANCE.getFormation_Dpc();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.OrganismeFormationImpl <em>Organisme Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.OrganismeFormationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getOrganismeFormation()
		 * @generated
		 */
		EClass ORGANISME_FORMATION = eINSTANCE.getOrganismeFormation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISME_FORMATION__NOM = eINSTANCE.getOrganismeFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISME_FORMATION__FORMATIONS = eINSTANCE.getOrganismeFormation_Formations();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.SessionFormationImpl <em>Session Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.SessionFormationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSessionFormation()
		 * @generated
		 */
		EClass SESSION_FORMATION = eINSTANCE.getSessionFormation();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_FORMATION__DATE_FIN = eINSTANCE.getSessionFormation_DateFin();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_FORMATION__DATE_DEBUT = eINSTANCE.getSessionFormation_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION_FORMATION__DUREE = eINSTANCE.getSessionFormation_Duree();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_FORMATION__EMPLOYES = eINSTANCE.getSessionFormation_Employes();

		/**
		 * The meta object literal for the '<em><b>Appreciations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_FORMATION__APPRECIATIONS = eINSTANCE.getSessionFormation_Appreciations();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EntretienImpl <em>Entretien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EntretienImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEntretien()
		 * @generated
		 */
		EClass ENTRETIEN = eINSTANCE.getEntretien();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN__DATE = eINSTANCE.getEntretien_Date();

		/**
		 * The meta object literal for the '<em><b>Meneur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRETIEN__MENEUR = eINSTANCE.getEntretien_Meneur();

		/**
		 * The meta object literal for the '<em><b>En Cours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN__EN_COURS = eINSTANCE.getEntretien_EnCours();

		/**
		 * The meta object literal for the '<em><b>Fake</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN__FAKE = eINSTANCE.getEntretien_Fake();

		/**
		 * The meta object literal for the '<em><b>Scan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN__SCAN = eINSTANCE.getEntretien_Scan();

		/**
		 * The meta object literal for the '<em><b>Employe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRETIEN___EMPLOYE = eINSTANCE.getEntretien__Employe();

		/**
		 * The meta object literal for the '<em><b>Has Valid Meneur</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRETIEN___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntretien__HasValidMeneur__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl <em>Entretien Professionnel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EntretienProfessionnelImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEntretienProfessionnel()
		 * @generated
		 */
		EClass ENTRETIEN_PROFESSIONNEL = eINSTANCE.getEntretienProfessionnel();

		/**
		 * The meta object literal for the '<em><b>Evolution Depuis Dernier Entretien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN = eINSTANCE.getEntretienProfessionnel_EvolutionDepuisDernierEntretien();

		/**
		 * The meta object literal for the '<em><b>Commentaire Bilan Formation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__COMMENTAIRE_BILAN_FORMATION = eINSTANCE.getEntretienProfessionnel_CommentaireBilanFormation();

		/**
		 * The meta object literal for the '<em><b>Evolution Souhaitee Dans Emploi Actuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL = eINSTANCE.getEntretienProfessionnel_EvolutionSouhaiteeDansEmploiActuel();

		/**
		 * The meta object literal for the '<em><b>Evolution Souhaitee Dans Nouvel Emploi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI = eINSTANCE.getEntretienProfessionnel_EvolutionSouhaiteeDansNouvelEmploi();

		/**
		 * The meta object literal for the '<em><b>Echeance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__ECHEANCE = eINSTANCE.getEntretienProfessionnel_Echeance();

		/**
		 * The meta object literal for the '<em><b>Evolution Souhaitee Competences Acquises</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES = eINSTANCE.getEntretienProfessionnel_EvolutionSouhaiteeCompetencesAcquises();

		/**
		 * The meta object literal for the '<em><b>Evolution Souhaitee Competences Requises</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES = eINSTANCE.getEntretienProfessionnel_EvolutionSouhaiteeCompetencesRequises();

		/**
		 * The meta object literal for the '<em><b>Evolution Souhaitee Moyens Realisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION = eINSTANCE.getEntretienProfessionnel_EvolutionSouhaiteeMoyensRealisation();

		/**
		 * The meta object literal for the '<em><b>Autres Actions Developpement Competences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES = eINSTANCE.getEntretienProfessionnel_AutresActionsDeveloppementCompetences();

		/**
		 * The meta object literal for the '<em><b>Perspectives Evolution Professionnelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE = eINSTANCE.getEntretienProfessionnel_PerspectivesEvolutionProfessionnelle();

		/**
		 * The meta object literal for the '<em><b>Perspectives Evolution Professionnelle Competences Associees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES = eINSTANCE.getEntretienProfessionnel_PerspectivesEvolutionProfessionnelleCompetencesAssociees();

		/**
		 * The meta object literal for the '<em><b>Adequation Projet Pro Besoins Entreprise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE = eINSTANCE.getEntretienProfessionnel_AdequationProjetProBesoinsEntreprise();

		/**
		 * The meta object literal for the '<em><b>Adequation Projet Pro Besoins Entreprise Commentaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE = eINSTANCE.getEntretienProfessionnel_AdequationProjetProBesoinsEntrepriseCommentaire();

		/**
		 * The meta object literal for the '<em><b>Rencontre Rh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH = eINSTANCE.getEntretienProfessionnel_RencontreRh();

		/**
		 * The meta object literal for the '<em><b>Rencontre Rh Commentaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE = eINSTANCE.getEntretienProfessionnel_RencontreRhCommentaire();

		/**
		 * The meta object literal for the '<em><b>Synthese</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRETIEN_PROFESSIONNEL__SYNTHESE = eINSTANCE.getEntretienProfessionnel_Synthese();

		/**
		 * The meta object literal for the '<em><b>Appreciations Session Formation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRETIEN_PROFESSIONNEL__APPRECIATIONS_SESSION_FORMATION = eINSTANCE.getEntretienProfessionnel_AppreciationsSessionFormation();

		/**
		 * The meta object literal for the '<em><b>Souhaits Formation Salarie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_SALARIE = eINSTANCE.getEntretienProfessionnel_SouhaitsFormationSalarie();

		/**
		 * The meta object literal for the '<em><b>Souhaits Formation Evaluateur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_EVALUATEUR = eINSTANCE.getEntretienProfessionnel_SouhaitsFormationEvaluateur();

		/**
		 * The meta object literal for the '<em><b>Has Valid Synthese</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRETIEN_PROFESSIONNEL___HAS_VALID_SYNTHESE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntretienProfessionnel__HasValidSynthese__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl <em>Appreciation Session Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAppreciationSessionFormation()
		 * @generated
		 */
		EClass APPRECIATION_SESSION_FORMATION = eINSTANCE.getAppreciationSessionFormation();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPRECIATION_SESSION_FORMATION__VALEUR = eINSTANCE.getAppreciationSessionFormation_Valeur();

		/**
		 * The meta object literal for the '<em><b>Session Formation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPRECIATION_SESSION_FORMATION__SESSION_FORMATION = eINSTANCE.getAppreciationSessionFormation_SessionFormation();

		/**
		 * The meta object literal for the '<em><b>Id Formation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPRECIATION_SESSION_FORMATION__ID_FORMATION = eINSTANCE.getAppreciationSessionFormation_IdFormation();

		/**
		 * The meta object literal for the '<em><b>Libelle Formation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPRECIATION_SESSION_FORMATION__LIBELLE_FORMATION = eINSTANCE.getAppreciationSessionFormation_LibelleFormation();

		/**
		 * The meta object literal for the '<em><b>Date Formation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPRECIATION_SESSION_FORMATION__DATE_FORMATION = eINSTANCE.getAppreciationSessionFormation_DateFormation();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl <em>Souhait Formation Evaluateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSouhaitFormationEvaluateur()
		 * @generated
		 */
		EClass SOUHAIT_FORMATION_EVALUATEUR = eINSTANCE.getSouhaitFormationEvaluateur();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUHAIT_FORMATION_EVALUATEUR__TEXTE = eINSTANCE.getSouhaitFormationEvaluateur_Texte();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUHAIT_FORMATION_EVALUATEUR__ID = eINSTANCE.getSouhaitFormationEvaluateur_Id();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl <em>Souhait Formation Salarie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getSouhaitFormationSalarie()
		 * @generated
		 */
		EClass SOUHAIT_FORMATION_SALARIE = eINSTANCE.getSouhaitFormationSalarie();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUHAIT_FORMATION_SALARIE__TEXTE = eINSTANCE.getSouhaitFormationSalarie_Texte();

		/**
		 * The meta object literal for the '<em><b>Avis Evaluateur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR = eINSTANCE.getSouhaitFormationSalarie_AvisEvaluateur();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOUHAIT_FORMATION_SALARIE__ID = eINSTANCE.getSouhaitFormationSalarie_Id();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.MutualiteImpl <em>Mutualite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.MutualiteImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getMutualite()
		 * @generated
		 */
		EClass MUTUALITE = eINSTANCE.getMutualite();

		/**
		 * The meta object literal for the '<em><b>Etablissements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUALITE__ETABLISSEMENTS = eINSTANCE.getMutualite_Etablissements();

		/**
		 * The meta object literal for the '<em><b>Emplois</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUALITE__EMPLOIS = eINSTANCE.getMutualite_Emplois();

		/**
		 * The meta object literal for the '<em><b>Effectif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUALITE__EFFECTIF = eINSTANCE.getMutualite_Effectif();

		/**
		 * The meta object literal for the '<em><b>Organismes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUALITE__ORGANISMES = eINSTANCE.getMutualite_Organismes();

		/**
		 * The meta object literal for the '<em><b>Utilisateurs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUTUALITE__UTILISATEURS = eINSTANCE.getMutualite_Utilisateurs();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EtablissementsImpl <em>Etablissements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EtablissementsImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEtablissements()
		 * @generated
		 */
		EClass ETABLISSEMENTS = eINSTANCE.getEtablissements();

		/**
		 * The meta object literal for the '<em><b>Etablissements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLISSEMENTS__ETABLISSEMENTS = eINSTANCE.getEtablissements_Etablissements();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EmploisImpl <em>Emplois</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EmploisImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEmplois()
		 * @generated
		 */
		EClass EMPLOIS = eINSTANCE.getEmplois();

		/**
		 * The meta object literal for the '<em><b>Emplois</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOIS__EMPLOIS = eINSTANCE.getEmplois_Emplois();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.EffectifImpl <em>Effectif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.EffectifImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getEffectif()
		 * @generated
		 */
		EClass EFFECTIF = eINSTANCE.getEffectif();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECTIF__EMPLOYES = eINSTANCE.getEffectif_Employes();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.impl.OrganismesImpl <em>Organismes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.impl.OrganismesImpl
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getOrganismes()
		 * @generated
		 */
		EClass ORGANISMES = eINSTANCE.getOrganismes();

		/**
		 * The meta object literal for the '<em><b>Organisme Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISMES__ORGANISME_FORMATIONS = eINSTANCE.getOrganismes_OrganismeFormations();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.ClassificationStatut <em>Classification Statut</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.ClassificationStatut
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getClassificationStatut()
		 * @generated
		 */
		EEnum CLASSIFICATION_STATUT = eINSTANCE.getClassificationStatut();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.Appreciation <em>Appreciation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.Appreciation
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAppreciation()
		 * @generated
		 */
		EEnum APPRECIATION = eINSTANCE.getAppreciation();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.Avis <em>Avis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.Avis
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getAvis()
		 * @generated
		 */
		EEnum AVIS = eINSTANCE.getAvis();

		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.Role
		 * @see fr.mutualite.rh.model.impl.MutPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //MutPackage
