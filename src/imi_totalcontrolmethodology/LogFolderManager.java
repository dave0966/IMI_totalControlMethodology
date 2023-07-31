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

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class LogFolderManager {
	private List<String> lines;
	private List<String> lst_EmployeeNum;
	private List<String> lst_template;
	private final String[] arrTulAttr = {"IKS_Template=", "AFAA_Template=", "SASSY_Template="};
	private final String[] arrRcflAttr = {"SubFolder=", "Valeo_IKS=", "Valeo_AFAA=", "Valeo_SASSY="};
	private boolean isInit = false;
	
	private Path eml = Paths.get("$Log\\EmployeeNumberLog.csv");
	private Path ltl = Paths.get("$Log\\ListOfTemplateLog.config");
	private Path rcfl = Paths.get("$Log\\RecentCreatedFileLog.config");
	private Path al = Paths.get("$Log\\ApplicationLog.config");
	
	LogFolderManager(){
		createDir_LogRepo();
		try {
			createCSV_EmployeeNumberLog();
			createConfig_ListOfTemplateLog();
			createConfig_RecentCreatedFileLog();
			createConfig_ApplicationLog();
			
			getListOfEmployeeNum();
			lines = Files.readAllLines(rcfl);
			this.isInit = true;
		}catch(FileAlreadyExistsException feaa) {
			System.out.println("\n\nlfm: FileALreadyExistsExcpetion\n\n");
			feaa.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("\n\nlfm: IOException\n\n");
			e.printStackTrace();
		}
		
	}
	
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
	
	//	Append EmployeeNum to CSV
	void UpdateEmployeeNumLog(String input) {
		if(!isEmployeeNumExist(input))
			try (CSVWriter writer = new CSVWriter(new FileWriter(eml.toString(), true))) 
			{
	            writer.writeNext(new String[] {input});
	            System.out.println("Updated Employee Number Log!");
	        } 
			catch (IOException e) { e.printStackTrace(); }
	}

	
	void UpdateRecentfileLog(String input, int lineNumber){
        try 
        {
            lines = Files.readAllLines(rcfl);
            String temp = lines.get(lineNumber);
            lines.set(lineNumber, temp.substring(0,temp.indexOf('=')+1).concat(input));
            Files.write(rcfl, lines);
            System.out.println("lfm: Updated RecentFileLog!");
        }
        
        catch (StringIndexOutOfBoundsException siobe) { siobe_repair(); }
        catch (IOException e) { e.printStackTrace(); }
	}
	
	// Abbreviation to UTL
	void UpdateTemplateLog(String Dir, int lineNumber) {
		try (CSVWriter writer = new CSVWriter(new FileWriter(ltl.toString(), true))) 
		{
            writer.writeNext(new String[] {Dir});
            System.out.println("Updated Template Log!");
        } 
		catch (IOException e) { e.printStackTrace(); }
	}
	

	void UTL_addVar
	
	
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
	
	String getRecentFileLog(int fileType) {
		String temp = lines.get(fileType);
		return temp.substring(temp.indexOf('=')+1);
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
	
	private boolean isEmployeeNumExist(String str) {
		return lst_EmployeeNum.contains(str);
	}
	
}
