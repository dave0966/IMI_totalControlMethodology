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

	void createCSV(String FileName) {
		try {
			InputStream is = new FileInputStream(mainClass.ofm.getCurrOutputFolder()+"\\"+FileName);
			Workbook wb = WorkbookFactory.create(is);	
		    Sheet sheet = wb.getSheetAt(0);
		    Row row = sheet.getRow(2);
		    Cell cell = row.getCell(3);
		    if (cell == null)
		        cell = row.createCell(3);
		    cell.setCellValue("a test");
		    
			OutputStream fos = new FileOutputStream(mainClass.ofm.getCurrOutputFolder()+"\\"+FileName);
			wb.write(fos);
//			System.out.println(new File("..\\Workbook_test\\1.csv").exists());
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * TO's Methods
	 * 
	 */

	void ToExcel() {

	}

	void ToCSV() {

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
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File is not compatible with the software. Try another file.",
					"Invalid File", JOptionPane.WARNING_MESSAGE, null);
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
		try {
			InputStream fcv_inp = new FileInputStream(dir);
			Workbook fcv_wb = WorkbookFactory.create(fcv_inp);
			Sheet fcv_sheet = fcv_wb.getSheet("Sheet1");
			Row fcv_row = fcv_sheet.getRow(1);

			char[] chr1 = (fcv_row.getCell(5).getStringCellValue() + fcv_row.getCell(10).getStringCellValue())
					.toCharArray();
			char[] chr2;

			switch (0) {
			case 0:
				chr2 = "  Valeo IKS    Aview Focus and active alignment  ".toCharArray();
				for (int x = 0; x < chr1.length; x++)
					if (!(chr1[x] == chr2[x]))
						return 0;
			case 1:
				chr2 = "      Valeo STLA               SASY3 EOL (Focus Verification)   ".toCharArray();
				for (int x = 0; x < chr1.length; x++)
					if (!(chr1[x] == chr2[x]))
						return 1;
				
			case 2:
				chr2 = "  Valeo STLA    Aview Focus and active alignment  ".toCharArray();
				for (int x = 0; x < chr1.length; x++)
					if (!(chr1[x] == chr2[x]))
						return 2;
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File is not compatible with the software. Try another file.",
					"Invalid File", JOptionPane.WARNING_MESSAGE, null);
			e.printStackTrace();
		}
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
