package org.prgmdl.tcg;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.prgmdl.dstmverifier.DSTMVerifier;
import org.prgmdl.dstmverifier.SimpleDSTMVerifier;
import org.prgmdl.merge.ModelMerge;
import org.prgmdl.merge.SimpleModelMerge;
import org.prgmdl.tcg.common.OptimizationLevel;
import org.prgmdl.tcg.common.Promela;
import org.prgmdl.tcg.common.RequestKind;
import org.prgmdl.tcg.d2p.DSTM2Promela;
import org.prgmdl.tcg.d2p.StandardDSTM2Promela;
import org.prgmdl.tcg.naming.NameManager;
import org.prgmdl.tcg.naming.StdNameManager;
import org.prgmdl.tcg.p2t.Promela2Text;
import org.prgmdl.tcg.p2t.StandardPromela2Text;
import org.prgmdl.tcg.spin.PostProcessor;
import org.prgmdl.tcg.spin.SpinManager;
import org.prgmdl.tcg.spin.StandardPostProcessor;
import org.prgmdl.tcg.spin.manager.SpinManagerFactory;
import org.prgmdl.tcg.tespel2never.Abstract2NeverFactory;
import org.prgmdl.tcg.tespel2never.Tespel2Never;

import DSTM4Rail.DSTM;
import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public class StandardTCG implements TestCaseGenerator {
	
	private final String inifile = "properties.ini";

	private OptimizationLevel olevel;
	
	private boolean justcompilation; 
	
	public StandardTCG(OptimizationLevel ol) {
		this.olevel = ol;
		this.justcompilation = false;
	}

	public StandardTCG() {
		this(OptimizationLevel.None);
	}
	
	public void justcompile() {
		this.justcompilation = true;
	}

	@Override
	public Vector<String> generate(DSTM model, String data, RequestKind request, Vector<String> input) throws LexingException, ParsingException, ConstraintException, IOException {
		Vector<String> tesqels = null;
		DSTMVerifier verifier = new SimpleDSTMVerifier(false);
		boolean verification = verifier.verify(model, data);
		if (verification) {
			// Merging
			ModelMerge mm = new SimpleModelMerge();
			DSTM mergedModel = mm.mergeModel(model,data);
			// Naming Phase
//			NameManager nm = new StdNameManager(); //SET NULL TO AVOID RENAIMING
			NameManager nm = null;
			DSTM renamed;
			if (nm != null)
				renamed = nm.renameModel(mergedModel);
			else
				renamed = EcoreUtil.copy(mergedModel);
			// DSTM2Promela
			DSTM2Promela d2p = new StandardDSTM2Promela();
			Promela pmModel = d2p.transform(renamed,data,nm);
			// Promela2Text
			Promela2Text p2t = new StandardPromela2Text();
			String pmText = p2t.transform(mergedModel, pmModel);			
			// Never claims Generation
			Hashtable<String,String> neverTable = this.neverManagement(model,request,input,nm);
			/*
			if (!this.justcompilation) {
				try {
					// SpinManager
					SpinManager sm = SpinManagerFactory.genSM(this.inifile,this.olevel);				
					Hashtable<String,String> pretesqels = sm.spinExecution(pmText,neverTable);
					// Post-processing and Reverse naming phases 
					PostProcessor pp = new StandardPostProcessor(this.inifile);
					tesqels = pp.transform(pretesqels,nm);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
		return tesqels;
	}

	private Hashtable<String,String> neverManagement(DSTM model, RequestKind request, Vector<String> input, NameManager nm) {
		Abstract2NeverFactory a2nf = new Abstract2NeverFactory(nm);
		Tespel2Never t2n = a2nf.factory(model, request, input);
		Vector<String> items = a2nf.getItems();
		Hashtable<String,String> results = t2n.generate(items);
		return results;
	}

	@Override
	public Vector<String> generate(DSTM model, String data, RequestKind request) throws LexingException, ParsingException, ConstraintException, IOException {
		return this.generate(model,data,request,null);
	}
	
	public void setOptimLevel(OptimizationLevel ol) {
		this.olevel = ol;
	}
}
