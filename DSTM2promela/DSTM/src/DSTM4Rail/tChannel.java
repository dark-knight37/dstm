/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tChannel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tChannel#getChannel_names <em>Channel names</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettChannel()
 * @model
 * @generated
 */
public interface tChannel extends tBasic {
	/**
	 * Returns the value of the '<em><b>Channel names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel names</em>' attribute list.
	 * @see DSTM4Rail.DSTM4RailPackage#gettChannel_Channel_names()
	 * @model
	 * @generated
	 */
	EList<String> getChannel_names();

} // tChannel
