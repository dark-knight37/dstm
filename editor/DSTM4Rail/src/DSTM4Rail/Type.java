/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Type#getDSTM <em>DSTM</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends NamedElement {
	/**
	 * Returns the value of the '<em><b>DSTM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.DSTM#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSTM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSTM</em>' container reference.
	 * @see #setDSTM(DSTM)
	 * @see DSTM4Rail.DSTM4RailPackage#getType_DSTM()
	 * @see DSTM4Rail.DSTM#getTypes
	 * @model opposite="types" keys="name" transient="false" ordered="false"
	 * @generated
	 */
	DSTM getDSTM();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Type#getDSTM <em>DSTM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSTM</em>' container reference.
	 * @see #getDSTM()
	 * @generated
	 */
	void setDSTM(DSTM value);

} // Type
