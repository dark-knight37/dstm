package org.prgmdl.tcg.d2p.datautils;

import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.node.Node;
import org.prgmdl.dstmverifier.data.types.MultitypeAnalyser;
import org.prgmdl.dstmverifier.data.types.TypeAnalyser;
import org.prgmdl.dstmverifier.data.types.TypeAnalyserFactory;

import DSTM4Rail.utilities.Utils;

public class ChannelUtils {

    public static String preparePadding(final int i, boolean with) {
    	String retval = "";
    	for (int j=1; j<=i; j++) {
    		retval += ",_";
    	}
    	return (with) ? retval : retval.substring(1,retval.length());
    }
    
    public static String composeTrigger(Hashtable<String,Integer> channelTable, DataToTransition dh) {
    	String retval = "(";
    	Set<String> actualChannel = channelTable.keySet();
    	for (String t: actualChannel) {
    		if (dh.isInternalChannel(t)) {
        		retval += t + "?" + ChannelUtils.prepareDonCareMsg(channelTable.get(t));
    		} else {
        		retval += t + "?" + ChannelUtils.prepareNotNullMsg(channelTable.get(t));
    		}
    		retval += " || ";
    	}
    	retval = retval.substring(0,retval.length()-4);
    	return retval + ")";
    }
    
    public static Hashtable<String,Integer> extractActualChannels(String chname, DataToTransition dh) {
    	String chtype = dh.getTypeName(chname);
    	String basename = chname;
    	if (dh.isParameter(chname)) {
    		chtype = TypeAnalyserFactory.chnUnfold(chtype);
    		// Search for a compatible channel
    		Vector<String> compatibleChannels = dh.getChannels(chtype);
    		chname = compatibleChannels.get(0);
    	}
    	TypeAnalyser ta = TypeAnalyserFactory.create(dh,chname,chtype);
//    	Node n = dh.getTypeNode(basename);
      	Node n = dh.getTypeNode(chname);
        ta.setDh(dh);
    	n.apply(ta);
    	// The extreme appezzottation
    	if (ta.isValid() == false) {
        	n = dh.getTypeNode(chtype);
    		n.apply(ta);
    	}
    	// Start modification 06072016
    	Hashtable<String,Integer> temp = new Hashtable<String,Integer>();
    	//Hashtable<String,String> fulltemp = ta.getTable();
    	temp = ta.getCounterTable();
    	
    	
    	
    	
    	// end modification 06072016
    	Hashtable<String,Integer> retval = new Hashtable<String,Integer>();
    	for (String x: temp.keySet()) {
    		String xrep = x.replaceAll(chname,basename);
    		retval.put(xrep,temp.get(x));
    	}
    	return retval;
    }
    
    public static Vector<String> getActualChannelNames(String chname, DataToTransition dh) {
    	Vector<String> retval = new Vector<String>();
		String chtype = dh.getTypeName(chname);
		boolean isMultiType = dh.isMultiTypedChannel(chname,chtype);
		if (isMultiType) {
    		Hashtable<String,String> chanTable = ChannelUtils.getCompatibilityTable(chname,dh);
    		retval = Utils.enum2vector(chanTable.keys());
		} else {
			retval.add(chname);
		}
		return retval;
    }

	public static String getMsgType(String msgs, DataToTransition dh, String tips) {
		StringTokenizer msgTok = new StringTokenizer(msgs.trim(),",");
		StringTokenizer tipTok = new StringTokenizer(tips,",");
		String retval = "";
		while (msgTok.hasMoreTokens()) {
			String msg = msgTok.nextToken();
			msg = ChannelUtils.clean(msg);
			String tip = tipTok.nextToken();
			if (msg.equals("1") && tip.equals("true")) {
				msg = "true";
			}
			if (msg.equals("0") && tip.equals("false")) {
				msg = "false";
			}
			if (!msg.equalsIgnoreCase("_")) {
				if (tip.contains("::")) {
					msg = tip.substring(0,tip.indexOf("::"));
				} else {
					msg = dh.getTypeName(msg);
				}
			}
			retval += msg + ",";
		}
		return retval.substring(0,retval.length()-1);
	}

