/**
 */
package promelamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.Composite#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Variable {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link promelamm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see promelamm.PromelammPackage#getComposite_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variable> getTypes();

} // Composite
