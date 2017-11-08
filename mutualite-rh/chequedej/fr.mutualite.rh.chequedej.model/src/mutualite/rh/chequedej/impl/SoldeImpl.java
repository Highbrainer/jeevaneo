/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solde</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.SoldeImpl#getSoldesIndividuels <em>Soldes Individuels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoldeImpl extends MinimalEObjectImpl.Container implements Solde {
	/**
	 * The cached value of the '{@link #getSoldesIndividuels() <em>Soldes Individuels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldesIndividuels()
	 * @generated
	 * @ordered
	 */
	protected EList<SoldeIndividuel> soldesIndividuels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoldeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.SOLDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoldeIndividuel> getSoldesIndividuels() {
		if (soldesIndividuels == null) {
			soldesIndividuels = new EObjectContainmentEList<SoldeIndividuel>(SoldeIndividuel.class, this, ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS);
		}
		return soldesIndividuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SoldeIndividuel getOrCreateSoldeIndividual(int matricule, int annee) {
		SoldeIndividuel soldeIndividual = getSoldeIndividual(matricule, annee);
		if(null!=soldeIndividual) {
			return soldeIndividual;
		}
		SoldeIndividuel si = ChequedejFactory.eINSTANCE.createSoldeIndividuel();
		si.setMatricule(matricule);
		si.setAnnee(annee);
		si.setNbCheques(0);
		getSoldesIndividuels().add(si);
		return si;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getSolde(int matricule, int annee) {
		Optional<SoldeIndividuel> opt = getSoldesIndividuels().stream().filter(si -> si.getMatricule()==matricule && si.getAnnee()==annee).findAny();
		if(opt.isPresent()) {
			return opt.get().getNbCheques();
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int annee(String mois) {
		return Integer.parseInt(mois.substring(0, 4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SoldeIndividuel getSoldeIndividual(int matricule, int annee) {
		return getSoldesIndividuels().stream().filter(si -> si.getMatricule()==matricule && si.getAnnee()==annee).findAny().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS:
				return ((InternalEList<?>)getSoldesIndividuels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS:
				return getSoldesIndividuels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS:
				getSoldesIndividuels().clear();
				getSoldesIndividuels().addAll((Collection<? extends SoldeIndividuel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS:
				getSoldesIndividuels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChequedejPackage.SOLDE__SOLDES_INDIVIDUELS:
				return soldesIndividuels != null && !soldesIndividuels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ChequedejPackage.SOLDE___GET_OR_CREATE_SOLDE_INDIVIDUAL__INT_INT:
				return getOrCreateSoldeIndividual((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ChequedejPackage.SOLDE___GET_SOLDE__INT_INT:
				return getSolde((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ChequedejPackage.SOLDE___ANNEE__STRING:
				return annee((String)arguments.get(0));
			case ChequedejPackage.SOLDE___GET_SOLDE_INDIVIDUAL__INT_INT:
				return getSoldeIndividual((Integer)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SoldeImpl
