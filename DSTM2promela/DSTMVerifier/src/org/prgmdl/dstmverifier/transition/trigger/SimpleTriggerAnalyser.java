package org.prgmdl.dstmverifier.transition.trigger;

import org.prgmdl.dstmverifier.data.DataToTransition;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessageAtomic;
import org.prgmdl.dstmverifier.transition.trigger.node.AMessagetypeAtomic;

import DSTM4Rail.Transition;
import DSTM4Rail.exceptions.TransitionViolation;
import DSTM4Rail.exceptions.ViolationKind;
import DSTM4Rail.utilities.Utils;


/**
 *
 * @author Stefano Marrone
 * @author Matilde Vassallo
 */
public class SimpleTriggerAnalyser extends BaseTriggerAnalyser {

    public SimpleTriggerAnalyser(DataToTransition dtt, Transition trans) {
		super(dtt, trans);
	}

	public void inAMessageAtomic(AMessageAtomic node) {
    	TokenFinder idf = new TokenFinder();
    	node.getVar().apply(idf);
    	String idName = idf.getName();
        if (!this.dtt.isChannel(idName)) {
        	if (this.dtt.isParameter(idName, this.machine)) {
        		String type = dtt.getTypeName(idName);
        		if (!type.startsWith("Chn")) {
        			this.violations.add(new TransitionViolation(ViolationKind.NTAC,idf.getName(),idf.getPos()));
        		}
        	} else {
            	// Neither a channel nor a parameter
    			this.violations.add(new TransitionViolation(ViolationKind.INCP,idf.getName(),idf.getPos()));
            }
        }
    }

    public void inAMessagetypeAtomic(AMessagetypeAtomic node) {
    	TokenFinder idfvar = new TokenFinder();
    	node.getVar().apply(idfvar);
    	String idName = idfvar.getName();
    	
    	TokenFinder idftype = new TokenFinder();
    	node.getSimpletype().apply(idftype);
    	String typeName = idftype.getName();

        if ((this.dtt.isParameter(idName, this.machine)) || (this.dtt.isChannel(idName))) {
       		String type = dtt.getTypeName(idName);
			if (type.startsWith("Chn") == true) {
				type = Utils.extractTypeFromChn(type);
			}
   			if (this.dtt.isMultiType(type)) {
       			if (!this.dtt.isInternalToMultitype(typeName, type)) {
           			this.violations.add(new TransitionViolation(ViolationKind.NTAMIT,idName,idftype.getPos()));
       			}
   			} else {
       			this.violations.add(new TransitionViolation(ViolationKind.NTAMIT,idName,idfvar.getPos()));
   			}
    	} else {
        	// Neither a channel nor a parameter
			this.violations.add(new TransitionViolation(ViolationKind.INCP,idName,idfvar.getPos()));
        }
    }
}

