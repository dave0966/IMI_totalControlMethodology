package imi_totalcontrolmethodology;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputFolderManager {
	File f_output;
	
	OutputFolderManager(){
		createDir_Output();
	}
	
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
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 11);
		File subfolder = new File("D:\\Coding\\git\\OJT\\IMI_\\IMI_totalControlMethodology\\$Output\\" + java.time.LocalDate.now().toString() + new SimpleDateFormat("_MM-dd").format(cal.getTime()));

		if(!subfolder.exists()) 
//		{
			subfolder.mkdirs();
//			System.out.println("Successfully Created Directory!");
//		}else 
//			System.out.println(java.time.LocalDate.now().toString() + " folder already exist!");
	}
}
