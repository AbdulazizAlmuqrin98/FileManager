import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public  class AddFile {
	public AddFile(){
		
	}
	
	public static void addAfile(String s1, String s2) {

		  try {
		    	 Scanner Sc = new Scanner(System.in);  // Create a Scanner object
		    	    System.out.println("Enter File Name");

		    	    String FileName = Sc.nextLine();  // Read user input
		      File myObj = new File(FileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 
		
		
	}
	
}
