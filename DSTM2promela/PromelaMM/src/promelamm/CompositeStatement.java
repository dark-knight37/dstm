/**
 */
package promelamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.CompositeStatement#getDescription <em>Description</em>}</li>
 *   <li>{@link promelamm.CompositeStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link promelamm.CompositeStatement#getSubStatements <em>Sub Statements</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getCompositeStatement()
 * @model
 * @generated
 */
public interface CompositeStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see promelamm.PromelammPackage#getCompositeStatement_Description()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see promelamm.PromelammPackage#getCompositeStatement_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link promelamm.CompositeStatement#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Sub Statements</b></em>' containment reference list.
	 * The list contents are of type {@link promelamm.AbstractStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Statements</em>' containment reference list.
	 * @see promelamm.PromelammPackage#getCompositeStatement_SubStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStatement> getSubStatements();

} // CompositeStatement
