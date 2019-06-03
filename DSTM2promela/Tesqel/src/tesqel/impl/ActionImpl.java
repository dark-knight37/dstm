/**
 */
package tesqel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tesqel.Action;
import tesqel.ActionKind;
import tesqel.TesqelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesqel.impl.ActionImpl#getRvalue <em>Rvalue</em>}</li>
 *   <li>{@link tesqel.impl.ActionImpl#getLvalue <em>Lvalue</em>}</li>
 *   <li>{@link tesqel.impl.ActionImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends PhaseImpl implements Action {
	/**
	 * The default value of the '{@link #getRvalue() <em>Rvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String RVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRvalue() <em>Rvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRvalue()
	 * @generated
	 * @ordered
	 */
	protected String rvalue = RVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String LVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLvalue() <em>Lvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvalue()
	 * @generated
	 * @ordered
	 */
	protected String lvalue = LVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ActionKind KIND_EDEFAULT = ActionKind.ASSIGNMENT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ActionKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesqelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRvalue() {
		return rvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRvalue(String newRvalue) {
		String oldRvalue = rvalue;
		rvalue = newRvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.ACTION__RVALUE, oldRvalue, rvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLvalue() {
		return lvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvalue(String newLvalue) {
		String oldLvalue = lvalue;
		lvalue = newLvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.ACTION__LVALUE, oldLvalue, lvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ActionKind newKind) {
		ActionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TesqelPackage.ACTION__RVALUE:
				return getRvalue();
			case TesqelPackage.ACTION__LVALUE:
				return getLvalue();
			case TesqelPackage.ACTION__KIND:
				return getKind();
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
			case TesqelPackage.ACTION__RVALUE:
				setRvalue((String)newValue);
				return;
			case TesqelPackage.ACTION__LVALUE:
				setLvalue((String)newValue);
				return;
			case TesqelPackage.ACTION__KIND:
				setKind((ActionKind)newValue);
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
			case TesqelPackage.ACTION__RVALUE:
				setRvalue(RVALUE_EDEFAULT);
				return;
			case TesqelPackage.ACTION__LVALUE:
				setLvalue(LVALUE_EDEFAULT);
				return;
			case TesqelPackage.ACTION__KIND:
				setKind(KIND_EDEFAULT);
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
			case TesqelPackage.ACTION__RVALUE:
				return RVALUE_EDEFAULT == null ? rvalue != null : !RVALUE_EDEFAULT.equals(rvalue);
			case TesqelPackage.ACTION__LVALUE:
				return LVALUE_EDEFAULT == null ? lvalue != null : !LVALUE_EDEFAULT.equals(lvalue);
			case TesqelPackage.ACTION__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (rvalue: ");
		result.append(rvalue);
		result.append(", lvalue: ");
		result.append(lvalue);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
