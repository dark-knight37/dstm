/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Box#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends Vertex {
	/**
	 * Returns the value of the '<em><b>Instantiation</b></em>' reference list.
	 * The list contents are of type {@link DSTM4Rail.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation</em>' reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getBox_Instantiation()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	EList<Machine> getInstantiation();

} // Box
