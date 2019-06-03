/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tCompound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tCompound#getSubtypes <em>Subtypes</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettCompound()
 * @model
 * @generated
 */
public interface tCompound extends tSimpleType {
	/**
	 * Returns the value of the '<em><b>Subtypes</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.tBasic}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.tBasic#getTCompound <em>TCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtypes</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#gettCompound_Subtypes()
	 * @see DSTM4Rail.tBasic#getTCompound
	 * @model opposite="tCompound" containment="true" required="true"
	 * @generated
	 */
	EList<tBasic> getSubtypes();

} // tCompound
