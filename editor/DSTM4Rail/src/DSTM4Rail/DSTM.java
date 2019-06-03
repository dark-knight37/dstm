/**
 */
package DSTM4Rail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSTM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.DSTM#getMachines <em>Machines</em>}</li>
 *   <li>{@link DSTM4Rail.DSTM#getMain <em>Main</em>}</li>
 *   <li>{@link DSTM4Rail.DSTM#getChannels <em>Channels</em>}</li>
 *   <li>{@link DSTM4Rail.DSTM#getTypes <em>Types</em>}</li>
 *   <li>{@link DSTM4Rail.DSTM#getGlobal_variables <em>Global variables</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getDSTM()
 * @model
 * @generated
 */
public interface DSTM extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Machines</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Machine}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Machine#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machines</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getDSTM_Machines()
	 * @see DSTM4Rail.Machine#getDSTM
	 * @model opposite="DSTM" containment="true" keys="name" required="true" ordered="false"
	 * @generated
	 */
	EList<Machine> getMachines();

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(Machine)
	 * @see DSTM4Rail.DSTM4RailPackage#getDSTM_Main()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	Machine getMain();

	/**
	 * Sets the value of the '{@link DSTM4Rail.DSTM#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Machine value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Channel}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Channel#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getDSTM_Channels()
	 * @see DSTM4Rail.Channel#getDSTM
	 * @model opposite="DSTM" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Type}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Type#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getDSTM_Types()
	 * @see DSTM4Rail.Type#getDSTM
	 * @model opposite="DSTM" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Global variables</b></em>' containment reference list.
	 * The list contents are of type {@link DSTM4Rail.Variable}.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.Variable#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global variables</em>' containment reference list.
	 * @see DSTM4Rail.DSTM4RailPackage#getDSTM_Global_variables()
	 * @see DSTM4Rail.Variable#getDSTM
	 * @model opposite="DSTM" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Variable> getGlobal_variables();

} // DSTM
