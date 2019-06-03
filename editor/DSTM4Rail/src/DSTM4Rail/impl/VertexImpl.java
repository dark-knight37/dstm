/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.Machine;
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
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.VertexImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link DSTM4Rail.impl.VertexImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VertexImpl extends NamedElementImpl implements Vertex {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequirements() {
		if (requirements == null) {
			requirements = new EDataTypeUniqueEList<String>(String.class, this, DSTM4RailPackage.VERTEX__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMachine() {
		if (eContainerFeatureID() != DSTM4RailPackage.VERTEX__MACHINE) return null;
		return (Machine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachine(Machine newMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMachine, DSTM4RailPackage.VERTEX__MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(Machine newMachine) {
		if (newMachine != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.VERTEX__MACHINE && newMachine != null)) {
			if (EcoreUtil.isAncestor(this, newMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMachine != null)
				msgs = ((InternalEObject)newMachine).eInverseAdd(this, DSTM4RailPackage.MACHINE__VERTEXES, Machine.class, msgs);
			msgs = basicSetMachine(newMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.VERTEX__MACHINE, newMachine, newMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSTM4RailPackage.VERTEX__MACHINE:
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
			case DSTM4RailPackage.VERTEX__MACHINE:
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
			case DSTM4RailPackage.VERTEX__MACHINE:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.MACHINE__VERTEXES, Machine.class, msgs);
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
			case DSTM4RailPackage.VERTEX__REQUIREMENTS:
				return getRequirements();
			case DSTM4RailPackage.VERTEX__MACHINE:
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
			case DSTM4RailPackage.VERTEX__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends String>)newValue);
				return;
			case DSTM4RailPackage.VERTEX__MACHINE:
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
			case DSTM4RailPackage.VERTEX__REQUIREMENTS:
				getRequirements().clear();
				return;
			case DSTM4RailPackage.VERTEX__MACHINE:
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
			case DSTM4RailPackage.VERTEX__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case DSTM4RailPackage.VERTEX__MACHINE:
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
		result.append(" (requirements: ");
		result.append(requirements);
		result.append(')');
		return result.toString();
	}

} //VertexImpl
