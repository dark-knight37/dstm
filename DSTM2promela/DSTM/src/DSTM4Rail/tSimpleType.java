/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tSimple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tSimpleType#getTMultiType <em>TMulti Type</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettSimpleType()
 * @model abstract="true"
 * @generated
 */
public interface tSimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>TMulti Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.tMultiType#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMulti Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMulti Type</em>' container reference.
	 * @see #setTMultiType(tMultiType)
	 * @see DSTM4Rail.DSTM4RailPackage#gettSimpleType_TMultiType()
	 * @see DSTM4Rail.tMultiType#getComposedBy
	 * @model opposite="composedBy" keys="name" transient="false" ordered="false"
	 * @generated
	 */
	tMultiType getTMultiType();

	/**
	 * Sets the value of the '{@link DSTM4Rail.tSimpleType#getTMultiType <em>TMulti Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMulti Type</em>' container reference.
	 * @see #getTMultiType()
	 * @generated
	 */
	void setTMultiType(tMultiType value);

} // tSimpleType
