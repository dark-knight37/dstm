/**
 */
package tesqel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.Firing#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesqel.Firing#getPhase <em>Phase</em>}</li>
 *   <li>{@link tesqel.Firing#getCurrent <em>Current</em>}</li>
 *   <li>{@link tesqel.Firing#getTransition <em>Transition</em>}</li>
 *   <li>{@link tesqel.Firing#getNext <em>Next</em>}</li>
 *   <li>{@link tesqel.Firing#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getFiring()
 * @model
 * @generated
 */
public interface Firing extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute list.
	 * @see tesqel.TesqelPackage#getFiring_Annotations()
	 * @model
	 * @generated
	 */
	EList<String> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.Phase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getFiring_Phase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Phase> getPhase();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute list.
	 * @see tesqel.TesqelPackage#getFiring_Current()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getCurrent();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute list.
	 * @see tesqel.TesqelPackage#getFiring_Transition()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getTransition();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute list.
	 * @see tesqel.TesqelPackage#getFiring_Next()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getNext();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see tesqel.TesqelPackage#getFiring_Order()
	 * @model required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link tesqel.Firing#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Firing
