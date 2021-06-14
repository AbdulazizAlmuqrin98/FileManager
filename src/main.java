import java.io.*;
import java.util.Scanner;


public class main {
	//Main Method////////////////////////////////////
	public static void main(String[] args) {

		
System.out.println("		Welcome to FileManager \nThe program are made by Abdulaziz Ahmed Almuqrin \n GitHub: https://github.com/AbdulazizAlmuqrin98");

	String op = getInput("Choose the function :"+"\n1- Add a File" +"\n2- Delete a File"+ "\n3- Search for a File "+"\n4- Retrieving the file names in an ascending order");
	  
    int opInt = Integer.parseInt(op);
	///Main menu
    switch (opInt) {
    case 1:
    	System.out.println("----Add a File----");
    
    	 addAfile(op, op);
    	
    	
    	
    	 break;

    case 2 :
    	
    	System.out.println("----Delete a File----");

    	
    	
    	   break;
           
    case 3:
    	System.out.println("----Search for a File----");

    	
    	 break;
    	 
    case 4:
    	System.out.println("----file names in an ascending order----");

    	
    	 break;
    	 
    	 
    	     	 
    	 
    default:
        System.out.println("You Entered an incorrect value");
        return;}
    
	}
	//End ofMain Method///////////////////////////////
	
	//getInput Method/////////////////////////////
	
	private static String getInput(String prompt) {
        BufferedReader stdin = 
                new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(prompt);
        System.out.flush();
        
        try {
            return stdin.readLine();
        }catch(Exception e) {
            return "Error : " + e.getMessage();
        }
    }
	//End of getInput Method/////////////////////////

	
	//////addAfile method
	public static void addAfile(String s1, String s2) {

		  try {
		    	 Scanner Sc = new Scanner(System.in);  // Create a Scanner object
		    	    System.out.println("Enter File Name");

		    	    String FileName = Sc.nextLine();  // Read user input
		      File myObj = new File("D:\\CoOp\\JavaProject\\Phase1\\FileManager\\Files\\"+FileName);
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
	//////////////End addAfile method
	
	
	
	///DeleteFile method
	
		

	
}
