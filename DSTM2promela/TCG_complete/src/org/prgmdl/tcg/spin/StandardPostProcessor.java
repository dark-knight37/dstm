package org.prgmdl.tcg.spin;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.prgmdl.tcg.d2p.frontend.Frontend;
import org.prgmdl.tcg.naming.NameManager;

import tesqel.Action;
import tesqel.ActionKind;
import tesqel.CFOrder;
import tesqel.CompoundFiring;
import tesqel.Condition;
import tesqel.ConditionKind;
import tesqel.Direction;
import tesqel.FOrder;
import tesqel.Firing;
import tesqel.Message;
import tesqel.Phase;
import tesqel.TesqelFactory;
import tesqel.TesqelPackage;
import tesqel.TestSequence;
import tesqel.Trigger;
import tesqel.impl.TesqelFactoryImpl;
import DSTM4Rail.utilities.IniReader;

public class StandardPostProcessor implements PostProcessor {
	
	private String tempFileName; 
	private int counter;
	
	public StandardPostProcessor(String inifile) throws Exception {
		IniReader reader = new IniReader(inifile);
		this.tempFileName = reader.get("temptesqel");
	}

	@Override
	public Vector<String> transform(Hashtable<String, String> pretesqels, NameManager nm) {
		if (pretesqels != null) {
			Set<String> keys = pretesqels.keySet();
			Vector<String> ret = new Vector<String>(keys.size());
			for (String key : keys) {
				try {
					String content = pretesqels.get(key);
					//manage SPIN output, conforming it to Tesqel
					System.out.println("POST PROCESSOR: processing " + key);
					content = this.manageSpinGeneratedString(content);
					//get Test Sequence from string
					TestSequence sequence = this.getTestSequenceFromString(content);
					//manage TestSequence object
					if (sequence.getCompoundFiring().size()>0) {
						this.manageTestSequence(sequence,nm);
						//add to ret vector
						ret.add(this.getStringFromTestSequence(sequence));
					}
				} catch (Exception e) {
					e.printStackTrace();
					ret.add("ERROR");
				}
			}
			return ret;
		} else {
			return null;
		}
	}
	
	private void manageTestSequence(TestSequence sequence, NameManager nm) {
		CompoundFiring previousCF = null, actualCF = null;
		Firing previousF = null, actualF = null;
		Phase phs = null;
		
		for (int i = 0; i < sequence.getCompoundFiring().size(); i++) {
			actualCF = sequence.getCompoundFiring().get(i);
			//set CF order
			actualCF.setOrder(i);			
			if (i > 0) {
				//create CF link
				this.addLinkBetweenCFs(sequence, previousCF, actualCF);
			}
			for (int j = 0; j < actualCF.getFiring().size(); j++) {
				actualF = actualCF.getFiring().get(j);
				//set F order
				actualF.setOrder(j);
				//splitting and renaming 'current' field
				this.splitAndRenameCurrent(actualF, nm);
				//splitting and renaming 'next' field
				this.splitAndRenameNext(actualF, nm);
				//splitting and renaming 'transition' field
				this.splitAndRenameTransition(actualF, nm);
				if (j > 0) {
					//create F link
					this.addLinkBetweenFs(actualCF, previousF, actualF);
				}
				for (int k = 0; k < actualF.getPhase().size(); k++) {
					phs = actualF.getPhase().get(k);
					phs.setOrder(k);
					if (phs instanceof Trigger)
						//add informations to triggers
						this.manageTrigger(actualCF, (Trigger) phs);
					else if (phs instanceof Condition)
						//add informations to conditions
						this.manageCondition(actualCF, (Condition) phs);
					else
						//add informations to actions
						this.manageAction((Action) phs);
				}
				previousF = actualF;
			}
			this.cleanIOMessageNames(actualCF);
			previousCF = actualCF;
		}
		this.setNameInitialSpecification(sequence);
	}
	
