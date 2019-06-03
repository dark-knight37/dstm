package DSTM4Rail.exceptions;



public enum ViolationKind {
	/**
	 * Duplicated identifier
	 */
	DUPID("Duplicated Identifier"),

	/**
	 * Undeclared Identifier
	 */
	UNDID("Undeclared Identifier"),

	/**
	 * Duplicated literal inside an enumeration
	 */
	DUPLIT("Duplicated literal inside an enumeration"),

	/**
	 * Mtype in the definition of another Mtype
	 */
	MTINMT("Mtype in the definition of another Mtype"),

	/**
	 * Duplicated subtype inside a MType
	 */
	DUPMTY("Duplicated subtype inside a MType"),

	/**
	 * Duplicated structure for MTypes
	 */
	SIGMTY("Duplicated structure for MTypes"),

	/**
	 * MType and/or Compound in the definition of another Compound
	 */
	CMINCNP("MType and/or Compound in the definition of another Compound"),

	/**
	 * Duplicated structure for Compounds
	 */
	SIGCNP("Duplicated structure for Compounds"),

	/**
	 * Not a channel neither a parameter
	 */
	INCP("Identifer is not a channel neither a parameter"),

	/**
	 * Identifier not typed as channel
	 */
	NTAC("Identifer not typed as channel"),
	
	/**
	 * No type for the expression
	 */
	ME("Malformed expression: this expression has no type"),
	/**
	 * Is not an internal channel
	 */
	INIC("Is not an internal channel"),
	/**
	 * Is not a type
	 */
	NAT("NOt a Type"),

	
	
	
	/**
	 * Parameter is not instance of a channel
	 */
	PINIC("Parameter is not instance of a channel"),	
	
	/**
	 * Variable is not instance of a channel
	 */
	VINIC("Variable is not instance of a channel"),	
	
	/**
	 * Is not a multityped channel
	 */
	INMTC("Is not a multityped channel"),	
	
	/**
	 * Chan is not istance of...
	 */
	CIN("Chan is not istance of..."),	
	
	/**
	 * Is not a parameter
	 */
	INP("Is not a parameter"),	
	
	/**
	 * Is not a variable
	 */
	INV("Is not a variable"),	
	
	/**
	 * Self loop on InitialNode
	 */
	SLFINIT("InitialNode cannot be a destination of a transition"),

	/**
	 * One initialNode
	 */
	UNQINIT("Each machine MUST have at most one InitialNode"),
	
	/**
	 * Unnamed control flow element
	 */
	UNMDELEM("Each element must have a name"), 
	
	/**
	 * Not a multitype in trigger definition
	 */	
	NTAMIT("The channels used in triggers must be multityped"), 
	
	/**
	 * Underscore in channel name
	 */
	USCN("Using underscores in channel names is not allowed"),
	
	DUMMY ("Dumb violations: normally used for debugging purposes"),
	
	/**
	 * A Transition cannot have the same name of a vertex
	 */
	NODENAMENOTUNQ("A Transition cannot have the same name of a vertex."),
	
	
	
	CHARNOTALLOWEDNODE("Vertexes names must not contain special characters"),
	
	
	CHARNOTALLOWEDTRANS("Transitions names must not contain special characters"),
	
	ATLEAST2NODE("Each machine must have at least one initial and one node!"),
	
	EXSINIT("Each machine must have an Initial node."),
	
	EXSNODE("Each machine must have a Node or an Exiting Node");
	
	
	private final String kindName;

	/**
	 * constructor.
	 * 
	 * @param name
	 *            name.
	 */
	private ViolationKind(String name) {
		kindName = name;
	}

	/**
	 * toString method.
	 * 
	 * @return string of the object.
	 */
	public String toString() {
		return kindName;
	}

	/**
	 * @return custom violation code (defined within evl file)
	 */
	public static ViolationKind getKindFromString(String kind) {
		for (ViolationKind vKind : ViolationKind.values()) {
			if (vKind.name().compareTo(kind) == 0)
				return vKind;
		}
		return null;
	}

}
