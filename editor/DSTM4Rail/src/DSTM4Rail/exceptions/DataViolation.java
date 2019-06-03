package DSTM4Rail.exceptions;



public class DataViolation extends Violation {

	private int line;
	
	private int pos;

	public DataViolation(ViolationKind kind, int line, int pos) {
		super(kind);
		this.line = line;
		this.pos = pos;
	}
	
	public int getLine() {
		return this.line;
	}

	public int getPos() {
		return this.pos;
	}
	
	public String toString() {
		return this.kind.toString() + " @" + this.line + "-" + this.pos;
	}
}