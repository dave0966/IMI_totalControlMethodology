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

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileManager{
	private Workbook wb = new SXSSFWorkbook();
	private String workingDir = "";

	
	/*
	 * 
	 * Create Methods
	 * 
	 */
	
	void createXLSX() {
		
		
	}

	/*
	 * 
	 * TO's Methods
	 * 
	 */

	void ToExcel() {

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
//			e.printStackTrace();
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

	/*
	 * 
	 * GET's Methods
	 * 
	 */

	int getTemplateType(String dir) {
		mainClass.dtsm.setWorkingFileDir(dir);
		String str1 = mainClass.dtsm.getCellValue(1, 5) + mainClass.dtsm.getCellValue(1, 10);
		String str2;
		System.out.println(str1);
		
		str2 = "  Valeo IKS  Aview Focus and active alignment  ";
		if(str2.equals(str1))
			return 0;
		
		str2 = "      Valeo STLA               SASY3 EOL (Focus Verification)   ";
		if(str2.equals(str1))
			return 1;
		
		str2 = "  Valeo STLA    Aview Focus and active alignment  ";
		if(str2.equals(str1))
			return 2;
		
		return -1;
	}

	List<String> getEmployeeNumList() {
		return mainClass.lfm.getListOfEmployeeNum();
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
