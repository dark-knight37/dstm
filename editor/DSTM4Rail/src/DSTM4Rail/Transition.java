/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#isIs_preemptive <em>Is preemptive</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getPar_instantiation <em>Par instantiation</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getDestination <em>Destination</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getExiting_node <em>Exiting node</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getEntering_node <em>Entering node</em>}</li>
 *   <li>{@link DSTM4Rail.Transition#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Trigger()
	 * @model ordered="false"
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

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
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Condition()
	 * @model ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Actions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getActions();

	/**
	 * Returns the value of the '<em><b>Is preemptive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is preemptive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is preemptive</em>' attribute.
	 * @see #setIs_preemptive(boolean)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Is_preemptive()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIs_preemptive();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#isIs_preemptive <em>Is preemptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is preemptive</em>' attribute.
	 * @see #isIs_preemptive()
	 * @generated
	 */
	void setIs_preemptive(boolean value);

	/**
	 * Returns the value of the '<em><b>Par instantiation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Par instantiation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par instantiation</em>' attribute list.
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Par_instantiation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getPar_instantiation();

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
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Requirements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getRequirements();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Source()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Vertex)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Destination()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	Vertex getDestination();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Vertex value);

	/**
	 * Returns the value of the '<em><b>Exiting node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exiting node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exiting node</em>' reference.
	 * @see #setExiting_node(ExitingNode)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Exiting_node()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	ExitingNode getExiting_node();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getExiting_node <em>Exiting node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exiting node</em>' reference.
	 * @see #getExiting_node()
	 * @generated
	 */
	void setExiting_node(ExitingNode value);

	/**
	 * Returns the value of the '<em><b>Entering node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entering node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entering node</em>' reference.
	 * @see #setEntering_node(EnteringNode)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Entering_node()
	 * @model keys="name" ordered="false"
	 * @generated
	 */
	EnteringNode getEntering_node();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getEntering_node <em>Entering node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entering node</em>' reference.
	 * @see #getEntering_node()
	 * @generated
	 */
	void setEntering_node(EnteringNode value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Machine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' container reference.
	 * @see #setMachine(Machine)
	 * @see DSTM4Rail.DSTM4RailPackage#getTransition_Machine()
	 * @see DSTM4Rail.Machine#getTransitions
	 * @model opposite="transitions" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Machine getMachine();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Transition#getMachine <em>Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' container reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Machine value);

} // Transition
