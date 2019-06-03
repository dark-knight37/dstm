/**
 */
package promelamm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import promelamm.Enumeration;
import promelamm.Model;
import promelamm.PromelammPackage;
import promelamm.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promelamm.impl.ModelImpl#getMax_proc <em>Max proc</em>}</li>
 *   <li>{@link promelamm.impl.ModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link promelamm.impl.ModelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link promelamm.impl.ModelImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link promelamm.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link promelamm.impl.ModelImpl#getTemp_num <em>Temp num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getMax_proc() <em>Max proc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_proc()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PROC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_proc() <em>Max proc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_proc()
	 * @generated
	 * @ordered
	 */
	protected int max_proc = MAX_PROC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<promelamm.Process> processes;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemp_num() <em>Temp num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp_num()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMP_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTemp_num() <em>Temp num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp_num()
	 * @generated
	 * @ordered
	 */
	protected int temp_num = TEMP_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromelammPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_proc() {
		return max_proc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_proc(int newMax_proc) {
		int oldMax_proc = max_proc;
		max_proc = newMax_proc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.MODEL__MAX_PROC, oldMax_proc, max_proc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<promelamm.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentWithInverseEList<promelamm.Process>(promelamm.Process.class, this, PromelammPackage.MODEL__PROCESSES, PromelammPackage.PROCESS__MODEL);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, PromelammPackage.MODEL__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, PromelammPackage.MODEL__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTemp_num() {
		return temp_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemp_num(int newTemp_num) {
		int oldTemp_num = temp_num;
		temp_num = newTemp_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.MODEL__TEMP_NUM, oldTemp_num, temp_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromelammPackage.MODEL__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromelammPackage.MODEL__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case PromelammPackage.MODEL__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case PromelammPackage.MODEL__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromelammPackage.MODEL__MAX_PROC:
				return getMax_proc();
			case PromelammPackage.MODEL__PROCESSES:
				return getProcesses();
			case PromelammPackage.MODEL__ENUMERATIONS:
				return getEnumerations();
			case PromelammPackage.MODEL__VARIABLES:
				return getVariables();
			case PromelammPackage.MODEL__NAME:
				return getName();
			case PromelammPackage.MODEL__TEMP_NUM:
				return getTemp_num();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PromelammPackage.MODEL__MAX_PROC:
				setMax_proc((Integer)newValue);
				return;
			case PromelammPackage.MODEL__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends promelamm.Process>)newValue);
				return;
			case PromelammPackage.MODEL__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case PromelammPackage.MODEL__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case PromelammPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case PromelammPackage.MODEL__TEMP_NUM:
				setTemp_num((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PromelammPackage.MODEL__MAX_PROC:
				setMax_proc(MAX_PROC_EDEFAULT);
				return;
			case PromelammPackage.MODEL__PROCESSES:
				getProcesses().clear();
				return;
			case PromelammPackage.MODEL__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case PromelammPackage.MODEL__VARIABLES:
				getVariables().clear();
				return;
			case PromelammPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PromelammPackage.MODEL__TEMP_NUM:
				setTemp_num(TEMP_NUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PromelammPackage.MODEL__MAX_PROC:
				return max_proc != MAX_PROC_EDEFAULT;
			case PromelammPackage.MODEL__PROCESSES:
				return processes != null && !processes.isEmpty();
			case PromelammPackage.MODEL__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case PromelammPackage.MODEL__VARIABLES:
				return variables != null && !variables.isEmpty();
			case PromelammPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PromelammPackage.MODEL__TEMP_NUM:
				return temp_num != TEMP_NUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (max_proc: ");
		result.append(max_proc);
		result.append(", name: ");
		result.append(name);
		result.append(", temp_num: ");
		result.append(temp_num);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
