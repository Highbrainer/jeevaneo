/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etablissement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Etablissement#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Etablissement#getEmployes <em>Employes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Etablissement#getId <em>Id</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Etablissement#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Etablissement#getEntreteneurs <em>Entreteneurs</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEtablissement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Etablissement extends CDOObject {
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
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissement_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Etablissement#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEtablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissement_Employes()
	 * @see fr.mutualite.rh.model.Employe#getEtablissement
	 * @model opposite="etablissement" required="true"
	 * @generated
	 */
	EList<Employe> getEmployes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissement_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Etablissement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEtablissementsEnResponsabilite <em>Etablissements En Responsabilite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Employe)
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissement_Responsable()
	 * @see fr.mutualite.rh.model.Employe#getEtablissementsEnResponsabilite
	 * @model opposite="etablissementsEnResponsabilite"
	 * @generated
	 */
	Employe getResponsable();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Etablissement#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Employe value);

	/**
	 * Returns the value of the '<em><b>Entreteneurs</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEtablissementsEntretenus <em>Etablissements Entretenus</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreteneurs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreteneurs</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissement_Entreteneurs()
	 * @see fr.mutualite.rh.model.Employe#getEtablissementsEntretenus
	 * @model opposite="etablissementsEntretenus"
	 * @generated
	 */
	EList<Employe> getEntreteneurs();

} // Etablissement
