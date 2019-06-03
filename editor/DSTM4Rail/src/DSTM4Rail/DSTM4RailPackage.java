/**
 */
package DSTM4Rail;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see DSTM4Rail.DSTM4RailFactory
 * @model kind="package"
 * @generated
 */
public interface DSTM4RailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DSTM4Rail";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "dstm4rail";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dstm4rail";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DSTM4RailPackage eINSTANCE = DSTM4Rail.impl.DSTM4RailPackageImpl.init();

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.NamedElementImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.DSTMImpl <em>DSTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.DSTMImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getDSTM()
	 * @generated
	 */
	int DSTM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__MACHINES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__MAIN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__CHANNELS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM__GLOBAL_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DSTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.MachineImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__DSTM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__VERTEXES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.TransitionImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is preemptive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_PREEMPTIVE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Par instantiation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PAR_INSTANTIATION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESTINATION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exiting node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXITING_NODE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Entering node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ENTERING_NODE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.VertexImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.NodeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REQUIREMENTS = VERTEX__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MACHINE = VERTEX__MACHINE;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.BoxImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__REQUIREMENTS = VERTEX__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__MACHINE = VERTEX__MACHINE;

	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__INSTANTIATION = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.PseudoNodeImpl <em>Pseudo Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.PseudoNodeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getPseudoNode()
	 * @generated
	 */
	int PSEUDO_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_NODE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_NODE__REQUIREMENTS = VERTEX__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_NODE__MACHINE = VERTEX__MACHINE;

	/**
	 * The number of structural features of the '<em>Pseudo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_NODE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_NODE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.EnteringNodeImpl <em>Entering Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.EnteringNodeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getEnteringNode()
	 * @generated
	 */
	int ENTERING_NODE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERING_NODE__NAME = PSEUDO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERING_NODE__REQUIREMENTS = PSEUDO_NODE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERING_NODE__MACHINE = PSEUDO_NODE__MACHINE;

	/**
	 * The number of structural features of the '<em>Entering Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERING_NODE_FEATURE_COUNT = PSEUDO_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entering Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERING_NODE_OPERATION_COUNT = PSEUDO_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.InitialNodeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = ENTERING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__REQUIREMENTS = ENTERING_NODE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__MACHINE = ENTERING_NODE__MACHINE;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = ENTERING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = ENTERING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.ExitingNodeImpl <em>Exiting Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.ExitingNodeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getExitingNode()
	 * @generated
	 */
	int EXITING_NODE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXITING_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXITING_NODE__REQUIREMENTS = NODE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXITING_NODE__MACHINE = NODE__MACHINE;

	/**
	 * The number of structural features of the '<em>Exiting Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXITING_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exiting Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXITING_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.ForkImpl <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.ForkImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__NAME = PSEUDO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__REQUIREMENTS = PSEUDO_NODE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__MACHINE = PSEUDO_NODE__MACHINE;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = PSEUDO_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = PSEUDO_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.JoinImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = PSEUDO_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REQUIREMENTS = PSEUDO_NODE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__MACHINE = PSEUDO_NODE__MACHINE;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = PSEUDO_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = PSEUDO_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.ParameterImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.TypeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DSTM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tSimpleTypeImpl <em>tSimple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tSimpleTypeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettSimpleType()
	 * @generated
	 */
	int TSIMPLE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIMPLE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIMPLE_TYPE__DSTM = TYPE__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIMPLE_TYPE__TMULTI_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tSimple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIMPLE_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tBasicImpl <em>tBasic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tBasicImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettBasic()
	 * @generated
	 */
	int TBASIC = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC__NAME = TSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC__DSTM = TSIMPLE_TYPE__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC__TMULTI_TYPE = TSIMPLE_TYPE__TMULTI_TYPE;

	/**
	 * The feature id for the '<em><b>TCompound</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC__TCOMPOUND = TSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tBasic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC_FEATURE_COUNT = TSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tBasic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASIC_OPERATION_COUNT = TSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tIntegerImpl <em>tInteger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tIntegerImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettInteger()
	 * @generated
	 */
	int TINTEGER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER__NAME = TBASIC__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER__DSTM = TBASIC__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER__TMULTI_TYPE = TBASIC__TMULTI_TYPE;

	/**
	 * The feature id for the '<em><b>TCompound</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER__TCOMPOUND = TBASIC__TCOMPOUND;

	/**
	 * The number of structural features of the '<em>tInteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER_FEATURE_COUNT = TBASIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>tInteger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTEGER_OPERATION_COUNT = TBASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tEnumImpl <em>tEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tEnumImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettEnum()
	 * @generated
	 */
	int TENUM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__NAME = TBASIC__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__DSTM = TBASIC__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__TMULTI_TYPE = TBASIC__TMULTI_TYPE;

	/**
	 * The feature id for the '<em><b>TCompound</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__TCOMPOUND = TBASIC__TCOMPOUND;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM__LITERALS = TBASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_FEATURE_COUNT = TBASIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_OPERATION_COUNT = TBASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tChannelImpl <em>tChannel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tChannelImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettChannel()
	 * @generated
	 */
	int TCHANNEL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL__NAME = TBASIC__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL__DSTM = TBASIC__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL__TMULTI_TYPE = TBASIC__TMULTI_TYPE;

	/**
	 * The feature id for the '<em><b>TCompound</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL__TCOMPOUND = TBASIC__TCOMPOUND;

	/**
	 * The feature id for the '<em><b>Channel names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL__CHANNEL_NAMES = TBASIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL_FEATURE_COUNT = TBASIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHANNEL_OPERATION_COUNT = TBASIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tCompoundImpl <em>tCompound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tCompoundImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettCompound()
	 * @generated
	 */
	int TCOMPOUND = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND__NAME = TSIMPLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND__DSTM = TSIMPLE_TYPE__DSTM;

	/**
	 * The feature id for the '<em><b>TMulti Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND__TMULTI_TYPE = TSIMPLE_TYPE__TMULTI_TYPE;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND__SUBTYPES = TSIMPLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tCompound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND_FEATURE_COUNT = TSIMPLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tCompound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPOUND_OPERATION_COUNT = TSIMPLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.tMultiTypeImpl <em>tMulti Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.tMultiTypeImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettMultiType()
	 * @generated
	 */
	int TMULTI_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_TYPE__DSTM = TYPE__DSTM;

	/**
	 * The feature id for the '<em><b>Composed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_TYPE__COMPOSED_BY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tMulti Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tMulti Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.VariableImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DSTM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.ChannelImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DSTM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNEL_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.cExternalImpl <em>cExternal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.cExternalImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getcExternal()
	 * @generated
	 */
	int CEXTERNAL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXTERNAL__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXTERNAL__DSTM = CHANNEL__DSTM;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXTERNAL__CHANNEL_TYPE = CHANNEL__CHANNEL_TYPE;

	/**
	 * The number of structural features of the '<em>cExternal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXTERNAL_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>cExternal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXTERNAL_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DSTM4Rail.impl.cInternalImpl <em>cInternal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DSTM4Rail.impl.cInternalImpl
	 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getcInternal()
	 * @generated
	 */
	int CINTERNAL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL__NAME = CHANNEL__NAME;

	/**
	 * The feature id for the '<em><b>DSTM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL__DSTM = CHANNEL__DSTM;

	/**
	 * The feature id for the '<em><b>Channel Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL__CHANNEL_TYPE = CHANNEL__CHANNEL_TYPE;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL__BOUND = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>cInternal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>cInternal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERNAL_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DSTM4Rail.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see DSTM4Rail.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link DSTM4Rail.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DSTM4Rail.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.DSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSTM</em>'.
	 * @see DSTM4Rail.DSTM
	 * @generated
	 */
	EClass getDSTM();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.DSTM#getMachines <em>Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machines</em>'.
	 * @see DSTM4Rail.DSTM#getMachines()
	 * @see #getDSTM()
	 * @generated
	 */
	EReference getDSTM_Machines();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.DSTM#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see DSTM4Rail.DSTM#getMain()
	 * @see #getDSTM()
	 * @generated
	 */
	EReference getDSTM_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.DSTM#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see DSTM4Rail.DSTM#getChannels()
	 * @see #getDSTM()
	 * @generated
	 */
	EReference getDSTM_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.DSTM#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see DSTM4Rail.DSTM#getTypes()
	 * @see #getDSTM()
	 * @generated
	 */
	EReference getDSTM_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.DSTM#getGlobal_variables <em>Global variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global variables</em>'.
	 * @see DSTM4Rail.DSTM#getGlobal_variables()
	 * @see #getDSTM()
	 * @generated
	 */
	EReference getDSTM_Global_variables();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see DSTM4Rail.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Machine#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DSTM</em>'.
	 * @see DSTM4Rail.Machine#getDSTM()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_DSTM();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.Machine#getVertexes <em>Vertexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertexes</em>'.
	 * @see DSTM4Rail.Machine#getVertexes()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Vertexes();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.Machine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see DSTM4Rail.Machine#getTransitions()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.Machine#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see DSTM4Rail.Machine#getParameters()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Parameters();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see DSTM4Rail.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link DSTM4Rail.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see DSTM4Rail.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link DSTM4Rail.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see DSTM4Rail.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.Transition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see DSTM4Rail.Transition#getActions()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Actions();

	/**
	 * Returns the meta object for the attribute '{@link DSTM4Rail.Transition#isIs_preemptive <em>Is preemptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is preemptive</em>'.
	 * @see DSTM4Rail.Transition#isIs_preemptive()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Is_preemptive();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.Transition#getPar_instantiation <em>Par instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Par instantiation</em>'.
	 * @see DSTM4Rail.Transition#getPar_instantiation()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Par_instantiation();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.Transition#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirements</em>'.
	 * @see DSTM4Rail.Transition#getRequirements()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Requirements();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see DSTM4Rail.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see DSTM4Rail.Transition#getDestination()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Destination();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Transition#getExiting_node <em>Exiting node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exiting node</em>'.
	 * @see DSTM4Rail.Transition#getExiting_node()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Exiting_node();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Transition#getEntering_node <em>Entering node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entering node</em>'.
	 * @see DSTM4Rail.Transition#getEntering_node()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Entering_node();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Transition#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see DSTM4Rail.Transition#getMachine()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Machine();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see DSTM4Rail.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.Vertex#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requirements</em>'.
	 * @see DSTM4Rail.Vertex#getRequirements()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Requirements();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Vertex#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see DSTM4Rail.Vertex#getMachine()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Machine();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see DSTM4Rail.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see DSTM4Rail.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the reference list '{@link DSTM4Rail.Box#getInstantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instantiation</em>'.
	 * @see DSTM4Rail.Box#getInstantiation()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Instantiation();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.PseudoNode <em>Pseudo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Node</em>'.
	 * @see DSTM4Rail.PseudoNode
	 * @generated
	 */
	EClass getPseudoNode();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.EnteringNode <em>Entering Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entering Node</em>'.
	 * @see DSTM4Rail.EnteringNode
	 * @generated
	 */
	EClass getEnteringNode();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see DSTM4Rail.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.ExitingNode <em>Exiting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exiting Node</em>'.
	 * @see DSTM4Rail.ExitingNode
	 * @generated
	 */
	EClass getExitingNode();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see DSTM4Rail.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see DSTM4Rail.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see DSTM4Rail.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DSTM4Rail.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Parameter#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Machine</em>'.
	 * @see DSTM4Rail.Parameter#getMachine()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Machine();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see DSTM4Rail.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Type#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DSTM</em>'.
	 * @see DSTM4Rail.Type#getDSTM()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_DSTM();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tBasic <em>tBasic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tBasic</em>'.
	 * @see DSTM4Rail.tBasic
	 * @generated
	 */
	EClass gettBasic();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.tBasic#getTCompound <em>TCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TCompound</em>'.
	 * @see DSTM4Rail.tBasic#getTCompound()
	 * @see #gettBasic()
	 * @generated
	 */
	EReference gettBasic_TCompound();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tInteger <em>tInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tInteger</em>'.
	 * @see DSTM4Rail.tInteger
	 * @generated
	 */
	EClass gettInteger();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tEnum <em>tEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tEnum</em>'.
	 * @see DSTM4Rail.tEnum
	 * @generated
	 */
	EClass gettEnum();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.tEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see DSTM4Rail.tEnum#getLiterals()
	 * @see #gettEnum()
	 * @generated
	 */
	EAttribute gettEnum_Literals();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tChannel <em>tChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tChannel</em>'.
	 * @see DSTM4Rail.tChannel
	 * @generated
	 */
	EClass gettChannel();

	/**
	 * Returns the meta object for the attribute list '{@link DSTM4Rail.tChannel#getChannel_names <em>Channel names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Channel names</em>'.
	 * @see DSTM4Rail.tChannel#getChannel_names()
	 * @see #gettChannel()
	 * @generated
	 */
	EAttribute gettChannel_Channel_names();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tCompound <em>tCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tCompound</em>'.
	 * @see DSTM4Rail.tCompound
	 * @generated
	 */
	EClass gettCompound();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.tCompound#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtypes</em>'.
	 * @see DSTM4Rail.tCompound#getSubtypes()
	 * @see #gettCompound()
	 * @generated
	 */
	EReference gettCompound_Subtypes();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tSimpleType <em>tSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tSimple Type</em>'.
	 * @see DSTM4Rail.tSimpleType
	 * @generated
	 */
	EClass gettSimpleType();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.tSimpleType#getTMultiType <em>TMulti Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>TMulti Type</em>'.
	 * @see DSTM4Rail.tSimpleType#getTMultiType()
	 * @see #gettSimpleType()
	 * @generated
	 */
	EReference gettSimpleType_TMultiType();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.tMultiType <em>tMulti Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tMulti Type</em>'.
	 * @see DSTM4Rail.tMultiType
	 * @generated
	 */
	EClass gettMultiType();

	/**
	 * Returns the meta object for the containment reference list '{@link DSTM4Rail.tMultiType#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed By</em>'.
	 * @see DSTM4Rail.tMultiType#getComposedBy()
	 * @see #gettMultiType()
	 * @generated
	 */
	EReference gettMultiType_ComposedBy();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see DSTM4Rail.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see DSTM4Rail.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Variable#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DSTM</em>'.
	 * @see DSTM4Rail.Variable#getDSTM()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DSTM();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see DSTM4Rail.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the container reference '{@link DSTM4Rail.Channel#getDSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>DSTM</em>'.
	 * @see DSTM4Rail.Channel#getDSTM()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_DSTM();

	/**
	 * Returns the meta object for the reference '{@link DSTM4Rail.Channel#getChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel Type</em>'.
	 * @see DSTM4Rail.Channel#getChannelType()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_ChannelType();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.cExternal <em>cExternal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cExternal</em>'.
	 * @see DSTM4Rail.cExternal
	 * @generated
	 */
	EClass getcExternal();

	/**
	 * Returns the meta object for class '{@link DSTM4Rail.cInternal <em>cInternal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cInternal</em>'.
	 * @see DSTM4Rail.cInternal
	 * @generated
	 */
	EClass getcInternal();

	/**
	 * Returns the meta object for the attribute '{@link DSTM4Rail.cInternal#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see DSTM4Rail.cInternal#getBound()
	 * @see #getcInternal()
	 * @generated
	 */
	EAttribute getcInternal_Bound();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DSTM4RailFactory getDSTM4RailFactory();

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
		 * The meta object literal for the '{@link DSTM4Rail.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.NamedElementImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.DSTMImpl <em>DSTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.DSTMImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getDSTM()
		 * @generated
		 */
		EClass DSTM = eINSTANCE.getDSTM();

		/**
		 * The meta object literal for the '<em><b>Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTM__MACHINES = eINSTANCE.getDSTM_Machines();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTM__MAIN = eINSTANCE.getDSTM_Main();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTM__CHANNELS = eINSTANCE.getDSTM_Channels();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTM__TYPES = eINSTANCE.getDSTM_Types();

		/**
		 * The meta object literal for the '<em><b>Global variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSTM__GLOBAL_VARIABLES = eINSTANCE.getDSTM_Global_variables();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.MachineImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>DSTM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__DSTM = eINSTANCE.getMachine_DSTM();

		/**
		 * The meta object literal for the '<em><b>Vertexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__VERTEXES = eINSTANCE.getMachine_Vertexes();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__TRANSITIONS = eINSTANCE.getMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__PARAMETERS = eINSTANCE.getMachine_Parameters();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.TransitionImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTIONS = eINSTANCE.getTransition_Actions();

		/**
		 * The meta object literal for the '<em><b>Is preemptive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__IS_PREEMPTIVE = eINSTANCE.getTransition_Is_preemptive();

		/**
		 * The meta object literal for the '<em><b>Par instantiation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PAR_INSTANTIATION = eINSTANCE.getTransition_Par_instantiation();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__REQUIREMENTS = eINSTANCE.getTransition_Requirements();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DESTINATION = eINSTANCE.getTransition_Destination();

		/**
		 * The meta object literal for the '<em><b>Exiting node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EXITING_NODE = eINSTANCE.getTransition_Exiting_node();

		/**
		 * The meta object literal for the '<em><b>Entering node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ENTERING_NODE = eINSTANCE.getTransition_Entering_node();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__MACHINE = eINSTANCE.getTransition_Machine();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.VertexImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__REQUIREMENTS = eINSTANCE.getVertex_Requirements();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__MACHINE = eINSTANCE.getVertex_Machine();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.NodeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.BoxImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Instantiation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__INSTANTIATION = eINSTANCE.getBox_Instantiation();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.PseudoNodeImpl <em>Pseudo Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.PseudoNodeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getPseudoNode()
		 * @generated
		 */
		EClass PSEUDO_NODE = eINSTANCE.getPseudoNode();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.EnteringNodeImpl <em>Entering Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.EnteringNodeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getEnteringNode()
		 * @generated
		 */
		EClass ENTERING_NODE = eINSTANCE.getEnteringNode();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.InitialNodeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.ExitingNodeImpl <em>Exiting Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.ExitingNodeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getExitingNode()
		 * @generated
		 */
		EClass EXITING_NODE = eINSTANCE.getExitingNode();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.ForkImpl <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.ForkImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.JoinImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.ParameterImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__MACHINE = eINSTANCE.getParameter_Machine();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.TypeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>DSTM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DSTM = eINSTANCE.getType_DSTM();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tBasicImpl <em>tBasic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tBasicImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettBasic()
		 * @generated
		 */
		EClass TBASIC = eINSTANCE.gettBasic();

		/**
		 * The meta object literal for the '<em><b>TCompound</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBASIC__TCOMPOUND = eINSTANCE.gettBasic_TCompound();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tIntegerImpl <em>tInteger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tIntegerImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettInteger()
		 * @generated
		 */
		EClass TINTEGER = eINSTANCE.gettInteger();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tEnumImpl <em>tEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tEnumImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettEnum()
		 * @generated
		 */
		EClass TENUM = eINSTANCE.gettEnum();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENUM__LITERALS = eINSTANCE.gettEnum_Literals();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tChannelImpl <em>tChannel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tChannelImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettChannel()
		 * @generated
		 */
		EClass TCHANNEL = eINSTANCE.gettChannel();

		/**
		 * The meta object literal for the '<em><b>Channel names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCHANNEL__CHANNEL_NAMES = eINSTANCE.gettChannel_Channel_names();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tCompoundImpl <em>tCompound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tCompoundImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettCompound()
		 * @generated
		 */
		EClass TCOMPOUND = eINSTANCE.gettCompound();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCOMPOUND__SUBTYPES = eINSTANCE.gettCompound_Subtypes();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tSimpleTypeImpl <em>tSimple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tSimpleTypeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettSimpleType()
		 * @generated
		 */
		EClass TSIMPLE_TYPE = eINSTANCE.gettSimpleType();

		/**
		 * The meta object literal for the '<em><b>TMulti Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSIMPLE_TYPE__TMULTI_TYPE = eINSTANCE.gettSimpleType_TMultiType();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.tMultiTypeImpl <em>tMulti Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.tMultiTypeImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#gettMultiType()
		 * @generated
		 */
		EClass TMULTI_TYPE = eINSTANCE.gettMultiType();

		/**
		 * The meta object literal for the '<em><b>Composed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMULTI_TYPE__COMPOSED_BY = eINSTANCE.gettMultiType_ComposedBy();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.VariableImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>DSTM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DSTM = eINSTANCE.getVariable_DSTM();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.ChannelImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>DSTM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__DSTM = eINSTANCE.getChannel_DSTM();

		/**
		 * The meta object literal for the '<em><b>Channel Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CHANNEL_TYPE = eINSTANCE.getChannel_ChannelType();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.cExternalImpl <em>cExternal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.cExternalImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getcExternal()
		 * @generated
		 */
		EClass CEXTERNAL = eINSTANCE.getcExternal();

		/**
		 * The meta object literal for the '{@link DSTM4Rail.impl.cInternalImpl <em>cInternal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DSTM4Rail.impl.cInternalImpl
		 * @see DSTM4Rail.impl.DSTM4RailPackageImpl#getcInternal()
		 * @generated
		 */
		EClass CINTERNAL = eINSTANCE.getcInternal();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINTERNAL__BOUND = eINSTANCE.getcInternal_Bound();

	}

} //DSTM4RailPackage
