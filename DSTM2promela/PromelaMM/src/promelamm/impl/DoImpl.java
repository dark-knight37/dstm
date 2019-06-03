/**
 */
package promelamm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import promelamm.Do;
import promelamm.PromelammPackage;
import promelamm.Unless;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Do</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promelamm.impl.DoImpl#getUnlessCase <em>Unless Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoImpl extends CompositeStatementImpl implements Do {
	/**
	 * The cached value of the '{@link #getUnlessCase() <em>Unless Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlessCase()
	 * @generated
	 * @ordered
	 */
	protected Unless unlessCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromelammPackage.Literals.DO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unless getUnlessCase() {
		if (unlessCase != null && unlessCase.eIsProxy()) {
			InternalEObject oldUnlessCase = (InternalEObject)unlessCase;
			unlessCase = (Unless)eResolveProxy(oldUnlessCase);
			if (unlessCase != oldUnlessCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromelammPackage.DO__UNLESS_CASE, oldUnlessCase, unlessCase));
			}
		}
		return unlessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unless basicGetUnlessCase() {
		return unlessCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlessCase(Unless newUnlessCase) {
		Unless oldUnlessCase = unlessCase;
		unlessCase = newUnlessCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.DO__UNLESS_CASE, oldUnlessCase, unlessCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromelammPackage.DO__UNLESS_CASE:
				if (resolve) return getUnlessCase();
				return basicGetUnlessCase();
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
			case PromelammPackage.DO__UNLESS_CASE:
				setUnlessCase((Unless)newValue);
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
			case PromelammPackage.DO__UNLESS_CASE:
				setUnlessCase((Unless)null);
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
			case PromelammPackage.DO__UNLESS_CASE:
				return unlessCase != null;
		}
		return super.eIsSet(featureID);
	}

} //DoImpl
