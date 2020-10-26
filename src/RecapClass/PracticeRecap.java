package RecapClass;

import java.util.Scanner;

public class PracticeRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*- Calculate credit score (if else)
	    
		   1- 299 Bad credit score
		   2- 300 - 579 very poor score --> %16
		   3- 380 - 669 fair credit score --> %18
		   4- 670 - 739 good credit score --> %21
		   5- 740 - 799 very good score --> %25
		   6- 800 - 850 Excellent score --> %20
		   Get score from user and print on the console
		   score and evaluation then score percentage**/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your score");
		String creditScore = scanner.nextLine();
   int score = 750;
	if (score<= 299){
		
		System.out.println("You have bad credit Score");

	} else if  (score>=300 && score<=579) {
		System.out.println("You have very poor credit score");
	
	}
else if (score>=380 && score<=669) {
	System.out.println("You have fair credit score");
	
}else if (score>=670 && score<=739) {
	System.out.println("You have good credit score");
	
}else if (score>=740 && score<=799) {
	System.out.println("You have  very good credit score");
	
	
}  else if (score>=800 && score<=850) {
	System.out.println("You have Excellent credit score");
}
	else {
		System.out.println("invalid score");
	}
System.out.println("Your scores % is : 25%"  );
/* Calculate insurance rate (if else  --> hint: nested)
     You have a company and have company cars. You wanna buy insurance
     Liability Insurance
     car numbers         insurance price
     1 car                750 (per car)
     2-5 cars             550 (per car)
     6-8 cars             450 (per car) 
     9+                   350 (per car)
     Full insurance
     car numbers         insurance price
     1 car                1150 (per car)
     2-5 cars             1050 (per car)
     6-8 cars             900 (per car) 
     9+                   800 (per car)
     Example : There are 5 cars in my company i wanna liability.
               I am gonna pay 550 per car
               totalInsurance 5 x 550***/
int insurance = 1; 
int carNumbers = 5;
int insurancePrice =550;
System.out.println("Total insurance :"+ (insurancePrice*carNumbers));

if (insurance== 1){
	System.out.println(" Liability Insurace");
	if(carNumbers==1){
		insurancePrice = 750;
		
	}else if (carNumbers >= 2 && carNumbers <= 5){
		insurancePrice = 550;
		
	}else if( carNumbers >=6 && carNumbers <=8 ){
		insurancePrice = 450;
		
	}else if( carNumbers >=9){
		insurancePrice = 350;
		
}else if (insurance == 2){
	System.out.println("Full Insurance");
	if(carNumbers ==1){
		insurancePrice= 1150;
		
	}else if (carNumbers >=2 && carNumbers <= 5){
		insurancePrice= 1050;
	}else if( carNumbers >=6 && carNumbers<=8){
		insurancePrice = 900;
		
	}else if( carNumbers >=9){
		insurancePrice = 800;
		
	}
		
	System.out.println("Total insurance :"+ (insurancePrice*carNumbers));





}
}

	
	}

	
	}

	

			
		
		


	

	


