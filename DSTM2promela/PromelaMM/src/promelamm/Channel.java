/**
 */
package promelamm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.Channel#getSize <em>Size</em>}</li>
 *   <li>{@link promelamm.Channel#getTypes <em>Types</em>}</li>
 *   <li>{@link promelamm.Channel#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link promelamm.Channel#isExternal <em>External</em>}</li>
 *   <li>{@link promelamm.Channel#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Variable {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see promelamm.PromelammPackage#getChannel_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link promelamm.Channel#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link promelamm.DefaultType}.
	 * The literals are from the enumeration {@link promelamm.DefaultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see promelamm.DefaultType
	 * @see promelamm.PromelammPackage#getChannel_Types()
	 * @model default="mtype" unique="false" required="true"
	 * @generated
	 */
	EList<DefaultType> getTypes();

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see promelamm.PromelammPackage#getChannel_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link promelamm.Channel#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see promelamm.PromelammPackage#getChannel_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link promelamm.Channel#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(String)
	 * @see promelamm.PromelammPackage#getChannel_Annotations()
	 * @model
	 * @generated
	 */
	String getAnnotations();

	/**
	 * Sets the value of the '{@link promelamm.Channel#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(String value);

} // Channel
