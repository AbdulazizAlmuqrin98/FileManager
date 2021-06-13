import java.io.*;

public class main {
	//Main Method////////////////////////////////////
	public static void main(String[] args) {
		
System.out.println("		Welcome to FileManager \nThe program are made by Abdulaziz Ahmed Almuqrin \n GitHub: https://github.com/AbdulazizAlmuqrin98");
	String op = getInput("Choose the function :"+"\n1- Add a File" +"\n2- Delete a File"+ "\n3- Search for a File ");
	  
    int opInt = Integer.parseInt(op);
	///Main menu
    switch (opInt) {
    case 1:
	
    	
    	 break;

    case 2 :
    	
    	
    	   break;
           
    case 3:
    	
    	
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

	
	
}
