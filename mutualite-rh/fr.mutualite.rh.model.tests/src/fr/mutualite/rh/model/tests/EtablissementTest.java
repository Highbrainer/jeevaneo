/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.MutFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Etablissement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtablissementTest extends TestCase {

	/**
	 * The fixture for this Etablissement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Etablissement fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EtablissementTest.class);
	}

	/**
	 * Constructs a new Etablissement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Etablissement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Etablissement fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Etablissement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Etablissement getFixture() {
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
		setFixture(MutFactory.eINSTANCE.createEtablissement());
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

} //EtablissementTest
