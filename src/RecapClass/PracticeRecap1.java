package RecapClass;

import java.util.Scanner;

public class PracticeRecap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*Create a program and calculate your age. 
		Sample outputIf you are born in 2000 then you are 20 years old.Requirements: 
		Use scanner concept in JavaGet input from user DOBGet input from user current yearCalculate current age**/
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your born year :");
		int year = scanner.nextInt();
		int age = 2020 - year;
		System.out.println("Your age is :" + age);
		
	/*Create a program and buy apples, carrots and tomatoesApples = $3.99, carrots = $0.99,tomatoes = $1.59
	  Tax rate is $0.06Calculate
		total price without taxCalculatetotal price with taxSample output:Total 
		price without tax = xTotal price with tax = y**/
		double apples = 3.99;
		double carrots = 0.99;
		double tomatoes = 1.59;
		double x = apples + carrots + tomatoes;
		double y = (x * 0.06)+ x;
		System.out.println("Price whithout tax:" + x);
		System.out.println("Price whith tax :" + y );
		
		/*Create a temperature converter programUse scanner conceptGet input from user a valueas FahrenheitConvert 
		Fahrenheit to Celsius(User enters 68 F which means 20 C)You can check the following webpage how to convert F to C
		Sample outputThe temperatureis 20 degrees Celsius**/
		
		System.out.println("What is the temperature :");
		double temp = scanner.nextDouble();
		double celsius = ((5 * ( temp -32.0))/9.0);
		System.out.println("Temperature is:" +  celsius +" degrees Celsius");
		
	}

}
