/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Souhait Formation Salarie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getAvisEvaluateur <em>Avis Evaluateur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getSouhaitFormationSalarie()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SouhaitFormationSalarie extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see fr.mutualite.rh.model.MutPackage#getSouhaitFormationSalarie_Texte()
	 * @model required="true"
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Avis Evaluateur</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Avis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avis Evaluateur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avis Evaluateur</em>' attribute.
	 * @see fr.mutualite.rh.model.Avis
	 * @see #setAvisEvaluateur(Avis)
	 * @see fr.mutualite.rh.model.MutPackage#getSouhaitFormationSalarie_AvisEvaluateur()
	 * @model required="true"
	 * @generated
	 */
	Avis getAvisEvaluateur();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.SouhaitFormationSalarie#getAvisEvaluateur <em>Avis Evaluateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avis Evaluateur</em>' attribute.
	 * @see fr.mutualite.rh.model.Avis
	 * @see #getAvisEvaluateur()
	 * @generated
	 */
	void setAvisEvaluateur(Avis value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see fr.mutualite.rh.model.MutPackage#getSouhaitFormationSalarie_Id()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getId();

} // SouhaitFormationSalarie
