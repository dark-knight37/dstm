package org.prgmdl.tcg.d2p.crosscompiler.condition;

import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.condition.analysis.DepthFirstAdapter;
import org.prgmdl.dstmverifier.transition.condition.node.AAndopBinop;
import org.prgmdl.dstmverifier.transition.condition.node.ABinaryTerm;
import org.prgmdl.dstmverifier.transition.condition.node.AChIdChname;
import org.prgmdl.dstmverifier.transition.condition.node.AChnIdChnName;
import org.prgmdl.dstmverifier.transition.condition.node.AComplexTrmlist;
import org.prgmdl.dstmverifier.transition.condition.node.ACompopAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.AComposedLval;
import org.prgmdl.dstmverifier.transition.condition.node.AComposedRval;
import org.prgmdl.dstmverifier.transition.condition.node.ADcareExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AEmptycondSize;
import org.prgmdl.dstmverifier.transition.condition.node.AEnumExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AEqEqop;
import org.prgmdl.dstmverifier.transition.condition.node.AEquiopAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.AFalseAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.AFalseExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AFullcondSize;
import org.prgmdl.dstmverifier.transition.condition.node.AGtCmpop;
import org.prgmdl.dstmverifier.transition.condition.node.AGteqCmpop;
import org.prgmdl.dstmverifier.transition.condition.node.AIdExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ALIdLiteral;
import org.prgmdl.dstmverifier.transition.condition.node.ALenChnExpr;
import org.prgmdl.dstmverifier.transition.condition.node.ALtCmpop;
import org.prgmdl.dstmverifier.transition.condition.node.ALteqCmpop;
import org.prgmdl.dstmverifier.transition.condition.node.AMinusMathop;
import org.prgmdl.dstmverifier.transition.condition.node.ANeqEqop;
import org.prgmdl.dstmverifier.transition.condition.node.ANestedTerm;
import org.prgmdl.dstmverifier.transition.condition.node.ANumExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AOropBinop;
import org.prgmdl.dstmverifier.transition.condition.node.APlusMathop;
import org.prgmdl.dstmverifier.transition.condition.node.ASimpleTrmlist;
import org.prgmdl.dstmverifier.transition.condition.node.ASizecondAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.ASlashMathop;
import org.prgmdl.dstmverifier.transition.condition.node.AStarMathop;
import org.prgmdl.dstmverifier.transition.condition.node.ATrmlistAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.ATrueAtomic;
import org.prgmdl.dstmverifier.transition.condition.node.ATrueExpr;
import org.prgmdl.dstmverifier.transition.condition.node.AUnaryTerm;
import org.prgmdl.dstmverifier.transition.condition.node.Node;
import org.prgmdl.tcg.d2p.datautils.ChannelUtils;
import org.prgmdl.tcg.d2p.datautils.StackUtils;

import DSTM4Rail.utilities.Utils;

public class ConditionTranslator extends DepthFirstAdapter {

	private DataToTransition dh;
	
	private Stack<String> stack;
	
	private boolean enabler; // variable needed to remediate to an error in single term list when  

	private boolean boolenabler; //   

	private boolean inchannel;

	public ConditionTranslator(DataToTransition dtt) {
		this.dh = dtt;
		this.stack = new Stack<String>();
		this.enabler = true;
		this.boolenabler = true;
		this.inchannel = false;
	}
	
	public String getString() {
		return this.stack.peek();
	}
	
    public void outANestedTerm(ANestedTerm node) {
    	StackUtils.monOp(this.stack);
    }
    
    public void outAUnaryTerm(AUnaryTerm node) {
    	StackUtils.monOp(this.stack,"!(");
    }

    public void outABinaryTerm(ABinaryTerm node) {
    	StackUtils.terOp(this.stack);
    }

    public void outAAndopBinop(AAndopBinop node) {
        this.stack.push("&&");
    }

    public void outAOropBinop(AOropBinop node) {
        this.stack.push("||");
    }
    
