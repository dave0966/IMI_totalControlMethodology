package imi_totalcontrolmethodology;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputFolderManager {
	private File f_output;
	private String currOutputFolder = "";
	

	OutputFolderManager(){
		createDir_Output();
		setDefaultCurrOutputDir();
		createOutput_subFolder();
	}
	
	/*
	 * 	
	 * 		Create MethodsS
	 * 
	 */
	
	private void createDir_Output() {
		f_output = new File("$Output");
		if(!f_output.exists()) 
//		{
			f_output.mkdirs();
//			System.out.println("Successfully Created Directory!");
//		}
		else 
			System.out.println("Output Folder Directory are Already Exist!");
	}
	
	private void createOutput_subFolder() {
		File subfolder = new File(getCurrOutputFolder());
		if(!subfolder.exists()) 
			subfolder.mkdirs();
//		{
//			System.out.println("Successfully Created Directory!");
//		}else 
//			System.out.println(java.time.LocalDate.now().toString() + " folder already exist!");
	}

	/*
	 * 
	 * 		Setter Method
	 * 
	 */
	
	 void setCurrOutputFolder(String dir) {
		 this.currOutputFolder = dir;
	}
	
	void setDefaultCurrOutputDir() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 11);
		this.currOutputFolder = "$Output\\" + java.time.LocalDate.now().toString() + new SimpleDateFormat("_MM-dd").format(cal.getTime());
	}
	
	/*
	 * 
	 * 		Getter Method
	 * 
	 */
	
	String getCurrOutputFolder() {
		return this.currOutputFolder;
	}
}
