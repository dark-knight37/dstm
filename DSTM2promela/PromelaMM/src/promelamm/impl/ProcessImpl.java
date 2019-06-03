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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import promelamm.AbstractStatement;
import promelamm.Model;
import promelamm.Parameter;
import promelamm.PromelammPackage;
import promelamm.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promelamm.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#getProcVariables <em>Proc Variables</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#getModel <em>Model</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#getProcessStatements <em>Process Statements</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link promelamm.impl.ProcessImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements promelamm.Process {
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
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcVariables() <em>Proc Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> procVariables;

	/**
	 * The cached value of the '{@link #getProcessStatements() <em>Process Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStatement> processStatements;

	/**
	 * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromelammPackage.Literals.PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.PROCESS__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getProcVariables() {
		if (procVariables == null) {
			procVariables = new EObjectContainmentEList<Variable>(Variable.class, this, PromelammPackage.PROCESS__PROC_VARIABLES);
		}
		return procVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != PromelammPackage.PROCESS__MODEL) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, PromelammPackage.PROCESS__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != PromelammPackage.PROCESS__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, PromelammPackage.MODEL__PROCESSES, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.PROCESS__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStatement> getProcessStatements() {
		if (processStatements == null) {
			processStatements = new EObjectContainmentEList<AbstractStatement>(AbstractStatement.class, this, PromelammPackage.PROCESS__PROCESS_STATEMENTS);
		}
		return processStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMain() {
		return isMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMain(boolean newIsMain) {
		boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.PROCESS__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, PromelammPackage.PROCESS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromelammPackage.PROCESS__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
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
			case PromelammPackage.PROCESS__PROC_VARIABLES:
				return ((InternalEList<?>)getProcVariables()).basicRemove(otherEnd, msgs);
			case PromelammPackage.PROCESS__MODEL:
				return basicSetModel(null, msgs);
			case PromelammPackage.PROCESS__PROCESS_STATEMENTS:
				return ((InternalEList<?>)getProcessStatements()).basicRemove(otherEnd, msgs);
			case PromelammPackage.PROCESS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PromelammPackage.PROCESS__MODEL:
				return eInternalContainer().eInverseRemove(this, PromelammPackage.MODEL__PROCESSES, Model.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromelammPackage.PROCESS__NAME:
				return getName();
			case PromelammPackage.PROCESS__IS_ACTIVE:
				return isIsActive();
			case PromelammPackage.PROCESS__PROC_VARIABLES:
				return getProcVariables();
			case PromelammPackage.PROCESS__MODEL:
				return getModel();
			case PromelammPackage.PROCESS__PROCESS_STATEMENTS:
				return getProcessStatements();
			case PromelammPackage.PROCESS__IS_MAIN:
				return isIsMain();
			case PromelammPackage.PROCESS__PARAMETERS:
				return getParameters();
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
			case PromelammPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case PromelammPackage.PROCESS__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case PromelammPackage.PROCESS__PROC_VARIABLES:
				getProcVariables().clear();
				getProcVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case PromelammPackage.PROCESS__MODEL:
				setModel((Model)newValue);
				return;
			case PromelammPackage.PROCESS__PROCESS_STATEMENTS:
				getProcessStatements().clear();
				getProcessStatements().addAll((Collection<? extends AbstractStatement>)newValue);
				return;
			case PromelammPackage.PROCESS__IS_MAIN:
				setIsMain((Boolean)newValue);
				return;
			case PromelammPackage.PROCESS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case PromelammPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PromelammPackage.PROCESS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case PromelammPackage.PROCESS__PROC_VARIABLES:
				getProcVariables().clear();
				return;
			case PromelammPackage.PROCESS__MODEL:
				setModel((Model)null);
				return;
			case PromelammPackage.PROCESS__PROCESS_STATEMENTS:
				getProcessStatements().clear();
				return;
			case PromelammPackage.PROCESS__IS_MAIN:
				setIsMain(IS_MAIN_EDEFAULT);
				return;
			case PromelammPackage.PROCESS__PARAMETERS:
				getParameters().clear();
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
			case PromelammPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PromelammPackage.PROCESS__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case PromelammPackage.PROCESS__PROC_VARIABLES:
				return procVariables != null && !procVariables.isEmpty();
			case PromelammPackage.PROCESS__MODEL:
				return getModel() != null;
			case PromelammPackage.PROCESS__PROCESS_STATEMENTS:
				return processStatements != null && !processStatements.isEmpty();
			case PromelammPackage.PROCESS__IS_MAIN:
				return isMain != IS_MAIN_EDEFAULT;
			case PromelammPackage.PROCESS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", isMain: ");
		result.append(isMain);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
