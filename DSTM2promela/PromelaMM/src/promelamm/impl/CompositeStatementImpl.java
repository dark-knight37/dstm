/**
 */
package promelamm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import promelamm.AbstractStatement;
import promelamm.CompositeStatement;
import promelamm.PromelammPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promelamm.impl.CompositeStatementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link promelamm.impl.CompositeStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link promelamm.impl.CompositeStatementImpl#getSubStatements <em>Sub Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStatementImpl extends AbstractStatementImpl implements CompositeStatement {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> description;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubStatements() <em>Sub Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStatement> subStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromelammPackage.Literals.COMPOSITE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeEList<String>(String.class, this, PromelammPackage.COMPOSITE_STATEMENT__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromelammPackage.COMPOSITE_STATEMENT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStatement> getSubStatements() {
		if (subStatements == null) {
			subStatements = new EObjectContainmentEList<AbstractStatement>(AbstractStatement.class, this, PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS);
		}
		return subStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS:
				return ((InternalEList<?>)getSubStatements()).basicRemove(otherEnd, msgs);
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
			case PromelammPackage.COMPOSITE_STATEMENT__DESCRIPTION:
				return getDescription();
			case PromelammPackage.COMPOSITE_STATEMENT__CONDITION:
				return getCondition();
			case PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS:
				return getSubStatements();
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
			case PromelammPackage.COMPOSITE_STATEMENT__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case PromelammPackage.COMPOSITE_STATEMENT__CONDITION:
				setCondition((String)newValue);
				return;
			case PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS:
				getSubStatements().clear();
				getSubStatements().addAll((Collection<? extends AbstractStatement>)newValue);
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
			case PromelammPackage.COMPOSITE_STATEMENT__DESCRIPTION:
				getDescription().clear();
				return;
			case PromelammPackage.COMPOSITE_STATEMENT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS:
				getSubStatements().clear();
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
			case PromelammPackage.COMPOSITE_STATEMENT__DESCRIPTION:
				return description != null && !description.isEmpty();
			case PromelammPackage.COMPOSITE_STATEMENT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case PromelammPackage.COMPOSITE_STATEMENT__SUB_STATEMENTS:
				return subStatements != null && !subStatements.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //CompositeStatementImpl
