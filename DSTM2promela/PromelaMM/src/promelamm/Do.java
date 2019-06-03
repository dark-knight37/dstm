/**
 */
package promelamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.Do#getUnlessCase <em>Unless Case</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getDo()
 * @model
 * @generated
 */
public interface Do extends CompositeStatement {
	/**
	 * Returns the value of the '<em><b>Unless Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unless Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unless Case</em>' reference.
	 * @see #setUnlessCase(Unless)
	 * @see promelamm.PromelammPackage#getDo_UnlessCase()
	 * @model required="true"
	 * @generated
	 */
	Unless getUnlessCase();

	/**
	 * Sets the value of the '{@link promelamm.Do#getUnlessCase <em>Unless Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unless Case</em>' reference.
	 * @see #getUnlessCase()
	 * @generated
	 */
	void setUnlessCase(Unless value);

} // Do
