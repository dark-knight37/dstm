/**
 */
package promelamm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.SimpleStatement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getSimpleStatement()
 * @model
 * @generated
 */
public interface SimpleStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see promelamm.PromelammPackage#getSimpleStatement_Description()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDescription();

} // SimpleStatement
