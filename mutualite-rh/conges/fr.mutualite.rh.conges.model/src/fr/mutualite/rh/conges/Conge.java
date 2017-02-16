/**
 */
package fr.mutualite.rh.conges;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.conges.Conge#getDebut <em>Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.Conge#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.conges.CongesPackage#getConge()
 * @model
 * @generated
 */
public interface Conge extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(Date)
	 * @see fr.mutualite.rh.conges.CongesPackage#getConge_Debut()
	 * @model
	 * @generated
	 */
	Date getDebut();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.conges.Conge#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(Date)
	 * @see fr.mutualite.rh.conges.CongesPackage#getConge_Fin()
	 * @model
	 * @generated
	 */
	Date getFin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.conges.Conge#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Date value);

} // Conge
