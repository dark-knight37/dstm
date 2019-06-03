/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Variable#getType <em>Type</em>}</li>
 *   <li>{@link DSTM4Rail.Variable#getDSTM <em>DSTM</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
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
	 * @see DSTM4Rail.DSTM4RailPackage#getVariable_Type()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	tBasic getType();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(tBasic value);

	/**
	 * Returns the value of the '<em><b>DSTM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.DSTM#getGlobal_variables <em>Global variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSTM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSTM</em>' container reference.
	 * @see #setDSTM(DSTM)
	 * @see DSTM4Rail.DSTM4RailPackage#getVariable_DSTM()
	 * @see DSTM4Rail.DSTM#getGlobal_variables
	 * @model opposite="global_variables" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DSTM getDSTM();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Variable#getDSTM <em>DSTM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSTM</em>' container reference.
	 * @see #getDSTM()
	 * @generated
	 */
	void setDSTM(DSTM value);

} // Variable
