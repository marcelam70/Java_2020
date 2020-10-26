package RecapClass;

import java.util.Scanner;

public class PracticeRecap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Password checker (if else --> hint: nested)
		   Create a login system and check exact password and username
		   Variables:
		   String secretUserName = "admin1";
		   String secretPassword = "ab1c123";
		   > Make sure that they match with secret ones and allows login successfully
		   > Whenever login is not successful, let program tell exact reason
		   > Why it is not valid
		     --> username is not valid
		     --> password is not valid
		     --> both username and password are invalid**/
	
		
	
		Scanner scanner = new Scanner(System.in);
		String secretUserName ="admin1";
	    String secretPassword = "ab1c123";
        System.out.println("Enter your username");
       String secretUserName1= scanner.nextLine();
      System.out.println("Enter your password");       
      String secretPassword1 = scanner.nextLine(); 
      
      if (secretPassword.equals(secretPassword1)){
      if (secretUserName.equals(secretUserName)){
    	System.out.println("Login successfuly");
    
      }else{
    	System.out.println("Your username is wrong");
       
	    } 
      }else {
	    	if(! (secretUserName.equals(secretUserName1) && !secretPassword.equals(secretPassword1)))  {
    		System.out.println("both username and password are invalid");
	   
	    	}      
              else  {
           System.out.println("password is not valid");       

      
     
              }
       
	    
   }
     }
	    	
}




//		/*4- Create a program and find which month is how many days. (switch&case)
//	   Example if user enter 5 (May) print on the console:
//		   number of days 31**/
//     
//  
//   int month;
//   Scanner scanner = new Scanner(System.in);
//	
//	System.out.println("Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
//	   month = scanner.nextInt();	
//	switch(month)
//	{
//	  	case 1:
//	  	case 3:
//		case 5: 	
//		case 7:
//		case 8:
//		case 10:
//		case 12:			  	
//			System.out.println(" 31 Days in this Month");
//		  	break;
//		case 4:	
//		case 6:
//		case 9:
//		case 11:			    	
//			System.out.println(" 30 Days in this Month");  
//			break;
//		case 2:
//			System.out.println("Either 28 or 29 Days in this Month"); 
//			break;
//		
//		default:		  	
//			System.out.println("Please enter Valid Number between 1 to 12");
//	  }
   
 
  
	  





