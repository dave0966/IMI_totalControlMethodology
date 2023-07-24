package imi_totalcontrolmethodology;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LogFolderManager {
	private File f_logRepo, f_enfl, f_rfl;
	private Scanner reader;
	
	LogFolderManager(){
		createDir_LogRepo();
		createTxt_EmployeeNumberLog();
		createRecentFile();
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
	
	private void createRecentFile() {
		f_rfl = new File("$Log\\RecentFileLog.txt");
		if(!f_rfl.exists())
			try {
				f_rfl.createNewFile();
				System.out.println("RecentFileLog been created!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			System.out.println("RecentFileLog already Exist!");
	}
	
	void setRecentfileLog(String input) {
		try {
			OutputStream fos = new FileOutputStream(input);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			createRecentFile();
			setRecentfileLog("");
		}
	}
	
	String getRecentFileLog() {
		try {
			reader = new Scanner (f_rfl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return reader.nextLine();
	}
	
	void addEmployeeNum(String str) {
		try 
		{
			if(!isEmployeeNumExist(str)) 
			{
				System.out.println("(LogFileManager) Inserted new Employee Number: " + str);
				FileWriter fw = new FileWriter(f_enfl, true);
				if(f_enfl.length() != 0)
					fw.write("\n"+str);
				else
					fw.write(str);
				
				fw.close();
			}
		}
		
		catch(IOException e) { e.printStackTrace(); }
	}
	
	List<String> getListOfEmployeeNum() {
		List<String> temp = new ArrayList<String>();
		try 
		{
			reader = new Scanner(f_enfl);
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
//		System.out.println("getListOfEmployeeNum invoked! ("+temp.size()+")");
		return temp;
	}
	
	boolean isEmployeeNumExist(String str) {
		System.out.println("isEmployeeNumExist invoked!");
		
		for(String get : getListOfEmployeeNum())
			if(get.equalsIgnoreCase(str))
				return true;

		return false;
	}
	
	
}
