/**
 */
package mutualite.rh.chequedej;

import java.time.LocalDate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Carnet#getCommandes <em>Commandes</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getCarnet()
 * @model
 * @generated
 */
public interface Carnet extends EObject {
	
	LocalDate mois(String mois);
	
	/**
	 * Returns the value of the '<em><b>Commandes</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.Commande}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commandes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commandes</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCarnet_Commandes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commande> getCommandes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ChequeDej root();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Commande getOrCreateCommande(String mois);

	String formatMois(LocalDate month);

} // Carnet
