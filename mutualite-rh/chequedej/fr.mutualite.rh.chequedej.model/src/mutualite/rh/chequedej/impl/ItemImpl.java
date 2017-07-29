/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Succursale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getSuccursale <em>Succursale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getNbCheques <em>Nb Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getNbJoursEntiersMoisPrecedent <em>Nb Jours Entiers Mois Precedent</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getNbJoursEntiersMoisSuivant <em>Nb Jours Entiers Mois Suivant</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ItemImpl#getPrenom <em>Prenom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The cached value of the '{@link #getSuccursale() <em>Succursale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccursale()
	 * @generated
	 * @ordered
	 */
	protected Succursale succursale;

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
	 * The default value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CHEQUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected int nbCheques = NB_CHEQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbJoursEntiersMoisPrecedent() <em>Nb Jours Entiers Mois Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJoursEntiersMoisPrecedent()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_JOURS_ENTIERS_MOIS_PRECEDENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbJoursEntiersMoisPrecedent() <em>Nb Jours Entiers Mois Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJoursEntiersMoisPrecedent()
	 * @generated
	 * @ordered
	 */
	protected int nbJoursEntiersMoisPrecedent = NB_JOURS_ENTIERS_MOIS_PRECEDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbJoursEntiersMoisSuivant() <em>Nb Jours Entiers Mois Suivant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJoursEntiersMoisSuivant()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_JOURS_ENTIERS_MOIS_SUIVANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbJoursEntiersMoisSuivant() <em>Nb Jours Entiers Mois Suivant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJoursEntiersMoisSuivant()
	 * @generated
	 * @ordered
	 */
	protected int nbJoursEntiersMoisSuivant = NB_JOURS_ENTIERS_MOIS_SUIVANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succursale getSuccursale() {
		if (succursale != null && succursale.eIsProxy()) {
			InternalEObject oldSuccursale = (InternalEObject)succursale;
			succursale = (Succursale)eResolveProxy(oldSuccursale);
			if (succursale != oldSuccursale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChequedejPackage.ITEM__SUCCURSALE, oldSuccursale, succursale));
			}
		}
		return succursale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succursale basicGetSuccursale() {
		return succursale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccursale(Succursale newSuccursale) {
		Succursale oldSuccursale = succursale;
		succursale = newSuccursale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__SUCCURSALE, oldSuccursale, succursale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCheques() {
		return nbCheques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCheques(int newNbCheques) {
		int oldNbCheques = nbCheques;
		nbCheques = newNbCheques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__NB_CHEQUES, oldNbCheques, nbCheques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbJoursEntiersMoisPrecedent() {
		return nbJoursEntiersMoisPrecedent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbJoursEntiersMoisPrecedent(int newNbJoursEntiersMoisPrecedent) {
		int oldNbJoursEntiersMoisPrecedent = nbJoursEntiersMoisPrecedent;
		nbJoursEntiersMoisPrecedent = newNbJoursEntiersMoisPrecedent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT, oldNbJoursEntiersMoisPrecedent, nbJoursEntiersMoisPrecedent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbJoursEntiersMoisSuivant() {
		return nbJoursEntiersMoisSuivant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbJoursEntiersMoisSuivant(int newNbJoursEntiersMoisSuivant) {
		int oldNbJoursEntiersMoisSuivant = nbJoursEntiersMoisSuivant;
		nbJoursEntiersMoisSuivant = newNbJoursEntiersMoisSuivant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT, oldNbJoursEntiersMoisSuivant, nbJoursEntiersMoisSuivant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ITEM__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.ITEM__SUCCURSALE:
				if (resolve) return getSuccursale();
				return basicGetSuccursale();
			case ChequedejPackage.ITEM__MATRICULE:
				return getMatricule();
			case ChequedejPackage.ITEM__NB_CHEQUES:
				return getNbCheques();
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT:
				return getNbJoursEntiersMoisPrecedent();
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT:
				return getNbJoursEntiersMoisSuivant();
			case ChequedejPackage.ITEM__COMMENTAIRE:
				return getCommentaire();
			case ChequedejPackage.ITEM__NOM:
				return getNom();
			case ChequedejPackage.ITEM__PRENOM:
				return getPrenom();
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
			case ChequedejPackage.ITEM__SUCCURSALE:
				setSuccursale((Succursale)newValue);
				return;
			case ChequedejPackage.ITEM__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case ChequedejPackage.ITEM__NB_CHEQUES:
				setNbCheques((Integer)newValue);
				return;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT:
				setNbJoursEntiersMoisPrecedent((Integer)newValue);
				return;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT:
				setNbJoursEntiersMoisSuivant((Integer)newValue);
				return;
			case ChequedejPackage.ITEM__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case ChequedejPackage.ITEM__NOM:
				setNom((String)newValue);
				return;
			case ChequedejPackage.ITEM__PRENOM:
				setPrenom((String)newValue);
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
			case ChequedejPackage.ITEM__SUCCURSALE:
				setSuccursale((Succursale)null);
				return;
			case ChequedejPackage.ITEM__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__NB_CHEQUES:
				setNbCheques(NB_CHEQUES_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT:
				setNbJoursEntiersMoisPrecedent(NB_JOURS_ENTIERS_MOIS_PRECEDENT_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT:
				setNbJoursEntiersMoisSuivant(NB_JOURS_ENTIERS_MOIS_SUIVANT_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case ChequedejPackage.ITEM__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
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
			case ChequedejPackage.ITEM__SUCCURSALE:
				return succursale != null;
			case ChequedejPackage.ITEM__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
			case ChequedejPackage.ITEM__NB_CHEQUES:
				return nbCheques != NB_CHEQUES_EDEFAULT;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT:
				return nbJoursEntiersMoisPrecedent != NB_JOURS_ENTIERS_MOIS_PRECEDENT_EDEFAULT;
			case ChequedejPackage.ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT:
				return nbJoursEntiersMoisSuivant != NB_JOURS_ENTIERS_MOIS_SUIVANT_EDEFAULT;
			case ChequedejPackage.ITEM__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case ChequedejPackage.ITEM__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case ChequedejPackage.ITEM__PRENOM:
				return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
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
		result.append(", nbCheques: ");
		result.append(nbCheques);
		result.append(", nbJoursEntiersMoisPrecedent: ");
		result.append(nbJoursEntiersMoisPrecedent);
		result.append(", nbJoursEntiersMoisSuivant: ");
		result.append(nbJoursEntiersMoisSuivant);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
