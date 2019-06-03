package DSTM4Rail.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

public class Utils {
	
	/**
	 * It checks if a generic vector contains a duplicated item
	 * @param buffer 
	 * @return true if a duplication occurs, false otherwise
	 */
	@SuppressWarnings("unchecked")
	public static boolean isThereDuplication(Vector<String> buffer) {
		boolean retval = false;
		Vector<String> dolly = (Vector<String>) buffer.clone();
		while ((retval == false) && (dolly.size()>0)) {
			String temp = dolly.remove(0);
			retval = dolly.contains(temp);
		}
		return retval;
	}

	/**
	 * It checks if a generic vector contains an element
	 * @param buffer 
	 * @return 
	 */
	public static boolean genericExistenceCheck(Vector<String> buffer, String element) {
		return buffer.contains(element);
	}

	/**
	 * It generates the signature of the Vector
	 * @return vector signature
	 */
	public static String getSignature(Vector<String> buffer) {
		String retval = "";
		for (int i = 0; i < buffer.size(); i++) {
			retval += buffer.elementAt(i) + ((i != buffer.size()-1) ? "-" : "" );
		}
		return retval;
	}
	
	/**
	 * It checks if there is null element inside the vector
	 * @return true if there is a null element, false otherwise
	 */
	public static boolean containsNull(Vector<String> buffer) {
		boolean retval = false;
		int i = 0;
		while ((!retval) && (i<buffer.size())) {
			retval = (buffer.elementAt(i) == null);
			i++;
		}
		return retval;
	}

	public static boolean signatureComparison(String s1, String s0) {
		StringTokenizer st1 = new StringTokenizer(s1,"-");
		StringTokenizer st0 = new StringTokenizer(s0,"-");
		boolean retval = st1.countTokens() == st0.countTokens();
		if (retval) {
			int i = 0;
			int max = st1.countTokens();
			while ((retval) && (i<max)) {
				String t1 = st1.nextToken();
				String t0 = st0.nextToken();
				retval = t1.equals(t0) || t0.equals("_") || t1.equals("_");
				i++;
			}
		}
		return retval;
	}
	
	public static String extractTypeFromChn(String x) {
		int beginIndex = x.indexOf('[') + 1;
		int endIndex = x.indexOf(']');
		return x.substring(beginIndex, endIndex);
	}
	
	public static String envelopeTypeInChn(String x) {
		return "Chn[" + x + "]";	
	}
	
	public static Vector<String> enum2vector(Enumeration<String> e) {
		Vector<String> retval = new Vector<String>();
		while (e.hasMoreElements()) {
			String t = e.nextElement();
			retval.add(t);
		}
		return retval;
	}
	
	public static String vector2string(Vector<String> v) {
		String retval = "";
		for (int i=0; i<v.size(); i++) {
			retval += v.get(i) + ",";
		}
		retval = retval.substring(0,retval.length()-1);
		return retval;
	}

	public static Vector<String> tokenizer2vector(StringTokenizer st) {
		Vector<String> retval = new Vector<String>();
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			retval.add(t);
		}
		return retval;
	}

	public static String file2string(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line = null;
		StringBuilder f = new StringBuilder();
		String ls = System.getProperty("line.separator");
	    while ((line = reader.readLine()) != null) {
	    	f.append(line);
	    	f.append(ls);
		}
	    String retval = f.toString();
	    reader.close();
	    return retval;
	}

	public static Vector<String> cleanVector(Vector<String> input) {
		Vector<String> retval = new Vector<String>();
		for (int i=0; i<input.size(); i++) {
			String x = input.elementAt(i);
			if (x.indexOf("&quot;") != -1) {
		        x = x.replaceAll("&quot;", "\"");
		    }			
			if (x.indexOf("&lt;") != -1) {
		        x = x.replaceAll("&lt;", "<");
		    }
			retval.add(i,x);
		}
		return retval;
	}
}