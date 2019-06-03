/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.xDstm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Box#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Box#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Box#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 *
 * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends Vertex, Destination, Source
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getBox_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.unina.xdstm.xDstm.Box#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference.
   * @see #setRequirements(requirements)
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getBox_Requirements()
   * @model containment="true"
   * @generated
   */
  requirements getRequirements();

  /**
   * Sets the value of the '{@link org.xtext.unina.xdstm.xDstm.Box#getRequirements <em>Requirements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirements</em>' containment reference.
   * @see #getRequirements()
   * @generated
   */
  void setRequirements(requirements value);

  /**
   * Returns the value of the '<em><b>Instantiation</b></em>' reference list.
   * The list contents are of type {@link org.xtext.unina.xdstm.xDstm.Machine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiation</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiation</em>' reference list.
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getBox_Instantiation()
   * @model
   * @generated
   */
  EList<Machine> getInstantiation();

} // Box
