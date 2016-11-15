/**
 */
package fr.mutualite.rh.model.util;

import fr.mutualite.rh.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage
 * @generated
 */
public class MutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MutPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutSwitch<Adapter> modelSwitch =
		new MutSwitch<Adapter>() {
			@Override
			public Adapter caseEmploye(Employe object) {
				return createEmployeAdapter();
			}
			@Override
			public Adapter caseAffectation(Affectation object) {
				return createAffectationAdapter();
			}
			@Override
			public Adapter caseEmploi(Emploi object) {
				return createEmploiAdapter();
			}
			@Override
			public Adapter caseAffectationClassification(AffectationClassification object) {
				return createAffectationClassificationAdapter();
			}
			@Override
			public Adapter caseFormation(Formation object) {
				return createFormationAdapter();
			}
			@Override
			public Adapter caseOrganismeFormation(OrganismeFormation object) {
				return createOrganismeFormationAdapter();
			}
			@Override
			public Adapter caseSessionFormation(SessionFormation object) {
				return createSessionFormationAdapter();
			}
			@Override
			public Adapter caseEntretien(Entretien object) {
				return createEntretienAdapter();
			}
			@Override
			public Adapter caseEntretienProfessionnel(EntretienProfessionnel object) {
				return createEntretienProfessionnelAdapter();
			}
			@Override
			public Adapter caseAppreciationSessionFormation(AppreciationSessionFormation object) {
				return createAppreciationSessionFormationAdapter();
			}
			@Override
			public Adapter caseSouhaitFormationEvaluateur(SouhaitFormationEvaluateur object) {
				return createSouhaitFormationEvaluateurAdapter();
			}
			@Override
			public Adapter caseSouhaitFormationSalarie(SouhaitFormationSalarie object) {
				return createSouhaitFormationSalarieAdapter();
			}
			@Override
			public Adapter caseMutualite(Mutualite object) {
				return createMutualiteAdapter();
			}
			@Override
			public Adapter caseEtablissements(Etablissements object) {
				return createEtablissementsAdapter();
			}
			@Override
			public Adapter caseEmplois(Emplois object) {
				return createEmploisAdapter();
			}
			@Override
			public Adapter caseEffectif(Effectif object) {
				return createEffectifAdapter();
			}
			@Override
			public Adapter caseOrganismes(Organismes object) {
				return createOrganismesAdapter();
			}
			@Override
			public Adapter caseEtablissement(Etablissement object) {
				return createEtablissementAdapter();
			}
			@Override
			public Adapter caseUtilisateur(Utilisateur object) {
				return createUtilisateurAdapter();
			}
			@Override
			public Adapter caseUtilisateurs(Utilisateurs object) {
				return createUtilisateursAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Etablissement <em>Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Etablissement
	 * @generated
	 */
	public Adapter createEtablissementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Utilisateur
	 * @generated
	 */
	public Adapter createUtilisateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Utilisateurs <em>Utilisateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Utilisateurs
	 * @generated
	 */
	public Adapter createUtilisateursAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Employe
	 * @generated
	 */
	public Adapter createEmployeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Emploi <em>Emploi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Emploi
	 * @generated
	 */
	public Adapter createEmploiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.AffectationClassification <em>Affectation Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.AffectationClassification
	 * @generated
	 */
	public Adapter createAffectationClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Formation
	 * @generated
	 */
	public Adapter createFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.OrganismeFormation <em>Organisme Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.OrganismeFormation
	 * @generated
	 */
	public Adapter createOrganismeFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.SessionFormation <em>Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.SessionFormation
	 * @generated
	 */
	public Adapter createSessionFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Entretien <em>Entretien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Entretien
	 * @generated
	 */
	public Adapter createEntretienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.EntretienProfessionnel <em>Entretien Professionnel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.EntretienProfessionnel
	 * @generated
	 */
	public Adapter createEntretienProfessionnelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.AppreciationSessionFormation <em>Appreciation Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation
	 * @generated
	 */
	public Adapter createAppreciationSessionFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.SouhaitFormationEvaluateur <em>Souhait Formation Evaluateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.SouhaitFormationEvaluateur
	 * @generated
	 */
	public Adapter createSouhaitFormationEvaluateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.SouhaitFormationSalarie <em>Souhait Formation Salarie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.SouhaitFormationSalarie
	 * @generated
	 */
	public Adapter createSouhaitFormationSalarieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Mutualite <em>Mutualite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Mutualite
	 * @generated
	 */
	public Adapter createMutualiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Etablissements <em>Etablissements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Etablissements
	 * @generated
	 */
	public Adapter createEtablissementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Emplois <em>Emplois</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Emplois
	 * @generated
	 */
	public Adapter createEmploisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Effectif <em>Effectif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Effectif
	 * @generated
	 */
	public Adapter createEffectifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.mutualite.rh.model.Organismes <em>Organismes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.mutualite.rh.model.Organismes
	 * @generated
	 */
	public Adapter createOrganismesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MutAdapterFactory
