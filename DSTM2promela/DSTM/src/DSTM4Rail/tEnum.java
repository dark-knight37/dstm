/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.tEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#gettEnum()
 * @model
 * @generated
 */
public interface tEnum extends tBasic {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' attribute list.
	 * @see DSTM4Rail.DSTM4RailPackage#gettEnum_Literals()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getLiterals();

} // tEnum
