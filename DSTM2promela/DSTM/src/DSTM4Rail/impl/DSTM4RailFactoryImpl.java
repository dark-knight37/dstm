/**
 */
package DSTM4Rail.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import DSTM4Rail.Box;
import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailFactory;
import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.EnteringNode;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.Fork;
import DSTM4Rail.InitialNode;
import DSTM4Rail.Join;
import DSTM4Rail.Machine;
import DSTM4Rail.Node;
import DSTM4Rail.Parameter;
import DSTM4Rail.Transition;
import DSTM4Rail.Variable;
import DSTM4Rail.cExternal;
import DSTM4Rail.cInternal;
import DSTM4Rail.tChannel;
import DSTM4Rail.tCompound;
import DSTM4Rail.tEnum;
import DSTM4Rail.tInteger;
import DSTM4Rail.tMultiType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSTM4RailFactoryImpl extends EFactoryImpl implements DSTM4RailFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSTM4RailFactory init() {
		try {
			DSTM4RailFactory theDSTM4RailFactory = (DSTM4RailFactory)EPackage.Registry.INSTANCE.getEFactory(DSTM4RailPackage.eNS_URI);
			if (theDSTM4RailFactory != null) {
				return theDSTM4RailFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DSTM4RailFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM4RailFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DSTM4RailPackage.DSTM: return createDSTM();
			case DSTM4RailPackage.MACHINE: return createMachine();
			case DSTM4RailPackage.TRANSITION: return createTransition();
			case DSTM4RailPackage.NODE: return createNode();
			case DSTM4RailPackage.BOX: return createBox();
			case DSTM4RailPackage.ENTERING_NODE: return createEnteringNode();
			case DSTM4RailPackage.INITIAL_NODE: return createInitialNode();
			case DSTM4RailPackage.EXITING_NODE: return createExitingNode();
			case DSTM4RailPackage.FORK: return createFork();
			case DSTM4RailPackage.JOIN: return createJoin();
			case DSTM4RailPackage.PARAMETER: return createParameter();
			case DSTM4RailPackage.TINTEGER: return createtInteger();
			case DSTM4RailPackage.TENUM: return createtEnum();
			case DSTM4RailPackage.TCHANNEL: return createtChannel();
			case DSTM4RailPackage.TCOMPOUND: return createtCompound();
			case DSTM4RailPackage.TMULTI_TYPE: return createtMultiType();
			case DSTM4RailPackage.VARIABLE: return createVariable();
			case DSTM4RailPackage.CEXTERNAL: return createcExternal();
			case DSTM4RailPackage.CINTERNAL: return createcInternal();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM createDSTM() {
		DSTMImpl dstm = new DSTMImpl();
		return dstm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteringNode createEnteringNode() {
		EnteringNodeImpl enteringNode = new EnteringNodeImpl();
		return enteringNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitingNode createExitingNode() {
		ExitingNodeImpl exitingNode = new ExitingNodeImpl();
		return exitingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fork createFork() {
		ForkImpl fork = new ForkImpl();
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tInteger createtInteger() {
		tIntegerImpl tInteger = new tIntegerImpl();
		return tInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tEnum createtEnum() {
		tEnumImpl tEnum = new tEnumImpl();
		return tEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tChannel createtChannel() {
		tChannelImpl tChannel = new tChannelImpl();
		return tChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tCompound createtCompound() {
		tCompoundImpl tCompound = new tCompoundImpl();
		return tCompound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tMultiType createtMultiType() {
		tMultiTypeImpl tMultiType = new tMultiTypeImpl();
		return tMultiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cExternal createcExternal() {
		cExternalImpl cExternal = new cExternalImpl();
		return cExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cInternal createcInternal() {
		cInternalImpl cInternal = new cInternalImpl();
		return cInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM4RailPackage getDSTM4RailPackage() {
		return (DSTM4RailPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DSTM4RailPackage getPackage() {
		return DSTM4RailPackage.eINSTANCE;
	}

} //DSTM4RailFactoryImpl
