package DSTM4Rail.exceptions;




public class TransitionViolation extends GenericViolation {
	
	private int pos = 0;
	
	public TransitionViolation(ViolationKind kind, String msg, int pos) {
		super(kind, msg);
		this.pos=pos;
	}
	

	public String getMsg() {
		return this.msg;
	}
		
	@Override
	public String toString() {
		return this.kind.toString() + ": " + this.msg + " @" + this.pos;
	}	

}
