package DSTM4Rail.exceptions;

import org.eclipse.emf.ecore.EObject;

import DSTM4Rail.NamedElement;

public class ModelViolation extends Violation{

	private String type;

	private EObject source;
	
	public ModelViolation(String code, String type, EObject source) {
		super(ViolationKind.getKindFromString(code));
		this.type = type;
		this.source = source;
	}

	public String getMsg() {
		return this.type;
	}

	public EObject getViolationSource() {
		return this.source;
	}

	@Override
	public String toString() {
		String name = "NO-NAME";
		if (this.source instanceof NamedElement) {
			String temp = ((NamedElement) this.source).getName(); 
			if (!temp.equals("")) { 
				name = temp;
			}
		}
		return this.kind.toString() + " on instance " + name + " of " + this.type + " element type";
	}
}
