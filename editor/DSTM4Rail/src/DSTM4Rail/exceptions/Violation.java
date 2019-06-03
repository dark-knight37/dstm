package DSTM4Rail.exceptions;



public abstract class Violation {

	protected ViolationKind kind;

	public Violation(ViolationKind kind) {
		super();
		this.kind = kind;
	}

	public ViolationKind getKind() {
		return this.kind;
	}

	public void setKind(ViolationKind kind) {
		this.kind = kind;
	}

	public abstract String toString();
}