/**
 */
package tesqel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CF Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.CFOrder#getFrom <em>From</em>}</li>
 *   <li>{@link tesqel.CFOrder#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getCFOrder()
 * @model
 * @generated
 */
public interface CFOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(CompoundFiring)
	 * @see tesqel.TesqelPackage#getCFOrder_From()
	 * @model required="true"
	 * @generated
	 */
	CompoundFiring getFrom();

	/**
	 * Sets the value of the '{@link tesqel.CFOrder#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(CompoundFiring value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(CompoundFiring)
	 * @see tesqel.TesqelPackage#getCFOrder_To()
	 * @model required="true"
	 * @generated
	 */
	CompoundFiring getTo();

	/**
	 * Sets the value of the '{@link tesqel.CFOrder#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(CompoundFiring value);

} // CFOrder
