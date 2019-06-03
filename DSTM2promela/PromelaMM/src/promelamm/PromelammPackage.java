/**
 */
package promelamm;

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
 * @see promelamm.PromelammFactory
 * @model kind="package"
 * @generated
 */
public interface PromelammPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "promelamm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://promelamm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "promelamm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromelammPackage eINSTANCE = promelamm.impl.PromelammPackageImpl.init();

	/**
	 * The meta object id for the '{@link promelamm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ModelImpl
	 * @see promelamm.impl.PromelammPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Max proc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MAX_PROC = 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROCESSES = 1;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ENUMERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Temp num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TEMP_NUM = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ProcessImpl
	 * @see promelamm.impl.PromelammPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Proc Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROC_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Process Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_STATEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_MAIN = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARAMETERS = 6;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.VariableImpl
	 * @see promelamm.impl.PromelammPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.EnumerationImpl
	 * @see promelamm.impl.PromelammPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.PrimitiveImpl
	 * @see promelamm.impl.PromelammPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__INITIAL_VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ChannelImpl
	 * @see promelamm.impl.PromelammPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__SIZE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPES = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPE_NAME = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__EXTERNAL = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__ANNOTATIONS = VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.AbstractStatementImpl
	 * @see promelamm.impl.PromelammPackageImpl#getAbstractStatement()
	 * @generated
	 */
	int ABSTRACT_STATEMENT = 13;

	/**
	 * The number of structural features of the '<em>Abstract Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.CompositeStatementImpl <em>Composite Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.CompositeStatementImpl
	 * @see promelamm.impl.PromelammPackageImpl#getCompositeStatement()
	 * @generated
	 */
	int COMPOSITE_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEMENT__DESCRIPTION = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEMENT__CONDITION = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEMENT__SUB_STATEMENTS = ABSTRACT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEMENT_OPERATION_COUNT = ABSTRACT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.DoImpl <em>Do</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.DoImpl
	 * @see promelamm.impl.PromelammPackageImpl#getDo()
	 * @generated
	 */
	int DO = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO__DESCRIPTION = COMPOSITE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO__CONDITION = COMPOSITE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO__SUB_STATEMENTS = COMPOSITE_STATEMENT__SUB_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Unless Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO__UNLESS_CASE = COMPOSITE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Do</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_FEATURE_COUNT = COMPOSITE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Do</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_OPERATION_COUNT = COMPOSITE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.CaseImpl
	 * @see promelamm.impl.PromelammPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DESCRIPTION = COMPOSITE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONDITION = COMPOSITE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SUB_STATEMENTS = COMPOSITE_STATEMENT__SUB_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = COMPOSITE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = COMPOSITE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.UnlessImpl <em>Unless</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.UnlessImpl
	 * @see promelamm.impl.PromelammPackageImpl#getUnless()
	 * @generated
	 */
	int UNLESS = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS__DESCRIPTION = COMPOSITE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS__CONDITION = COMPOSITE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS__SUB_STATEMENTS = COMPOSITE_STATEMENT__SUB_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_FEATURE_COUNT = COMPOSITE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_OPERATION_COUNT = COMPOSITE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ForImpl
	 * @see promelamm.impl.PromelammPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__DESCRIPTION = COMPOSITE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__CONDITION = COMPOSITE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__SUB_STATEMENTS = COMPOSITE_STATEMENT__SUB_STATEMENTS;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = COMPOSITE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_OPERATION_COUNT = COMPOSITE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ArrayImpl
	 * @see promelamm.impl.PromelammPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = PRIMITIVE__TYPE;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__INITIAL_VALUE = PRIMITIVE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SIZE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.IfImpl
	 * @see promelamm.impl.PromelammPackageImpl#getIf()
	 * @generated
	 */
	int IF = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DESCRIPTION = COMPOSITE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = COMPOSITE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Sub Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SUB_STATEMENTS = COMPOSITE_STATEMENT__SUB_STATEMENTS;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = COMPOSITE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = COMPOSITE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.SimpleStatementImpl
	 * @see promelamm.impl.PromelammPackageImpl#getSimpleStatement()
	 * @generated
	 */
	int SIMPLE_STATEMENT = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT__DESCRIPTION = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT_OPERATION_COUNT = ABSTRACT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promelamm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.impl.ParameterImpl
	 * @see promelamm.impl.PromelammPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promelamm.DefaultType <em>Default Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promelamm.DefaultType
	 * @see promelamm.impl.PromelammPackageImpl#getDefaultType()
	 * @generated
	 */
	int DEFAULT_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link promelamm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see promelamm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Model#getMax_proc <em>Max proc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max proc</em>'.
	 * @see promelamm.Model#getMax_proc()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Max_proc();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Model#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see promelamm.Model#getProcesses()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Model#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see promelamm.Model#getEnumerations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Enumerations();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Model#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see promelamm.Model#getVariables()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Variables();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promelamm.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Model#getTemp_num <em>Temp num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temp num</em>'.
	 * @see promelamm.Model#getTemp_num()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Temp_num();

	/**
	 * Returns the meta object for class '{@link promelamm.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see promelamm.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promelamm.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Process#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see promelamm.Process#isIsActive()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsActive();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Process#getProcVariables <em>Proc Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proc Variables</em>'.
	 * @see promelamm.Process#getProcVariables()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcVariables();

	/**
	 * Returns the meta object for the container reference '{@link promelamm.Process#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see promelamm.Process#getModel()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Process#getProcessStatements <em>Process Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Statements</em>'.
	 * @see promelamm.Process#getProcessStatements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_ProcessStatements();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Process#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see promelamm.Process#isIsMain()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsMain();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.Process#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see promelamm.Process#getParameters()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Parameters();

	/**
	 * Returns the meta object for class '{@link promelamm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see promelamm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promelamm.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link promelamm.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see promelamm.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute list '{@link promelamm.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see promelamm.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Literals();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Enumeration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promelamm.Enumeration#getName()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Name();

	/**
	 * Returns the meta object for class '{@link promelamm.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see promelamm.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Primitive#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see promelamm.Primitive#getType()
	 * @see #getPrimitive()
	 * @generated
	 */
	EAttribute getPrimitive_Type();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Primitive#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see promelamm.Primitive#getInitialValue()
	 * @see #getPrimitive()
	 * @generated
	 */
	EAttribute getPrimitive_InitialValue();

	/**
	 * Returns the meta object for class '{@link promelamm.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see promelamm.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Channel#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see promelamm.Channel#getSize()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Size();

	/**
	 * Returns the meta object for the attribute list '{@link promelamm.Channel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see promelamm.Channel#getTypes()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Types();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Channel#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see promelamm.Channel#getTypeName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Channel#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see promelamm.Channel#isExternal()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_External();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Channel#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see promelamm.Channel#getAnnotations()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Annotations();

	/**
	 * Returns the meta object for class '{@link promelamm.Do <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do</em>'.
	 * @see promelamm.Do
	 * @generated
	 */
	EClass getDo();

	/**
	 * Returns the meta object for the reference '{@link promelamm.Do#getUnlessCase <em>Unless Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unless Case</em>'.
	 * @see promelamm.Do#getUnlessCase()
	 * @see #getDo()
	 * @generated
	 */
	EReference getDo_UnlessCase();

	/**
	 * Returns the meta object for class '{@link promelamm.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see promelamm.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for class '{@link promelamm.Unless <em>Unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unless</em>'.
	 * @see promelamm.Unless
	 * @generated
	 */
	EClass getUnless();

	/**
	 * Returns the meta object for class '{@link promelamm.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see promelamm.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for class '{@link promelamm.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see promelamm.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Array#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see promelamm.Array#getSize()
	 * @see #getArray()
	 * @generated
	 */
	EAttribute getArray_Size();

	/**
	 * Returns the meta object for class '{@link promelamm.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see promelamm.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for class '{@link promelamm.CompositeStatement <em>Composite Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Statement</em>'.
	 * @see promelamm.CompositeStatement
	 * @generated
	 */
	EClass getCompositeStatement();

	/**
	 * Returns the meta object for the attribute list '{@link promelamm.CompositeStatement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see promelamm.CompositeStatement#getDescription()
	 * @see #getCompositeStatement()
	 * @generated
	 */
	EAttribute getCompositeStatement_Description();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.CompositeStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see promelamm.CompositeStatement#getCondition()
	 * @see #getCompositeStatement()
	 * @generated
	 */
	EAttribute getCompositeStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link promelamm.CompositeStatement#getSubStatements <em>Sub Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Statements</em>'.
	 * @see promelamm.CompositeStatement#getSubStatements()
	 * @see #getCompositeStatement()
	 * @generated
	 */
	EReference getCompositeStatement_SubStatements();

	/**
	 * Returns the meta object for class '{@link promelamm.AbstractStatement <em>Abstract Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Statement</em>'.
	 * @see promelamm.AbstractStatement
	 * @generated
	 */
	EClass getAbstractStatement();

	/**
	 * Returns the meta object for class '{@link promelamm.SimpleStatement <em>Simple Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Statement</em>'.
	 * @see promelamm.SimpleStatement
	 * @generated
	 */
	EClass getSimpleStatement();

	/**
	 * Returns the meta object for the attribute list '{@link promelamm.SimpleStatement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see promelamm.SimpleStatement#getDescription()
	 * @see #getSimpleStatement()
	 * @generated
	 */
	EAttribute getSimpleStatement_Description();

	/**
	 * Returns the meta object for class '{@link promelamm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see promelamm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promelamm.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link promelamm.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see promelamm.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for enum '{@link promelamm.DefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Type</em>'.
	 * @see promelamm.DefaultType
	 * @generated
	 */
	EEnum getDefaultType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PromelammFactory getPromelammFactory();

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
		 * The meta object literal for the '{@link promelamm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ModelImpl
		 * @see promelamm.impl.PromelammPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Max proc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__MAX_PROC = eINSTANCE.getModel_Max_proc();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROCESSES = eINSTANCE.getModel_Processes();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ENUMERATIONS = eINSTANCE.getModel_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__VARIABLES = eINSTANCE.getModel_Variables();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Temp num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TEMP_NUM = eINSTANCE.getModel_Temp_num();

		/**
		 * The meta object literal for the '{@link promelamm.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ProcessImpl
		 * @see promelamm.impl.PromelammPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IS_ACTIVE = eINSTANCE.getProcess_IsActive();

		/**
		 * The meta object literal for the '<em><b>Proc Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROC_VARIABLES = eINSTANCE.getProcess_ProcVariables();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MODEL = eINSTANCE.getProcess_Model();

		/**
		 * The meta object literal for the '<em><b>Process Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROCESS_STATEMENTS = eINSTANCE.getProcess_ProcessStatements();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IS_MAIN = eINSTANCE.getProcess_IsMain();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARAMETERS = eINSTANCE.getProcess_Parameters();

		/**
		 * The meta object literal for the '{@link promelamm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.VariableImpl
		 * @see promelamm.impl.PromelammPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link promelamm.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.EnumerationImpl
		 * @see promelamm.impl.PromelammPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

		/**
		 * The meta object literal for the '{@link promelamm.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.PrimitiveImpl
		 * @see promelamm.impl.PromelammPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE__TYPE = eINSTANCE.getPrimitive_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE__INITIAL_VALUE = eINSTANCE.getPrimitive_InitialValue();

		/**
		 * The meta object literal for the '{@link promelamm.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ChannelImpl
		 * @see promelamm.impl.PromelammPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__SIZE = eINSTANCE.getChannel_Size();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TYPES = eINSTANCE.getChannel_Types();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TYPE_NAME = eINSTANCE.getChannel_TypeName();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__EXTERNAL = eINSTANCE.getChannel_External();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__ANNOTATIONS = eINSTANCE.getChannel_Annotations();

		/**
		 * The meta object literal for the '{@link promelamm.impl.DoImpl <em>Do</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.DoImpl
		 * @see promelamm.impl.PromelammPackageImpl#getDo()
		 * @generated
		 */
		EClass DO = eINSTANCE.getDo();

		/**
		 * The meta object literal for the '<em><b>Unless Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO__UNLESS_CASE = eINSTANCE.getDo_UnlessCase();

		/**
		 * The meta object literal for the '{@link promelamm.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.CaseImpl
		 * @see promelamm.impl.PromelammPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '{@link promelamm.impl.UnlessImpl <em>Unless</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.UnlessImpl
		 * @see promelamm.impl.PromelammPackageImpl#getUnless()
		 * @generated
		 */
		EClass UNLESS = eINSTANCE.getUnless();

		/**
		 * The meta object literal for the '{@link promelamm.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ForImpl
		 * @see promelamm.impl.PromelammPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '{@link promelamm.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ArrayImpl
		 * @see promelamm.impl.PromelammPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY__SIZE = eINSTANCE.getArray_Size();

		/**
		 * The meta object literal for the '{@link promelamm.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.IfImpl
		 * @see promelamm.impl.PromelammPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '{@link promelamm.impl.CompositeStatementImpl <em>Composite Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.CompositeStatementImpl
		 * @see promelamm.impl.PromelammPackageImpl#getCompositeStatement()
		 * @generated
		 */
		EClass COMPOSITE_STATEMENT = eINSTANCE.getCompositeStatement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_STATEMENT__DESCRIPTION = eINSTANCE.getCompositeStatement_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_STATEMENT__CONDITION = eINSTANCE.getCompositeStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Sub Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATEMENT__SUB_STATEMENTS = eINSTANCE.getCompositeStatement_SubStatements();

		/**
		 * The meta object literal for the '{@link promelamm.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.AbstractStatementImpl
		 * @see promelamm.impl.PromelammPackageImpl#getAbstractStatement()
		 * @generated
		 */
		EClass ABSTRACT_STATEMENT = eINSTANCE.getAbstractStatement();

		/**
		 * The meta object literal for the '{@link promelamm.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.SimpleStatementImpl
		 * @see promelamm.impl.PromelammPackageImpl#getSimpleStatement()
		 * @generated
		 */
		EClass SIMPLE_STATEMENT = eINSTANCE.getSimpleStatement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STATEMENT__DESCRIPTION = eINSTANCE.getSimpleStatement_Description();

		/**
		 * The meta object literal for the '{@link promelamm.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.impl.ParameterImpl
		 * @see promelamm.impl.PromelammPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link promelamm.DefaultType <em>Default Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promelamm.DefaultType
		 * @see promelamm.impl.PromelammPackageImpl#getDefaultType()
		 * @generated
		 */
		EEnum DEFAULT_TYPE = eINSTANCE.getDefaultType();

	}

} //PromelammPackage
