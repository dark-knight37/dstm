/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Vertex#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link DSTM4Rail.Vertex#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute list.
	 * @see DSTM4Rail.DSTM4RailPackage#getVertex_Requirements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getRequirements();

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Machine#getVertexes <em>Vertexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(Machine)
	 * @see DSTM4Rail.DSTM4RailPackage#getVertex_Machine()
	 * @see DSTM4Rail.Machine#getVertexes
	 * @model opposite="vertexes" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Machine getMachine();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Vertex#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Machine value);

} // Vertex
