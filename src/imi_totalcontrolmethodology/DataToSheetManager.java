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
import java.util.Set;

import javax.swing.JOptionPane;

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
	private Workbook wb;
	private FileInputStream fis;
	private FileOutputStream fos;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	
	private String workingFileDir = "";
	private Set<Integer> key;
	private boolean isErrorFree = true;
	private int[] arrColumn = {14,15,17,18,19,20,21,22,23,24,25};		// Arrays of integers that represents the column O to Z in excel
	private int selectedColumn = 14;									// By default, 14th Column (or Column O) was set.
	private HashMap<Integer, String> buffer = new HashMap<Integer, String>();
	
	
	void setWorkingFileDir(String str) {
		System.out.println("(DataToSheetManager) workingFileDir changes value!");
		this.workingFileDir = str;
	}
	
	String getWorkingFileDir() {
		return this.workingFileDir;
	}
	
	void insertToCell(int input_row, int input_column, String input_data, boolean isFillUpForm1){
		try {
			fis = new FileInputStream(new File(getWorkingFileDir()));
			wb = WorkbookFactory.create(fis);
			sheet =  wb.getSheetAt(0);
			row = sheet.getRow(input_row);
			cell = row.getCell(input_column);
//			System.out.println("FillUpForm: " + isFillUpForm1);
			cell.setCellValue(
								(input_data.length() == 0 || input_data.equalsIgnoreCase("N/A")) ? 
									"-" 
									: (isFillUpForm1) ? 
											(input_data.equalsIgnoreCase("PASS")) ? "✓":"☓"
											:input_data
							 );
			OutputStream fileOut = new FileOutputStream(getWorkingFileDir());
			sheet.autoSizeColumn(getSelectedColumn_Actual());
			wb.write(fileOut);
		} catch (IOException | EncryptedDocumentException e) {
			setErrorFree(false);
			e.printStackTrace();
		}
	}
	
	String getCellValue(int input_row, int input_column) {
		try {
			System.out.println(getWorkingFileDir());
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
	
	void insertToBuffer(Integer i, String s) {
		buffer.put(i, s);
	}
	
	String getFromBuffer(Integer i) {
		return buffer.get(i);
	}
	
	void commit(int fileType){
		mainClass.fm.createCopyXLSX(fileType);
		key = buffer.keySet();
		
		for(Integer k : key) {
				System.out.println("commit: "+ buffer.get(k));
				insertToCell(k, getSelectedColumn_Actual(), buffer.get(k), ((k < 26 && k > 6) ? true: false));
//			System.out.println(k + " " + getSelectedColumn_Actual() + " " + buffer.get(k));
		}
	}
	
	void flash() {
		System.out.println("Flashed!");
		buffer.clear();
	}
	
	void setSelectedColumn_Actual(int i) {
		System.out.println("Selected Column/Actual: " + arrColumn[i]);
		this.selectedColumn = arrColumn[i];
	}
	
	int getSelectedColumn_Actual() {
		return this.selectedColumn;
	}
	
	int selectedColumnToIndex() {
		for(int index = 0; index < arrColumn.length; index++)
			if(arrColumn[index] == getSelectedColumn_Actual())
				return index;
		
		return -1;
	}
	
	boolean isErrorFree() {
		if(!this.isErrorFree) {
			JOptionPane.showMessageDialog(null, "The File is not existing or being used by another process (or application). "
					  + "\nTry close or terminate the application.");
			setErrorFree(true);
			return false;
		}
		
		return true;
	}
	
	void setErrorFree(boolean bool) {
		this.isErrorFree = bool;
	}
	
	
}
