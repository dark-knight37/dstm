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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tesqel.Firing;
import tesqel.Phase;
import tesqel.TesqelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesqel.impl.FiringImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link tesqel.impl.FiringImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link tesqel.impl.FiringImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link tesqel.impl.FiringImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link tesqel.impl.FiringImpl#getNext <em>Next</em>}</li>
 *   <li>{@link tesqel.impl.FiringImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiringImpl extends MinimalEObjectImpl.Container implements Firing {
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
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected EList<Phase> phase;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected EList<String> current;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> transition;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> next;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesqelPackage.Literals.FIRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAnnotations() {
		if (annotations == null) {
			annotations = new EDataTypeUniqueEList<String>(String.class, this, TesqelPackage.FIRING__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phase> getPhase() {
		if (phase == null) {
			phase = new EObjectContainmentEList<Phase>(Phase.class, this, TesqelPackage.FIRING__PHASE);
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCurrent() {
		if (current == null) {
			current = new EDataTypeEList<String>(String.class, this, TesqelPackage.FIRING__CURRENT);
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTransition() {
		if (transition == null) {
			transition = new EDataTypeEList<String>(String.class, this, TesqelPackage.FIRING__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNext() {
		if (next == null) {
			next = new EDataTypeEList<String>(String.class, this, TesqelPackage.FIRING__NEXT);
		}
		return next;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.FIRING__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesqelPackage.FIRING__PHASE:
				return ((InternalEList<?>)getPhase()).basicRemove(otherEnd, msgs);
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
			case TesqelPackage.FIRING__ANNOTATIONS:
				return getAnnotations();
			case TesqelPackage.FIRING__PHASE:
				return getPhase();
			case TesqelPackage.FIRING__CURRENT:
				return getCurrent();
			case TesqelPackage.FIRING__TRANSITION:
				return getTransition();
			case TesqelPackage.FIRING__NEXT:
				return getNext();
			case TesqelPackage.FIRING__ORDER:
				return getOrder();
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
			case TesqelPackage.FIRING__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.FIRING__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends Phase>)newValue);
				return;
			case TesqelPackage.FIRING__CURRENT:
				getCurrent().clear();
				getCurrent().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.FIRING__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.FIRING__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.FIRING__ORDER:
				setOrder((Integer)newValue);
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
			case TesqelPackage.FIRING__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TesqelPackage.FIRING__PHASE:
				getPhase().clear();
				return;
			case TesqelPackage.FIRING__CURRENT:
				getCurrent().clear();
				return;
			case TesqelPackage.FIRING__TRANSITION:
				getTransition().clear();
				return;
			case TesqelPackage.FIRING__NEXT:
				getNext().clear();
				return;
			case TesqelPackage.FIRING__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case TesqelPackage.FIRING__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TesqelPackage.FIRING__PHASE:
				return phase != null && !phase.isEmpty();
			case TesqelPackage.FIRING__CURRENT:
				return current != null && !current.isEmpty();
			case TesqelPackage.FIRING__TRANSITION:
				return transition != null && !transition.isEmpty();
			case TesqelPackage.FIRING__NEXT:
				return next != null && !next.isEmpty();
			case TesqelPackage.FIRING__ORDER:
				return order != ORDER_EDEFAULT;
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
		result.append(", current: ");
		result.append(current);
		result.append(", transition: ");
		result.append(transition);
		result.append(", next: ");
		result.append(next);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //FiringImpl
