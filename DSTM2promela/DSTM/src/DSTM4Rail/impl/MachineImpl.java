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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.Machine;
import DSTM4Rail.Parameter;
import DSTM4Rail.Transition;
import DSTM4Rail.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.MachineImpl#getDSTM <em>DSTM</em>}</li>
 *   <li>{@link DSTM4Rail.impl.MachineImpl#getVertexes <em>Vertexes</em>}</li>
 *   <li>{@link DSTM4Rail.impl.MachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link DSTM4Rail.impl.MachineImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends NamedElementImpl implements Machine {
	/**
	 * The cached value of the '{@link #getVertexes() <em>Vertexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertexes;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

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
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM getDSTM() {
		if (eContainerFeatureID() != DSTM4RailPackage.MACHINE__DSTM) return null;
		return (DSTM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSTM(DSTM newDSTM, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDSTM, DSTM4RailPackage.MACHINE__DSTM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSTM(DSTM newDSTM) {
		if (newDSTM != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.MACHINE__DSTM && newDSTM != null)) {
			if (EcoreUtil.isAncestor(this, newDSTM))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDSTM != null)
				msgs = ((InternalEObject)newDSTM).eInverseAdd(this, DSTM4RailPackage.DSTM__MACHINES, DSTM.class, msgs);
			msgs = basicSetDSTM(newDSTM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.MACHINE__DSTM, newDSTM, newDSTM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertexes() {
		if (vertexes == null) {
			vertexes = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, DSTM4RailPackage.MACHINE__VERTEXES, DSTM4RailPackage.VERTEX__MACHINE);
		}
		return vertexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, DSTM4RailPackage.MACHINE__TRANSITIONS, DSTM4RailPackage.TRANSITION__MACHINE);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, DSTM4RailPackage.MACHINE__PARAMETERS, DSTM4RailPackage.PARAMETER__MACHINE);
		}
		return parameters;
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
			case DSTM4RailPackage.MACHINE__DSTM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDSTM((DSTM)otherEnd, msgs);
			case DSTM4RailPackage.MACHINE__VERTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVertexes()).basicAdd(otherEnd, msgs);
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case DSTM4RailPackage.MACHINE__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
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
			case DSTM4RailPackage.MACHINE__DSTM:
				return basicSetDSTM(null, msgs);
			case DSTM4RailPackage.MACHINE__VERTEXES:
				return ((InternalEList<?>)getVertexes()).basicRemove(otherEnd, msgs);
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case DSTM4RailPackage.MACHINE__PARAMETERS:
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
			case DSTM4RailPackage.MACHINE__DSTM:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.DSTM__MACHINES, DSTM.class, msgs);
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
			case DSTM4RailPackage.MACHINE__DSTM:
				return getDSTM();
			case DSTM4RailPackage.MACHINE__VERTEXES:
				return getVertexes();
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				return getTransitions();
			case DSTM4RailPackage.MACHINE__PARAMETERS:
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
			case DSTM4RailPackage.MACHINE__DSTM:
				setDSTM((DSTM)newValue);
				return;
			case DSTM4RailPackage.MACHINE__VERTEXES:
				getVertexes().clear();
				getVertexes().addAll((Collection<? extends Vertex>)newValue);
				return;
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case DSTM4RailPackage.MACHINE__PARAMETERS:
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
			case DSTM4RailPackage.MACHINE__DSTM:
				setDSTM((DSTM)null);
				return;
			case DSTM4RailPackage.MACHINE__VERTEXES:
				getVertexes().clear();
				return;
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case DSTM4RailPackage.MACHINE__PARAMETERS:
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
			case DSTM4RailPackage.MACHINE__DSTM:
				return getDSTM() != null;
			case DSTM4RailPackage.MACHINE__VERTEXES:
				return vertexes != null && !vertexes.isEmpty();
			case DSTM4RailPackage.MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case DSTM4RailPackage.MACHINE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
