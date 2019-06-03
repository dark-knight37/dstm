/**
 */
package tesqel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOrder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.FOrder#getFrom <em>From</em>}</li>
 *   <li>{@link tesqel.FOrder#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getFOrder()
 * @model
 * @generated
 */
public interface FOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Firing)
	 * @see tesqel.TesqelPackage#getFOrder_From()
	 * @model required="true"
	 * @generated
	 */
	Firing getFrom();

	/**
	 * Sets the value of the '{@link tesqel.FOrder#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Firing value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Firing)
	 * @see tesqel.TesqelPackage#getFOrder_To()
	 * @model required="true"
	 * @generated
	 */
	Firing getTo();

	/**
	 * Sets the value of the '{@link tesqel.FOrder#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Firing value);

} // FOrder
