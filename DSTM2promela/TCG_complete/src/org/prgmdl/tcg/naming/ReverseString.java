package org.prgmdl.tcg.naming;

public class ReverseString {
	
	private String s;
	
	private RenamingKind k;

	public ReverseString(String s, RenamingKind k) {
		super();
		this.s = s;
		this.k = k;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public RenamingKind getK() {
		return k;
	}

	public void setK(RenamingKind k) {
		this.k = k;
	}
}
