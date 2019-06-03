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

import tesqel.CFOrder;
import tesqel.CompoundFiring;
import tesqel.Condition;
import tesqel.TesqelPackage;
import tesqel.TestReason;
import tesqel.TestSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getCompoundFiring <em>Compound Firing</em>}</li>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getLink <em>Link</em>}</li>
 *   <li>{@link tesqel.impl.TestSequenceImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSequenceImpl extends MinimalEObjectImpl.Container implements TestSequence {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected EList<String> initial;

	/**
	 * The cached value of the '{@link #getCompoundFiring() <em>Compound Firing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundFiring()
	 * @generated
	 * @ordered
	 */
	protected EList<CompoundFiring> compoundFiring;

	/**
	 * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> initialCondition;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<CFOrder> link;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<TestReason> specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TesqelPackage.Literals.TEST_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TesqelPackage.TEST_SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInitial() {
		if (initial == null) {
			initial = new EDataTypeUniqueEList<String>(String.class, this, TesqelPackage.TEST_SEQUENCE__INITIAL);
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompoundFiring> getCompoundFiring() {
		if (compoundFiring == null) {
			compoundFiring = new EObjectContainmentEList<CompoundFiring>(CompoundFiring.class, this, TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING);
		}
		return compoundFiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getInitialCondition() {
		if (initialCondition == null) {
			initialCondition = new EObjectContainmentEList<Condition>(Condition.class, this, TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION);
		}
		return initialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CFOrder> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<CFOrder>(CFOrder.class, this, TesqelPackage.TEST_SEQUENCE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestReason> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentEList<TestReason>(TestReason.class, this, TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING:
				return ((InternalEList<?>)getCompoundFiring()).basicRemove(otherEnd, msgs);
			case TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION:
				return ((InternalEList<?>)getInitialCondition()).basicRemove(otherEnd, msgs);
			case TesqelPackage.TEST_SEQUENCE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
			case TesqelPackage.TEST_SEQUENCE__NAME:
				return getName();
			case TesqelPackage.TEST_SEQUENCE__INITIAL:
				return getInitial();
			case TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING:
				return getCompoundFiring();
			case TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION:
				return getInitialCondition();
			case TesqelPackage.TEST_SEQUENCE__LINK:
				return getLink();
			case TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS:
				return getSpecifications();
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
			case TesqelPackage.TEST_SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case TesqelPackage.TEST_SEQUENCE__INITIAL:
				getInitial().clear();
				getInitial().addAll((Collection<? extends String>)newValue);
				return;
			case TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING:
				getCompoundFiring().clear();
				getCompoundFiring().addAll((Collection<? extends CompoundFiring>)newValue);
				return;
			case TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION:
				getInitialCondition().clear();
				getInitialCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case TesqelPackage.TEST_SEQUENCE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends CFOrder>)newValue);
				return;
			case TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends TestReason>)newValue);
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
			case TesqelPackage.TEST_SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TesqelPackage.TEST_SEQUENCE__INITIAL:
				getInitial().clear();
				return;
			case TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING:
				getCompoundFiring().clear();
				return;
			case TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION:
				getInitialCondition().clear();
				return;
			case TesqelPackage.TEST_SEQUENCE__LINK:
				getLink().clear();
				return;
			case TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS:
				getSpecifications().clear();
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
			case TesqelPackage.TEST_SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TesqelPackage.TEST_SEQUENCE__INITIAL:
				return initial != null && !initial.isEmpty();
			case TesqelPackage.TEST_SEQUENCE__COMPOUND_FIRING:
				return compoundFiring != null && !compoundFiring.isEmpty();
			case TesqelPackage.TEST_SEQUENCE__INITIAL_CONDITION:
				return initialCondition != null && !initialCondition.isEmpty();
			case TesqelPackage.TEST_SEQUENCE__LINK:
				return link != null && !link.isEmpty();
			case TesqelPackage.TEST_SEQUENCE__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", initial: ");
		result.append(initial);
		result.append(')');
		return result.toString();
	}

} //TestSequenceImpl
