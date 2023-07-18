package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LogFolderManager {
	private File f_logRepo, f_enfl;
	
	LogFolderManager(){
		createDir_LogRepo();
		createTxt_EmployeeNumberLog();
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
	
	List<String> getListOfEmployeeNum() {
		List<String> temp = new ArrayList<String>();
		try 
		{
			Scanner reader = new Scanner(f_enfl);
			while (reader.hasNextLine()) {
				String temp_str = reader.nextLine();
				if(temp_str.length() == 8)
					temp.add(temp_str);
			}
			reader.close();
		} 
		
		catch (FileNotFoundException e) { e.printStackTrace(); }
		
//		for(String str: temp)
//			System.out.println("From dataManager:"+str);
//		System.out.println("Employee Status: " + !temp.isEmpty());
		return temp;
	}
}
