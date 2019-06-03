/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Machine#getDSTM <em>DSTM</em>}</li>
 *   <li>{@link DSTM4Rail.Machine#getVertexes <em>Vertexes</em>}</li>
 *   <li>{@link DSTM4Rail.Machine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link DSTM4Rail.Machine#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>DSTM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.DSTM#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSTM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSTM</em>' container reference.
	 * @see #setDSTM(DSTM)
	 * @see DSTM4Rail.DSTM4RailPackage#getMachine_DSTM()
	 * @see DSTM4Rail.DSTM#getMachines
	 * @model opposite="machines" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DSTM getDSTM();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Machine#getDSTM <em>DSTM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSTM</em>' container reference.
	 * @see #getDSTM()
	 * @generated
	 */
	void setDSTM(DSTM value);

	/**
	 * Returns the value of the '<em><b>Vertexes</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Vertex}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Vertex#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertexes</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getMachine_Vertexes()
	 * @see DSTM4Rail.Vertex#getMachine
	 * @model opposite="machine" containment="true" keys="name" lower="2" ordered="false"
	 * @generated
	 */
	EList<Vertex> getVertexes();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Transition}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Transition#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getMachine_Transitions()
	 * @see DSTM4Rail.Transition#getMachine
	 * @model opposite="machine" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Parameter}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Parameter#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getMachine_Parameters()
	 * @see DSTM4Rail.Parameter#getMachine
	 * @model opposite="machine" containment="true" keys="name"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Machine
