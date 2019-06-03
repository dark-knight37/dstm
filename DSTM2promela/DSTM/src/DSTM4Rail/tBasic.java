/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tBasic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tBasic#getTCompound <em>TCompound</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettBasic()
 * @model abstract="true"
 * @generated
 */
public interface tBasic extends tSimpleType {
	/**
	 * Returns the value of the '<em><b>TCompound</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.tCompound#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCompound</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCompound</em>' container reference.
	 * @see #setTCompound(tCompound)
	 * @see DSTM4Rail.DSTM4RailPackage#gettBasic_TCompound()
	 * @see DSTM4Rail.tCompound#getSubtypes
	 * @model opposite="subtypes" keys="name" transient="false" ordered="false"
	 * @generated
	 */
	tCompound getTCompound();

	/**
	 * Sets the value of the '{@link DSTM4Rail.tBasic#getTCompound <em>TCompound</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TCompound</em>' container reference.
	 * @see #getTCompound()
	 * @generated
	 */
	void setTCompound(tCompound value);

} // tBasic
