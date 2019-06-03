/**
 */
package tesqel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tesqel.Action#getRvalue <em>Rvalue</em>}</li>
 *   <li>{@link tesqel.Action#getLvalue <em>Lvalue</em>}</li>
 *   <li>{@link tesqel.Action#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see tesqel.TesqelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Phase {
	/**
	 * Returns the value of the '<em><b>Rvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rvalue</em>' attribute.
	 * @see #setRvalue(String)
	 * @see tesqel.TesqelPackage#getAction_Rvalue()
	 * @model
	 * @generated
	 */
	String getRvalue();

	/**
	 * Sets the value of the '{@link tesqel.Action#getRvalue <em>Rvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rvalue</em>' attribute.
	 * @see #getRvalue()
	 * @generated
	 */
	void setRvalue(String value);

	/**
	 * Returns the value of the '<em><b>Lvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lvalue</em>' attribute.
	 * @see #setLvalue(String)
	 * @see tesqel.TesqelPackage#getAction_Lvalue()
	 * @model required="true"
	 * @generated
	 */
	String getLvalue();

	/**
	 * Sets the value of the '{@link tesqel.Action#getLvalue <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lvalue</em>' attribute.
	 * @see #getLvalue()
	 * @generated
	 */
	void setLvalue(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tesqel.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see tesqel.ActionKind
	 * @see #setKind(ActionKind)
	 * @see tesqel.TesqelPackage#getAction_Kind()
	 * @model required="true"
	 * @generated
	 */
	ActionKind getKind();

	/**
	 * Sets the value of the '{@link tesqel.Action#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see tesqel.ActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ActionKind value);

} // Action
