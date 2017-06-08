/**
 */
package fr.mutualite.rh.model.dto.impl;

import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.OrganismeFormation;
import fr.mutualite.rh.model.SessionFormation;
import fr.mutualite.rh.model.dto.*;

import java.text.DateFormat;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtoFactoryImpl extends EFactoryImpl implements DtoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DtoFactory init() {
		try {
			DtoFactory theDtoFactory = (DtoFactory)EPackage.Registry.INSTANCE.getEFactory(DtoPackage.eNS_URI);
			if (theDtoFactory != null) {
				return theDtoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DtoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DtoPackage.FORMULAIRE: return (EObject)createFormulaire();
			case DtoPackage.UI_EMPLOYE: return (EObject)createUIEmploye();
			case DtoPackage.UI_SESSION_FORMATION: return (EObject)createUISessionFormation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulaire createFormulaire() {
		FormulaireImpl formulaire = new FormulaireImpl();
		return formulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIEmploye createUIEmploye() {
		UIEmployeImpl uiEmploye = new UIEmployeImpl();
		return uiEmploye;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISessionFormation createUISessionFormation() {
		UISessionFormationImpl uiSessionFormation = new UISessionFormationImpl();
		return uiSessionFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoPackage getDtoPackage() {
		return (DtoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DtoPackage getPackage() {
		return DtoPackage.eINSTANCE;
	}

	DateFormat df = DateFormat.getDateInstance();
	
	@Override
	public UISessionFormation createUISessionFormation(SessionFormation sf) {
		Formation f = (Formation) sf.eContainer();
		OrganismeFormation o = (OrganismeFormation) f.eContainer();
		UISessionFormation uisf = createUISessionFormation();
		uisf.setDuree(("" + sf.getDuree()).replaceFirst("\\.0+$", "") + "h");
		uisf.setLibelle(f.getLibelle());
		uisf.setOrganisme(o.getNom());
		String quand = df.format(sf.getDateDebut());
		if(!sf.getDateFin().equals(sf.getDateDebut())) {
			quand += " au " + df.format(sf.getDateFin());
		}
		uisf.setQuand(quand);
		uisf.setDpc(f.isDpc());
		return uisf;
	}

} //DtoFactoryImpl
