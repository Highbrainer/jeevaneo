/**
 */
package fr.mutualite.rh.conges.impl;

import fr.mutualite.rh.conges.Conge;
import fr.mutualite.rh.conges.CongesPackage;

import fr.mutualite.rh.conges.TypeConge;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.conges.impl.CongeImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.CongeImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.CongeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.mutualite.rh.conges.impl.CongeImpl#getDecompte <em>Decompte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CongeImpl extends MinimalEObjectImpl.Container implements Conge {
	/**
	 * The default value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Date debut = DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Date fin = FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeConge TYPE_EDEFAULT = TypeConge.CP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeConge type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecompte() <em>Decompte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompte()
	 * @generated
	 * @ordered
	 */
	protected static final int DECOMPTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecompte() <em>Decompte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompte()
	 * @generated
	 * @ordered
	 */
	protected int decompte = DECOMPTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CongeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CongesPackage.Literals.CONGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebut(Date newDebut) {
		Date oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.CONGE__DEBUT, oldDebut, debut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(Date newFin) {
		Date oldFin = fin;
		fin = newFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.CONGE__FIN, oldFin, fin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConge getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeConge newType) {
		TypeConge oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.CONGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecompte() {
		return decompte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompte(int newDecompte) {
		int oldDecompte = decompte;
		decompte = newDecompte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CongesPackage.CONGE__DECOMPTE, oldDecompte, decompte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CongesPackage.CONGE__DEBUT:
				return getDebut();
			case CongesPackage.CONGE__FIN:
				return getFin();
			case CongesPackage.CONGE__TYPE:
				return getType();
			case CongesPackage.CONGE__DECOMPTE:
				return getDecompte();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CongesPackage.CONGE__DEBUT:
				setDebut((Date)newValue);
				return;
			case CongesPackage.CONGE__FIN:
				setFin((Date)newValue);
				return;
			case CongesPackage.CONGE__TYPE:
				setType((TypeConge)newValue);
				return;
			case CongesPackage.CONGE__DECOMPTE:
				setDecompte((Integer)newValue);
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
			case CongesPackage.CONGE__DEBUT:
				setDebut(DEBUT_EDEFAULT);
				return;
			case CongesPackage.CONGE__FIN:
				setFin(FIN_EDEFAULT);
				return;
			case CongesPackage.CONGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CongesPackage.CONGE__DECOMPTE:
				setDecompte(DECOMPTE_EDEFAULT);
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
			case CongesPackage.CONGE__DEBUT:
				return DEBUT_EDEFAULT == null ? debut != null : !DEBUT_EDEFAULT.equals(debut);
			case CongesPackage.CONGE__FIN:
				return FIN_EDEFAULT == null ? fin != null : !FIN_EDEFAULT.equals(fin);
			case CongesPackage.CONGE__TYPE:
				return type != TYPE_EDEFAULT;
			case CongesPackage.CONGE__DECOMPTE:
				return decompte != DECOMPTE_EDEFAULT;
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
		result.append(" (debut: ");
		result.append(debut);
		result.append(", fin: ");
		result.append(fin);
		result.append(", type: ");
		result.append(type);
		result.append(", decompte: ");
		result.append(decompte);
		result.append(')');
		return result.toString();
	}

} //CongeImpl
