package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileManager{
	/*
	 * 
	 * Create Methods
	 * 
	 */

	void createCopyXLSX(int filetype) {
		System.out.println("(createCopyXLSX): " + filetype);
		try 
		{
			String temp = "";
			if(!isFileExist(filetype)) {
				
				switch(filetype) {
					case 0:
						temp = "$Resource\\Valeo_IKS_Aview_Focus_Active_Alignment_Template.xlsx";
						break;
					case 1:
						temp = "$Resource\\Valeo_STLA_Aview_Focus_Active_Alignment_Template.xlsx";
						break;
					case 2:
						temp = "$Resource\\Valeo_STLA _SASSY3_EOL_Template.xlsx";
						break;
				}
			}
				Files.copy(new File(temp).toPath(), new File(getCopiedFileName(filetype)).toPath());
				mainClass.dtsm.setWorkingFileDir(getCopiedFileName(filetype));
//				mainClass.dtsm.init_WB();
		} 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	/*
	 * 
	 * IS's Methods
	 * 
	 */

	boolean isFileCredentialValid(String dir) {
		try {
			if (!dir.endsWith(".xlsx"))
				throw new IOException();

			InputStream fcv_inp = new FileInputStream(dir);
			Workbook fcv_wb = WorkbookFactory.create(fcv_inp);
			Sheet fcv_sheet = fcv_wb.getSheet("Sheet1");
			Row fcv_row = fcv_sheet.getRow(68);

			char[] chr1 = fcv_row.getCell(1).getStringCellValue().toCharArray();
			char[] chr2 = "Form No. MFGE-MFGE-005-004".toCharArray();

			for (int x = 0; x < chr1.length; x++)
				if (!(chr1[x] == chr2[x]))
					return false;
		} catch (IOException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "File is not compatible with the software. Try another file.", "Invalid File", JOptionPane.WARNING_MESSAGE, null);
			e.printStackTrace();
			return false;
		}

		return true;
	}

	boolean isNumeric(String str) {
		for (char chr : str.toCharArray())
			if (!Character.isDigit(chr)) {
				System.out.println(str + " is not Numeric");
				return false;
			}
		return true;
	}

	boolean isFileExist(int i) {
		mainClass.dtsm.setWorkingFileDir(getCopiedFileName(i));
		
		for(String f_str: new File("$Output").list()) {
//			System.out.println(mainClass.dtsm.getWorkingFileDir() + " " + f_str);
			String temp = mainClass.dtsm.getWorkingFileDir();
//			System.out.println("(isFileExist()): " + f_str.equalsIgnoreCase(temp.substring(temp.lastIndexOf('\\')+1)));
			System.out.println(temp.substring(temp.lastIndexOf('\\')+1,temp.lastIndexOf('.')));
			if(f_str.equalsIgnoreCase(temp.substring(temp.lastIndexOf('\\')+1,temp.lastIndexOf('.'))))
				return true;
		}
		return false;
	}
	
	/*
	 * 
	 * GET's Methods
	 * 
	 */
	
	//Method for Existing Templates
	int getTemplateType(String dir) {
		mainClass.dtsm.setWorkingFileDir(dir);
		System.out.println("(getTemplateType): " + mainClass.dtsm.getWorkingFileDir());
		String str1 = mainClass.dtsm.getCellValue(1, 5) + mainClass.dtsm.getCellValue(1, 10);
//		System.out.println(str1);
		
		if("  Valeo IKS  Aview Focus and active alignment  ".equals(str1))
			return 0;
		
		if("  Valeo STLA    Aview Focus and active alignment  ".equals(str1))
			return 1;
		
		if("      Valeo STLA               SASY3 EOL (Focus Verification)   ".equals(str1))
			return 2;
		
		
		return -1;
	}

	List<String> getEmployeeNumList() {
		return mainClass.lfm.getListOfEmployeeNum();
	}
	
	private String getCopiedFileName(int i) {
		String temp = "";
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 10);
		
		
		switch(i) {
			case 0:
				temp =  "$Output\\Valeo_IKS_AFAA_";
				break;
			case 2:
				temp =  "$Output\\Valeo_STLA_SASSY3_EOL_";
				break;
			case 1:	
				temp =  "$Output\\Valeo_STLA_AFAA_";
				break;
		}
		
		return temp + java.time.LocalDate.now().toString() + new SimpleDateFormat("_MM-dd").format(cal.getTime()) + ".xlsx";
	}

	/*
	 * 
	 * ADD's Methods
	 * 
	 */

	void addEmployeeNum(String input) {
		mainClass.lfm.addEmployeeNum(input);
	}
}
