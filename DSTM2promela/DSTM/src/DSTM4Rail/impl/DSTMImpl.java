/**
 */
package DSTM4Rail.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import DSTM4Rail.Channel;
import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.Machine;
import DSTM4Rail.Type;
import DSTM4Rail.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSTM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.DSTMImpl#getMachines <em>Machines</em>}</li>
 *   <li>{@link DSTM4Rail.impl.DSTMImpl#getMain <em>Main</em>}</li>
 *   <li>{@link DSTM4Rail.impl.DSTMImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link DSTM4Rail.impl.DSTMImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link DSTM4Rail.impl.DSTMImpl#getGlobal_variables <em>Global variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSTMImpl extends NamedElementImpl implements DSTM {
	/**
	 * The cached value of the '{@link #getMachines() <em>Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> machines;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Machine main;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<Channel> channels;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getGlobal_variables() <em>Global variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal_variables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> global_variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSTMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.DSTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getMachines() {
		if (machines == null) {
			machines = new EObjectContainmentWithInverseEList<Machine>(Machine.class, this, DSTM4RailPackage.DSTM__MACHINES, DSTM4RailPackage.MACHINE__DSTM);
		}
		return machines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMain() {
		if (main != null && main.eIsProxy()) {
			InternalEObject oldMain = (InternalEObject)main;
			main = (Machine)eResolveProxy(oldMain);
			if (main != oldMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.DSTM__MAIN, oldMain, main));
			}
		}
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Machine newMain) {
		Machine oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.DSTM__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Channel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentWithInverseEList<Channel>(Channel.class, this, DSTM4RailPackage.DSTM__CHANNELS, DSTM4RailPackage.CHANNEL__DSTM);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, DSTM4RailPackage.DSTM__TYPES, DSTM4RailPackage.TYPE__DSTM);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getGlobal_variables() {
		if (global_variables == null) {
			global_variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, DSTM4RailPackage.DSTM__GLOBAL_VARIABLES, DSTM4RailPackage.VARIABLE__DSTM);
		}
		return global_variables;
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
			case DSTM4RailPackage.DSTM__MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMachines()).basicAdd(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__CHANNELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChannels()).basicAdd(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGlobal_variables()).basicAdd(otherEnd, msgs);
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
			case DSTM4RailPackage.DSTM__MACHINES:
				return ((InternalEList<?>)getMachines()).basicRemove(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				return ((InternalEList<?>)getGlobal_variables()).basicRemove(otherEnd, msgs);
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
			case DSTM4RailPackage.DSTM__MACHINES:
				return getMachines();
			case DSTM4RailPackage.DSTM__MAIN:
				if (resolve) return getMain();
				return basicGetMain();
			case DSTM4RailPackage.DSTM__CHANNELS:
				return getChannels();
			case DSTM4RailPackage.DSTM__TYPES:
				return getTypes();
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				return getGlobal_variables();
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
			case DSTM4RailPackage.DSTM__MACHINES:
				getMachines().clear();
				getMachines().addAll((Collection<? extends Machine>)newValue);
				return;
			case DSTM4RailPackage.DSTM__MAIN:
				setMain((Machine)newValue);
				return;
			case DSTM4RailPackage.DSTM__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case DSTM4RailPackage.DSTM__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				getGlobal_variables().clear();
				getGlobal_variables().addAll((Collection<? extends Variable>)newValue);
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
			case DSTM4RailPackage.DSTM__MACHINES:
				getMachines().clear();
				return;
			case DSTM4RailPackage.DSTM__MAIN:
				setMain((Machine)null);
				return;
			case DSTM4RailPackage.DSTM__CHANNELS:
				getChannels().clear();
				return;
			case DSTM4RailPackage.DSTM__TYPES:
				getTypes().clear();
				return;
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				getGlobal_variables().clear();
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
			case DSTM4RailPackage.DSTM__MACHINES:
				return machines != null && !machines.isEmpty();
			case DSTM4RailPackage.DSTM__MAIN:
				return main != null;
			case DSTM4RailPackage.DSTM__CHANNELS:
				return channels != null && !channels.isEmpty();
			case DSTM4RailPackage.DSTM__TYPES:
				return types != null && !types.isEmpty();
			case DSTM4RailPackage.DSTM__GLOBAL_VARIABLES:
				return global_variables != null && !global_variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DSTMImpl
