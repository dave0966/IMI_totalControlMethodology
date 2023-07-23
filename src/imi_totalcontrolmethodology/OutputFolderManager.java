package imi_totalcontrolmethodology;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class OutputFolderManager {
	private File f_output;
	private String currOutputFolder = null;

	OutputFolderManager(){
		System.out.println("OutputFolderManager invoked!");
		createDir_Output();
//		setDefaultCurrOutputDir();
//		createOutput_subFolder();
	}
	
	/*
	 * 	
	 * 		Create MethodsS
	 * 
	 */
	
	private void createDir_Output() {
		f_output = new File("$Output");
		if(!f_output.exists()) 
		{
			f_output.mkdirs();
			System.out.println("Successfully Created Directory!");
		}
		else 
			System.out.println("Output Folder Directory are Already Exist!");
	}
	
	/*	
	 * 	isFileExists > YES > SysOut(Exist)
	 * 				 > NO  > isValid > YES > SysOut(Exist)
	 * 								 > NO  > Make File > SysOut(Create)
	 */
		
//	private void createOutput_subFolder() {
//		if(new File(getCurrOutputFolder()).exists()) 
//			System.out.println("Output Subfolder (Recent) already exists!");
//		else if(isOutputSubFolderValid())
//			System.err.println("Output Subfolder (Recent) already exists!");
//		else
//		{
//			new File(getCurrOutputFolder()).mkdirs();
//			System.out.println("New Instance of Subfolder been created!");
//		}
//			
//	}
//
//	/*
//	 * 
//	 * 		Setter Method
//	 * 
//	 */
//	
//	private void setDefaultCurrOutputDir() {
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, 11);
//		this.currOutputFolder = "$Output\\" + "2023-07-21" + new SimpleDateFormat("_MM-dd").format(cal.getTime());
//	}
//	
//	/*
//	 * 
//	 * 		Getter Method
//	 * 
//	 */
//	
//	String getCurrOutputFolder() {
//		return this.currOutputFolder +"\\"; 
//	}
//	
//	/*
//	 * 
//	 *		Is Method
//	 * 
//	 */
//	
////	boolean isOutputSubFolderValid() {
////		File[] arrFile = f_output.listFiles();
////		
////		for(File fff: arrFile)
////			System.out.println("isOSFV: " + fff.getAbsolutePath());
////		
////		String recentFile = arrFile[arrFile.length-1].getName();
////		System.out.println("isOSFV_0: " + recentFile);
////		
////		String MM_DD = recentFile.substring(recentFile.indexOf("_")+1);
////			
////		Calendar cal = Calendar.getInstance();
////		cal.add(Calendar.DATE, -1);
////		
////		System.out.println("isOSFV_1: " + new SimpleDateFormat("MM-dd").format(cal.getTime()));
////		System.out.println("isOSFV_2: " + MM_DD);
////		System.out.println("isOSFV_3: " + new SimpleDateFormat("MM-dd").format(cal.getTime()).equalsIgnoreCase("MM_DD"));
////		return 
////				(new SimpleDateFormat("MM-dd").format(cal.getTime()).equalsIgnoreCase(MM_DD)) ? 	//Conditional Statement that Compares the current date and the file-name date of recent Output Subfolder
////				false : true;		// TRUE - If both date Strings are equal means that
////	}
//	
//	/*
//	 * 	Get the recent folder (according to the date format set to it)
//	 * 	Get the substring of YYYY-MM-DD
//	 * 	Create an array of Date starting from the substring up to 10 days after the fact
//	 *	Compare the array of Date to the Current Date
//	 * 	If the for-loop finish to execute return false
//	 *  But if the for-loop get one result of true return immediately.
//	 */
//	
//	boolean isOutputSubFolderValid() {
//		File[] arrSubFolder= f_output.listFiles();
//		String recentSubFolder;
//		try 
//		{
//			for(File elem_arrSF : arrSubFolder)
//				
//				recentSubFolder = arrSubFolder[arrSubFolder.length-1].getName();
//			System.out.println("isOSFV_0: " + recentSubFolder);
//			String ctt_MMDD = recentSubFolder.substring(recentSubFolder.lastIndexOf('\\')+1, recentSubFolder.indexOf('_'));
//			
////			System.out.println("isOSFV_1: " + ctt_MMDD);
//			
//			Calendar temp_calendar = Calendar.getInstance();
//			System.out.println("isOSFV_2: " + new SimpleDateFormat("yyyy-MM-dd").format(temp_calendar.getTime()));
//			
//			for(int days = 0; days < 11; days++)
//			{
//				temp_calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(ctt_MMDD));
//				temp_calendar.add(Calendar.DATE, days);
////				System.out.print("isOSFV_3 ("+days+"): " + new SimpleDateFormat("yyyy-MM-dd").format(temp_calendar.getTime()));
////				System.out.print(" - " + java.time.LocalDate.now().toString() );
////				System.out.println(" = " + (new SimpleDateFormat("yyyy-MM-dd").format(temp_calendar.getTime()).equals(java.time.LocalDate.now().toString())));
//				if((new SimpleDateFormat("yyyy-MM-dd").format(temp_calendar.getTime()).equals(java.time.LocalDate.now().toString())))
//						return true;
//			}
//			
////			System.out.println("isOSFV_2_1: " + new SimpleDateFormat("yyyy-MM-dd").format(temp_calendar.getTime()));
////			for(String t : temp)
////				System.out.println("isOSFV_4: " + t);
//		} 
//		
//		catch (ParseException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) 
//		{
//			e.printStackTrace();
//			new File(getCurrOutputFolder()).mkdirs();
//			return false;
//		}
//		
//		return false;
//	}
}
