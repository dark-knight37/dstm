package DSTM4Rail.utilities;

import java.io.PushbackReader;
import java.io.StringReader;

public class PBFactory {
	
	protected static String load = null;

	public static PushbackReader getPBR() {
		return new PushbackReader(new StringReader(load), 1024);
	}
	
	public static PushbackReader getPBR(String lload) {
		return new PushbackReader(new StringReader(lload), 1024);
	}

	public static void attach(String payload) {
		load = payload;
	}
}
