/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link DSTM4Rail.Parameter#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(tBasic)
	 * @see DSTM4Rail.DSTM4RailPackage#getParameter_Type()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	tBasic getType();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(tBasic value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Machine#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(Machine)
	 * @see DSTM4Rail.DSTM4RailPackage#getParameter_Machine()
	 * @see DSTM4Rail.Machine#getParameters
	 * @model opposite="parameters" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Machine getMachine();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Parameter#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Machine value);

} // Parameter
