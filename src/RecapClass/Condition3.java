package RecapClass;

import java.util.Scanner;

public class Condition3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		String userGrade = input.nextLine();
		
		switch(userGrade){
		
		case "A":
			System.out.println("Distinction");
			break;
		case "B":
			System.out.println("Perfect");
			break;
		case "C":
			System.out.println("Good");
			
			break;
		default :
			System.out.println("Fail");
			break;

	}

	}
}
