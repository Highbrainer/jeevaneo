/**
 */
package mutualite.rh.chequedej.tests;

import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cheque Dej</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.ChequeDej#integrateDeje(java.lang.String, int, int, int) <em>Integrate Deje</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ChequeDejTest extends TestCase {

	/**
	 * The fixture for this Cheque Dej test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeDej fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChequeDejTest.class);
	}

	/**
	 * Constructs a new Cheque Dej test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequeDejTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cheque Dej test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChequeDej fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cheque Dej test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeDej getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createChequeDej());
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
	 * Tests the '{@link mutualite.rh.chequedej.ChequeDej#integrateDeje(java.lang.String, int, int, int) <em>Integrate Deje</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.ChequeDej#integrateDeje(java.lang.String, int, int, int)
	 * @generated NOT
	 */
	public void testIntegrateDeje__String_int_int() {
		
	}

	public void testImportDejes() {
		int matricule = 2600;
		
		int soldeInitial = 0;
		int[] joursTravailles = {0,0,17,12,15,20,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {17,12,15,20,18};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}

	public void testImportDejes02() {
		int matricule = 2600;
		
		int soldeInitial = 0;
		int[] joursTravailles = {0,0,16,12,15,20,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {17,12,14,20,18};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}

	public void testImportDejes03() {
		int matricule = 2600;
		
		int soldeInitial = 0;
		int[] joursTravailles = {0,0,17,12,15,20,18};
		int[] estimations = {0,12,15,20,18};
		int[] commandes = {0,12,25,25,20};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}

	public void testImportDejes04() {
		int matricule = 12;
		this.getFixture().getChoix().getOrCreateChoix(matricule).setNbMaxCheques(10);
		
		int soldeInitial = 0;
		int[] joursTravailles = {0,0,17,12,15,20,18};
		int[] estimations = {0,12,15,20,18};
		int[] commandes = {0,10,10,10,10};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}
	public void testImportDejes05() {
		int matricule = 12;
		this.getFixture().getChoix().getOrCreateChoix(matricule).setNbMaxCheques(10);
		
		int soldeInitial = 0;
		int[] joursTravailles = {0,0,17,12,15,9,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {10,10,10,10,10};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}
	public void testImportDejes06() {
		int matricule = 12;
		this.getFixture().getChoix().getOrCreateChoix(matricule).setNbMaxCheques(10);
		
		int soldeInitial = -20; // il nous en doit 20!!!
		int[] joursTravailles = {0,0,17,12,15,9,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {0,9,10,10,10};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}
	public void testImportDejes07() {
		int matricule = 12;
		this.getFixture().getChoix().getOrCreateChoix(matricule).setNbMaxCheques(10);
		
		int soldeInitial = -20;
		int[] joursTravailles = {0,0,17,8,8,9,18};
		int[] estimations = {17,9,8,20,18};
		int[] commandes = {0,6,8,10,10};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}
	
	public void testImportDejes08() {
		int matricule = 2600;
		
		int soldeInitial = 10;
		int[] joursTravailles = {0,0,17,12,15,20,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {25,14,15,20,18};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}
	
	public void testImportDejes09() {
		int matricule = 2600;
		
		int soldeInitial = -10;
		int[] joursTravailles = {0,0,17,12,15,20,18};
		int[] estimations = {17,12,15,20,18};
		int[] commandes = {7,12,15,20,18};
		
		_test(matricule, soldeInitial, joursTravailles, estimations, commandes);
		
	}

	public void _test(int matricule, int soldeInitial, int[] joursTravailles, int[] estimations, int[] commandes) {
		
		
		
		getFixture().getSolde().getOrCreateSoldeIndividual(matricule).setNbCheques(soldeInitial);
		
		for(int i=0;i<commandes.length;++i) {
			String mois = "20170" + (i+1);
			getFixture().integrateDeje(mois, matricule, estimations[i], joursTravailles[i]);
			Assert.assertEquals(commandes[i], getFixture().getCarnet().getOrCreateCommande(mois).getOrCreateItem(matricule).getNbCheques().intValue());
		}
//		System.out.println("#####################################");
//		root.getSolde().getOrCreateSoldeIndividual(matricule).getHistorique().stream().map(HistoriqueSoldeIndividuel::getComment).forEach(System.out::println);
	}

} //ChequeDejTest
