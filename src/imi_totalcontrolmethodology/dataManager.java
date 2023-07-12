package imi_totalcontrolmethodology;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class dataManager {
	final String excel_dir = "";
	private File f_dir, f_enfl, f_logRepo, f_output;
	String test = "1";
	dataManager(){
		createDir_LogRepo();
		createTxt_EmployeeNumberLog();
	}
	
	dataManager(String dir){
		f_dir = new File(dir);
		
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
	
	private void createDir_Output() {
		f_output = new File("$Output");
		if(!f_output.exists()) {
			f_output.mkdirs();
			System.out.println("Successfully Created Directory!");
		}else 
			System.out.println("Folder Directory for Employee Log Already Exist!");
	}
	
	//Add a method in which prevent redundant data
	void addEmployeeNum(String str) {
		try 
		{
			if(!compareTxt()) {
				JOptionPane.showMessageDialog(null, "please insert emplyee number!", "File Creation Alert Warning", JOptionPane.WARNING_MESSAGE);
			}
			else {
				FileWriter fw = new FileWriter(f_enfl, true);
				fw.write("\n"+str);
				fw.close();
			}
		}
		
		catch(IOException e) { e.printStackTrace(); }
	}
	boolean compareTxt() {
		for(String str1: getListOfEmployeeNum()) {
			if (str1 == test) {
				return true;
			}
		}
		return false;
	}
	
	List<String> getListOfEmployeeNum() {
		List<String> temp = new ArrayList<String>();
		
		try 
		{
			Scanner reader = new Scanner(f_enfl);
			while (reader.hasNextLine()) {
				String temp_str = reader.nextLine();
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