	public static String getMsgTypeAct(String msgs, DataToTransition dh) {
		StringTokenizer msgTok = new StringTokenizer(msgs.trim(),",");
		String retval = "";
		while (msgTok.hasMoreTokens()) {
			String msg = msgTok.nextToken();
			if (!msg.equalsIgnoreCase("_")) {
				msg = dh.getTypeName(msg);
			}
			retval += msg + ",";
		}
		return retval.substring(0,retval.length()-1);
	}

	public static boolean checkCompatibility(String sign, String msg) {
		boolean retval = true;
		String tempSign = ChannelUtils.unpadSignature(sign);
		StringTokenizer signST = new StringTokenizer(tempSign,",");
		StringTokenizer msgST = new StringTokenizer(msg,",");
		retval = (signST.countTokens() == msgST.countTokens());
		while ((retval == true) && (signST.hasMoreTokens())) {
			String signTemp = signST.nextToken();
			String msgTemp = msgST.nextToken();
			// Eval removing
			msgTemp = ChannelUtils.clean(msgTemp);
			if (!msgTemp.equalsIgnoreCase("_")) {
				retval = (signTemp.equalsIgnoreCase(msgTemp));
			}
		} 
		return retval;
	}

	private static String clean(String token) {
		String retval = token;
		if (retval.startsWith("eval(")) {
			int istart = "eval(".length();
			int iend = token.length()-")".length();
			retval = token.substring(istart,iend);
		}
		return retval;
	}

	private static String unpadSignature(String sign) {
		String retval = sign;
		if (sign.startsWith("[") && sign.endsWith("]")) {
			retval = sign.substring(1,sign.length()-1);
		}
		return retval;
	}

	public static String chnUnfold(String x) {
		boolean flag = x.startsWith("Chn[") && x.endsWith("]");
		if (flag) {
			x = x.substring(4,x.length()-1);
		}
		return x;
	}

	public static boolean isChnTypd(String x) {
		return x.startsWith("Chn[") && x.endsWith("]");
	}

	public static Hashtable<String,String> getCompatibilityTable(String chname, DataToTransition dh) {
    	TypeAnalyser ta = TypeAnalyserFactory.create(dh,chname);
    	Node n = dh.getTypeNode(chname);
    	n.apply(ta);
//    	// The extreme appezzottation TODO what if to write exception code in the default branch of the getTypeNode function
//    	if (ta.isValid() == false) {
//    		String chtype = dh.getTypeName(chname);
//        	n = dh.getTypeNode(chtype);
//    		n.apply(ta);
//    	}
    	return ta.getTable();
	}

	public static String choiceComposeTrigger(Hashtable<String,Integer> tb, String cts) {
    	String retval = "(";
    	Set<String> actualChannel = tb.keySet();
    	for (String t: actualChannel) {
    		if (t.equals(cts)) {
    			String payload = ChannelUtils.prepareNotNullMsg(tb.get(t));
    			retval += t + "?" + payload;
    			retval += " && ";
    		}
    	}
    	retval = retval.substring(0,retval.length()-4);
    	return retval + ")";
	}

    public static String prepareNotNullMsg(int i) {
    	return ChannelUtils.prepareMsg(i,1);
    }

    public static String prepareDonCareMsg(int i) {
    	return ChannelUtils.prepareMsg(i,-1);
    }

    public static String prepareNullMsg(int i) {
    	return ChannelUtils.prepareMsg(i,0);
	}

	private static String prepareMsg(int i, int tap) {
		String retval = "";
		if (tap >= 0) {
			retval = "[" + tap + ChannelUtils.preparePadding(i,true) + "]";
		} else {
			retval = "[" + ChannelUtils.preparePadding(i,false) + "]";
		}
    	return retval; 
	}
}
