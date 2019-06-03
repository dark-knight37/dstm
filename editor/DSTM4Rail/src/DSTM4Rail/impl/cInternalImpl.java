/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.cInternal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>cInternal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.cInternalImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class cInternalImpl extends ChannelImpl implements cInternal {
	/**
	 * The default value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected static final int BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected int bound = BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cInternalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.CINTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBound(int newBound) {
		int oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DSTM4RailPackage.CINTERNAL__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSTM4RailPackage.CINTERNAL__BOUND:
				return getBound();
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
			case DSTM4RailPackage.CINTERNAL__BOUND:
				setBound((Integer)newValue);
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
			case DSTM4RailPackage.CINTERNAL__BOUND:
				setBound(BOUND_EDEFAULT);
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
			case DSTM4RailPackage.CINTERNAL__BOUND:
				return bound != BOUND_EDEFAULT;
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
		result.append(" (bound: ");
		result.append(bound);
		result.append(')');
		return result.toString();
	}

} //cInternalImpl
