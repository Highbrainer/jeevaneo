/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque Dej</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#getCarnet <em>Carnet</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#getValeurNominale <em>Valeur Nominale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#getParticipationPatronale <em>Participation Patronale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#getParametrage <em>Parametrage</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej()
 * @model
 * @generated
 */
public interface ChequeDej extends EObject {
	/**
	 * Returns the value of the '<em><b>Carnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carnet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carnet</em>' containment reference.
	 * @see #setCarnet(Carnet)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej_Carnet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Carnet getCarnet();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChequeDej#getCarnet <em>Carnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carnet</em>' containment reference.
	 * @see #getCarnet()
	 * @generated
	 */
	void setCarnet(Carnet value);

	/**
	 * Returns the value of the '<em><b>Valeur Nominale</b></em>' attribute.
	 * The default value is <code>"6.7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur Nominale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Nominale</em>' attribute.
	 * @see #setValeurNominale(float)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej_ValeurNominale()
	 * @model default="6.7" required="true"
	 * @generated
	 */
	float getValeurNominale();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChequeDej#getValeurNominale <em>Valeur Nominale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Nominale</em>' attribute.
	 * @see #getValeurNominale()
	 * @generated
	 */
	void setValeurNominale(float value);

	/**
	 * Returns the value of the '<em><b>Participation Patronale</b></em>' attribute.
	 * The default value is <code>"3.69"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participation Patronale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation Patronale</em>' attribute.
	 * @see #setParticipationPatronale(float)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej_ParticipationPatronale()
	 * @model default="3.69" required="true"
	 * @generated
	 */
	float getParticipationPatronale();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChequeDej#getParticipationPatronale <em>Participation Patronale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participation Patronale</em>' attribute.
	 * @see #getParticipationPatronale()
	 * @generated
	 */
	void setParticipationPatronale(float value);

	/**
	 * Returns the value of the '<em><b>Etablissements Virtuels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissements Virtuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissements Virtuels</em>' containment reference.
	 * @see #setEtablissementsVirtuels(EtablissementsVirtuels)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej_EtablissementsVirtuels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EtablissementsVirtuels getEtablissementsVirtuels();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChequeDej#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissements Virtuels</em>' containment reference.
	 * @see #getEtablissementsVirtuels()
	 * @generated
	 */
	void setEtablissementsVirtuels(EtablissementsVirtuels value);

	/**
	 * Returns the value of the '<em><b>Parametrage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametrage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametrage</em>' containment reference.
	 * @see #setParametrage(Parametrage)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChequeDej_Parametrage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parametrage getParametrage();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChequeDej#getParametrage <em>Parametrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametrage</em>' containment reference.
	 * @see #getParametrage()
	 * @generated
	 */
	void setParametrage(Parametrage value);

} // ChequeDej
