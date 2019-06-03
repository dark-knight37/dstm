/**
 */
package tesqel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesqel.CompoundFiring;
import tesqel.FOrder;
import tesqel.Firing;
import tesqel.Message;
import tesqel.TesqelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Firing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesqel.impl.CompoundFiringImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesqel.impl.CompoundFiringImpl#getFiring <em>Firing</em>}</li>
 *   <li>{@link tesqel.impl.CompoundFiringImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link tesqel.impl.CompoundFiringImpl#getIOmessage <em>IOmessage</em>}</li>
 *   <li>{@link tesqel.impl.CompoundFiringImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundFiringImpl extends MinimalEObjectImpl.Container implements CompoundFiring {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> annotations;

	/**
	 * The cached value of the '{@link #getFiring() <em>Firing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiring()
	 * @generated
	 * @ordered
	 */
	protected EList<Firing> firing;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIOmessage() <em>IOmessage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOmessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> iOmessage;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<FOrder> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundFiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesqelPackage.Literals.COMPOUND_FIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<String>(String.class, this, TesqelPackage.COMPOUND_FIRING__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Firing> getFiring() {
		if (firing == null) {
			firing = new EObjectContainmentEList<Firing>(Firing.class, this, TesqelPackage.COMPOUND_FIRING__FIRING);
		}
		return firing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.COMPOUND_FIRING__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getIOmessage() {
		if (iOmessage == null) {
			iOmessage = new EObjectContainmentEList<Message>(Message.class, this, TesqelPackage.COMPOUND_FIRING__IOMESSAGE);
		}
		return iOmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FOrder> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<FOrder>(FOrder.class, this, TesqelPackage.COMPOUND_FIRING__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesqelPackage.COMPOUND_FIRING__FIRING:
				return ((InternalEList<?>)getFiring()).basicRemove(otherEnd, msgs);
			case TesqelPackage.COMPOUND_FIRING__IOMESSAGE:
				return ((InternalEList<?>)getIOmessage()).basicRemove(otherEnd, msgs);
			case TesqelPackage.COMPOUND_FIRING__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case TesqelPackage.COMPOUND_FIRING__ANNOTATIONS:
				return getAnnotations();
			case TesqelPackage.COMPOUND_FIRING__FIRING:
				return getFiring();
			case TesqelPackage.COMPOUND_FIRING__ORDER:
				return getOrder();
			case TesqelPackage.COMPOUND_FIRING__IOMESSAGE:
				return getIOmessage();
			case TesqelPackage.COMPOUND_FIRING__LINK:
				return getLink();
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
			case TesqelPackage.COMPOUND_FIRING__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.COMPOUND_FIRING__FIRING:
				getFiring().clear();
				getFiring().addAll((Collection<? extends Firing>)newValue);
				return;
			case TesqelPackage.COMPOUND_FIRING__ORDER:
				setOrder((Integer)newValue);
				return;
			case TesqelPackage.COMPOUND_FIRING__IOMESSAGE:
				getIOmessage().clear();
				getIOmessage().addAll((Collection<? extends Message>)newValue);
				return;
			case TesqelPackage.COMPOUND_FIRING__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends FOrder>)newValue);
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
			case TesqelPackage.COMPOUND_FIRING__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TesqelPackage.COMPOUND_FIRING__FIRING:
				getFiring().clear();
				return;
			case TesqelPackage.COMPOUND_FIRING__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case TesqelPackage.COMPOUND_FIRING__IOMESSAGE:
				getIOmessage().clear();
				return;
			case TesqelPackage.COMPOUND_FIRING__LINK:
				getLink().clear();
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
			case TesqelPackage.COMPOUND_FIRING__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TesqelPackage.COMPOUND_FIRING__FIRING:
				return firing != null && !firing.isEmpty();
			case TesqelPackage.COMPOUND_FIRING__ORDER:
				return order != ORDER_EDEFAULT;
			case TesqelPackage.COMPOUND_FIRING__IOMESSAGE:
				return iOmessage != null && !iOmessage.isEmpty();
			case TesqelPackage.COMPOUND_FIRING__LINK:
				return link != null && !link.isEmpty();
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
		result.append(" (annotations: ");
		result.append(annotations);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //CompoundFiringImpl
