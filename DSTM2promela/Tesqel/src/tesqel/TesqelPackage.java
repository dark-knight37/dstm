/**
 */
package tesqel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tesqel.TesqelFactory
 * @model kind="package"
 * @generated
 */
public interface TesqelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tesqel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "tesqel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tesqel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TesqelPackage eINSTANCE = tesqel.impl.TesqelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tesqel.impl.TestSequenceImpl <em>Test Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.TestSequenceImpl
	 * @see tesqel.impl.TesqelPackageImpl#getTestSequence()
	 * @generated
	 */
	int TEST_SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Compound Firing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__COMPOUND_FIRING = 2;

	/**
	 * The feature id for the '<em><b>Initial Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__INITIAL_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE__SPECIFICATIONS = 5;

	/**
	 * The number of structural features of the '<em>Test Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Test Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.FiringImpl <em>Firing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.FiringImpl
	 * @see tesqel.impl.TesqelPackageImpl#getFiring()
	 * @generated
	 */
	int FIRING = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__PHASE = 1;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__CURRENT = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__NEXT = 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING__ORDER = 5;

	/**
	 * The number of structural features of the '<em>Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.PhaseImpl <em>Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.PhaseImpl
	 * @see tesqel.impl.TesqelPackageImpl#getPhase()
	 * @generated
	 */
	int PHASE = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.TriggerImpl
	 * @see tesqel.impl.TesqelPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ORDER = PHASE__ORDER;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CHANNEL = PHASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__MESSAGE = PHASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = PHASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.ConditionImpl
	 * @see tesqel.impl.TesqelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ORDER = PHASE__ORDER;

	/**
	 * The feature id for the '<em><b>Rvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__RVALUE = PHASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__LVALUE = PHASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__KIND = PHASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = PHASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.CFOrderImpl <em>CF Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.CFOrderImpl
	 * @see tesqel.impl.TesqelPackageImpl#getCFOrder()
	 * @generated
	 */
	int CF_ORDER = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CF_ORDER__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CF_ORDER__TO = 1;

	/**
	 * The number of structural features of the '<em>CF Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CF_ORDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CF Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CF_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.ActionImpl
	 * @see tesqel.impl.TesqelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ORDER = PHASE__ORDER;

	/**
	 * The feature id for the '<em><b>Rvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RVALUE = PHASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LVALUE = PHASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__KIND = PHASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = PHASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = PHASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.CompoundFiringImpl <em>Compound Firing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.CompoundFiringImpl
	 * @see tesqel.impl.TesqelPackageImpl#getCompoundFiring()
	 * @generated
	 */
	int COMPOUND_FIRING = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Firing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING__FIRING = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING__ORDER = 2;

	/**
	 * The feature id for the '<em><b>IOmessage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING__IOMESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING__LINK = 4;

	/**
	 * The number of structural features of the '<em>Compound Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Compound Firing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_FIRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.FOrderImpl <em>FOrder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.FOrderImpl
	 * @see tesqel.impl.TesqelPackageImpl#getFOrder()
	 * @generated
	 */
	int FORDER = 8;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORDER__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORDER__TO = 1;

	/**
	 * The number of structural features of the '<em>FOrder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>FOrder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.MessageImpl
	 * @see tesqel.impl.TesqelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DIRECTION = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.TestReasonImpl <em>Test Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.TestReasonImpl
	 * @see tesqel.impl.TesqelPackageImpl#getTestReason()
	 * @generated
	 */
	int TEST_REASON = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REASON__NAME = 0;

	/**
	 * The number of structural features of the '<em>Test Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REASON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.SpecificationImpl
	 * @see tesqel.impl.TesqelPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = TEST_REASON__NAME;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = TEST_REASON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = TEST_REASON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.CoverageImpl
	 * @see tesqel.impl.TesqelPackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__NAME = TEST_REASON__NAME;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = TEST_REASON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OPERATION_COUNT = TEST_REASON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.impl.RequirementImpl
	 * @see tesqel.impl.TesqelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = TEST_REASON__NAME;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = TEST_REASON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = TEST_REASON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tesqel.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.ActionKind
	 * @see tesqel.impl.TesqelPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 14;

	/**
	 * The meta object id for the '{@link tesqel.ConditionKind <em>Condition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.ConditionKind
	 * @see tesqel.impl.TesqelPackageImpl#getConditionKind()
	 * @generated
	 */
	int CONDITION_KIND = 15;

	/**
	 * The meta object id for the '{@link tesqel.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tesqel.Direction
	 * @see tesqel.impl.TesqelPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 16;


	/**
	 * Returns the meta object for class '{@link tesqel.TestSequence <em>Test Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Sequence</em>'.
	 * @see tesqel.TestSequence
	 * @generated
	 */
	EClass getTestSequence();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.TestSequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesqel.TestSequence#getName()
	 * @see #getTestSequence()
	 * @generated
	 */
	EAttribute getTestSequence_Name();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.TestSequence#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Initial</em>'.
	 * @see tesqel.TestSequence#getInitial()
	 * @see #getTestSequence()
	 * @generated
	 */
	EAttribute getTestSequence_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.TestSequence#getCompoundFiring <em>Compound Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Firing</em>'.
	 * @see tesqel.TestSequence#getCompoundFiring()
	 * @see #getTestSequence()
	 * @generated
	 */
	EReference getTestSequence_CompoundFiring();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.TestSequence#getInitialCondition <em>Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Condition</em>'.
	 * @see tesqel.TestSequence#getInitialCondition()
	 * @see #getTestSequence()
	 * @generated
	 */
	EReference getTestSequence_InitialCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.TestSequence#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see tesqel.TestSequence#getLink()
	 * @see #getTestSequence()
	 * @generated
	 */
	EReference getTestSequence_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.TestSequence#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see tesqel.TestSequence#getSpecifications()
	 * @see #getTestSequence()
	 * @generated
	 */
	EReference getTestSequence_Specifications();

	/**
	 * Returns the meta object for class '{@link tesqel.Firing <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firing</em>'.
	 * @see tesqel.Firing
	 * @generated
	 */
	EClass getFiring();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.Firing#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see tesqel.Firing#getAnnotations()
	 * @see #getFiring()
	 * @generated
	 */
	EAttribute getFiring_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.Firing#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phase</em>'.
	 * @see tesqel.Firing#getPhase()
	 * @see #getFiring()
	 * @generated
	 */
	EReference getFiring_Phase();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.Firing#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Current</em>'.
	 * @see tesqel.Firing#getCurrent()
	 * @see #getFiring()
	 * @generated
	 */
	EAttribute getFiring_Current();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.Firing#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition</em>'.
	 * @see tesqel.Firing#getTransition()
	 * @see #getFiring()
	 * @generated
	 */
	EAttribute getFiring_Transition();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.Firing#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Next</em>'.
	 * @see tesqel.Firing#getNext()
	 * @see #getFiring()
	 * @generated
	 */
	EAttribute getFiring_Next();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Firing#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see tesqel.Firing#getOrder()
	 * @see #getFiring()
	 * @generated
	 */
	EAttribute getFiring_Order();

	/**
	 * Returns the meta object for class '{@link tesqel.Phase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phase</em>'.
	 * @see tesqel.Phase
	 * @generated
	 */
	EClass getPhase();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Phase#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see tesqel.Phase#getOrder()
	 * @see #getPhase()
	 * @generated
	 */
	EAttribute getPhase_Order();

	/**
	 * Returns the meta object for class '{@link tesqel.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see tesqel.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Trigger#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see tesqel.Trigger#getChannel()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Channel();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Trigger#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see tesqel.Trigger#getMessage()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Message();

	/**
	 * Returns the meta object for class '{@link tesqel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see tesqel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Condition#getRvalue <em>Rvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rvalue</em>'.
	 * @see tesqel.Condition#getRvalue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Rvalue();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Condition#getLvalue <em>Lvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvalue</em>'.
	 * @see tesqel.Condition#getLvalue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Lvalue();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Condition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tesqel.Condition#getKind()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Kind();

	/**
	 * Returns the meta object for class '{@link tesqel.CFOrder <em>CF Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CF Order</em>'.
	 * @see tesqel.CFOrder
	 * @generated
	 */
	EClass getCFOrder();

	/**
	 * Returns the meta object for the reference '{@link tesqel.CFOrder#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see tesqel.CFOrder#getFrom()
	 * @see #getCFOrder()
	 * @generated
	 */
	EReference getCFOrder_From();

	/**
	 * Returns the meta object for the reference '{@link tesqel.CFOrder#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see tesqel.CFOrder#getTo()
	 * @see #getCFOrder()
	 * @generated
	 */
	EReference getCFOrder_To();

	/**
	 * Returns the meta object for class '{@link tesqel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see tesqel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Action#getRvalue <em>Rvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rvalue</em>'.
	 * @see tesqel.Action#getRvalue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Rvalue();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Action#getLvalue <em>Lvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvalue</em>'.
	 * @see tesqel.Action#getLvalue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Lvalue();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Action#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see tesqel.Action#getKind()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Kind();

	/**
	 * Returns the meta object for class '{@link tesqel.CompoundFiring <em>Compound Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Firing</em>'.
	 * @see tesqel.CompoundFiring
	 * @generated
	 */
	EClass getCompoundFiring();

	/**
	 * Returns the meta object for the attribute list '{@link tesqel.CompoundFiring#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotations</em>'.
	 * @see tesqel.CompoundFiring#getAnnotations()
	 * @see #getCompoundFiring()
	 * @generated
	 */
	EAttribute getCompoundFiring_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.CompoundFiring#getFiring <em>Firing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firing</em>'.
	 * @see tesqel.CompoundFiring#getFiring()
	 * @see #getCompoundFiring()
	 * @generated
	 */
	EReference getCompoundFiring_Firing();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.CompoundFiring#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see tesqel.CompoundFiring#getOrder()
	 * @see #getCompoundFiring()
	 * @generated
	 */
	EAttribute getCompoundFiring_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.CompoundFiring#getIOmessage <em>IOmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IOmessage</em>'.
	 * @see tesqel.CompoundFiring#getIOmessage()
	 * @see #getCompoundFiring()
	 * @generated
	 */
	EReference getCompoundFiring_IOmessage();

	/**
	 * Returns the meta object for the containment reference list '{@link tesqel.CompoundFiring#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see tesqel.CompoundFiring#getLink()
	 * @see #getCompoundFiring()
	 * @generated
	 */
	EReference getCompoundFiring_Link();

	/**
	 * Returns the meta object for class '{@link tesqel.FOrder <em>FOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOrder</em>'.
	 * @see tesqel.FOrder
	 * @generated
	 */
	EClass getFOrder();

	/**
	 * Returns the meta object for the reference '{@link tesqel.FOrder#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see tesqel.FOrder#getFrom()
	 * @see #getFOrder()
	 * @generated
	 */
	EReference getFOrder_From();

	/**
	 * Returns the meta object for the reference '{@link tesqel.FOrder#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see tesqel.FOrder#getTo()
	 * @see #getFOrder()
	 * @generated
	 */
	EReference getFOrder_To();

	/**
	 * Returns the meta object for class '{@link tesqel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see tesqel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Message#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see tesqel.Message#getChannel()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Channel();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Message#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see tesqel.Message#getMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Message();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.Message#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see tesqel.Message#getDirection()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Direction();

	/**
	 * Returns the meta object for class '{@link tesqel.TestReason <em>Test Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Reason</em>'.
	 * @see tesqel.TestReason
	 * @generated
	 */
	EClass getTestReason();

	/**
	 * Returns the meta object for the attribute '{@link tesqel.TestReason#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tesqel.TestReason#getName()
	 * @see #getTestReason()
	 * @generated
	 */
	EAttribute getTestReason_Name();

	/**
	 * Returns the meta object for class '{@link tesqel.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see tesqel.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for class '{@link tesqel.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see tesqel.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for class '{@link tesqel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see tesqel.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for enum '{@link tesqel.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see tesqel.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the meta object for enum '{@link tesqel.ConditionKind <em>Condition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Kind</em>'.
	 * @see tesqel.ConditionKind
	 * @generated
	 */
	EEnum getConditionKind();

	/**
	 * Returns the meta object for enum '{@link tesqel.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see tesqel.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TesqelFactory getTesqelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tesqel.impl.TestSequenceImpl <em>Test Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.TestSequenceImpl
		 * @see tesqel.impl.TesqelPackageImpl#getTestSequence()
		 * @generated
		 */
		EClass TEST_SEQUENCE = eINSTANCE.getTestSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SEQUENCE__NAME = eINSTANCE.getTestSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SEQUENCE__INITIAL = eINSTANCE.getTestSequence_Initial();

		/**
		 * The meta object literal for the '<em><b>Compound Firing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SEQUENCE__COMPOUND_FIRING = eINSTANCE.getTestSequence_CompoundFiring();

		/**
		 * The meta object literal for the '<em><b>Initial Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SEQUENCE__INITIAL_CONDITION = eINSTANCE.getTestSequence_InitialCondition();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SEQUENCE__LINK = eINSTANCE.getTestSequence_Link();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SEQUENCE__SPECIFICATIONS = eINSTANCE.getTestSequence_Specifications();

		/**
		 * The meta object literal for the '{@link tesqel.impl.FiringImpl <em>Firing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.FiringImpl
		 * @see tesqel.impl.TesqelPackageImpl#getFiring()
		 * @generated
		 */
		EClass FIRING = eINSTANCE.getFiring();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRING__ANNOTATIONS = eINSTANCE.getFiring_Annotations();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRING__PHASE = eINSTANCE.getFiring_Phase();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRING__CURRENT = eINSTANCE.getFiring_Current();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRING__TRANSITION = eINSTANCE.getFiring_Transition();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRING__NEXT = eINSTANCE.getFiring_Next();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRING__ORDER = eINSTANCE.getFiring_Order();

		/**
		 * The meta object literal for the '{@link tesqel.impl.PhaseImpl <em>Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.PhaseImpl
		 * @see tesqel.impl.TesqelPackageImpl#getPhase()
		 * @generated
		 */
		EClass PHASE = eINSTANCE.getPhase();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHASE__ORDER = eINSTANCE.getPhase_Order();

		/**
		 * The meta object literal for the '{@link tesqel.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.TriggerImpl
		 * @see tesqel.impl.TesqelPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CHANNEL = eINSTANCE.getTrigger_Channel();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__MESSAGE = eINSTANCE.getTrigger_Message();

		/**
		 * The meta object literal for the '{@link tesqel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.ConditionImpl
		 * @see tesqel.impl.TesqelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Rvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__RVALUE = eINSTANCE.getCondition_Rvalue();

		/**
		 * The meta object literal for the '<em><b>Lvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__LVALUE = eINSTANCE.getCondition_Lvalue();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__KIND = eINSTANCE.getCondition_Kind();

		/**
		 * The meta object literal for the '{@link tesqel.impl.CFOrderImpl <em>CF Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.CFOrderImpl
		 * @see tesqel.impl.TesqelPackageImpl#getCFOrder()
		 * @generated
		 */
		EClass CF_ORDER = eINSTANCE.getCFOrder();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CF_ORDER__FROM = eINSTANCE.getCFOrder_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CF_ORDER__TO = eINSTANCE.getCFOrder_To();

		/**
		 * The meta object literal for the '{@link tesqel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.ActionImpl
		 * @see tesqel.impl.TesqelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Rvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__RVALUE = eINSTANCE.getAction_Rvalue();

		/**
		 * The meta object literal for the '<em><b>Lvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__LVALUE = eINSTANCE.getAction_Lvalue();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__KIND = eINSTANCE.getAction_Kind();

		/**
		 * The meta object literal for the '{@link tesqel.impl.CompoundFiringImpl <em>Compound Firing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.CompoundFiringImpl
		 * @see tesqel.impl.TesqelPackageImpl#getCompoundFiring()
		 * @generated
		 */
		EClass COMPOUND_FIRING = eINSTANCE.getCompoundFiring();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_FIRING__ANNOTATIONS = eINSTANCE.getCompoundFiring_Annotations();

		/**
		 * The meta object literal for the '<em><b>Firing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FIRING__FIRING = eINSTANCE.getCompoundFiring_Firing();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_FIRING__ORDER = eINSTANCE.getCompoundFiring_Order();

		/**
		 * The meta object literal for the '<em><b>IOmessage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FIRING__IOMESSAGE = eINSTANCE.getCompoundFiring_IOmessage();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_FIRING__LINK = eINSTANCE.getCompoundFiring_Link();

		/**
		 * The meta object literal for the '{@link tesqel.impl.FOrderImpl <em>FOrder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.FOrderImpl
		 * @see tesqel.impl.TesqelPackageImpl#getFOrder()
		 * @generated
		 */
		EClass FORDER = eINSTANCE.getFOrder();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORDER__FROM = eINSTANCE.getFOrder_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORDER__TO = eINSTANCE.getFOrder_To();

		/**
		 * The meta object literal for the '{@link tesqel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.MessageImpl
		 * @see tesqel.impl.TesqelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__CHANNEL = eINSTANCE.getMessage_Channel();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DIRECTION = eINSTANCE.getMessage_Direction();

		/**
		 * The meta object literal for the '{@link tesqel.impl.TestReasonImpl <em>Test Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.TestReasonImpl
		 * @see tesqel.impl.TesqelPackageImpl#getTestReason()
		 * @generated
		 */
		EClass TEST_REASON = eINSTANCE.getTestReason();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_REASON__NAME = eINSTANCE.getTestReason_Name();

		/**
		 * The meta object literal for the '{@link tesqel.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.SpecificationImpl
		 * @see tesqel.impl.TesqelPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '{@link tesqel.impl.CoverageImpl <em>Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.CoverageImpl
		 * @see tesqel.impl.TesqelPackageImpl#getCoverage()
		 * @generated
		 */
		EClass COVERAGE = eINSTANCE.getCoverage();

		/**
		 * The meta object literal for the '{@link tesqel.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.impl.RequirementImpl
		 * @see tesqel.impl.TesqelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link tesqel.ActionKind <em>Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.ActionKind
		 * @see tesqel.impl.TesqelPackageImpl#getActionKind()
		 * @generated
		 */
		EEnum ACTION_KIND = eINSTANCE.getActionKind();

		/**
		 * The meta object literal for the '{@link tesqel.ConditionKind <em>Condition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.ConditionKind
		 * @see tesqel.impl.TesqelPackageImpl#getConditionKind()
		 * @generated
		 */
		EEnum CONDITION_KIND = eINSTANCE.getConditionKind();

		/**
		 * The meta object literal for the '{@link tesqel.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tesqel.Direction
		 * @see tesqel.impl.TesqelPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //TesqelPackage
