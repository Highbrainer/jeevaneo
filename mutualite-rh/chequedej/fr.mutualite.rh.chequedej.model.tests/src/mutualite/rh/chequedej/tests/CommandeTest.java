/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.Commande;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandeTest extends TestCase {

	/**
	 * The fixture for this Commande test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commande fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommandeTest.class);
	}

	/**
	 * Constructs a new Commande test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Commande test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Commande fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Commande test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Commande getFixture() {
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
		setFixture(ChequedejFactory.eINSTANCE.createCommande());
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

} //CommandeTest
