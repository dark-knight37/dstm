package org.prgmdl.tcg.d2p.crosscompiler.tesqelUtils;

import java.util.StringTokenizer;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;

import DSTM4Rail.utilities.Utils;

public class ActionHelper extends Helper {
	
	public ActionHelper() {
		this.kind = "Action";
    }

    public String getAssignment(String name, String type) {
        String phase = this.show;
        phase += super.printfHeader() + super.tesqelHeader() + this.space;
        phase += "kind=" + this.pq() + "assignment" + this.pq() + this.space;
        phase += "lvalue=" + this.pq() + name + this.pq() + this.space;
        phase += "rvalue=" + this.pq() + this.getTypeTag(type) + this.pq();
        phase += this.tesqelTrailer() + this.sn() + this.q(); 
        phase += "," + name + this.printfTrailer();
		return phase;
    }

	public String getMessage(String knd, String chname) {
        String phase = this.show; 
        phase += super.printfHeader() + super.tesqelHeader() + this.space;
        phase += "kind=" + this.pq() + knd + this.pq() + this.space;
        phase += "lvalue=" + this.pq() + chname + this.pq() + this.space;
        phase += this.tesqelTrailer() + this.sn() + this.q() + this.printfTrailer(); 
		return phase;
	}

    public String getSend(String chn, String extExprlist, DataToTransition datahandler) {
        String phase = this.show; 
        phase += super.printfHeader() + super.tesqelHeader() + this.space;
        phase += "kind=" + this.pq() + "send" + this.pq() + this.space;
        phase += "lvalue=" + this.pq() + chn + this.pq() + this.space;
        String exprs = this.printExpressions(extExprlist);  
        String types = this.msgStart + this.printTags(extExprlist,datahandler) + this.msgEnd;
        phase += "rvalue=" + this.pq() + types + this.pq();
        phase += this.tesqelTrailer() + this.sn() + this.q();
        phase += "," + exprs + this.printfTrailer();
		return phase;
    }
    
    private Vector<String> getExpressions(String extExprList) {
    	int index = extExprList.indexOf('!');
    	String temp = extExprList.substring(index+1);
    	StringTokenizer st = new StringTokenizer(temp,",");
    	return Utils.tokenizer2vector(st);
    }

    private String printExpressions(String extExprList) {
    	String retval = null;
    	Vector<String> split = this.getExpressions(extExprList);
    	if (split.get(0).equals("1")) {
    		split.remove(0);
    	}
		retval = Utils.vector2string(split);
    	return retval;
    }

    private Vector<String> getTags(String extExprList, DataToTransition datahandler) {
    	Vector<String> retval = this.getExpressions(extExprList);
    	if (retval.get(0).equals("1")) {
    		retval.remove(0);
    	}
    	for (int i=0; i < retval.size(); i++) {
    		String temp = datahandler.getTypeName(retval.elementAt(i));
    		temp = this.getTypeTag(temp);
    		retval.set(i,temp);
    	}
    	return retval;
    }

    private String printTags(String extExprList, DataToTransition datahandler) {
    	Vector<String> temp = this.getTags(extExprList,datahandler);
		String retval = Utils.vector2string(temp);
    	return retval;
    }

    private String getTypeTag(String type) {
		String retval = "%e";
		if (type != null) {
			if (type.equals("Int") || type.equals("Bool")) {
				retval = "%d";
			}  
		}
		return retval;
	}
}