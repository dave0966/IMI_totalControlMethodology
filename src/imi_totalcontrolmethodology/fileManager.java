package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class fileManager {
	
	/*IKS and STLA - Aview					STLA - SASSY3
	 *Column    14   ... 25					 14   15   ... 25
	 *Row 	->	(3), ... (3)				 (3), (3), ...
	 * 		->	(4), ... (4)				 (4), (4), ...	 	
	 * 		->	(5), ... (5)				 (5), (5), ...
	 * 	
	 *		->	(7), ... (7) 				 (7),  (NONE), ...
	 *	 	->	(8), ... (8)				 (8),  (NONE), ...
	 *	 	->	(9), ... (9)				 (9),  (NONE), ...
	 * 		->	(10), ... (10)				 (10), (NONE), ...
	 * 		->	(11), ...(11) 				 (11), (NONE), ...
	 * 		->	(12), ...(12)				 (12), (NONE), ...
	 * 		->	(13), ...(13)				 (13), (NONE), ...
	 *		->	(14), ...(14)				 (14), (NONE), ...
	 *		->	(15), ...(15)				 (15), (NONE), ...
	 *	 	->	(16), ...(16)				 (16), (NONE), ...
	 *	 	->	(17), ...(17)				 (17), (16),   ...
	 *		->	(18), ...(18)  				 ...,  ...,    ...
	 *		-> 	(19), ...(19) 
	 * 		->	(20), ...(20)
	 * 		->	(21), ...(21)
	 *		->	(22), ...(22) 
	 *		->	(23), ...(23) 
	 */
	
	private final String excel_dir = "$Output";
	private File f_dir, f_enfl, f_logRepo, f_output;
	private List<HashMap<Integer, Integer>> arrCellMap;
	private Workbook wb = new SXSSFWorkbook();
	
	fileManager(){
//		System.out.println("File Manager Loading...");
		createDir_LogRepo();
		createTxt_EmployeeNumberLog();
		createDir_Output();
		createDir_Resource();
		createOutput_subFolder();
	}
	
	private void createDir_LogRepo() {
		f_logRepo = new File("$Log");
		if(!f_logRepo.exists()) {
			f_logRepo.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Folder Directory for Employee Log Already Exist!");
	}
	
	private void createTxt_EmployeeNumberLog() {
		f_enfl = new File("$Log\\Employee_Number_(DO NOT DELETE).txt");
		if(f_enfl.exists())
			System.out.println("Employee Number Log exists!");
		else 
		{
			JOptionPane.showMessageDialog(null, "Successfully Created Employee Number Log!", "File Creation Alert Warning", JOptionPane.WARNING_MESSAGE);
			try 					{ f_enfl.createNewFile(); } 
			catch (IOException e) 	{ e.printStackTrace(); }
		}
		
	}
	
	private void createDir_Output() {
		f_output = new File("$Output");
		if(!f_output.exists()) {
			f_output.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Output Folder Directory are Already Exist!");
	}
	
	private void createOutput_subFolder() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 11);
		
		File subfolder = new File("D:\\Coding\\git\\OJT\\IMI_\\IMI_totalControlMethodology\\$Output\\" + java.time.LocalDate.now().toString() + new SimpleDateFormat("_MM-dd").format(cal.getTime()));
		if(!subfolder.exists()) {
			subfolder.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println(java.time.LocalDate.now().toString() + " folder already exist!");
		
	}
	
	private void checkResource() {
		if(!(new File("LOGO.jpg").exists()))
			JOptionPane.showMessageDialog(null, "LOGO.jpg could not be find or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
		else if(!(new File("image-300x150.jpg").exists()))
			JOptionPane.showMessageDialog(null, "image-300x150.jpg could not be find or search!", "Missing File", JOptionPane.ERROR_MESSAGE, null);
	}
	
	private void createDir_Resource() {
		new File("$Resource");
		if(!f_output.exists()) {
			f_output.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Resource Folder Directory are Already Exist!");
	}
	
	void init_CellMap(boolean templateType) {
		//The value templateType indicates the way initializing the arrCellMap HashMap
		
		for(int column = 0; column < 20; column++)
		{
			int col_cond1 = 14+column;
			int col_cond2 = (templateType && (column % 2 != 0)) ? 0 : col_cond1;
			for(int row = 0; row < 11; row++)
			{
//				System.out.println("CellMap:" + col_cond2);
				HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
				temp.put(3, col_cond1);
				temp.put(4, col_cond1);
				temp.put(5, col_cond1);
				
				temp.put(7, col_cond1);
				temp.put(8, col_cond1);
				temp.put(9, col_cond1);
				temp.put(10, col_cond1);
				temp.put(11, col_cond1);
				temp.put(12, col_cond1);
				temp.put(13, col_cond1);
				temp.put(14, col_cond1);
				temp.put(15, col_cond1);
				temp.put(16, col_cond1);
				
				temp.put(17, col_cond1);
				temp.put(18, col_cond1);
				temp.put(19, col_cond1);
				
				temp.put(20, col_cond1);
				temp.put(21, col_cond1);
				temp.put(22, col_cond1);
				temp.put(23, col_cond1);
				
				arrCellMap.add(temp);
			}
		}
	}
	
	
	//Add a method in which prevent redundant data
	void addEmployeeNum(String str) {
		try 
		{
			FileWriter fw = new FileWriter(f_enfl, true);
			if(f_enfl.length() != 0)
				fw.write("\n"+str);
			else
				fw.write(str);
			
			fw.close();
		}
		
		catch(IOException e) { e.printStackTrace(); }
	}
	
	boolean isNumeric(String str) {
		for(char chr: str.toCharArray())
			if(!Character.isDigit(chr)) {
				System.out.println(str + " is not Numeric" );
				return false;
			}
		return true;
	}
	
	void createCSV() {
		try {
			new File("..\\Workbook_test").mkdirs();
			OutputStream fos = new FileOutputStream("..\\Workbook_test\\1.csv");
			System.out.println(new File("..\\Workbook_test\\1.xlsx").exists());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	void ToExcel(){
		
	}
	
	void ToCSV(){
		
	}
	
	List<String> getListOfEmployeeNum() {
		List<String> temp = new ArrayList<String>();
		try 
		{
			Scanner reader = new Scanner(f_enfl);
			while (reader.hasNextLine()) 
				temp.add(reader.nextLine());
			reader.close();
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); }
		
//		for(String str: temp)
//			System.out.println("From dataManager:"+str);
//		System.out.println("Employee Status: " + !temp.isEmpty());
		return temp;
	}

	
	boolean isFileCredentialValid(String dir) {
		try
		{
			InputStream fcv_inp = new FileInputStream(dir);
			Workbook fcv_wb = WorkbookFactory.create(fcv_inp);
			Sheet fcv_sheet = fcv_wb.getSheet("Sheet1");
			Row fcv_row = fcv_sheet.getRow(68);
			
			char[] chr1 = fcv_row.getCell(1).getStringCellValue().toCharArray();
			char[] chr2 = "Form No. MFGE-MFGE-005-004".toCharArray();
			
			for(int x = 0;x < chr1.length;x++)
				if(!(chr1[x] == chr2[x]))
					return false;
		}
		catch(IOException  e)
		{
			JOptionPane.showMessageDialog(null, "File is not compatible with the software. Try another file.", "Invalid File", JOptionPane.WARNING_MESSAGE, null);
			e.printStackTrace();
		}
		
		return true;
	}
	
	int getTemplateType(String dir) {
		try
		{
			InputStream fcv_inp = new FileInputStream(dir);
			Workbook fcv_wb = WorkbookFactory.create(fcv_inp);
			Sheet fcv_sheet = fcv_wb.getSheet("Sheet1");
			Row fcv_row = fcv_sheet.getRow(1);
			
			char[] chr1 = (fcv_row.getCell(5).getStringCellValue() + fcv_row.getCell(10).getStringCellValue()).toCharArray();
			char[] chr2;
			
			switch(0) {
				case 0:
					chr2 = "  Valeo IKS    Aview Focus and active alignment  ".toCharArray();
					for(int x = 0;x < chr1.length;x++)
						if(!(chr1[x] == chr2[x]))
							return 0;
				case 1:
					chr2 = "      Valeo STLA               SASY3 EOL (Focus Verification)   ".toCharArray();
					for(int x = 0;x < chr1.length;x++)
						if(!(chr1[x] == chr2[x]))
							return 1;
				case 2:
					chr2 = "  Valeo STLA    Aview Focus and active alignment  ".toCharArray();
					for(int x = 0;x < chr1.length;x++)
						if(!(chr1[x] == chr2[x]))
							return 2;
			}
		}
		catch(IOException  e)
		{
			JOptionPane.showMessageDialog(null, "File is not compatible with the software. Try another file.", "Invalid File", JOptionPane.WARNING_MESSAGE, null);
			e.printStackTrace();
		}
		return -1;
	}
	
}
