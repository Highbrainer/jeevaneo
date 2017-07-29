/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.Succursale;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Succursale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuccursaleTest extends TestCase {

	/**
	 * The fixture for this Succursale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Succursale fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuccursaleTest.class);
	}

	/**
	 * Constructs a new Succursale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccursaleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Succursale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Succursale fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Succursale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Succursale getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createSuccursale());
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

} //SuccursaleTest
