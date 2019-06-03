package org.prgmdl.tcg.d2p.crosscompiler.action;

import java.util.Hashtable;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.data.node.Node;
import org.prgmdl.dstmverifier.data.types.MultitypeAnalyser;
import org.prgmdl.dstmverifier.data.types.SpecialisedMultitypeAnalyser;
import org.prgmdl.dstmverifier.data.types.TypeAnalyser;
import org.prgmdl.dstmverifier.data.types.TypeAnalyserFactory;
import org.prgmdl.dstmverifier.transition.action.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.action.node.AAndLbop;
import org.prgmdl.dstmverifier.transition.action.node.ABoolnotExpr;
import org.prgmdl.dstmverifier.transition.action.node.ABoolopExpr;
import org.prgmdl.dstmverifier.transition.action.node.ACompareExpr;
import org.prgmdl.dstmverifier.transition.action.node.AComplexExprlist;
import org.prgmdl.dstmverifier.transition.action.node.AComplexExtvarlist;
import org.prgmdl.dstmverifier.transition.action.node.AConserveStatement;
import org.prgmdl.dstmverifier.transition.action.node.ADontExtvar;
import org.prgmdl.dstmverifier.transition.action.node.AEqEqop;
import org.prgmdl.dstmverifier.transition.action.node.AEqivExpr;
import org.prgmdl.dstmverifier.transition.action.node.AFaAtomic;
import org.prgmdl.dstmverifier.transition.action.node.AGtCmpop;
import org.prgmdl.dstmverifier.transition.action.node.AGteqCmpop;
import org.prgmdl.dstmverifier.transition.action.node.AIdAtomic;
import org.prgmdl.dstmverifier.transition.action.node.AIdChname;
import org.prgmdl.dstmverifier.transition.action.node.AIdLiteral;
import org.prgmdl.dstmverifier.transition.action.node.AIdVar;
import org.prgmdl.dstmverifier.transition.action.node.ALenchnAtomic;
import org.prgmdl.dstmverifier.transition.action.node.ALtCmpop;
import org.prgmdl.dstmverifier.transition.action.node.ALteqCmpop;
import org.prgmdl.dstmverifier.transition.action.node.AMathopExpr;
import org.prgmdl.dstmverifier.transition.action.node.AMathppExpr;
import org.prgmdl.dstmverifier.transition.action.node.AMinusMbop;
import org.prgmdl.dstmverifier.transition.action.node.AMinusMinusMmop;
import org.prgmdl.dstmverifier.transition.action.node.ANeqEqop;
import org.prgmdl.dstmverifier.transition.action.node.ANestedlExpr;
import org.prgmdl.dstmverifier.transition.action.node.ANumAtomic;
import org.prgmdl.dstmverifier.transition.action.node.AOrLbop;
import org.prgmdl.dstmverifier.transition.action.node.APlusMbop;
import org.prgmdl.dstmverifier.transition.action.node.APlusPlusMmop;
import org.prgmdl.dstmverifier.transition.action.node.AReceiveStatement;
import org.prgmdl.dstmverifier.transition.action.node.ASendStatement;
import org.prgmdl.dstmverifier.transition.action.node.ASlashMbop;
import org.prgmdl.dstmverifier.transition.action.node.AStarMbop;
import org.prgmdl.dstmverifier.transition.action.node.ATokAssign;
import org.prgmdl.dstmverifier.transition.action.node.ATrAtomic;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;
import org.prgmdl.tcg.d2p.datautils.StackUtils;

import DSTM4Rail.utilities.Utils;

public class ActionTranslator extends DepthFirstAdapter {
	
	protected DataToTransition dh;
	
	protected Stack<String> stack;
	
	public ActionTranslator(DataToTransition dtt) {
		this.dh = dtt;
		this.stack = new Stack<String>();
	}
	
	public String getString() {
		String retval = "";
		@SuppressWarnings("unchecked")
		Stack<String> temp = (Stack<String>) this.stack.clone();
		while (!temp.isEmpty()) {
			retval = temp.pop() + retval;
		}
		return retval;
	}
	
	public void outALtCmpop(ALtCmpop node) {
		this.stack.push("<");
	}
	
    public void outAGtqCmpop(AGtCmpop node) {
		this.stack.push(">");
    }
    
