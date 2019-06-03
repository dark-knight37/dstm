/**
 */
package DSTM4Rail.impl;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.tMultiType;
import DSTM4Rail.tSimpleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tMulti Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.tMultiTypeImpl#getComposedBy <em>Composed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tMultiTypeImpl extends TypeImpl implements tMultiType {
	/**
	 * The cached value of the '{@link #getComposedBy() <em>Composed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<tSimpleType> composedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tMultiTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.TMULTI_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tSimpleType> getComposedBy() {
		if (composedBy == null) {
			composedBy = new EObjectContainmentWithInverseEList<tSimpleType>(tSimpleType.class, this, DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY, DSTM4RailPackage.TSIMPLE_TYPE__TMULTI_TYPE);
		}
		return composedBy;
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComposedBy()).basicAdd(otherEnd, msgs);
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				return ((InternalEList<?>)getComposedBy()).basicRemove(otherEnd, msgs);
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				return getComposedBy();
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				getComposedBy().clear();
				getComposedBy().addAll((Collection<? extends tSimpleType>)newValue);
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				getComposedBy().clear();
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
			case DSTM4RailPackage.TMULTI_TYPE__COMPOSED_BY:
				return composedBy != null && !composedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //tMultiTypeImpl
