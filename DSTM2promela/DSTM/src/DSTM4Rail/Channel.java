/**
 */
package DSTM4Rail;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.Channel#getDSTM <em>DSTM</em>}</li>
 *   <li>{@link DSTM4Rail.Channel#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @see DSTM4Rail.DSTM4RailPackage#getChannel()
 * @model abstract="true"
 * @generated
 */
public interface Channel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>DSTM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DSTM4Rail.DSTM#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSTM</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSTM</em>' container reference.
	 * @see #setDSTM(DSTM)
	 * @see DSTM4Rail.DSTM4RailPackage#getChannel_DSTM()
	 * @see DSTM4Rail.DSTM#getChannels
	 * @model opposite="channels" keys="name" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DSTM getDSTM();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Channel#getDSTM <em>DSTM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSTM</em>' container reference.
	 * @see #getDSTM()
	 * @generated
	 */
	void setDSTM(DSTM value);

	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Type</em>' reference.
	 * @see #setChannelType(Type)
	 * @see DSTM4Rail.DSTM4RailPackage#getChannel_ChannelType()
	 * @model keys="name" required="true" ordered="false"
	 * @generated
	 */
	Type getChannelType();

	/**
	 * Sets the value of the '{@link DSTM4Rail.Channel#getChannelType <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' reference.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(Type value);

} // Channel
