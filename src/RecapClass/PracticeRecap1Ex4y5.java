package RecapClass;

import java.util.Scanner;

public class PracticeRecap1Ex4y5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a program as price checkerA user went to Walmart. He/she wants to buy an item. 
		Help him/her as a developer...Use scanner Get input a price form the userIf the price is less than 25,
		print on the console “the price is cheap and buy it”If price is greater than or equal 26and less than or equal 100, 
		print on the console “the price is expensive”In other cases, print out “go home**/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your item price :");
		double price = scanner.nextDouble();
		
		if (price < 25) {
			System.out.println("The price is cheap an buy it");	
		}
		else if (price > 26 && price <= 100) {
		    System.out.println("The price is expensive");
					
			}else
				System.out.println("Go home.......!");
			
	
  /*Create a voting eligibility program
	Get input an age from user check if value of age is 18 or more true--say eligible to vote false—you’re not eligible to vote**/
		
		
		System.out.println("Enter your age :");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("Elegible to vote");
		} else {
           System.out.println("Not elegible to vote");
		} 
		   {
			
			
			
		}
		
		
		
		
		
	}
}

