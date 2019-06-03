/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cInternal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.cInternal#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getcInternal()
 * @model
 * @generated
 */
public interface cInternal extends Channel {
	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(int)
	 * @see DSTM4Rail.DSTM4RailPackage#getcInternal_Bound()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBound();

	/**
	 * Sets the value of the '{@link DSTM4Rail.cInternal#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(int value);

} // cInternal
