package RecapClass;

public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * FIZZBUZZ
		 * if number is divisible by 3 (no remainder) print FIZZ
		 * if number is divisible by 5 (no remainder) print BUZZ
		 * if number is divisible by 5 and 3 (no remainder) print FIZZBUZZ
		 * else print number itself
		 * 
		 */
		
		int number = 21;
		
		if (number % 3 == 0 && number % 5 == 0){
			System.out.println("FIZZBUZZ");
		}else if (number % 3 == 0){
			System.out.println("FIZZ");
		}else if (number % 5 == 0){
			System.out.println("BUZZ");
		}else {
			System.out.println(number);
		}

	}

	}


