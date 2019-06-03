package org.prgmdl.tcg.d2p.backend;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;


public class DSTM2PromelaM2M {
    private Properties properties = new Properties();
    protected IModel inModel;
    protected IModel pmlModel;
    public Boolean generateFile(String[] args) {
            try {
                if (args.length < 2) {
                    System.out.println("Arguments not valid : {IN_model_path, PML_model_path}.");
                }
                DSTM2PromelaM2M runner = new DSTM2PromelaM2M();
                runner.loadModels(args[0]);
                runner.doDSTM2ProMM((IProgressMonitor)new NullProgressMonitor());
                runner.saveModels(args[1]);
                return true;
            }
            catch (ATLCoreException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            catch (ATLExecutionException e) {
                e.printStackTrace();
            }
        return false;
    }

    
    
    public DSTM2PromelaM2M() throws IOException {
        this.properties.load(DSTM2PromelaM2M.getFileURL("DSTM2Promela.properties").openStream());
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
    }

    
    public void loadModels(String inModelPath) throws ATLCoreException {
        EMFModelFactory factory = new EMFModelFactory();
        EMFInjector injector = new EMFInjector();
        IReferenceModel dstmrailMetamodel = factory.newReferenceModel();
        injector.inject((IModel)dstmrailMetamodel, this.getMetamodelUri("DSTMRail"));
        IReferenceModel promelaMetamodel = factory.newReferenceModel();
        injector.inject((IModel)promelaMetamodel, this.getMetamodelUri("PROMELA"));
        this.inModel = factory.newModel(dstmrailMetamodel);
        injector.inject(this.inModel, inModelPath);
        this.pmlModel = factory.newModel(promelaMetamodel);
    }

    public void saveModels(String pmlModelPath) throws ATLCoreException {
        EMFExtractor extractor = new EMFExtractor();
        extractor.extract(this.pmlModel, pmlModelPath);
    }

    public Object doDSTM2ProMM(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
    	EMFVMLauncher launcher = new EMFVMLauncher();
        Map<String, Object> launcherOptions = this.getOptions();
        launcher.initialize(launcherOptions);
        launcher.addInModel(this.inModel, "IN", "DSTMRail");
        launcher.addOutModel(this.pmlModel, "PML", "PROMELA");
        
        launcher.addLibrary("DSTMLib", (Object)this.getLibraryAsStream("DSTMLib"));
        return launcher.launch("run", monitor, launcherOptions, (Object[])this.getModulesList());
    }

    protected InputStream[] getModulesList() throws IOException {
        InputStream[] modules = null;
        String modulesList = this.properties.getProperty("DSTM2ProMM.modules");
        if (modulesList != null) {
            String[] moduleNames = modulesList.split(",");
            modules = new InputStream[moduleNames.length];
            int i = 0;
            while (i < moduleNames.length) {
                String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
                modules[i] = DSTM2PromelaM2M.getFileURL(asmModulePath).openStream();
                ++i;
            }
        }
        return modules;
    }

    protected String getMetamodelUri(String metamodelName) {
        return this.properties.getProperty("DSTM2ProMM.metamodels." + metamodelName);
    }

    protected InputStream getLibraryAsStream(String libraryName) throws IOException {
        return DSTM2PromelaM2M.getFileURL(this.properties.getProperty("DSTM2ProMM.libraries." + libraryName)).openStream();
    }

    protected Map<String, Object> getOptions() {
        HashMap<String, Object> options = new HashMap<String, Object>();
        for (Map.Entry entry : this.properties.entrySet()) {
            if (!entry.getKey().toString().startsWith("DSTM2ProMM.options.")) continue;
            options.put(entry.getKey().toString().replaceFirst("DSTM2ProMM.options.", ""), entry.getValue().toString());
        }
        return options;
    }

    protected static URL getFileURL(String fileName) throws IOException {
        URL resourceURL;
        URL fileURL = DSTM2PromelaM2M.isEclipseRunning() ? ((resourceURL = DSTM2PromelaM2M.class.getResource(fileName)) != null ? FileLocator.toFileURL((URL)resourceURL) : null) : DSTM2PromelaM2M.class.getResource(fileName);
        if (fileURL == null) {
            throw new IOException("'" + fileName + "' not found");
        }
        return fileURL;
    }

    public static boolean isEclipseRunning() {
        try {
            return Platform.isRunning();
        }
        catch (Throwable v0) {
            return false;
        }
    }
    

    
}