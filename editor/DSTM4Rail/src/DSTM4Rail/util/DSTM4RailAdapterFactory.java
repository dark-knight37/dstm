/**
 */
package DSTM4Rail.util;

import DSTM4Rail.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DSTM4Rail.DSTM4RailPackage
 * @generated
 */
public class DSTM4RailAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSTM4RailPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM4RailAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DSTM4RailPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSTM4RailSwitch<Adapter> modelSwitch =
		new DSTM4RailSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDSTM(DSTM object) {
				return createDSTMAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
			}
			@Override
			public Adapter casePseudoNode(PseudoNode object) {
				return createPseudoNodeAdapter();
			}
			@Override
			public Adapter caseEnteringNode(EnteringNode object) {
				return createEnteringNodeAdapter();
			}
			@Override
			public Adapter caseInitialNode(InitialNode object) {
				return createInitialNodeAdapter();
			}
			@Override
			public Adapter caseExitingNode(ExitingNode object) {
				return createExitingNodeAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter casetBasic(tBasic object) {
				return createtBasicAdapter();
			}
			@Override
			public Adapter casetInteger(tInteger object) {
				return createtIntegerAdapter();
			}
			@Override
			public Adapter casetEnum(tEnum object) {
				return createtEnumAdapter();
			}
			@Override
			public Adapter casetChannel(tChannel object) {
				return createtChannelAdapter();
			}
			@Override
			public Adapter casetCompound(tCompound object) {
				return createtCompoundAdapter();
			}
			@Override
			public Adapter casetSimpleType(tSimpleType object) {
				return createtSimpleTypeAdapter();
			}
			@Override
			public Adapter casetMultiType(tMultiType object) {
				return createtMultiTypeAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseChannel(Channel object) {
				return createChannelAdapter();
			}
			@Override
			public Adapter casecExternal(cExternal object) {
				return createcExternalAdapter();
			}
			@Override
			public Adapter casecInternal(cInternal object) {
				return createcInternalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.DSTM <em>DSTM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.DSTM
	 * @generated
	 */
	public Adapter createDSTMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.PseudoNode <em>Pseudo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.PseudoNode
	 * @generated
	 */
	public Adapter createPseudoNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.EnteringNode <em>Entering Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.EnteringNode
	 * @generated
	 */
	public Adapter createEnteringNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.InitialNode
	 * @generated
	 */
	public Adapter createInitialNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.ExitingNode <em>Exiting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.ExitingNode
	 * @generated
	 */
	public Adapter createExitingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tBasic <em>tBasic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tBasic
	 * @generated
	 */
	public Adapter createtBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tInteger <em>tInteger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tInteger
	 * @generated
	 */
	public Adapter createtIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tEnum <em>tEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tEnum
	 * @generated
	 */
	public Adapter createtEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tChannel <em>tChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tChannel
	 * @generated
	 */
	public Adapter createtChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tCompound <em>tCompound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tCompound
	 * @generated
	 */
	public Adapter createtCompoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tSimpleType <em>tSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tSimpleType
	 * @generated
	 */
	public Adapter createtSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.tMultiType <em>tMulti Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.tMultiType
	 * @generated
	 */
	public Adapter createtMultiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.cExternal <em>cExternal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.cExternal
	 * @generated
	 */
	public Adapter createcExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DSTM4Rail.cInternal <em>cInternal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DSTM4Rail.cInternal
	 * @generated
	 */
	public Adapter createcInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DSTM4RailAdapterFactory
