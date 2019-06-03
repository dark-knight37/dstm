package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.util.StringTokenizer;

public class MsgUtils {
	
	public static String genNull(String sign) {
		int size = MsgUtils.signSize(sign);
		return MsgUtils.genPad("0",size);
	}

	public static String genDontCare(String sign) {
		int size = MsgUtils.signSize(sign);
		return MsgUtils.genPad("_",size);
	}

	private static int signSize(String sign) {
		int retval = 0;
		StringTokenizer st = new StringTokenizer(sign,",");
		while (st.hasMoreElements()) {
			st.nextElement();
			retval++;
		}
		return retval;
	}

	private static String genPad(String pad, int num) {
		String retval = "";
		for (int i = 1; i<=num; i++) {
			retval += pad + ",";
		}
		return retval.substring(0,retval.length()-1);
	}
}