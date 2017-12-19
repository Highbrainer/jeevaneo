/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solde</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Solde#getSoldesIndividuels <em>Soldes Individuels</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getSolde()
 * @model
 * @generated
 */
public interface Solde extends EObject {
	/**
	 * Returns the value of the '<em><b>Soldes Individuels</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.SoldeIndividuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soldes Individuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soldes Individuels</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSolde_SoldesIndividuels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoldeIndividuel> getSoldesIndividuels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SoldeIndividuel getOrCreateSoldeIndividual(int matricule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getSolde(int matricule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int annee(String mois);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SoldeIndividuel getSoldeIndividual(int matricule);

} // Solde
