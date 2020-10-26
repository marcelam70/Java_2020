package Week4;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

public class PracticeMonday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Create int array points and assign 10 different numbers
   between 0 - 100 
   Verify there are 10 numbers or not
   Reverse array 
   int i[] ={1,2,3,4,5,6}
   Sample output:
   10 numbers found
   6,5,4,3,2,1**/

		
		  int num [] ={1,2,3,4,5,6,8,9,10,11};
		 
			if(num.length == 10) {
				System.out.println("10 numbers found");
			}else {
				System.out.println("We need to find 10 numbers");
			}
			
			for(int i = num.length-1; i >= 0; i--) {
				System.out.print(num[i] +" ");
			}
	     
			/*Create variable nums - assign several values
			   using a loop calculate the sum and print it
			   ADDITIONAL steps:
			         - calculate sum of even numbers
			         - calculate sum of odd numbers   
			    Sample output:
			       Sum is 115167
			        Sum of evens is 8022
			        Sum of odds is 107145**/
			
			
			
			int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
			
			int sum = 0;
			int sumOfEvens = 0;
			int sumOfOdds = 0;
			
			for(int n : nums) {
				sum += n;
				
				if(n % 2 == 0) {
					sumOfEvens += n;
				}else {
					sumOfOdds += n;
				}
				
			}
			System.out.println("Sum is " + sum);
			System.out.println("Sum of evens is " + sumOfEvens);
			System.out.println("Sum of odds is " + sumOfOdds);

			
			/*3- String[] arr = {"zero", "one", "two","three","four","keys"};
		    Count how many words have "e"  in array**/
			
			String[] arr = {"zero", "one", "two","three","four","keys"};
			int counter = 0;
	        for(String str : arr) {
	            
	            if(str.contains("e")) {
	                counter++;
			}
				/* String[] arr = new String[] {"apples", "banana", "kiwi", "cherries"};
				   Print app, ban, kiw, che
				   Don't print all values**/
				 
				 String[] arr1 = new String[] {"apples", "banana", "kiwi", "cherries"};
				 
					 for (String fruit  : arr) {
							System.out.println(fruit.substring(0,3));
					
				}
			String[] clothes = new String [] {"pants", "shirts","coats", "scarf"};
			for ( String clothe : arr ){
				System.out.println(clothe.substring(0,3));
			}
	}

	}

}












