package org.xtext.unina.xdstm.validation;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;


public class IncludeHelper {
	
	public boolean checkIncludedFile(String fileName) {
//		IWorkspace workspace = ResourcesPlugin.getWorkspace();
//		workspace.getRoot().getProjects();
//		
//		return true;
		
		return new File(fileName).exists();
	}
}
