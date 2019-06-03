/**
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstm.xDstm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Machine#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Machine#getVertexes <em>Vertexes</em>}</li>
 *   <li>{@link org.xtext.unina.xdstm.xDstm.Machine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
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
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.unina.xdstm.xDstm.Machine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vertexes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unina.xdstm.xDstm.Vertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertexes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertexes</em>' containment reference list.
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getMachine_Vertexes()
   * @model containment="true"
   * @generated
   */
  EList<Vertex> getVertexes();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.unina.xdstm.xDstm.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.unina.xdstm.xDstm.XDstmPackage#getMachine_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Machine