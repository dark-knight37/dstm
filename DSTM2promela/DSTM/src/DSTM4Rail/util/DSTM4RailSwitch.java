/**
 */
package DSTM4Rail.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import DSTM4Rail.Box;
import DSTM4Rail.Channel;
import DSTM4Rail.DSTM;
import DSTM4Rail.DSTM4RailPackage;
import DSTM4Rail.EnteringNode;
import DSTM4Rail.ExitingNode;
import DSTM4Rail.Fork;
import DSTM4Rail.InitialNode;
import DSTM4Rail.Join;
import DSTM4Rail.Machine;
import DSTM4Rail.NamedElement;
import DSTM4Rail.Node;
import DSTM4Rail.Parameter;
import DSTM4Rail.PseudoNode;
import DSTM4Rail.Transition;
import DSTM4Rail.Type;
import DSTM4Rail.Variable;
import DSTM4Rail.Vertex;
import DSTM4Rail.cExternal;
import DSTM4Rail.cInternal;
import DSTM4Rail.tBasic;
import DSTM4Rail.tChannel;
import DSTM4Rail.tCompound;
import DSTM4Rail.tEnum;
import DSTM4Rail.tInteger;
import DSTM4Rail.tMultiType;
import DSTM4Rail.tSimpleType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DSTM4Rail.DSTM4RailPackage
 * @generated
 */
public class DSTM4RailSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DSTM4RailPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSTM4RailSwitch() {
		if (modelPackage == null) {
			modelPackage = DSTM4RailPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DSTM4RailPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.DSTM: {
				DSTM dstm = (DSTM)theEObject;
				T result = caseDSTM(dstm);
				if (result == null) result = caseNamedElement(dstm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.MACHINE: {
				Machine machine = (Machine)theEObject;
				T result = caseMachine(machine);
				if (result == null) result = caseNamedElement(machine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseNamedElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseVertex(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.BOX: {
				Box box = (Box)theEObject;
				T result = caseBox(box);
				if (result == null) result = caseVertex(box);
				if (result == null) result = caseNamedElement(box);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.PSEUDO_NODE: {
				PseudoNode pseudoNode = (PseudoNode)theEObject;
				T result = casePseudoNode(pseudoNode);
				if (result == null) result = caseVertex(pseudoNode);
				if (result == null) result = caseNamedElement(pseudoNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.ENTERING_NODE: {
				EnteringNode enteringNode = (EnteringNode)theEObject;
				T result = caseEnteringNode(enteringNode);
				if (result == null) result = casePseudoNode(enteringNode);
				if (result == null) result = caseVertex(enteringNode);
				if (result == null) result = caseNamedElement(enteringNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseEnteringNode(initialNode);
				if (result == null) result = casePseudoNode(initialNode);
				if (result == null) result = caseVertex(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.EXITING_NODE: {
				ExitingNode exitingNode = (ExitingNode)theEObject;
				T result = caseExitingNode(exitingNode);
				if (result == null) result = caseNode(exitingNode);
				if (result == null) result = caseVertex(exitingNode);
				if (result == null) result = caseNamedElement(exitingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.FORK: {
				Fork fork = (Fork)theEObject;
				T result = caseFork(fork);
				if (result == null) result = casePseudoNode(fork);
				if (result == null) result = caseVertex(fork);
				if (result == null) result = caseNamedElement(fork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = casePseudoNode(join);
				if (result == null) result = caseVertex(join);
				if (result == null) result = caseNamedElement(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TBASIC: {
				tBasic tBasic = (tBasic)theEObject;
				T result = casetBasic(tBasic);
				if (result == null) result = casetSimpleType(tBasic);
				if (result == null) result = caseType(tBasic);
				if (result == null) result = caseNamedElement(tBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TINTEGER: {
				tInteger tInteger = (tInteger)theEObject;
				T result = casetInteger(tInteger);
				if (result == null) result = casetBasic(tInteger);
				if (result == null) result = casetSimpleType(tInteger);
				if (result == null) result = caseType(tInteger);
				if (result == null) result = caseNamedElement(tInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TENUM: {
				tEnum tEnum = (tEnum)theEObject;
				T result = casetEnum(tEnum);
				if (result == null) result = casetBasic(tEnum);
				if (result == null) result = casetSimpleType(tEnum);
				if (result == null) result = caseType(tEnum);
				if (result == null) result = caseNamedElement(tEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TCHANNEL: {
				tChannel tChannel = (tChannel)theEObject;
				T result = casetChannel(tChannel);
				if (result == null) result = casetBasic(tChannel);
				if (result == null) result = casetSimpleType(tChannel);
				if (result == null) result = caseType(tChannel);
				if (result == null) result = caseNamedElement(tChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TCOMPOUND: {
				tCompound tCompound = (tCompound)theEObject;
				T result = casetCompound(tCompound);
				if (result == null) result = casetSimpleType(tCompound);
				if (result == null) result = caseType(tCompound);
				if (result == null) result = caseNamedElement(tCompound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TSIMPLE_TYPE: {
				tSimpleType tSimpleType = (tSimpleType)theEObject;
				T result = casetSimpleType(tSimpleType);
				if (result == null) result = caseType(tSimpleType);
				if (result == null) result = caseNamedElement(tSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.TMULTI_TYPE: {
				tMultiType tMultiType = (tMultiType)theEObject;
				T result = casetMultiType(tMultiType);
				if (result == null) result = caseType(tMultiType);
				if (result == null) result = caseNamedElement(tMultiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseNamedElement(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.CEXTERNAL: {
				cExternal cExternal = (cExternal)theEObject;
				T result = casecExternal(cExternal);
				if (result == null) result = caseChannel(cExternal);
				if (result == null) result = caseNamedElement(cExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DSTM4RailPackage.CINTERNAL: {
				cInternal cInternal = (cInternal)theEObject;
				T result = casecInternal(cInternal);
				if (result == null) result = caseChannel(cInternal);
				if (result == null) result = caseNamedElement(cInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSTM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSTM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSTM(DSTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBox(Box object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoNode(PseudoNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entering Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entering Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnteringNode(EnteringNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exiting Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exiting Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitingNode(ExitingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFork(Fork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tBasic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tBasic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetBasic(tBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tInteger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tInteger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetInteger(tInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetEnum(tEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tChannel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tChannel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetChannel(tChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tCompound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tCompound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetCompound(tCompound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tSimple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tSimple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetSimpleType(tSimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tMulti Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tMulti Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetMultiType(tMultiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cExternal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cExternal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecExternal(cExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>cInternal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>cInternal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecInternal(cInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DSTM4RailSwitch
