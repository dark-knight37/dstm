/**
 */
package tesqel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Firing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.CompoundFiring#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesqel.CompoundFiring#getFiring <em>Firing</em>}</li>
 *   <li>{@link tesqel.CompoundFiring#getOrder <em>Order</em>}</li>
 *   <li>{@link tesqel.CompoundFiring#getIOmessage <em>IOmessage</em>}</li>
 *   <li>{@link tesqel.CompoundFiring#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getCompoundFiring()
 * @model
 * @generated
 */
public interface CompoundFiring extends EObject {
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
	 * @see tesqel.TesqelPackage#getCompoundFiring_Annotations()
	 * @model
	 * @generated
	 */
	EList<String> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Firing</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.Firing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getCompoundFiring_Firing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Firing> getFiring();

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
	 * @see tesqel.TesqelPackage#getCompoundFiring_Order()
	 * @model required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link tesqel.CompoundFiring#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>IOmessage</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IOmessage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IOmessage</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getCompoundFiring_IOmessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getIOmessage();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link tesqel.FOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see tesqel.TesqelPackage#getCompoundFiring_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<FOrder> getLink();

} // CompoundFiring
