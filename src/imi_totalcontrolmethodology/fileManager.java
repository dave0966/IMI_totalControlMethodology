package imi_totalcontrolmethodology;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class fileManager{
	private List<String> arrDirTemplate = new ArrayList<String>();
 	private Path templatePath = Paths.get("D:\\Coding\\git\\OJT\\IMI_\\IMI_totalControlMethodology\\$Resource");
	
	
	fileManager() {
		setArrDirTemplate();
		for(String temp : arrDirTemplate)
			System.out.println(temp);
	}
	
	/*
	 * 
	 * Create Methods
	 * 
	 */
	
	// 0 - IKS AFAA | 1 - STLA AFAA | 2 - STLA SASSY3
	void copyXLSXTemplate(int filetype) {
		Files.copy(, null);
	}
	
	/*
	 * 
	 * IS's Methods
	 * 
	 */

	boolean isFileCredentialValid(String dir) {
		return false;
	}

	boolean isNumeric(String str) {
		return false;
	}

	boolean isFileExist(int i) {
		return false;
	}
	
	boolean isFileDateValid(String dir) {
		return false;
	}
	
	/*
	 * 
	 * 	SET Method/s
	 * 
	 */
	
	void setArrDirTemplate() {
		for(String temp: new File("$Resource").list())
			if(temp.endsWith("Template.xlsx"))
				arrDirTemplate.add("$Resource\\" + temp);
	}
	
	String getTemplateDirectory(int fileTemplate) {
		return mainClass.lfm.getFileTemplatePathCategory(fileTemplate);
	}
	
	/*
	 * 
	 * GET's Methods
	 * 
	 */
	
	//Method for Existing Templates
	int getTemplateType(String dir) {
		return 0	;
	}

	List<String> getEmployeeNumList() {
		return null;
	}
	
	private String getCopiedFileName(int i) {
		return null;
	}
	
	String getArrDirTemplate(int template) {
		return this.arrDirTemplate.get(template);
	}
	
	/*
	 * 
	 * ADD's Methods
	 * 
	 */

	void addEmployeeNum(String input) {
	}
	
	void addArrDirTemplate() {
		
	}
}
