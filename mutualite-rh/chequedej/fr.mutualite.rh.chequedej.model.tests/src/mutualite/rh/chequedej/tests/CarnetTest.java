/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequedejFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Carnet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarnetTest extends TestCase {

	/**
	 * The fixture for this Carnet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carnet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CarnetTest.class);
	}

	/**
	 * Constructs a new Carnet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarnetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Carnet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Carnet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Carnet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Carnet getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createCarnet());
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

} //CarnetTest
