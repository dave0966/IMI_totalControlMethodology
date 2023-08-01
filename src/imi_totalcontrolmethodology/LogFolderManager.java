package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.HashMap;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class LogFolderManager {
	private List<String> lines;
	private List<String> lst_EmployeeNum;
	private HashMap<String,String> hsh_template = new HashMap<String, String>();
	
	private final String[] arrTulAttr = {"IKS=", "AFAA=", "SASSY="};
	private final String[] arrRcflAttr = {"SubFolder=", "Valeo_IKS=", "Valeo_AFAA=", "Valeo_SASSY=", "Temp="};
	private boolean isInit = false;
	
	private Path eml = Paths.get("$Log\\EmployeeNumberLog.csv");
	private Path ltl = Paths.get("$Log\\ListOfTemplateLog.config");
	private Path rcfl = Paths.get("$Log\\RecentCreatedFileLog.config");
	private Path al = Paths.get("$Log\\ApplicationLog.config");
	
	LogFolderManager(){
		try {
			createDir_LogRepo();
			createCSV_EmployeeNumberLog();
			createConfig_ListOfTemplateLog();
			createConfig_RecentCreatedFileLog();
			createConfig_ApplicationLog();
			
			this.isInit = true;
		}catch(FileAlreadyExistsException feaa) {
			System.out.println("\n\nlfm: FileALreadyExistsExcpetion\n\n");
			feaa.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("\n\nlfm: IOException\n\n");
			e.printStackTrace();
		}
		
	}
	
	
	/*
	 * 
	 * 		CREATE METHOD
	 * 
	 */
	
	private void createDir_LogRepo() {
		File temp = new File("$Log");
		if(!temp.exists()) 
		{
			temp.mkdirs();
			System.out.println("lfm: $Log created!");
		}
		else
			System.out.println("lfm: $Log exists!");
	}
	
	
	private void createCSV_EmployeeNumberLog() throws IOException, FileAlreadyExistsException {
		if(!Files.exists(eml)) 
		{
			Files.createFile(eml);
			System.out.println("lfm: EmployeeNumberLog.csv created!");
		}
		else
			System.out.println("lfm: 'EmployeeNumberLog.csv' exists!");
	}
	
	
	private void createConfig_ListOfTemplateLog() throws IOException, FileAlreadyExistsException{
		if(!Files.exists(ltl)) 
		{
			Files.createFile(ltl);
			System.out.println("lfm: ListOfTemplate.config created!");
		}
		else
			System.out.println("lfm: 'ListOfTemplate.config' exists!");
	}

	
	private void createConfig_RecentCreatedFileLog() throws IOException, FileAlreadyExistsException{
		if(!Files.exists(rcfl)) 
		{
			Files.createFile(rcfl);
			Files.write(rcfl, (arrRcflAttr[0] + System.lineSeparator()
							 + arrRcflAttr[1] + System.lineSeparator()
							 + arrRcflAttr[2] + System.lineSeparator()
							 + arrRcflAttr[3]
							  ).getBytes(),
					    StandardOpenOption.CREATE
			);
			System.out.println("lfm: RecentCreateFileLog.config created!");
		}
		else
			System.out.println("lfm: 'RecentCreatedFileLog.config' exists!");
	}
	
	private void createConfig_ApplicationLog() throws IOException {
		if(!Files.exists(al))
		{
			Files.createFile(al);
			System.out.println("");
		}
		
	}
	
	


	/*
	 * 
	 * 		ADD METHODS
	 * 
	 */
	
	//	Append EmployeeNum to CSV
	void addEmployeeNumLog(String input) {
		if(!isEmployeeNumExist(input))
			try (CSVWriter writer = new CSVWriter(new FileWriter(eml.toString(), true))) 
			{
	            writer.writeNext(new String[] {input});
	            System.out.println("Updated Employee Number Log!");
	        } 
			catch (IOException e) { e.printStackTrace(); }
	}
	

	void addCategoryTemplateLog(String Dir) {
		try 
		{
			if(!Dir.contains("=")) {
				lines = Files.readAllLines(ltl);
				lines.add(Dir + "=");
				Files.write(ltl, lines);
				System.out.println("Added NEW Category Template Log!");
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid File Template Directory! or Do not Include \"=\" character.", "addCategoryTemplateLog", JOptionPane.WARNING_MESSAGE);
        } 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	
	void addRecentFileLog(String Dir) {
		try 
		{
			if(!Dir.contains("=")) {
				lines = Files.readAllLines(rcfl);
				lines.add(Dir + "=");
				Files.write(rcfl, lines);
				System.out.println("Added NEW Category Recent File Log!");
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid File Template Directory! or Do not Include \"=\" character.", "addCategoryTemplateLog", JOptionPane.WARNING_MESSAGE);
        } 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	
	/*
	 * 
	 * 		UPDATE METHODS
	 * 
	 */
	
	void updateCategoryTemplateLog(int category, String Dir) {
		try {
			if((Dir.endsWith(".xlsx") || Dir.endsWith(".csv")) && Dir.substring(0, Dir.indexOf(".")).length() > 0) 
			{
				lines = Files.readAllLines(ltl);
				String temp = lines.get(category);
				lines.set(category, temp.substring(0,temp.indexOf('=')+1).concat(Dir));
				System.out.println("Updated Template Log!");
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid File Template Directory!", "updateCategoryTemplateLog", JOptionPane.WARNING_MESSAGE);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 	Guide in accessing RecentFileLog => LineNumber 0-4...:
	 * 	0 - Accessing Subfolder 		(Permanent)
	 * 	1 - Accessing Temporary Holder	(Permanent) NOTE: CLEAR when the user not using the specified DIR
	 * 	2 - Accessing Valeo_IKS
	 * 	3 - Accessing Valeo_STLA
	 * 	4 - Accessing Valeo_SASSY3
	 *  ...
	 *  n - ########
	 */
	void updateRecentfileLog(String Dir, int lineNumber){
        try 
        {
            lines = Files.readAllLines(rcfl);
            String temp = lines.get(lineNumber);
            lines.set(lineNumber, temp.substring(0,temp.indexOf('=')+1).concat(Dir));
            Files.write(rcfl, lines);
            System.out.println("lfm: Updated RecentFileLog!");
        }
        
        catch (StringIndexOutOfBoundsException siobe) { siobe_repair(); }
        catch (IOException e) { e.printStackTrace(); }
	}
	

	/*
	 * 
	 * 		OTHER METHODS
	 * 
	 */
	
	//siobe -> StringIndexOutOfBoundsException Repair
	private void siobe_repair() {
		try
		{
			lines = Files.readAllLines(rcfl);
			for(int index = 0; index < 3; index++) {
				String temp = lines.get(index);
				if(temp.indexOf('=') < 0)
					lines.set(index, arrRcflAttr[index].concat(temp));
			}
			Files.write(rcfl, lines);
			System.out.println("\nlfm: RecentFileLog fixed!\n");
		} 
		catch(IOException e) { e.printStackTrace(); }
		
	}
	
	/*
	 * 
	 * 		GET METHODS
	 * 
	 */
	
	// Temperorary put ltl
	String getFileTemplatePathCategory(int lineNumberTemplate) {
		String tmp_str = "";
		try {
			List<String> tmp_list = Files.readAllLines(ltl);
			tmp_str = tmp_list.get(lineNumberTemplate);
			return tmp_str.substring(tmp_str.indexOf("\"")+1, tmp_str.lastIndexOf("\""));
		}
		
		catch(IndexOutOfBoundsException inobe) {
			System.out.println("Exceeds Line Number for Accessing array of DIR ("+lineNumberTemplate+")");
			return (lineNumberTemplate < 0) ? "" : getFileTemplatePathCategory(lineNumberTemplate-1);
		}
		
		catch (IOException e) {
			e.printStackTrace();
			return tmp_str.substring(tmp_str.indexOf("=")+1);
		}
	}
	
	
	long getNumberOfTemplateCategory() {
		try {
			return Files.readAllLines(ltl).size();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
	
	String getRecentFileLog(int fileType) {
		try {
			lines = Files.readAllLines(rcfl);
			String temp = lines.get(fileType);
			return temp.substring(temp.indexOf('=')+1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	
	List<String> getListOfEmployeeNum() {
		try 
		{
		      CSVReader reader = new CSVReader(new FileReader(eml.toString()));
		      lst_EmployeeNum = new ArrayList<String>();
		      
		      for(String[] arrString: reader.readAll())
		    	  for(String str : arrString)
		    		  if(str.length() == 8)
		    			  lst_EmployeeNum.add(str);
		      
		      return lst_EmployeeNum;
		}
		
		catch(IOException | CsvException e) {
			System.out.println("\n\nlfm: CsvValidationException\n\n");
			e.printStackTrace();
			
		}
		return null;
	}
	
	
	boolean getIsInit() {
		return this.isInit;
	}
	
	/*
	 * 
	 * 		IS METHODS
	 * 
	 */
	
	private boolean isEmployeeNumExist(String str) {
		return lst_EmployeeNum.contains(str);
	}
	
}
