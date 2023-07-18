package imi_totalcontrolmethodology;

import java.io.File;

import javax.swing.JOptionPane;

public class ResourceFolderManager {
	private File f_resource;
	
	private void createDir_Resource() {
		f_resource = new File("$Resource");
		if(!f_resource.exists()) {
			f_resource.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Resource Folder Directory are Already Exist!");
	}
	
	private void checkResource() {
		if(!(new File("LOGO.jpg").exists()))
			JOptionPane.showMessageDialog(null, "LOGO.jpg could not be find or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
		else if(!(new File("image-300x150.jpg").exists()))
			JOptionPane.showMessageDialog(null, "image-300x150.jpg could not be find or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
	}
}
