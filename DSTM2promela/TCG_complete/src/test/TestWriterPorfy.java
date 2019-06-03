package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tesqel.CFOrder;
import tesqel.CompoundFiring;
import tesqel.Firing;
import tesqel.Message;
import tesqel.TesqelFactory;
import tesqel.TesqelPackage;
import tesqel.TestSequence;

public class TestWriterPorfy {
	
	private static final String iniFile = "testwriter.ini";
	private static final String tesqelFolder = "model_test//tesqel//";
	private static final String outFolder = "model_test//results//";
	
	public static void main(String[] args) throws Exception {
		//Open file and Read Test Sequences
		ArrayList<TestSequence> list = new ArrayList<TestSequence>();
		
		//load Test Sequence and remove empty compound firings
		File folder = new File(tesqelFolder);
		System.out.println(folder.listFiles().length + " files");
		for (File file : folder.listFiles()) {
			TestSequence fromFile, newTS;
			fromFile = loadTestSequence(file.getPath());
			newTS = EcoreUtil.copy(fromFile);
			newTS.getLink().clear();
			for (int i = fromFile.getCompoundFiring().size()-1; i >= 0; i--) {
				if (fromFile.getCompoundFiring().get(i).getFiring().isEmpty()) {
					newTS.getCompoundFiring().remove(i);
				}
			}
			for (int i = 0; i < newTS.getCompoundFiring().size(); i++) {
				newTS.getCompoundFiring().get(i).setOrder(i);
				if (i!=0) {
					CFOrder cforder = TesqelFactory.eINSTANCE.createCFOrder();
					cforder.setTo(newTS.getCompoundFiring().get(i));
					cforder.setFrom(newTS.getCompoundFiring().get(i-1));
					newTS.getLink().add(cforder);
				}
			}
			list.add(newTS);
		}
		
		//remove unreceived IO messages
		for (TestSequence testSequence : list) {
			for (CompoundFiring cf : testSequence.getCompoundFiring()) {
				EList<Message> messages = cf.getIOmessage();
				for(int i = messages.size()-1; i>=0; i--) {
					Message m = messages.get(i);
					boolean found = false;
					if (m.getMessage().compareTo("<Pause>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MainTask.t4")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<Resume>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MainTask.t5")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<StartTaskMezzi>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MezziTask.t1")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<EndTaskMezzi>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MezziTask.t2")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<StartTaskMeteo>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MeteoTask.t1")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<EndTaskMeteo>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MeteoTask.t2")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<StartTaskSegnalazioni>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("SegnalazioniTask.t1")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<EndTaskSegnalazioni>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("SegnalazioniTask.t2")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<UpdateMezzi>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MainTask.t6")) 
								found = true;
						}
					} else if (m.getMessage().compareTo("<UpdateMeteo>")==0) {
						Iterator<Firing> it = cf.getFiring().iterator();
						while (!found && it.hasNext()) {
							Firing f = it.next();
							if (f.getTransition().contains("MainTask.t9")) 
								found = true;
						}
					}
					if(!found)
						messages.remove(i);
				}
			}
		}
		
		ArrayList<TestSequence> newlist = new ArrayList<TestSequence>();
		//check equivalence among test sequences
		for (int i = 0; i < list.size(); i++) {
			boolean repeated = false;
			int j = 0;
			while (!repeated && j < newlist.size()) {
				repeated = equals(list.get(i), newlist.get(j));
				j++;
			}
			if (!repeated)
				newlist.add(list.get(i));
		}
		
//		File directory = new File(outFolder);
//		if (!directory.exists()) {
//	        directory.mkdir();
//		}
		
		//write test sequence to files
		int i=0;
		for (TestSequence ts : newlist) {
			writeTestSequence(ts, outFolder + "test" + (i++) + ".tesqel");
		}
		
		writeTests(newlist);
	}
	
	private static void writeTests(ArrayList<TestSequence> newlist) throws IOException {
		HashMap<String, String> mappingTable = new HashMap<String, String>();
		//load ini file
		List<String> content = Files.readAllLines(Paths.get(iniFile));
		for (String string : content) {
			String[] inside = string.split(" "); 
			if(inside.length>=2 && !inside[0].isEmpty() && !inside[inside.length-1].isEmpty())
				mappingTable.put(inside[0], inside[inside.length-1]);
		}
		
		int numTest = 1;
		for (TestSequence ts : newlist) {
			System.out.println("@Test");
			System.out.println("public void Test" + (numTest++) + "() throws InterruptedException {");
			System.out.println("\tGeneralEvent.declareandSetSemaphore(DownloadMezziTask.sem);");
			System.out.println("\tGeneralEvent.declareandSetSemaphore(LeggiMeteoTask.sem);");
			System.out.println("\tGeneralEvent.declareandSetSemaphore(LeggiSegnalazioniTask.sem);");
			System.out.println("\tGeneralEvent.startApp(\"com.porfirio.orariprocida2011\");");
			for (CompoundFiring f : ts.getCompoundFiring()) {
				for (Message m : f.getIOmessage()) {
					System.out.println("\t" + mappingTable.get(m.getMessage().substring(1, m.getMessage().length()-1)) + ";");
				}
			}
			System.out.println("}");
		}
	}

	static public boolean equals(TestSequence ts1, TestSequence ts2) {
		boolean ret = true;
		if (ts1.getInitial().size() == ts2.getInitial().size()) {
			for (int i = 0; i < ts1.getInitial().size(); i++) {
				if (ts1.getInitial().get(i).compareTo(ts2.getInitial().get(i)) != 0)
					return false;
			}
		} else
			return false;
		if (ts1.getCompoundFiring().size() == ts2.getCompoundFiring().size()) {
			for (int i = 0; i < ts1.getCompoundFiring().size(); i++) {
				if (ts1.getCompoundFiring().get(i).getFiring().size() == ts2.getCompoundFiring().get(i).getFiring().size()) {
					for (int j = 0; j < ts1.getCompoundFiring().get(i).getFiring().size(); j++) {
						Firing f1 = ts1.getCompoundFiring().get(i).getFiring().get(j);
						Firing f2 = ts2.getCompoundFiring().get(i).getFiring().get(j);
						if (f1.getCurrent().size() == f2.getCurrent().size()) {
							for (int k = 0; k < f1.getCurrent().size(); k++) {
								if (f1.getCurrent().get(k).compareTo(f2.getCurrent().get(k)) != 0)
									return false;
							}
						} else
							return false;
						if (f1.getNext().size() == f2.getNext().size()) {
							for (int k = 0; k < f1.getNext().size(); k++) {
								if (f1.getNext().get(k).compareTo(f2.getNext().get(k)) != 0)
									return false;
							}
						} else
							return false;
						if (f1.getTransition().size() == f2.getTransition().size()) {
							for (int k = 0; k < f1.getTransition().size(); k++) {
								if (f1.getTransition().get(k).compareTo(f2.getTransition().get(k)) != 0)
									return false;
							}
						} else
							return false;
					}
				} else
					return false;
			}
		} else
			return false;
		return ret;
	}
	
	static public TestSequence loadTestSequence(String fileName) throws Exception {
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		try {
			Resource resource = resSet.getResource(URI.createURI(fileName), true);
			return (TestSequence) resource.getContents().get(0);
		} catch (Exception e) {
			e.printStackTrace();
			return TesqelFactory.eINSTANCE.createTestSequence();
		}
	}
	
	static public void writeTestSequence(TestSequence ts, String fileName) throws Exception {
		TesqelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tesqel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(fileName));
		resource.getContents().add(ts);
		resource.save(Collections.EMPTY_MAP);
	}
	
}