	private void cleanIOMessageNames(CompoundFiring cf) {
		//remove [identifier] from IOmessages
		for (Message m : cf.getIOmessage()) {
			if (m.getDirection() == Direction.TO_SYSTEM) {
				String chNameOLD = m.getChannel();
				m.setChannel(chNameOLD.substring(0, chNameOLD.indexOf('[')));
			}
		}
	}
	
	private void manageTrigger(CompoundFiring cf, Trigger trg) {
		//set message field with the message content
		String chIDtoFind = trg.getMessage();
		boolean found = false;
		String message = "";
		Message IOmess = null;
		String IOmessID = "";
		//retrieve message from IOmessages of the current cf (for external channels)
		Iterator<Message> iterator = cf.getIOmessage().iterator();
		while (chIDtoFind!= null && !found && iterator.hasNext()) {
			IOmess = iterator.next();
			if(IOmess.getDirection() == Direction.TO_SYSTEM) {
				int startIdx = IOmess.getChannel().indexOf('[');
				int endIdx = IOmess.getChannel().indexOf(']');
				if ((startIdx > 0) && (endIdx > startIdx)) {
					IOmessID = IOmess.getChannel().substring(startIdx + 1, endIdx);
					if(IOmessID.compareTo(chIDtoFind) == 0) {
						found = true;
						message = IOmess.getMessage();
					}
				}
			}
		}
		if (found)
			trg.setMessage(message);
		else
			trg.setMessage(null);
	}
	
	private void manageCondition(CompoundFiring cf, Condition cnd) {
		if (cnd.getKind() == ConditionKind.MESSAGE) {
			//set Rvalue field with the message content
			String chIDtoFind = cnd.getRvalue();
			boolean found = false;
			String Rvalue = "";
			Message IOmess = null;
			String IOmessID = "";
			//retrieve message from IOmessages of the current cf (for external channels)
			Iterator<Message> iterator = cf.getIOmessage().iterator();
			while (chIDtoFind!= null && !found && iterator.hasNext()) {
				IOmess = iterator.next();
				if(IOmess.getDirection() == Direction.TO_SYSTEM) {
					int startIdx = IOmess.getChannel().indexOf('[');
					int endIdx = IOmess.getChannel().indexOf(']');
					if ((startIdx > 0) && (endIdx > startIdx)) {
						IOmessID = IOmess.getChannel().substring(startIdx + 1, endIdx);
						if(IOmessID.compareTo(chIDtoFind) == 0) {
							found = true;
							Rvalue = IOmess.getMessage();
						}
					}
				}
			}
			if (found)
				cnd.setRvalue(Rvalue);
			else
				cnd.setRvalue(null);
		}
	}
	
	private void manageAction(Action act) {
		if (act.getKind() == ActionKind.SEND)
			//add brackets in case of message sending
			act.setRvalue("<" + act.getRvalue() + ">");
	}

	private void addLinkBetweenCFs(TestSequence sequence, CompoundFiring previous, CompoundFiring actual) {
		CFOrder CFLink = TesqelFactory.eINSTANCE.createCFOrder();
		CFLink.setFrom(previous);
		CFLink.setTo(actual);
		sequence.getLink().add(CFLink);		
	}

	private void addLinkBetweenFs(CompoundFiring cf, Firing previous, Firing actual) {
		FOrder FLink = TesqelFactory.eINSTANCE.createFOrder();
		FLink.setFrom(previous);
		FLink.setTo(actual);
		cf.getLink().add(FLink);
	}

	private void splitAndRenameCurrent(Firing f, NameManager nm) {
		String[] tempSplittedName = f.getCurrent().get(0).split(Frontend.separator);
		if (tempSplittedName.length >= 1) {
			f.getCurrent().clear();
			for (int i = 1; i < tempSplittedName.length; i++) {
				if (nm != null)
					f.getCurrent().add(nm.reverse(tempSplittedName[0]).getS() + PostProcessor.separator + nm.reverse(tempSplittedName[i]).getS());
				else
					f.getCurrent().add(tempSplittedName[0] + PostProcessor.separator + tempSplittedName[i]);
			}
		}
	}
	
