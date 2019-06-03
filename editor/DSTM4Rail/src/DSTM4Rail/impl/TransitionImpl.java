/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.EnteringNode;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.Machine;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#isIs_preemptive <em>Is preemptive</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getPar_instantiation <em>Par instantiation</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getExiting_node <em>Exiting node</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getEntering_node <em>Entering node</em>}</li>
 *   <li>{@link DSTM4Rail.impl.TransitionImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actions;

	/**
	 * The default value of the '{@link #isIs_preemptive() <em>Is preemptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_preemptive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PREEMPTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_preemptive() <em>Is preemptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_preemptive()
	 * @generated
	 * @ordered
	 */
	protected boolean is_preemptive = IS_PREEMPTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPar_instantiation() <em>Par instantiation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar_instantiation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> par_instantiation;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requirements;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Vertex destination;

	/**
	 * The cached value of the '{@link #getExiting_node() <em>Exiting node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExiting_node()
	 * @generated
	 * @ordered
	 */
	protected ExitingNode exiting_node;

	/**
	 * The cached value of the '{@link #getEntering_node() <em>Entering node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntering_node()
	 * @generated
	 * @ordered
	 */
	protected EnteringNode entering_node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActions() {
		if (actions == null) {
			actions = new EDataTypeUniqueEList<String>(String.class, this, DSTM4RailPackage.TRANSITION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_preemptive() {
		return is_preemptive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_preemptive(boolean newIs_preemptive) {
		boolean oldIs_preemptive = is_preemptive;
		is_preemptive = newIs_preemptive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__IS_PREEMPTIVE, oldIs_preemptive, is_preemptive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPar_instantiation() {
		if (par_instantiation == null) {
			par_instantiation = new EDataTypeUniqueEList<String>(String.class, this, DSTM4RailPackage.TRANSITION__PAR_INSTANTIATION);
		}
		return par_instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequirements() {
		if (requirements == null) {
			requirements = new EDataTypeUniqueEList<String>(String.class, this, DSTM4RailPackage.TRANSITION__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Vertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Vertex)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.TRANSITION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Vertex newDestination) {
		Vertex oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitingNode getExiting_node() {
		if (exiting_node != null && exiting_node.eIsProxy()) {
			InternalEObject oldExiting_node = (InternalEObject)exiting_node;
			exiting_node = (ExitingNode)eResolveProxy(oldExiting_node);
			if (exiting_node != oldExiting_node) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.TRANSITION__EXITING_NODE, oldExiting_node, exiting_node));
			}
		}
		return exiting_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitingNode basicGetExiting_node() {
		return exiting_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExiting_node(ExitingNode newExiting_node) {
		ExitingNode oldExiting_node = exiting_node;
		exiting_node = newExiting_node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__EXITING_NODE, oldExiting_node, exiting_node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteringNode getEntering_node() {
		if (entering_node != null && entering_node.eIsProxy()) {
			InternalEObject oldEntering_node = (InternalEObject)entering_node;
			entering_node = (EnteringNode)eResolveProxy(oldEntering_node);
			if (entering_node != oldEntering_node) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.TRANSITION__ENTERING_NODE, oldEntering_node, entering_node));
			}
		}
		return entering_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteringNode basicGetEntering_node() {
		return entering_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntering_node(EnteringNode newEntering_node) {
		EnteringNode oldEntering_node = entering_node;
		entering_node = newEntering_node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__ENTERING_NODE, oldEntering_node, entering_node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMachine() {
		if (eContainerFeatureID() != DSTM4RailPackage.TRANSITION__MACHINE) return null;
		return (Machine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachine(Machine newMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMachine, DSTM4RailPackage.TRANSITION__MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(Machine newMachine) {
		if (newMachine != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.TRANSITION__MACHINE && newMachine != null)) {
			if (EcoreUtil.isAncestor(this, newMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMachine != null)
				msgs = ((InternalEObject)newMachine).eInverseAdd(this, DSTM4RailPackage.MACHINE__TRANSITIONS, Machine.class, msgs);
			msgs = basicSetMachine(newMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TRANSITION__MACHINE, newMachine, newMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSTM4RailPackage.TRANSITION__MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMachine((Machine)otherEnd, msgs);
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
			case DSTM4RailPackage.TRANSITION__MACHINE:
				return basicSetMachine(null, msgs);
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
			case DSTM4RailPackage.TRANSITION__MACHINE:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.MACHINE__TRANSITIONS, Machine.class, msgs);
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
			case DSTM4RailPackage.TRANSITION__TRIGGER:
				return getTrigger();
			case DSTM4RailPackage.TRANSITION__CONDITION:
				return getCondition();
			case DSTM4RailPackage.TRANSITION__ACTIONS:
				return getActions();
			case DSTM4RailPackage.TRANSITION__IS_PREEMPTIVE:
				return isIs_preemptive();
			case DSTM4RailPackage.TRANSITION__PAR_INSTANTIATION:
				return getPar_instantiation();
			case DSTM4RailPackage.TRANSITION__REQUIREMENTS:
				return getRequirements();
			case DSTM4RailPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DSTM4RailPackage.TRANSITION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case DSTM4RailPackage.TRANSITION__EXITING_NODE:
				if (resolve) return getExiting_node();
				return basicGetExiting_node();
			case DSTM4RailPackage.TRANSITION__ENTERING_NODE:
				if (resolve) return getEntering_node();
				return basicGetEntering_node();
			case DSTM4RailPackage.TRANSITION__MACHINE:
				return getMachine();
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
			case DSTM4RailPackage.TRANSITION__TRIGGER:
				setTrigger((String)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends String>)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__IS_PREEMPTIVE:
				setIs_preemptive((Boolean)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__PAR_INSTANTIATION:
				getPar_instantiation().clear();
				getPar_instantiation().addAll((Collection<? extends String>)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends String>)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__DESTINATION:
				setDestination((Vertex)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__EXITING_NODE:
				setExiting_node((ExitingNode)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__ENTERING_NODE:
				setEntering_node((EnteringNode)newValue);
				return;
			case DSTM4RailPackage.TRANSITION__MACHINE:
				setMachine((Machine)newValue);
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
			case DSTM4RailPackage.TRANSITION__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case DSTM4RailPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case DSTM4RailPackage.TRANSITION__ACTIONS:
				getActions().clear();
				return;
			case DSTM4RailPackage.TRANSITION__IS_PREEMPTIVE:
				setIs_preemptive(IS_PREEMPTIVE_EDEFAULT);
				return;
			case DSTM4RailPackage.TRANSITION__PAR_INSTANTIATION:
				getPar_instantiation().clear();
				return;
			case DSTM4RailPackage.TRANSITION__REQUIREMENTS:
				getRequirements().clear();
				return;
			case DSTM4RailPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case DSTM4RailPackage.TRANSITION__DESTINATION:
				setDestination((Vertex)null);
				return;
			case DSTM4RailPackage.TRANSITION__EXITING_NODE:
				setExiting_node((ExitingNode)null);
				return;
			case DSTM4RailPackage.TRANSITION__ENTERING_NODE:
				setEntering_node((EnteringNode)null);
				return;
			case DSTM4RailPackage.TRANSITION__MACHINE:
				setMachine((Machine)null);
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
			case DSTM4RailPackage.TRANSITION__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case DSTM4RailPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case DSTM4RailPackage.TRANSITION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case DSTM4RailPackage.TRANSITION__IS_PREEMPTIVE:
				return is_preemptive != IS_PREEMPTIVE_EDEFAULT;
			case DSTM4RailPackage.TRANSITION__PAR_INSTANTIATION:
				return par_instantiation != null && !par_instantiation.isEmpty();
			case DSTM4RailPackage.TRANSITION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case DSTM4RailPackage.TRANSITION__SOURCE:
				return source != null;
			case DSTM4RailPackage.TRANSITION__DESTINATION:
				return destination != null;
			case DSTM4RailPackage.TRANSITION__EXITING_NODE:
				return exiting_node != null;
			case DSTM4RailPackage.TRANSITION__ENTERING_NODE:
				return entering_node != null;
			case DSTM4RailPackage.TRANSITION__MACHINE:
				return getMachine() != null;
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
		result.append(" (trigger: ");
		result.append(trigger);
		result.append(", condition: ");
		result.append(condition);
		result.append(", actions: ");
		result.append(actions);
		result.append(", is_preemptive: ");
		result.append(is_preemptive);
		result.append(", par_instantiation: ");
		result.append(par_instantiation);
		result.append(", requirements: ");
		result.append(requirements);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
