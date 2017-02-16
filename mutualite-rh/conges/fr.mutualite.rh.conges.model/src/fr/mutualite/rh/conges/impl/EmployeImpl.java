/**
 */
package fr.mutualite.rh.conges.impl;

import fr.mutualite.rh.conges.Conge;
import fr.mutualite.rh.conges.CongesPackage;
import fr.mutualite.rh.conges.Employe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.conges.impl.EmployeImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.EmployeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.EmployeImpl#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.EmployeImpl#getConges <em>Conges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends MinimalEObjectImpl.Container implements Employe {
	/**
	 * The default value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected int matricule = MATRICULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtablissement() <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissement()
	 * @generated
	 * @ordered
	 */
	protected static final float ETABLISSEMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEtablissement() <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissement()
	 * @generated
	 * @ordered
	 */
	protected float etablissement = ETABLISSEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConges() <em>Conges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConges()
	 * @generated
	 * @ordered
	 */
	protected EList<Conge> conges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CongesPackage.Literals.EMPLOYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		int oldMatricule = matricule;
		matricule = newMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.EMPLOYE__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.EMPLOYE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEtablissement() {
		return etablissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissement(float newEtablissement) {
		float oldEtablissement = etablissement;
		etablissement = newEtablissement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.EMPLOYE__ETABLISSEMENT, oldEtablissement, etablissement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conge> getConges() {
		if (conges == null) {
			conges = new EObjectContainmentEList<Conge>(Conge.class, this, CongesPackage.EMPLOYE__CONGES);
		}
		return conges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CongesPackage.EMPLOYE__CONGES:
				return ((InternalEList<?>)getConges()).basicRemove(otherEnd, msgs);
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
			case CongesPackage.EMPLOYE__MATRICULE:
				return getMatricule();
			case CongesPackage.EMPLOYE__NOM:
				return getNom();
			case CongesPackage.EMPLOYE__ETABLISSEMENT:
				return getEtablissement();
			case CongesPackage.EMPLOYE__CONGES:
				return getConges();
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
			case CongesPackage.EMPLOYE__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case CongesPackage.EMPLOYE__NOM:
				setNom((String)newValue);
				return;
			case CongesPackage.EMPLOYE__ETABLISSEMENT:
				setEtablissement((Float)newValue);
				return;
			case CongesPackage.EMPLOYE__CONGES:
				getConges().clear();
				getConges().addAll((Collection<? extends Conge>)newValue);
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
			case CongesPackage.EMPLOYE__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case CongesPackage.EMPLOYE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case CongesPackage.EMPLOYE__ETABLISSEMENT:
				setEtablissement(ETABLISSEMENT_EDEFAULT);
				return;
			case CongesPackage.EMPLOYE__CONGES:
				getConges().clear();
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
			case CongesPackage.EMPLOYE__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
			case CongesPackage.EMPLOYE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case CongesPackage.EMPLOYE__ETABLISSEMENT:
				return etablissement != ETABLISSEMENT_EDEFAULT;
			case CongesPackage.EMPLOYE__CONGES:
				return conges != null && !conges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matricule: ");
		result.append(matricule);
		result.append(", nom: ");
		result.append(nom);
		result.append(", etablissement: ");
		result.append(etablissement);
		result.append(')');
		return result.toString();
	}

} //EmployeImpl
