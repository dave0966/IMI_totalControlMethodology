package imi_totalcontrolmethodology;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.ArrayBlockingQueue;
import java.nio.file.Path;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


class SheetCell{
	private int Row, Column;
	private String Inputdata;
	
	SheetCell(int row, int column, String input){
		this.Row = row;
		this.Column = column;
		this.Inputdata = input;
	}
	
	int getRow() {
		return this.Row;
	}
	
	int getColumn() {
		return this.Column;
	}
	
	String getInputdata() {
		return this.Inputdata;
	}
	
}

public class DataToSheetManager {
	private Workbook wb;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	
	private ArrayBlockingQueue<SheetCell> buffer = new ArrayBlockingQueue<SheetCell>(100);
	private Path workingFileDir = Paths.get("D:\\Coding\\git\\OJT\\IMI_\\IMI_totalControlMethodology\\$Output\\temp.xlsx");
	
	private int limit_iter = 3;
	
	DataToSheetManager(){
		try {
			initWb();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void initWb() throws IOException {
		try
		{
			bis = new BufferedInputStream( new FileInputStream(workingFileDir.toString()) );
			wb = new XSSFWorkbook(bis);
			sheet =  wb.getSheetAt(0);
		}
		
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/*	
	 * 	Type of Data to be expect and then convert it to:
	 * 	• PASS 	 -> ✓
	 * 	• FAIL   -> X(#,#)
	 * 	• String -> Lorem Ipsum
	 *  • Null	 -> -
	 */ 
	
	void addToBuffer(int row, int column, String input) {
		if(input.length() == 0)
			input = "-";
			
		else if(input.equalsIgnoreCase("PASS"))
			input = "✓";
			
		else if(input.contains("FAIL"))
			input.replace("FAIL", "X");
		
		buffer.add(new SheetCell(row, column, input));
	}
	
	void commit() {
		try 
		{
			bos = new BufferedOutputStream(new FileOutputStream(workingFileDir.toString()));

			while(buffer.size() != 0) {
				SheetCell temp_sc = buffer.take();
				System.out.printf("Insert: %s \t%s \t%s\n" , temp_sc.getRow(), temp_sc.getColumn(), temp_sc.getInputdata());
				insertToCell(temp_sc.getRow(), temp_sc.getColumn(), temp_sc.getInputdata());
			}
			
			bos.flush();
			wb.close();
		} 
		
		catch (InterruptedException | IOException e)
		{
			JOptionPane.showMessageDialog(null, "The Application cannot access the file "
											  + "\nbecause it is being used. Close the application "
											  + "\nusing it then CLICK OK.");
			if(limit_iter > 0) {
				limit_iter--;
				commit();
			}
			else if(limit_iter == 0)
				JOptionPane.showMessageDialog(null, "The process has been abort due to an "
												  + "\napplication/s using the file. Try Again!");
			else
				limit_iter = 3;
			
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 	Be wary when using insertToCell
	 * 	REMEMBER to know the parameter (MAX ROW, MAX COLUMN) of the cell created in template
	 * 	
	 * 	NULLPOINTEREXCEPTION:
	 * 		For Example:
	 * 		When insertToCell() method invoke with parameter of more than the 
	 *  	ROW/COLUMN according to the border of the template it calls NullPointerException
	 *  
	 * 		NullPointerException most likely results to getting a cell outside the template border
	 * 		By default, it is null but within the border it is not null. For the reason of, it
	 *  	was manually configured by the developer and hence, contains non-null.
	 *  
	 *  IOEXCEPTION - TRUNCATED ZIP FILE:
	 *  	The File your calling is corrupted. 
	 *  
	 *  	Solution:
	 *  		Manually remove the file.
	 *  
	 */
	
	void insertToCell(int input_row, int input_column, String input_data) {
		try {
			row = sheet.getRow(input_row);
			if(row == null)
				throw new IOException();
			
			cell = row.getCell(input_column);
			
			if(!(cell == null))
				cell.setCellValue(input_data);
			else {
				System.out.println("insertToCell Abort!");
				return;
			}
			bos = new BufferedOutputStream( new FileOutputStream(workingFileDir.toString()));
			sheet.autoSizeColumn(input_column);
			wb.write(bos);
		} 
		catch (NullPointerException | IOException e) 
		{	
			JOptionPane.showMessageDialog(null, "Failed To Insert Prompt to Specified Cell.");
			e.printStackTrace();
		}
	}
	
	void flush() throws IOException {
		System.out.println("\tRow \tColumn \tData");
		for(SheetCell sc : buffer)
			System.out.printf("Delete: %s \t%s \t%s\n" , sc.getRow(), sc.getColumn(), sc.getInputdata());
		this.buffer.clear();
	}
}
