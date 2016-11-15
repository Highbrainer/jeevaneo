/**
 */
package fr.mutualite.rh.model.dto;

import fr.mutualite.rh.model.Entretien;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getService <em>Service</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getPoste <em>Poste</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getMenePar <em>Mene Par</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getEntretien <em>Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDate <em>Date</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getAnciennete <em>Anciennete</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise <em>Date Entree Entreprise</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Formulaire extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Prenom()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Returns the value of the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricule</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Matricule()
	 * @model id="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Nom()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Returns the value of the '<em><b>Diplomes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diplomes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diplomes</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Diplomes()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDiplomes();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Service()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getService();

	/**
	 * Returns the value of the '<em><b>Poste</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poste</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poste</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Poste()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getPoste();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Responsable()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getResponsable();

	/**
	 * Returns the value of the '<em><b>Mene Par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mene Par</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mene Par</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_MenePar()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getMenePar();

	/**
	 * Returns the value of the '<em><b>Entretien</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entretien</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entretien</em>' reference.
	 * @see #setEntretien(Entretien)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Entretien()
	 * @model required="true"
	 * @generated
	 */
	Entretien getEntretien();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.Formulaire#getEntretien <em>Entretien</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entretien</em>' reference.
	 * @see #getEntretien()
	 * @generated
	 */
	void setEntretien(Entretien value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Date()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Returns the value of the '<em><b>Date Precedent Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Precedent Entretien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Precedent Entretien</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_DatePrecedentEntretien()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getDatePrecedentEntretien();

	/**
	 * Returns the value of the '<em><b>Anciennete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anciennete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anciennete</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_Anciennete()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getAnciennete();

	/**
	 * Returns the value of the '<em><b>Date Entree Entreprise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Entree Entreprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Entree Entreprise</em>' attribute.
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getFormulaire_DateEntreeEntreprise()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getDateEntreeEntreprise();

} // Formulaire
