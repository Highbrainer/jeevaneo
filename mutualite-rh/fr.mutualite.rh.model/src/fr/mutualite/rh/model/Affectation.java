/**
 */
package fr.mutualite.rh.model;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Affectation#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Affectation#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Affectation#getEmploi <em>Emploi</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getAffectation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Affectation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectation_DateDebut()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Affectation#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectation_DateFin()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Affectation#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Emploi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emploi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emploi</em>' reference.
	 * @see #setEmploi(Emploi)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectation_Emploi()
	 * @model required="true"
	 * @generated
	 */
	Emploi getEmploi();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Affectation#getEmploi <em>Emploi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emploi</em>' reference.
	 * @see #getEmploi()
	 * @generated
	 */
	void setEmploi(Emploi value);

} // Affectation
