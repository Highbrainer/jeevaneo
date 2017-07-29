/**
 */
package mutualite.rh.chequedej;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Commande#getDate <em>Date</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Commande#getItems <em>Items</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Commande#getParticipationPatronale <em>Participation Patronale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Commande#getValeurNominale <em>Valeur Nominale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Commande#getMois <em>Mois</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande()
 * @model
 * @generated
 */
public interface Commande extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Commande#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Participation Patronale</b></em>' attribute.
	 * The default value is <code>"3.58"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participation Patronale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation Patronale</em>' attribute.
	 * @see #setParticipationPatronale(float)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande_ParticipationPatronale()
	 * @model default="3.58" required="true"
	 * @generated
	 */
	float getParticipationPatronale();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Commande#getParticipationPatronale <em>Participation Patronale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participation Patronale</em>' attribute.
	 * @see #getParticipationPatronale()
	 * @generated
	 */
	void setParticipationPatronale(float value);

	/**
	 * Returns the value of the '<em><b>Valeur Nominale</b></em>' attribute.
	 * The default value is <code>"6.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur Nominale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Nominale</em>' attribute.
	 * @see #setValeurNominale(float)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande_ValeurNominale()
	 * @model default="6.5" required="true"
	 * @generated
	 */
	float getValeurNominale();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Commande#getValeurNominale <em>Valeur Nominale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Nominale</em>' attribute.
	 * @see #getValeurNominale()
	 * @generated
	 */
	void setValeurNominale(float value);

	/**
	 * Returns the value of the '<em><b>Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mois</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mois</em>' attribute.
	 * @see #setMois(String)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCommande_Mois()
	 * @model required="true"
	 * @generated
	 */
	String getMois();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Commande#getMois <em>Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mois</em>' attribute.
	 * @see #getMois()
	 * @generated
	 */
	void setMois(String value);

} // Commande
