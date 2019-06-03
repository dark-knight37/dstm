/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.tBasic;
import DSTM4Rail.tCompound;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tBasic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.tBasicImpl#getTCompound <em>TCompound</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class tBasicImpl extends tSimpleTypeImpl implements tBasic {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tBasicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.TBASIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tCompound getTCompound() {
		if (eContainerFeatureID() != DSTM4RailPackage.TBASIC__TCOMPOUND) return null;
		return (tCompound)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCompound(tCompound newTCompound, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTCompound, DSTM4RailPackage.TBASIC__TCOMPOUND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCompound(tCompound newTCompound) {
		if (newTCompound != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.TBASIC__TCOMPOUND && newTCompound != null)) {
			if (EcoreUtil.isAncestor(this, newTCompound))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTCompound != null)
				msgs = ((InternalEObject)newTCompound).eInverseAdd(this, DSTM4RailPackage.TCOMPOUND__SUBTYPES, tCompound.class, msgs);
			msgs = basicSetTCompound(newTCompound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TBASIC__TCOMPOUND, newTCompound, newTCompound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTCompound((tCompound)otherEnd, msgs);
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
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				return basicSetTCompound(null, msgs);
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
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.TCOMPOUND__SUBTYPES, tCompound.class, msgs);
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
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				return getTCompound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				setTCompound((tCompound)newValue);
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
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				setTCompound((tCompound)null);
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
			case DSTM4RailPackage.TBASIC__TCOMPOUND:
				return getTCompound() != null;
		}
		return super.eIsSet(featureID);
	}

} //tBasicImpl