    public void outALteqCmpop(ALteqCmpop node) {
		this.stack.push("<=");
    }
    
    public void outAGteqCmpop(AGteqCmpop node) {
		this.stack.push(">=");
    }
    
    public void outAPlusMbop(APlusMbop node) {
		this.stack.push("+");
    }
    
    public void outAPlusPlusMmop(APlusPlusMmop node) {
		this.stack.push("+");
        this.stack.push("1");
    }
    
    public void outAMinusMbop(AMinusMbop node) {
		this.stack.push("-");
    }

    public void outAMinusMinusMmop(AMinusMinusMmop node) {
		this.stack.push("-");
        this.stack.push("1");
    }

    public void outASlashMbop(ASlashMbop node) {
		this.stack.push("/");
    }

    public void outAStarMbop(AStarMbop node) {
		this.stack.push("*");
    }
    
    public void outAAndLbop(AAndLbop node) {
		this.stack.push("&&");
    }

    public void outAOrLbop(AOrLbop node) {
		this.stack.push("||");
    }
    
    public void outAEqEqop(AEqEqop node) {
        this.stack.push("==");
    }

    public void outANeqEqop(ANeqEqop node) {
        this.stack.push("!=");
    }
    
    public void outADontExtvar(ADontExtvar node) {
        this.stack.push("_");
    }

    public void outANumAtomic(ANumAtomic node) {
        this.stack.push(node.getNumbers().getText());
    }
    
    public void outALenchnAtomic(ALenchnAtomic node) {
        StackUtils.monOp(this.stack,"len(");
    }

    public void outANestedlExpr(ANestedlExpr node) {
    	StackUtils.monOp(this.stack);
    }
    
    public void outABoolnotExpr(ABoolnotExpr node) {
    	StackUtils.monOp(this.stack,"!(");
    }
    
    public void outABoolopExpr(ABoolopExpr node) {
    	StackUtils.terOp(this.stack);
    }
    
    public void outACompareExpr(ACompareExpr node) {
    	StackUtils.terOp(this.stack);
    }
    
    public void outAMathppExpr(AMathppExpr node) {
    	StackUtils.terOp(stack);
    }
    
    public void outAMathopExpr(AMathopExpr node) {
    	StackUtils.terOp(this.stack);
    }
    
    public void outAEqivExpr(AEqivExpr node) {
    	StackUtils.terOp(this.stack);
    }
    
    public void outATrAtomic(ATrAtomic node) {
        this.stack.push("1");
    }
    
    public void outAFaAtomic(AFaAtomic node) {
        this.stack.push("0");
    }

    public void outATokAssign(ATokAssign node) {
        this.stack.push("=");
    }    

    public void outAIdAtomic(AIdAtomic node) {
        this.stack.push(node.getIdentifier().getText());
    }

    public void outAIdLiteral(AIdLiteral node) {
        this.stack.push(node.getIdentifier().getText());
    }

    public void outAIdChname(AIdChname node) {
        this.stack.push(node.getIdentifier().getText());
    }

    public void outASendStatement(ASendStatement node) {
        MsgSendUtils msu = new MsgSendUtils(this.dh);
        String exprList = this.stack.pop();        
        String chName = this.stack.pop();
        String retval = msu.sendChannel(chName,exprList);
        this.stack.push(retval);
    }

    public void outAComplexExtvarlist(AComplexExtvarlist node) {
        StackUtils.binOp(this.stack,",");
    }

	public void outAComplexExprlist(AComplexExprlist node) {
        StackUtils.binOp(this.stack,",");
    }
    
    public void outAReceiveStatement(AReceiveStatement node) {
        String varList = this.stack.pop();
        String chName = this.stack.pop();
        boolean external = this.dh.isExternalChannel(chName);
    	String pfx = "?";
    	String sfx = "";
        if (external) {
        	pfx = "?<";
        	sfx = ">";
        }
        String retval = this.recvCheckManagement(chName,varList,pfx,sfx);
        this.stack.push(retval);
    }
    
    public void outAConserveStatement(AConserveStatement node) {
        String varList = this.stack.pop();
        String chName = this.stack.pop();
        String retval = this.checkManagement(chName,varList);
        this.stack.push(retval);
    }
    
