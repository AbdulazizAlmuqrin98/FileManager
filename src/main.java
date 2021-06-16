import java.io.*;
import java.util.Scanner;


public class main {
	 String names[];
	    int length;
	public static void run() {
		System.out.println("		Welcome to FileManager \nThe program are made by Abdulaziz Ahmed Almuqrin \n GitHub: https://github.com/AbdulazizAlmuqrin98");

	String op = getInput("Choose the function :"+"\n1- Add a File" +"\n2- Delete a File"+ "\n3- Search for a File "+"\n4- Retrieving the file names in an ascending order"+"\n5- End Program");
	  
    int opInt = Integer.parseInt(op);
	///Main menu
    switch (opInt) {
    case 1:
    	System.out.println("----Add a File----");
    
    	 addAfile(op, op);
    	 String added = getInput("1- Go back \n2- End");
    	 int addedInt = Integer.parseInt(added);
    	 if(addedInt==1) {
    		 System.out.println("Go back to menu");
    		 run();
    		 
    	 }
    	 else {	System.out.println("Program End");    	 System.exit(0);}

    	
    	
    	 break;

    case 2 :
    	
    	System.out.println("----Delete a File----");
    	DeleteFile(op,op);
    	
    	 String Del = getInput("1- Go back \n2- End");
    	 int DelInt = Integer.parseInt(Del);
    	 if(DelInt==1) {
    		 System.out.println("Go back to menu");
    		 run();
    		 
    	 }
    	 else {	System.out.println("Program End");    	 System.exit(0);}

    	   break;
           
    case 3:
    	System.out.println("----Search for a File----");
    	//search
		int flag=0;
		do {
   
    Scanner Sc = new Scanner(System.in); 
    	System.out.println("----Search----");
    	System.out.println("Choose :");
    	System.out.println("1-Show all file in Directory");
    	System.out.println("2-Search for a file in the Directory");
    	System.out.println("3-Go back to menu");
    	System.out.println("4-End");

    	int i= Sc.nextInt();
    		if(i==1) {
    	    	System.out.println("	Show all file in Directory");

    			SearchInDirectory(op,op);
    			
    			
    			flag=1;
    		}
    		else if (i==2) {
    			findFile(op,op);
    			 
    		
    		}
    		else if(i==3) {	    	System.out.println("Go back to menu");
			flag=3;
			
			run();
	    	break;

    			}
    		else if (i==4){System.out.println("Program End");    	 System.exit(0);
    		
    		flag=4;}
    		
    }while(flag !=3 || flag !=2 || flag !=1 || flag !=4 );
		
		
    	
    	 break;
    	 
    case 4:
    	System.out.println("----file names in an ascending order----");
    	main sorter = new main();
    	 File directory = new File("D:\\CoOp\\JavaProject\\Phase1\\FileManager\\Files");

			String[] flist =directory.list();
			 for (String i : flist) {
		            System.out.print(i);
		            System.out.print("\n");
		        }
			 String Q = getInput("1- Go back \n2- End");
	    	 int QInt = Integer.parseInt(Q);
	    	 if(QInt==1) {
	    		 System.out.println("Go back to menu");
	    		 run();
	    		 
	    	 }
	    	 else {	System.out.println("Program End");    	 System.exit(0);}

    	
    	 break;
    	 
    	 
    case 5:  
    	System.out.println("Program End");    	 System.exit(0); 	 
   	 break;

    default:
        System.out.println("You Entered an incorrect value");
        return;}
    }
	//Main Method////////////////////////////////////
	public static void main(String[] args) {
		run();
		

    
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
	
	public static void DeleteFile(String s1, String s2) {

		
   	 Scanner Sc = new Scanner(System.in);  // Create a Scanner object
   	    System.out.println("Enter File Name");

   	    String FileName = Sc.nextLine();  // Read user input
     File myObj = new File("D:\\CoOp\\JavaProject\\Phase1\\FileManager\\Files\\"+FileName);
     if (myObj.delete()) { 
         System.out.println("Deleted the file: " + myObj.getName());
       } else {
         System.out.println("Failed to delete the file.");
       } 
      
  
}
	////////////End DeleteFile method
	
	  //searchInDirectory/////
	  public static void SearchInDirectory(String s1, String s2) {  
	
		 System.out.print("In Directory: \n");
		  File directory = new File("D:\\CoOp\\JavaProject\\Phase1\\FileManager\\Files");

			String[] flist =directory.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			}
			else {
			for (File f: directory.listFiles()) {
				flist = directory.list();
				 System.out.println(f.getName());
				 flag = 1;
			}
		
			if (flag == 0) {
				System.out.println("File Not Found");
			}
	  }}
	 /// findFile
	  public static void findFile(String name,String fn)
	    {
		  File directory = new File("D:\\CoOp\\JavaProject\\Phase1\\FileManager\\Files");
			String[] flist = directory.list();
			int flag = 0;
			if (flist == null) {
				System.out.println("Empty directory.");
			}
			else {

				// Linear search in the array
				  System.out.println("Enter File Name");
				  Scanner Sc = new Scanner(System.in);  // Create a Scanner object
				  String File_Name = Sc.nextLine(); 
				for (int i = 0; i < flist.length; i++) {
					String filename = flist[i];
					 
			    	     // Read user input 
					if (filename.equalsIgnoreCase(File_Name)) {
						System.out.println(filename + " found");
						flag = 1;
					}
				}
			}

			if (flag == 0) {
				System.out.println("File Not Found");
			}
			
	    }////////////findFile End
	  //sort method
	  void sort(String array[]) {
	        if (array == null || array.length == 0) {
	            return;
	        }
	        this.names = array;
	        this.length = array.length;
	        quickSort(0, length - 1);
	    }
	  void quickSort(int lowerIndex, int higherIndex) {
	        int i = lowerIndex;
	        int j = higherIndex;
	        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

	        while (i <= j) {
	            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
	                i++;
	            }

	            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
	                j--;
	            }

	            if (i <= j) {
	                exchangeNames(i, j);
	                i++;
	                j--;
	            }
	        }
	        //call quickSort recursively
	        if (lowerIndex < j) {
	            quickSort(lowerIndex, j);
	        }
	        if (i < higherIndex) {
	            quickSort(i, higherIndex);
	        }
	    }
	  void exchangeNames(int i, int j) {
	        String temp = this.names[i];
	        this.names[i] = this.names[j];
	        this.names[j] = temp;
	    }
	
}
