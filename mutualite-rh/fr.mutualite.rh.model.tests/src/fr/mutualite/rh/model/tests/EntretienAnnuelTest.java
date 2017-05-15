/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.MutFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entretien Annuel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntretienAnnuelTest extends EntretienTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntretienAnnuelTest.class);
	}

	/**
	 * Constructs a new Entretien Annuel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntretienAnnuelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entretien Annuel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntretienAnnuel getFixture() {
		return (EntretienAnnuel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MutFactory.eINSTANCE.createEntretienAnnuel());
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

} //EntretienAnnuelTest
