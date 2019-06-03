package org.xtext.unina.xdstm.validation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.prgmdl.dstmverifier.transition.trigger.SimpleTriggerVerifier;
import org.xtext.unina.xdstm.generator.Helper;
import org.xtext.unina.xdstm.xDstm.Machine;
import org.xtext.unina.xdstm.xDstm.Model;
import org.xtext.unina.xdstm.xDstm.Transition;

import DSTM4Rail.exceptions.ConstraintException;
import DSTM4Rail.exceptions.LexingException;
import DSTM4Rail.exceptions.ParsingException;

public class DSTMVerifierStub {
	
	public boolean verifyTrigger(Transition trans, Model model, String fileName) {
//		DSTM4Rail.DSTM dstm4rail = Helper.convertToDSTM4Rail(model);
//		
//		DSTM4Rail.Transition t = null;
//		for (DSTM4Rail.Machine m : dstm4rail.getMachines()) {
//			if (m.getName().compareTo(((Machine) trans.eContainer()).getName())==0) {
//				for (DSTM4Rail.Transition tr : m.getTransitions()) {
//					if (tr.getName().compareTo(trans.getName())==0) {
//						t = tr;
//						break;
//					}
//				}
//			}
//		}
//		
//		BufferedReader reader = null;
//		try {
//			reader = new BufferedReader(new FileReader(fileName));
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
//		String line = null;
//		StringBuilder stringBuilder = new StringBuilder();
//		String ls = System.getProperty("line.separator");
//		try {
//			while( (line = reader.readLine()) != null ) {
//				stringBuilder.append(line);
//			    stringBuilder.append(ls);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				reader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		String declarations = stringBuilder.toString();
//		SimpleTriggerVerifier tv = new SimpleTriggerVerifier();
//		
//		boolean ret = false;
//		try {
//			ret = tv.verifyTrigger(t, dstm4rail, declarations);
//		} catch (LexingException | ParsingException | ConstraintException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return ret;
		return true;
	}
	
	public boolean verifyCondition(Transition trans, Model model, String fileName) {
		return true;
	}
	
	public boolean verifyAction(Transition trans, Model model, String fileName, int actNumber) {
		return true;
	}
	
}
