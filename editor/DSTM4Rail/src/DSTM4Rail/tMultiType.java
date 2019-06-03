/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tMulti Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tMultiType#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettMultiType()
 * @model
 * @generated
 */
public interface tMultiType extends Type {
	/**
	 * Returns the value of the '<em><b>Composed By</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.tSimpleType}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.tSimpleType#getTMultiType <em>TMulti Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed By</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#gettMultiType_ComposedBy()
	 * @see DSTM4Rail.tSimpleType#getTMultiType
	 * @model opposite="tMultiType" containment="true" required="true"
	 * @generated
	 */
	EList<tSimpleType> getComposedBy();

} // tMultiType
