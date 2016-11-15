/**
 */
package fr.mutualite.rh.model.dto.tests;

import java.util.Arrays;
import java.util.Date;

import org.junit.Assert;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.Formulaire;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formulaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getPrenom() <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getMatricule() <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getNom() <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDiplomes() <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getService() <em>Service</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getPoste() <em>Poste</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getResponsable() <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getMenePar() <em>Mene Par</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDate() <em>Date</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien() <em>Date Precedent Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getAnciennete() <em>Anciennete</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise() <em>Date Entree Entreprise</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FormulaireTest extends TestCase {

	/**
	 * The fixture for this Formulaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formulaire fixture = null;
	private Employe e;
	private Employe resp;
	private Etablissement et;
	private Entretien entretien;
	private Entretien entretien0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormulaireTest.class);
	}

	/**
	 * Constructs a new Formulaire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaireTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Formulaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Formulaire fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Formulaire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formulaire getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DtoFactory.eINSTANCE.createFormulaire());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getPrenom() <em>Prenom</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getPrenom()
	 * @generated NOT
	 */
	public void testGetPrenom() {
		Assert.assertEquals("Alexandre", getFixture().getPrenom());
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getMatricule() <em>Matricule</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getMatricule()
	 * @generated NOT
	 */
	public void testGetMatricule() {
		Assert.assertEquals(123, getFixture().getMatricule());
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getNom() <em>Nom</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getNom()
	 * @generated NOT
	 */
	public void testGetNom() {
		Assert.assertEquals("Borgoltz", getFixture().getNom());
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getDiplomes() <em>Diplomes</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDiplomes()
	 * @generated NOT
	 */
	public void testGetDiplomes() {
		Assert.assertTrue(e.getDiplomes().stream().allMatch(getFixture().getDiplomes()::contains));
		Assert.assertTrue(Arrays.asList(getFixture().getDiplomes().split(", ")).stream().allMatch(e.getDiplomes()::contains));
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getService() <em>Service</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getService()
	 * @generated NOT
	 */
	public void testGetService() {
		Assert.assertEquals(et.getNom(), getFixture().getService());
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getPoste() <em>Poste</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getPoste()
	 * @generated NOT
	 */
	public void testGetPoste() {
		Assert.assertTrue(getFixture().getPoste().startsWith(e.getAffectationEmploiCourante().getEmploi().getIntitule() + " depuis le "));
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getResponsable() <em>Responsable</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getResponsable()
	 * @generated NOT
	 */
	public void testGetResponsable() {
		Assert.assertEquals(resp.getPrenom() + " " + resp.getNom(), getFixture().getResponsable());
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getMenePar() <em>Mene Par</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getMenePar()
	 * @generated NOT
	 */
	public void testGetMenePar() {
		Assert.assertEquals(resp.getPrenom() + " " + resp.getNom(), getFixture().getMenePar());
		}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getDate() <em>Date</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDate()
	 * @generated NOT
	 */
	public void testGetDate() {
		Assert.assertEquals(entretien.getDate(), getFixture().getDate());
		}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien() <em>Date Precedent Entretien</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDatePrecedentEntretien()
	 * @generated NOT
	 */
	public void testGetDatePrecedentEntretien() {
		Date datePrecedentEntretien = getFixture().getDatePrecedentEntretien();
		Assert.assertEquals(entretien0.getDate(), datePrecedentEntretien);
		}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getAnciennete() <em>Anciennete</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getAnciennete()
	 * @generated
	 */
	public void testGetAnciennete() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise() <em>Date Entree Entreprise</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.dto.Formulaire#getDateEntreeEntreprise()
	 * @generated
	 */
	public void testGetDateEntreeEntreprise() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //FormulaireTest
