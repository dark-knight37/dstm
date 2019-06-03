/**
 */
package DSTM4Rail.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.tMultiType;
import DSTM4Rail.tSimpleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tSimple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.tSimpleTypeImpl#getTMultiType <em>TMulti Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class tSimpleTypeImpl extends TypeImpl implements tSimpleType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tSimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.TSIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tMultiType getTMultiType() {
		if (eContainerFeatureID() != DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE) return null;
		return (tMultiType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTMultiType(tMultiType newTMultiType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTMultiType, DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTMultiType(tMultiType newTMultiType) {
		if (newTMultiType != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE && newTMultiType != null)) {
			if (EcoreUtil.isAncestor(this, newTMultiType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTMultiType != null)
				msgs = ((InternalEObject)newTMultiType).eInverseAdd(this, DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY, tMultiType.class, msgs);
			msgs = basicSetTMultiType(newTMultiType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE, newTMultiType, newTMultiType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTMultiType((tMultiType)otherEnd, msgs);
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				return basicSetTMultiType(null, msgs);
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY, tMultiType.class, msgs);
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				return getTMultiType();
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				setTMultiType((tMultiType)newValue);
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				setTMultiType((tMultiType)null);
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
			case DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE:
				return getTMultiType() != null;
		}
		return super.eIsSet(featureID);
	}

} //tSimpleTypeImpl
