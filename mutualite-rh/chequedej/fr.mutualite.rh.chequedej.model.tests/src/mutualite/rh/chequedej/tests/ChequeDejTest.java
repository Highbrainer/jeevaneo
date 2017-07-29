/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cheque Dej</b></em>'.
 * <!-- end-user-doc -->
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

} //ChequeDejTest