    public void inATrueExpr(ATrueExpr node) {
    	if (this.boolenabler == true) {
            this.stack.push("1");
    	}
    }

    public void inATrueAtomic(ATrueAtomic node) {
    	if (this.boolenabler == true) {
            this.stack.push("1");
    	}
    }
    
    public void inAFalseExpr(AFalseExpr node) {
    	if (this.boolenabler == true) {
            this.stack.push("0");
    	}
    }

    public void inAFalseAtomic(AFalseAtomic node) {
    	if (this.boolenabler == true) {
            this.stack.push("0");
    	}
    }

    public void outAEquiopAtomic(AEquiopAtomic node) {
    	StackUtils.terOp(this.stack);
    }

    public void outACompopAtomic(ACompopAtomic node) {
    	StackUtils.terOp(this.stack);
    }

    public void outAFullcondSize(AFullcondSize node) {
        this.stack.push("full");
    }

    public void outAEmptycondSize(AEmptycondSize node) {
        this.stack.push("empty");
    }

    public void outANeqEqop(ANeqEqop node) {
        this.stack.push("!=");
    }

    public void outAEqEqop(AEqEqop node) {
        this.stack.push("==");
    }

    public void outALteqCmpop(ALteqCmpop node) {
        this.stack.push("<=");
    }

    public void outALtCmpop(ALtCmpop node) {
        this.stack.push("<");
    }

    public void outAGteqCmpop(AGteqCmpop node) {
        this.stack.push(">=");
    }

    public void outAGtCmpop(AGtCmpop node) {
        this.stack.push(">");
    }

    public void outASizecondAtomic(ASizecondAtomic node) {
        String func = this.stack.pop();
        String channel = this.stack.pop();
        this.stack.push(func + "(" + channel + "");
    }

    public void outAChIdChname(AChIdChname node) {
        String chname = node.getIdentifier().getText();
        this.stack.push(chname);
    }
    
    public void outAComposedLval(AComposedLval node) {
        StackUtils.terOp(this.stack);
    }

    public void outAComposedRval(AComposedRval node) {
        StackUtils.terOp(this.stack);
    }

    public void outAPlusMathop(APlusMathop node) {
        this.stack.push("+");
    }

    public void outAMinusMathop(AMinusMathop node) {
        this.stack.push("-");
    }

    public void outAStarMathop(AStarMathop node) {
        this.stack.push("*");
    }

    public void outASlashMathop(ASlashMathop node) {
        this.stack.push("/");
    }

    public void inATrmlistAtomic(ATrmlistAtomic node) {

    }

    public void outATrmlistAtomic(ATrmlistAtomic node) {
    	String retval = "";
    	// Extract data
    	String translated = this.stack.pop();
    	String original = node.getTrmlist().toString().trim().replace(" ","");
    	String msgTypes = ChannelUtils.getMsgType(translated.trim(),this.dh,original);
    	String chName = this.stack.pop();
    	String basename = chName;
    	boolean isparam = this.dh.isParameter(chName);
    	
    	if (isparam) {
    		String type = this.dh.getTypeName(chName);
    		type = ChannelUtils.chnUnfold(type);
    		chName = this.dh.getChannels(type).get(0);
    	}
    	
    	Hashtable<String,String> chanTable = ChannelUtils.getCompatibilityTable(chName,this.dh);
    	// First comparison - deletion of not compatible types
    	Vector<String> keys = Utils.enum2vector(chanTable.keys());
    	if (keys.isEmpty()) {
    		keys.add(chName);
    		chanTable.put(chName,msgTypes);
    	}
    	Vector<String> toremove = new Vector<String>();
    	for (int i = 0; i < keys.size(); i++) {
    		String key = keys.elementAt(i);
    		String sign = chanTable.get(key);  		
//        	if (isparam) {
//        		sign = ChannelUtils.chnUnfold(sign);
//        		if (this.dh.isCompound(sign)) {
//        			CompoundAnalyser ca = new CompoundAnalyser(sign);
//        			this.dh.getCompoundNode(sign).apply(ca);
//        			sign = ca.getType();
//        		}
//        	}
    		if (!ChannelUtils.checkCompatibility(sign,msgTypes)) {
    			toremove.add(key);
    		}
    	}
    	keys.removeAll(toremove);
    	// Preparation of the final string
//   	keys = Utils.enum2vector(chanTable.keys());
    	int stop = keys.size();
    	
    	// Message preparation
    	translated = this.format(translated);
    	boolean mtypeFlag = this.dh.isMultiType(chName);
    	boolean extFlag = this.dh.isExternalChannel(chName);
    	String header = (mtypeFlag || extFlag) ? "1," : "";
    	for (int i = 0; i <stop; i++) {
    		String thename = keys.elementAt(i); 
    		thename = thename.replaceAll(chName,basename);
    		retval +=  thename + "?[" + header + translated + "]";
    		if (i != stop - 1) {
    			retval += " || ";
    		}
    	}
    	this.stack.push(retval);
    }
    
