/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.EvaluationCompetence;
import fr.mutualite.rh.model.MutFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation Competence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationCompetenceTest extends TestCase {

	/**
	 * The fixture for this Evaluation Competence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationCompetence fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationCompetenceTest.class);
	}

	/**
	 * Constructs a new Evaluation Competence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationCompetenceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Evaluation Competence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EvaluationCompetence fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Evaluation Competence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationCompetence getFixture() {
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
		setFixture(MutFactory.eINSTANCE.createEvaluationCompetence());
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

} //EvaluationCompetenceTest
