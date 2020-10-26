package SmallGroup;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MondaySmallGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for (int l= 1; l <10; l++) {
				for (int k =1; k<=10; k++){
					System.out.println(k*l + "\t");
				}
			 System.out.println();

	}
			int[] numbers = {
					951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
					615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
					386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
					399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
					815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
					958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470,
					743, 527};{
					for (int i = 0; i < numbers.length; i++) {
					 int el = numbers[i];
					 if (el == 237) {
					 break;
					}
					// using the division remainder operator %
					 if (el % 2 == 0) {
					 System.out.println(el);
					 }
					}
		}
					/* Write a program to print out all Armstrong numbers between 1 and 500. 
					If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
					For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )**/				
					 int digit1, // To hold first digit (Ones) of number 
					  digit2, // To hold second digit (Tens) of number
					   digit3; {// To hold third digit (Hundreds) of number
					
					 for(int number = 1; number <= 500; number++){
						
					      int temp = number;
						  digit1 = temp % 10;
					      temp = temp / 10;
					      digit2 = temp % 10;
					       
					      temp = temp / 10;
					      digit3 = temp % 10;
						  if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number)
					      {
						    System.out.println(number);
					 }
		}
}
}
}