    private String format(String msg) {
    	Hashtable<String,String> table = new Hashtable<String,String>();
    	table.put("true","1");
    	table.put("false","0");
    	Vector<String> keys = Utils.enum2vector(table.keys());
    	for (int i=0; i<keys.size(); i++) {
        	msg = this.formatSingle(msg,keys.get(i),table.get(keys.get(i)));
    	}
		return msg;
	}

	private String formatSingle(String msg, String alpha, String beta) {
		if (msg.equals(alpha)) {
			msg = beta;
		} else {
			msg = msg.replaceAll("," + alpha,"," + beta);
			msg = msg.replaceAll(alpha + ",",beta + ",");
		}
		return msg;
	}

	public void outAIdExpr(AIdExpr node) {
		String token = node.getIdentifier().getText();
		boolean isBool = token.equals("false") || token.equals("true");
		boolean nottodo = isBool && (this.boolenabler == false);
		boolean toeval = this.dh.isVariable(token) && (this.inchannel == true); 
		if (!nottodo) {
			if (toeval) {
				token = "eval(" + token + ")";
			}
	        this.stack.push(token);
		}
    }

    public void outAChnIdChnName(AChnIdChnName node) {
        this.stack.push(node.getIdentifier().getText());
    }
    
    public void outANumExpr(ANumExpr node) {
        this.stack.push(node.getNumbers().getText());
    }

    public void inAComplexTrmlist(AComplexTrmlist node){
    	this.inchannel = true;
    }

    public void outAComplexTrmlist(AComplexTrmlist node){
        StackUtils.binOp(this.stack,",");
    	this.inchannel = false;
    }

    public void inASimpleTrmlist(ASimpleTrmlist node){
    	this.inchannel = true;
    }

    public void outASimpleTrmlist(ASimpleTrmlist node){
    	if (this.enabler == true) {
        	Node p = node.parent();
        	if (p instanceof ATrmlistAtomic) {
        		String name = node.getExpr().toString().trim();
        		String top = this.stack.peek();
        		boolean istrue = name.equals("true") && top.equals("1"); 
        		boolean isfalse = name.equals("false") && top.equals("0"); 
        		if (!(istrue || isfalse)) {
                	this.stack.push(name);
        		}
        	} 
    	}
    	this.enabler = true;
    	this.boolenabler = true;
    	this.inchannel = false;
    }

    public void outALenChnExpr(ALenChnExpr node) {
        StackUtils.monOp(this.stack,"len(");
    }
    
    public void outADcareExpr(ADcareExpr node) {
        this.stack.push("_");
    }
    
    public void outAEnumExpr(AEnumExpr node) {
    	ALIdLiteral lit = (ALIdLiteral) node.getLiteral();
        this.stack.push(lit.getIdentifier().getText());
        this.enabler = false;
    }
}