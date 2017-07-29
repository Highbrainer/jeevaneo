/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.Parametrage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parametrage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametrageTest extends TestCase {

	/**
	 * The fixture for this Parametrage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parametrage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParametrageTest.class);
	}

	/**
	 * Constructs a new Parametrage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametrageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Parametrage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Parametrage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Parametrage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Parametrage getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createParametrage());
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

} //ParametrageTest
