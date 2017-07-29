/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.CodeClient;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Code Client</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeClientTest extends TestCase {

	/**
	 * The fixture for this Code Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeClient fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodeClientTest.class);
	}

	/**
	 * Constructs a new Code Client test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeClientTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Code Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CodeClient fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Code Client test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeClient getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createCodeClient());
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

} //CodeClientTest
