package RecapClassA27;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		int num1, num2;
		try {
			num1 = 2;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("Here is try block:");
			
		} catch (ArithmeticException e) {
			System.out.println("You should not divide a number by zero:");
			
		}
			catch (Exception e) {//generic exception can handling all exceptions
				System.out.println("Exception ocurred:");
				
			}
		finally {//works in any condition
			System.out.println("Here is finally");
			
		}
	     System.out.println("Here is out of try and catch");
		
		}

	}