    private String recvCheckManagement(String chName, String extvarlist, String prefix, String postfix) {
    	String retval = "";
    	String copyExtVarLst = extvarlist;
    	String chType = this.dh.getTypeName(chName);
    	boolean multitypeFlag = this.dh.isMultiTypedChannel(chName,chType);
    	if (multitypeFlag) {
    		String types = ChannelUtils.getMsgTypeAct(extvarlist,this.dh);
    		Hashtable<String,String> chanTable = ChannelUtils.getCompatibilityTable(chName,this.dh);
    		int tableDimension = chanTable.keySet().size();
    		String[] keys = new String[tableDimension];
    		chanTable.keySet().toArray(keys);
    		for (int i = 0; i < keys.length; i++) {
    			String sign = chanTable.get(keys[i]);
    			boolean toSent = ChannelUtils.checkCompatibility(sign,types);
    			String commandString = toSent ? "1" : "0";
    			String nullString = MsgUtils.genDontCare(sign);
    			String packet = toSent ? copyExtVarLst : nullString;
    			String temp = keys[i] + prefix + commandString + "," + packet + postfix + ";";
    			retval = retval + temp + "\n";
    		}
    		retval = retval.substring(0,retval.length()-1);
    	} else {
    		StringTokenizer st = new StringTokenizer(copyExtVarLst,",");
    		Vector<String> stv = Utils.tokenizer2vector(st);
    		
        	TypeAnalyser ta = TypeAnalyserFactory.create(dh,chName,chType);
          	Node n = dh.getTypeNode(chType);
            ta.setDh(dh);
        	n.apply(ta);
        	Hashtable<String,String> thetab = ta.getTable();
        	String listtypes = thetab.get(thetab.keys().nextElement());
        	listtypes = listtypes.substring(1,listtypes.length()-1);
        	Vector<String> ttv = Utils.tokenizer2vector(new StringTokenizer(listtypes,","));
        	
        	Vector<String> finalList = new Vector<String>();
        	
        	for (int i=0; i<stv.size(); i++) {
        		String stv_x = stv.elementAt(i);
        		String ttv_x = ttv.elementAt(i);
        		
        		if (ChannelUtils.isChnTypd(ttv_x)) {
        			ttv_x = ChannelUtils.chnUnfold(ttv_x);
        		}
        		if (this.dh.isMultiType(ttv_x)) {
        			SpecialisedMultitypeAnalyser mta = new SpecialisedMultitypeAnalyser("");
        			mta.setDh(this.dh);
        			Node t = this.dh.getTypeNode(ttv_x);
        			t.apply(mta);
        			Vector<String> tkeys = mta.getSuffix();
        			boolean dontcare = stv_x.equals("_");
        			for (int j=0; j<tkeys.size(); j++) {
        				String filler = (dontcare) ? "_": stv_x + tkeys.elementAt(j);
        				finalList.add(filler);
        			}
        		} else {
        			finalList.add(stv_x);
        		}
        	}
        	retval = chName + prefix;
        	for (int k=0; k<finalList.size(); k++) {
        		retval += finalList.elementAt(k) + ","; 
        	}
        	retval = retval.substring(0,retval.length()-1) + postfix;
    	}
    	return retval;
    }

    private String checkManagement(String chName, String extvarlist) {
    	String retval = "";
    	String chType = this.dh.getTypeName(chName);
    	String key = chName;
    	boolean multitypeFlag = this.dh.isMultiTypedChannel(chName,chType);
    	if (multitypeFlag) {
    		String types = ChannelUtils.getMsgTypeAct(extvarlist,this.dh);
    		Hashtable<String,String> chanTable = ChannelUtils.getCompatibilityTable(chName,this.dh);
    		int tableDimension = chanTable.keySet().size();
    		String[] keys = new String[tableDimension];
    		chanTable.keySet().toArray(keys);
    		for (int i = 0; i < keys.length; i++) {
    			String sign = chanTable.get(keys[i]);
    			boolean toSend = ChannelUtils.checkCompatibility(sign,types);
    			if (toSend) {
    				key = keys[i];
    			}
    		}
    	}
		retval = key + "?<1," + extvarlist + ">";
    	return retval;
    }

    public void outAIdVar(AIdVar node) {
        this.stack.push(node.getIdentifier().getText());
    }
}