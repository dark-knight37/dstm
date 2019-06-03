package org.prgmdl.dstmverifier.data;

import java.util.Vector;

import org.prgmdl.dstmverifier.data.node.ABasicSimpletype;
import org.prgmdl.dstmverifier.data.node.ACompoundDeclarationCompoundDeclaration;
import org.prgmdl.dstmverifier.data.node.AMultitypeDeclarationMultitypeDeclaration;
import org.prgmdl.dstmverifier.data.node.Node;

/**
 * This interface is responsible of providing high level synthetic information on the parsed data to other packages
 * @author Stefano Marrone
 */
public interface DataToTransition {
	
	/**
	 * It verifies if the asked identifier is somehow defined (variable, type, etc.) in the data file
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is defined, false if not defined
	 */
	public boolean isDefined(String identifier);

	public Vector<String> declaredParameters(String machine);

	/**
	 * It verifies if the asked identifier is defined as a channel in the data file
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is channel, false if not defined or not a channel
	 */
	public boolean isChannel(String identifier);
	
	/**
	 * It verifies if the asked identifier is defined as a parameter of a specified machine in the data file 
	 * @param identifier name of the parameter to query
	 * @param machineName name of the machine to query
	 * @return true if the identifier is a parameter and the machine is a machine and if there is a matching of both, false otherwise
	 */
	public boolean isParameter(String identifier, String machineName);
	
	/**
	 * It verifies if the asked identifier is defined as a parameter of a specified machine in the data file 
	 * @param identifier name of the parameter to query
	 * @param machineName name of the machine to query
	 * @return true if the identifier is a parameter and the machine is a machine and if there is a matching of both, false otherwise
	 */
	public boolean isParameter(String identifier);

	/**
	 * It verifies if the asked identifier is defined as a variable in the data file
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a variable, false if is not a variable
	 */
	public boolean isVariable(String identifier);

	/**
	 * It verifies that the enum literal belongs to the written enum type 
	 * @param identifier name of the literal to check
	 * @param enumName name of the enumerative type
	 * @return false if the literal does not belong to the type or if the type is not an enum 
	 */
	public boolean isEnumLiteralOf(String identifier, String enumName);

	/**
	 * It verifies if the asked identifier is defined as a variable belonging to a type 
	 * @param identifier name of the identifier to query
	 * @param typename name of the type
	 * @return true if the identifier is a variable, the typename is a type and the variable is an instance of the type
	 */
	public boolean isVarInstanceOf(String identifier, String typeName);
	
	/**
	 * It verifies if the asked identifier is defined as a channel belonging to a type 
	 * @param identifier name of the identifier to query
	 * @param typename name of the type
	 * @return true if the identifier is a channel, the typename is a type and the channel is an instance of the type
	 */
	public boolean isChanInstanceOf(String identifier, String typeName);

	/**
	 * It verifies if the asked identifier is defined as a channel belonging to a type. More specifically:
	 * (a) if the identifier is a channel of a simple (basic or compound), it checks that the passed list of types is exactly the simple type of the channel
	 * i.e.  typeName = [Int,T] --> the type of the channel is a simple defined as <Int,T>;
	 * (b) if the identifier is a channel of a multitype, it checks that the passed list of types is one of the simple type on which the multitype is defined on
	 * i.e.  typeName = [Int,T] --> the type of the channel is a multitype defined as {<Int,T>, Y};
	 * @param identifier name of the channel to query
	 * @param typename list of the type names composing the simple type
	 * @return true if all the conditions are verified, false otherwise
	 */
	public boolean isChanInstanceOf(String identifier, Vector<String> typeName);

	/**
	 * It verifies if the asked identifier is defined as a type (basic, compound or multitype). In the basic case, it must check if the type is a predefined type (bool/int) or a enum or a channel type.  
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a type 
	 */
	public boolean isType(String identifier);

	/**
	 * It verifies if the asked identifier is defined as a multitype.  
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a multitype 
	 */
	public boolean isMultiType(String identifier);

	/**
	 * It verifies if the asked identifier is defined as a compound  
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a compound 
	 */
	public boolean isCompound(String identifier);

	/**
	 * It verifies if the asked identifier is defined as a basic  
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a basic
	 */
	public boolean isBasic(String identifier);

	/**
	 * It verifies if the asked identifier is defined as a basic or compound.  
	 * @param identifier name of the identifier to query
	 * @return true if the identifier is a simple type 
	 */
	public boolean isSimpleType(String identifier);
	
	/**
	 * It verifies if the asked identifier is defined as a parameter belonging to a type 
	 * @param identifier name of the identifier to query
	 * @param typename name of the type
	 * @return true if the identifier is a parameter, the typename is a type and the variable is an instance of the type
	 */
	public boolean isParInstanceOf(String identifier, String typeName);

	/**
	 * It verifies if the asked identifier is defined as a parameter belonging to a type. More specifically:
	 * (a) if the identifier is a parameter of a simple (basic or compound), it checks that the passed list of types is exactly the simple type of the parameter
	 * i.e.  typeName = [Int,T] --> the type of the parameter is a simple defined as <Int,T>;
	 * (b) if the identifier is a parameter of a multitype, it checks that the passed list of types is one of the simple type on which the multitype is defined on
	 * i.e.  typeName = [Int,T] --> the type of the parameter is a multitype defined as {<Int,T>, Y};
	 * @param identifier name of the parameter to query
	 * @param typename list of the type names composing the simple type
	 * @return true if all the conditions are verified, false otherwise
	 */
	public boolean isParInstanceOf(String identifier, Vector<String> typeName);

	/**
	 * It verifies if the channel is defined as internal	 
	 * @param identifier name of the channel
	 * @return true if the channel is internal
	 */
	public boolean isInternalChannel(String identifier);

	/**
	 * It verifies if the channel is defined as external	 
	 * @param identifier name of the channel
	 * @return true if the channel is external
	 */
	public boolean isExternalChannel(String identifier);
	
	/**
	 * It verifies two stuffs:
	 * (a) if the asked identifier is defined as channel related to a multitype
	 * (b) if the typeName is used within the definition of the multitype
	 * @param identifier name of the identifier to query
	 * @param typename name of the simple type to check
	 * @return true if the conditions are both true
	 */
	public boolean isMultiTypedChannel(String identifier, String typeName);

	/**
	 * This method checks if a simple type name is used within the definition of a multitype
	 * @param typeName name of the type to check as defined and simple
	 * @param multitypeName name of the type to check as defined and multitype
	 * @return true if the conditions are fulfilled
	 */
	public boolean isInternalToMultitype(String typeName, String multitypeName);

	/**
	 * It returns the name of the type related to a variable, to a parameter or to channel.
	 * @param identifier name of the variable/parameter
	 * @return name of the type
	 */
	public String getTypeName(String identifier);
	
	public ACompoundDeclarationCompoundDeclaration getCompoundNode(String name);
	
	public AMultitypeDeclarationMultitypeDeclaration getMultitypeNode(String name);
	
	public ABasicSimpletype getBasicNode(String name);
	
	public Node getTypeNode(String name);
	
	public Vector<String> getChannels(String type);

}