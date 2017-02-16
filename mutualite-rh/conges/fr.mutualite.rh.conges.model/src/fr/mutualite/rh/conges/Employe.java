/**
 */
package fr.mutualite.rh.conges;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.conges.Employe#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.Employe#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.Employe#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.Employe#getConges <em>Conges</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.conges.CongesPackage#getEmploye()
 * @model
 * @generated
 */
public interface Employe extends EObject {
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
	 * @see fr.mutualite.rh.conges.CongesPackage#getEmploye_Matricule()
	 * @model
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.conges.Employe#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

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
	 * @see fr.mutualite.rh.conges.CongesPackage#getEmploye_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.conges.Employe#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissement</em>' attribute.
	 * @see #setEtablissement(float)
	 * @see fr.mutualite.rh.conges.CongesPackage#getEmploye_Etablissement()
	 * @model
	 * @generated
	 */
	float getEtablissement();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.conges.Employe#getEtablissement <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissement</em>' attribute.
	 * @see #getEtablissement()
	 * @generated
	 */
	void setEtablissement(float value);

	/**
	 * Returns the value of the '<em><b>Conges</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.conges.Conge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conges</em>' containment reference list.
	 * @see fr.mutualite.rh.conges.CongesPackage#getEmploye_Conges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conge> getConges();

} // Employe
