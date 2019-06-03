package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.util.Hashtable;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;

public class MsgSendUtils {
	private DataToTransition dh;
	
	public MsgSendUtils(DataToTransition dtt) {
		this.dh = dtt;
	}
	
    public String sendChannel(String chName, String exprList) {
    	String retval = null;
    	String basename = chName;
        String chType = this.dh.getTypeName(chName);
    	String actualChName = chName;
        boolean multitypeFlag = this.dh.isMultiTypedChannel(chName,chType);
        boolean paramFlag = this.dh.isParameter(chName);
        if (!multitypeFlag) {
        	if (paramFlag) {
        		chType = ChannelUtils.chnUnfold(chType);
        		actualChName = this.dh.getChannels(chType).get(0);
                multitypeFlag = this.dh.isMultiTypedChannel(actualChName,chType);
                if (multitypeFlag) {
                	chName = actualChName;
                }
        	}
        }
        if (multitypeFlag) {
        	retval = this.sendMultiChannel(chName,exprList,basename);
        } else {
        	retval = this.sendSimpleChannel(chName,exprList);
        }
        return retval;
    }

    private String sendSimpleChannel(String chName, String exprList) {
		String prefix = this.dh.isInternalChannel(chName) ? "" : "1," ;
		return chName + "!" + prefix + exprList;
	}

	private String sendMultiChannel(String chName, String exprList, String base) {
    	String retval = "";
    	String exprTypes = ChannelUtils.getMsgTypeAct(exprList,this.dh);
    	Hashtable<String,String> chanTable = ChannelUtils.getCompatibilityTable(chName,this.dh);
    	int tableDimension = chanTable.keySet().size();
    	String[] keys = new String[tableDimension];
    	chanTable.keySet().toArray(keys);
    	for (int i = 0; i < keys.length; i++) {
    		String actualkey = keys[i]; 
    		String sign = chanTable.get(keys[i]);
    		boolean toSent = ChannelUtils.checkCompatibility(sign,exprTypes);
    		String commandString = toSent ? "1" : "0";
    		String nullString = MsgUtils.genNull(sign);
    		String packet = toSent ? exprList : nullString;
    		if (!base.equals(chName)) {
    			actualkey = actualkey.replace(chName,base);
    		}
    		String temp = actualkey + "!" + commandString + "," + packet + ";\n";
    		retval = retval + " " + temp;
    	}
    	if (retval.endsWith(";\n")) {
    		retval = retval.substring(0,retval.length()-2);
    	}
		return retval;
	}
}