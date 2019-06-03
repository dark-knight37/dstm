package DSTM4Rail.exceptions;

/**
 * This class of exceptions is related to violations of model constraints such as: 
 * <UL>
 *  <LI> type matching: a variable is assigned to a value that does not belong to its type;
 *  <LI> no declaration for variable: a variable is never declared;
 *  <LI> ...
 * </UL>
 * @author Stefano Marrone
 */
public class LexingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2571194654266946533L;

	public LexingException(String string) {
		super(string);
	}
}
