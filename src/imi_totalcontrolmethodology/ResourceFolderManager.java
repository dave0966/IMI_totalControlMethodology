package imi_totalcontrolmethodology;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ResourceFolderManager implements GlobalResource {
	private File f_resource;
	private Path dir_RFM = Paths.get("D:\\Coding\\git\\OJT\\IMI_\\IMI_totalControlMethodology\\$Resource");
	
	
	public ResourceFolderManager() {
		createDir_Resource();
		checkResource();
	}
	
	private void createDir_Resource() {
		f_resource = new File("$Resource");
		if(!f_resource.exists()) {
			f_resource.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Resource Folder Directory are Already Exist!");
	}
	
	boolean checkResource() {
		if(Files.notExists(Path.get(img_logo.get)))
			JOptionPane.showMessageDialog(null, "LOGO.jpg could not be found or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
		else if(!(new File("$Resource\\image-300x150.jpg").exists()))
			JOptionPane.showMessageDialog(null, "image-300x150.jpg could not be find or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
		else
			return false;
		
		return true;
	}
}
