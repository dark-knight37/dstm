/**
 */
package promelamm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promelamm.Model#getMax_proc <em>Max proc</em>}</li>
 *   <li>{@link promelamm.Model#getProcesses <em>Processes</em>}</li>
 *   <li>{@link promelamm.Model#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link promelamm.Model#getVariables <em>Variables</em>}</li>
 *   <li>{@link promelamm.Model#getName <em>Name</em>}</li>
 *   <li>{@link promelamm.Model#getTemp_num <em>Temp num</em>}</li>
 * </ul>
 *
 * @see promelamm.PromelammPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Max proc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max proc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max proc</em>' attribute.
	 * @see #setMax_proc(int)
	 * @see promelamm.PromelammPackage#getModel_Max_proc()
	 * @model required="true"
	 * @generated
	 */
	int getMax_proc();

	/**
	 * Sets the value of the '{@link promelamm.Model#getMax_proc <em>Max proc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max proc</em>' attribute.
	 * @see #getMax_proc()
	 * @generated
	 */
	void setMax_proc(int value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link promelamm.Process}.
	 * It is bidirectional and its opposite is '{@link promelamm.Process#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see promelamm.PromelammPackage#getModel_Processes()
	 * @see promelamm.Process#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<promelamm.Process> getProcesses();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link promelamm.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see promelamm.PromelammPackage#getModel_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link promelamm.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see promelamm.PromelammPackage#getModel_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

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
	 * @see promelamm.PromelammPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link promelamm.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temp num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp num</em>' attribute.
	 * @see #setTemp_num(int)
	 * @see promelamm.PromelammPackage#getModel_Temp_num()
	 * @model
	 * @generated
	 */
	int getTemp_num();

	/**
	 * Sets the value of the '{@link promelamm.Model#getTemp_num <em>Temp num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp num</em>' attribute.
	 * @see #getTemp_num()
	 * @generated
	 */
	void setTemp_num(int value);

} // Model
