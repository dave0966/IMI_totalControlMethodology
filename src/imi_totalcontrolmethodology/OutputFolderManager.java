package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

public class OutputFolderManager {
	private File f_output;
	private String currOutputFolder = "";
	

	OutputFolderManager(){
//		System.out.println("OutputFolderManager invoked!");
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
		if(f_output.exists()) 
		{
			f_output.mkdirs();
			System.out.println("Successfully Created Directory!");
		}
		else 
			System.out.println("Output Folder Directory are Already Exist!");
	}
	
	private void createOutput_subFolder() {
		File subfolder = new File(getCurrOutputFolder());
		if(!subfolder.exists() && isOutputSubFolderValid()) 
		{ 
			subfolder.mkdirs();
			System.out.println("New Instance of Output SubFolder created!");
		}
		else
			System.out.println("Output SubFolder (Recent) are Already Exist!");
	}

	/*
	 * 
	 * 		Setter Method
	 * 
	 */
	
	 void setCurrOutputSubFolder(String dir) {
		 this.currOutputFolder = dir;
	}
	
	void setDefaultCurrOutputDir() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 11);
		setCurrOutputSubFolder("$Output\\" + java.time.LocalDate.now().toString() + new SimpleDateFormat("_MM-dd").format(cal.getTime()));
	}
	
	/*
	 * 
	 * 		Getter Method
	 * 
	 */
	
	String getCurrOutputFolder() {
		return this.currOutputFolder;
	}
	
	/*
	 * 
	 *		Is Method
	 * 
	 */
	
	boolean isOutputSubFolderValid() {
		File[] arrFile = f_output.listFiles();
		String recentFile = arrFile[arrFile.length-1].getName();
		String MM_DD = recentFile.substring(recentFile.indexOf("_")+1);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		
//		System.out.println(new SimpleDateFormat("MM-dd").format(cal.getTime()));
//		System.out.println(MM_DD);
//		System.out.println(new SimpleDateFormat("MM-dd").format(cal.getTime()).equalsIgnoreCase("MM_DD"));
		return 
				(new SimpleDateFormat("MM-dd").format(cal.getTime()).equalsIgnoreCase(MM_DD)) ? 	//Conditional Statement that Compares the current date and the file-name date of recent Output Subfolder
				false : true;		// TRUE - If both date Strings are equal means that
	}
}
