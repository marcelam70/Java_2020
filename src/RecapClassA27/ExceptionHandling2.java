package RecapClassA27;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		//Multiple catch
		try{
			int arr[] = new int[7];
			arr[9]=30/2;
			System.out.println("Last statement of try block");
			
		
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception...");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array elements outside of the limit...");
			
		}
		catch (Exception e) {
			System.out.println("Some other exception...");
		}
		finally {
			System.out.println("Her is finally block....");
		}
		System.out.println("Out of the try and catch....");
	}

}
