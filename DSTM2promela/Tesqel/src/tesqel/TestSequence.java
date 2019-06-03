/**
 */
package tesqel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.TestSequence#getName <em>Name</em>}</li>
 *   <li>{@link tesqel.TestSequence#getInitial <em>Initial</em>}</li>
 *   <li>{@link tesqel.TestSequence#getCompoundFiring <em>Compound Firing</em>}</li>
 *   <li>{@link tesqel.TestSequence#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link tesqel.TestSequence#getLink <em>Link</em>}</li>
 *   <li>{@link tesqel.TestSequence#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getTestSequence()
 * @model
 * @generated
 */
public interface TestSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tesqel.TesqelPackage#getTestSequence_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tesqel.TestSequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute list.
	 * @see tesqel.TesqelPackage#getTestSequence_Initial()
	 * @model default=""
	 * @generated
	 */
	EList<String> getInitial();

	/**
	 * Returns the value of the '<em><b>Compound Firing</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.CompoundFiring}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Firing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Firing</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getTestSequence_CompoundFiring()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompoundFiring> getCompoundFiring();

	/**
	 * Returns the value of the '<em><b>Initial Condition</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Condition</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getTestSequence_InitialCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getInitialCondition();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.CFOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getTestSequence_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<CFOrder> getLink();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.TestReason}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getTestSequence_Specifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestReason> getSpecifications();

} // TestSequence