	private void splitAndRenameNext(Firing f, NameManager nm) {
		String[] tempSplittedName = f.getNext().get(0).split(Frontend.separator);
		if (tempSplittedName.length >= 1) {
			f.getNext().clear();
			for (int i = 1; i < tempSplittedName.length; i++) {
				if (nm != null)
					f.getNext().add(nm.reverse(tempSplittedName[0]).getS() + PostProcessor.separator + nm.reverse(tempSplittedName[i]).getS());
				else
					f.getNext().add(tempSplittedName[0] + PostProcessor.separator + tempSplittedName[i]);
			}
		}
	}
	
	private void splitAndRenameTransition(Firing f, NameManager nm) {
		String[] tempSplittedName = f.getTransition().get(0).split(Frontend.separator);
		if (tempSplittedName.length >= 1) {
			f.getTransition().clear();
			for (int i = 1; i < tempSplittedName.length; i++) {
				if (nm != null)
					f.getTransition().add(nm.reverse(tempSplittedName[0]).getS() + PostProcessor.separator + nm.reverse(tempSplittedName[i]).getS());
				else
					f.getTransition().add(tempSplittedName[0] + PostProcessor.separator + tempSplittedName[i]);
			}
		}
	}
	
	private void setNameInitialSpecification(TestSequence sequence) {
		if (!sequence.getCompoundFiring().isEmpty()) {
			int LastCFIndex = sequence.getCompoundFiring().size() - 1;
			//set name, initial and specification
			CompoundFiring lastCF = sequence.getCompoundFiring().get(LastCFIndex);
			while (lastCF.getFiring().isEmpty()) {
				lastCF = sequence.getCompoundFiring().get(--LastCFIndex);
			}
			Firing lastF = lastCF.getFiring().get(lastCF.getFiring().size() - 1);
			sequence.setName(lastF.getTransition().toString().replace("[", "").replace("]", "").replace(" ", ""));
			//sequence.setSpecification(sequence.getName()); TODO: trovare meccanismo per capire se si tratta di coverage o requirement
			sequence.getInitial().clear();
			sequence.getInitial().addAll(sequence.getCompoundFiring().get(0).getFiring().get(0).getCurrent());
		}
	}

	private String fileToString(String path) throws IOException {
		String fileContent = "";
		List<String> content = Files.readAllLines(Paths.get(path));
		for (String line : content) {
			fileContent += line + "\n";
		}
		return fileContent;
	}
	
	private String manageSpinGeneratedString(String s) {
		String temp = "";
		String[] splitted = s.split("\n");
		for (String line : splitted) {
			line = line.trim();
			if(line.startsWith("<") && line.endsWith(">"))
				temp += line.trim() + "\n";
		}
		if (temp.endsWith("</compoundFiring>\n"))
			//esistono casi in cui </compoundFiring> viene inserito da SPIN
			temp += "</tesqel:TestSequence>";
		else
			temp += "</compoundFiring>\n</tesqel:TestSequence>";
		return temp;
	}
	
	private TestSequence getTestSequenceFromString(String s) throws Exception {
		//write temp tesqel file in order to reuse reader from URI
		PrintWriter pw = new PrintWriter(this.tempFileName);
		pw.write(s);
		pw.close();
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		try {
			Resource resource = resSet.getResource(URI.createURI(this.tempFileName), true);
			Files.deleteIfExists(Paths.get(this.tempFileName));
			return (TestSequence) resource.getContents().get(0);
		} catch (Exception e) {
			return TesqelFactory.eINSTANCE.createTestSequence();
		}
	}
	
	private String getStringFromTestSequence(TestSequence test) throws Exception {	   
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		String temporaryFileName = this.tempFileName.substring(0, this.tempFileName.lastIndexOf('.')) +
				this.counter + this.tempFileName.substring(this.tempFileName.lastIndexOf('.'));
		this.counter++;
		Resource resource = resSet.createResource(URI.createFileURI(temporaryFileName));
		resource.getContents().add(test);
		resource.save(Collections.EMPTY_MAP);
		String ret = fileToString(temporaryFileName);
		Files.deleteIfExists(Paths.get(temporaryFileName));
		return ret;
	}
	
}
