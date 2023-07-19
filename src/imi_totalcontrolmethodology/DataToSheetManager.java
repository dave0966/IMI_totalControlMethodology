package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * 
 *IKS and STLA - Aview					STLA - SASSY3
 *Column    14   ... 25					 14   15   ... 25
 *Row 	->	(3), ... (3)				 (3), (3), ...
 * 		->	(4), ... (4)				 (4), (4), ...	 	
 * 		->	(5), ... (5)				 (5), (5), ...
 * 	
 *		->	(7), ... (7) 				 (7),  (NONE), ...
 *	 	->	(8), ... (8)				 (8),  (NONE), ...
 *	 	->	(9), ... (9)				 (9),  (NONE), ...
 * 		->	(10), ...(10)				 (10), (NONE), ...
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

public class DataToSheetManager {
	private String workingFileDir = "";
	private Workbook wb;
	private FileInputStream fis;
	private FileOutputStream fos;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	
	void setWorkingFileDir(String str) {
//		System.out.println("(DataToSheetManager) workingFileDir changes value!");
		this.workingFileDir = str;
	}
	
	String getWorkingFileDir() {
		return this.workingFileDir;
	}
	
	void insertToCell(int input_row, int input_column, String input_data) {
		try {
			fis = new FileInputStream(new File(getWorkingFileDir()));
			wb = WorkbookFactory.create(fis);
			sheet =  wb.getSheetAt(0);
			row = sheet.getRow(input_row);
			cell = row.getCell(input_column);
			cell.setCellValue(input_data);
			
			OutputStream fileOut = new FileOutputStream(getWorkingFileDir());
			wb.write(fileOut);
		} catch (IOException | EncryptedDocumentException e) {
			e.printStackTrace();
		}
	}
	
	String getCellValue(int input_row, int input_column) {
		try {
			fis = new FileInputStream(new File(getWorkingFileDir()));
			wb = WorkbookFactory.create(fis);
		} catch (IOException | EncryptedDocumentException e) {
			e.printStackTrace();
		}
		sheet =  wb.getSheetAt(0);
		row = sheet.getRow(input_row);
		cell = row.getCell(input_column);
		
		return cell.toString();
	}
	
	
}
