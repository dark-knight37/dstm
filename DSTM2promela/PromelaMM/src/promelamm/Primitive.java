/**
 */
package promelamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.Primitive#getType <em>Type</em>}</li>
 *   <li>{@link promelamm.Primitive#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getPrimitive()
 * @model
 * @generated
 */
public interface Primitive extends Variable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link promelamm.DefaultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see promelamm.DefaultType
	 * @see #setType(DefaultType)
	 * @see promelamm.PromelammPackage#getPrimitive_Type()
	 * @model unique="false" required="true"
	 * @generated
	 */
	DefaultType getType();

	/**
	 * Sets the value of the '{@link promelamm.Primitive#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see promelamm.DefaultType
	 * @see #getType()
	 * @generated
	 */
	void setType(DefaultType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see promelamm.PromelammPackage#getPrimitive_InitialValue()
	 * @model
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link promelamm.Primitive#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

} // Primitive
