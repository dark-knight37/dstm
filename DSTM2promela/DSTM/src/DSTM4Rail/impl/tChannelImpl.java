/**
 */
package DSTM4Rail.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.tChannel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tChannel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DSTM4Rail.impl.tChannelImpl#getChannel_names <em>Channel names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class tChannelImpl extends tBasicImpl implements tChannel {
	/**
	 * The cached value of the '{@link #getChannel_names() <em>Channel names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel_names()
	 * @generated
	 * @ordered
	 */
	protected EList<String> channel_names;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DSTM4RailPackage.Literals.TCHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChannel_names() {
		if (channel_names == null) {
			channel_names = new EDataTypeUniqueEList<String>(String.class, this, DSTM4RailPackage.TCHANNEL__CHANNEL_NAMES);
		}
		return channel_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DSTM4RailPackage.TCHANNEL__CHANNEL_NAMES:
				return getChannel_names();
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
			case DSTM4RailPackage.TCHANNEL__CHANNEL_NAMES:
				getChannel_names().clear();
				getChannel_names().addAll((Collection<? extends String>)newValue);
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
			case DSTM4RailPackage.TCHANNEL__CHANNEL_NAMES:
				getChannel_names().clear();
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
			case DSTM4RailPackage.TCHANNEL__CHANNEL_NAMES:
				return channel_names != null && !channel_names.isEmpty();
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
		result.append(" (channel_names: ");
		result.append(channel_names);
		result.append(')');
		return result.toString();
	}

} //tChannelImpl
