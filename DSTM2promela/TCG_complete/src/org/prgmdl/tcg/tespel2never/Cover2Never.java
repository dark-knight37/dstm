package org.prgmdl.tcg.tespel2never;

public class Cover2Never extends Abstract2Never {

	@Override
	protected String generate(String i, int counter) {
		String retval = "never n" + counter + "{\n"
				+ "never_step:\n"
				+ "if\n"
				+ ":: (LastTransition==" + i + ") -> goto end_never;\n"
				+ ":: else -> goto never_step;\n"
				+ "fi;\n"
				+ "end_never:\n"
				+ "skip\n"
				+ "}"
				+ "\n";
		return retval;
	}

}
