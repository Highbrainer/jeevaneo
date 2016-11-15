/**
 */
package fr.mutualite.rh.model;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Employe#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getNomJeuneFille <em>Nom Jeune Fille</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getDateEmbauche <em>Date Embauche</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getAffectationsEmploi <em>Affectations Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getAffectationEmploiCourante <em>Affectation Emploi Courante</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getAffectationsClassification <em>Affectations Classification</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getAffectationClassificationCourante <em>Affectation Classification Courante</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getSessionsFormation <em>Sessions Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEntretiens <em>Entretiens</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEntretiensMenes <em>Entretiens Menes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getDateSortieEntreprise <em>Date Sortie Entreprise</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getSubalternes <em>Subalternes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEtablissementsEnResponsabilite <em>Etablissements En Responsabilite</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEntreteneurs <em>Entreteneurs</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getEmployesEntretenus <em>Employes Entretenus</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Employe#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEmploye()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Employe extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricule</em>' attribute.
	 * @see #setMatricule(int)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Matricule()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Prenom()
	 * @model required="true"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Nom Jeune Fille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Jeune Fille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Jeune Fille</em>' attribute.
	 * @see #setNomJeuneFille(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_NomJeuneFille()
	 * @model
	 * @generated
	 */
	String getNomJeuneFille();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getNomJeuneFille <em>Nom Jeune Fille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Jeune Fille</em>' attribute.
	 * @see #getNomJeuneFille()
	 * @generated
	 */
	void setNomJeuneFille(String value);

	/**
	 * Returns the value of the '<em><b>Date Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Naissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Naissance</em>' attribute.
	 * @see #setDateNaissance(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_DateNaissance()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateNaissance();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getDateNaissance <em>Date Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Naissance</em>' attribute.
	 * @see #getDateNaissance()
	 * @generated
	 */
	void setDateNaissance(Date value);

	/**
	 * Returns the value of the '<em><b>Date Embauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Embauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Embauche</em>' attribute.
	 * @see #setDateEmbauche(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_DateEmbauche()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateEmbauche();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getDateEmbauche <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Embauche</em>' attribute.
	 * @see #getDateEmbauche()
	 * @generated
	 */
	void setDateEmbauche(Date value);

	/**
	 * Returns the value of the '<em><b>Diplomes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diplomes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diplomes</em>' attribute list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Diplomes()
	 * @model
	 * @generated
	 */
	EList<String> getDiplomes();

	/**
	 * Returns the value of the '<em><b>Etablissement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Etablissement#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissement</em>' reference.
	 * @see #setEtablissement(Etablissement)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Etablissement()
	 * @see fr.mutualite.rh.model.Etablissement#getEmployes
	 * @model opposite="employes" required="true"
	 * @generated
	 */
	Etablissement getEtablissement();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getEtablissement <em>Etablissement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissement</em>' reference.
	 * @see #getEtablissement()
	 * @generated
	 */
	void setEtablissement(Etablissement value);

	/**
	 * Returns the value of the '<em><b>Affectations Emploi</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Affectation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectations Emploi</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectations Emploi</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_AffectationsEmploi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Affectation> getAffectationsEmploi();

	/**
	 * Returns the value of the '<em><b>Affectation Emploi Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectation Emploi Courante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectation Emploi Courante</em>' reference.
	 * @see #setAffectationEmploiCourante(Affectation)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_AffectationEmploiCourante()
	 * @model required="true"
	 * @generated
	 */
	Affectation getAffectationEmploiCourante();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getAffectationEmploiCourante <em>Affectation Emploi Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affectation Emploi Courante</em>' reference.
	 * @see #getAffectationEmploiCourante()
	 * @generated
	 */
	void setAffectationEmploiCourante(Affectation value);

	/**
	 * Returns the value of the '<em><b>Affectations Classification</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.AffectationClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectations Classification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectations Classification</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_AffectationsClassification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AffectationClassification> getAffectationsClassification();

	/**
	 * Returns the value of the '<em><b>Affectation Classification Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affectation Classification Courante</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affectation Classification Courante</em>' reference.
	 * @see #setAffectationClassificationCourante(AffectationClassification)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_AffectationClassificationCourante()
	 * @model required="true"
	 * @generated
	 */
	AffectationClassification getAffectationClassificationCourante();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getAffectationClassificationCourante <em>Affectation Classification Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affectation Classification Courante</em>' reference.
	 * @see #getAffectationClassificationCourante()
	 * @generated
	 */
	void setAffectationClassificationCourante(AffectationClassification value);

	/**
	 * Returns the value of the '<em><b>Sessions Formation</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.SessionFormation}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.SessionFormation#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions Formation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions Formation</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_SessionsFormation()
	 * @see fr.mutualite.rh.model.SessionFormation#getEmployes
	 * @model opposite="employes"
	 * @generated
	 */
	EList<SessionFormation> getSessionsFormation();

	/**
	 * Returns the value of the '<em><b>Entretiens</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Entretien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entretiens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entretiens</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Entretiens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entretien> getEntretiens();

	/**
	 * Returns the value of the '<em><b>Entretiens Menes</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Entretien}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Entretien#getMeneur <em>Meneur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entretiens Menes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entretiens Menes</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_EntretiensMenes()
	 * @see fr.mutualite.rh.model.Entretien#getMeneur
	 * @model opposite="meneur"
	 * @generated
	 */
	EList<Entretien> getEntretiensMenes();

	/**
	 * Returns the value of the '<em><b>Date Sortie Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Sortie Entreprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Sortie Entreprise</em>' attribute.
	 * @see #setDateSortieEntreprise(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_DateSortieEntreprise()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateSortieEntreprise();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getDateSortieEntreprise <em>Date Sortie Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sortie Entreprise</em>' attribute.
	 * @see #getDateSortieEntreprise()
	 * @generated
	 */
	void setDateSortieEntreprise(Date value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getSubalternes <em>Subalternes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Employe)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Responsable()
	 * @see fr.mutualite.rh.model.Employe#getSubalternes
	 * @model opposite="subalternes" required="true"
	 * @generated
	 */
	Employe getResponsable();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Employe#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Employe value);

	/**
	 * Returns the value of the '<em><b>Subalternes</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subalternes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subalternes</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Subalternes()
	 * @see fr.mutualite.rh.model.Employe#getResponsable
	 * @model opposite="responsable"
	 * @generated
	 */
	EList<Employe> getSubalternes();

	/**
	 * Returns the value of the '<em><b>Etablissements En Responsabilite</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Etablissement}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Etablissement#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissements En Responsabilite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissements En Responsabilite</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_EtablissementsEnResponsabilite()
	 * @see fr.mutualite.rh.model.Etablissement#getResponsable
	 * @model opposite="responsable"
	 * @generated
	 */
	EList<Etablissement> getEtablissementsEnResponsabilite();

	/**
	 * Returns the value of the '<em><b>Entreteneurs</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEmployesEntretenus <em>Employes Entretenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreteneurs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreteneurs</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Entreteneurs()
	 * @see fr.mutualite.rh.model.Employe#getEmployesEntretenus
	 * @model opposite="employesEntretenus" required="true"
	 * @generated
	 */
	EList<Employe> getEntreteneurs();

	/**
	 * Returns the value of the '<em><b>Employes Entretenus</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEntreteneurs <em>Entreteneurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employes Entretenus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes Entretenus</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_EmployesEntretenus()
	 * @see fr.mutualite.rh.model.Employe#getEntreteneurs
	 * @model opposite="entreteneurs"
	 * @generated
	 */
	EList<Employe> getEmployesEntretenus();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see fr.mutualite.rh.model.MutPackage#getEmploye_Label()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasValidAffectationEmploiCourante(DiagnosticChain chain, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasOneAndOnlyOneAffectationEmploiCourante(DiagnosticChain chain, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasOneAndOnlyOneAffectationClassificationCourante(DiagnosticChain chain, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasValidAffectationClassificationCourante(DiagnosticChain chain, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Employe responsable();

} // Employe
