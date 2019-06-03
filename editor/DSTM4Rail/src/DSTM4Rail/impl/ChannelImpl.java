/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.Channel;
import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.ChannelImpl#getDSTM <em>DSTM</em>}</li>
 *   <li>{@link DSTM4Rail.impl.ChannelImpl#getChannelType <em>Channel Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChannelImpl extends NamedElementImpl implements Channel {
	/**
	 * The cached value of the '{@link #getChannelType() <em>Channel Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelType()
	 * @generated
	 * @ordered
	 */
	protected Type channelType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM getDSTM() {
		if (eContainerFeatureID() != DSTM4RailPackage.CHANNEL__DSTM) return null;
		return (DSTM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSTM(DSTM newDSTM, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDSTM, DSTM4RailPackage.CHANNEL__DSTM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSTM(DSTM newDSTM) {
		if (newDSTM != eInternalContainer() || (eContainerFeatureID() != DSTM4RailPackage.CHANNEL__DSTM && newDSTM != null)) {
			if (EcoreUtil.isAncestor(this, newDSTM))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDSTM != null)
				msgs = ((InternalEObject)newDSTM).eInverseAdd(this, DSTM4RailPackage.DSTM__CHANNELS, DSTM.class, msgs);
			msgs = basicSetDSTM(newDSTM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.CHANNEL__DSTM, newDSTM, newDSTM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getChannelType() {
		if (channelType != null && channelType.eIsProxy()) {
			InternalEObject oldChannelType = (InternalEObject)channelType;
			channelType = (Type)eResolveProxy(oldChannelType);
			if (channelType != oldChannelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DSTM4RailPackage.CHANNEL__CHANNEL_TYPE, oldChannelType, channelType));
			}
		}
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetChannelType() {
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelType(Type newChannelType) {
		Type oldChannelType = channelType;
		channelType = newChannelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.CHANNEL__CHANNEL_TYPE, oldChannelType, channelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSTM4RailPackage.CHANNEL__DSTM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDSTM((DSTM)otherEnd, msgs);
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				return basicSetDSTM(null, msgs);
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				return eInternalContainer().eInverseRemove(this, DSTM4RailPackage.DSTM__CHANNELS, DSTM.class, msgs);
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				return getDSTM();
			case DSTM4RailPackage.CHANNEL__CHANNEL_TYPE:
				if (resolve) return getChannelType();
				return basicGetChannelType();
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				setDSTM((DSTM)newValue);
				return;
			case DSTM4RailPackage.CHANNEL__CHANNEL_TYPE:
				setChannelType((Type)newValue);
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				setDSTM((DSTM)null);
				return;
			case DSTM4RailPackage.CHANNEL__CHANNEL_TYPE:
				setChannelType((Type)null);
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
			case DSTM4RailPackage.CHANNEL__DSTM:
				return getDSTM() != null;
			case DSTM4RailPackage.CHANNEL__CHANNEL_TYPE:
				return channelType != null;
		}
		return super.eIsSet(featureID);
	}

} //ChannelImpl
