package RecapClass;

import java.util.Scanner;

public class PracticeRecap3Strings {

	public static void main(String[] args) {
		
		/*Find length to StringString str = "We are learning Java with Bob"**/
String str = "We are learning Java with bob";
System.out.println("My length is:" + str.length());


/*String str2 = " I will be an Automation engineer and will start a new career with SiliconeLabs which is a school of technology"
  a) find Automation that starts in which index
  b) create a logic and if your string contains engineer print the console  "yes engineer" if not print "no, engineer"
  c) find index of start word in the string**/

  String str2 = " I will be an Automation engineer  and will start a new career with SiliconeLabs which is a school of technology";
       System.out.println( str2.indexOf("start"));

      
      
       if (str2.equals("engineer")) {
           System.out.println("Yes engineer");		
		}
       else
    	   System.out.println("No engineer");
       System.out.println(str2.indexOf("Automation"));
       
     /*  String str = "   SiliconeLabs Company " Remove before and after spaces in the String**/
       
       String str3 = "   SiliconeLabs Company ";
       System.out.println(str3.replace(" [a-zA]"," "));
       }	
	}



