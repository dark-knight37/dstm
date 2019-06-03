package DSTM4Rail.exceptions;




public class GenericViolation extends Violation {
	
	protected String msg;

	public GenericViolation(ViolationKind kind, String msg) {
		super(kind);
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}
		
	@Override
	public String toString() {
		return this.kind.toString() + ": " + this.msg;
	}
}