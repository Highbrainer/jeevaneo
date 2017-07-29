/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.EtablissementVirtuel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Etablissement Virtuel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtablissementVirtuelTest extends TestCase {

	/**
	 * The fixture for this Etablissement Virtuel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementVirtuel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EtablissementVirtuelTest.class);
	}

	/**
	 * Constructs a new Etablissement Virtuel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementVirtuelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Etablissement Virtuel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EtablissementVirtuel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Etablissement Virtuel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementVirtuel getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createEtablissementVirtuel());
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

} //EtablissementVirtuelTest
