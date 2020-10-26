package RecapClass;

public class EmployeesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an object
		Employees dylan = new Employees();
		dylan.setFirstName("Dylan");
		dylan.setLastName("Corpron");
		dylan.setSSN("234567890");
		
		System.out.println("First name: " + dylan.getFirstName());
		System.out.println("Last name: " + dylan.getLastName());
		System.out.println("SSN : " + dylan.getSSN());
		
		dylan.worker(45);
		System.out.println("**************");
		Employees lucas = new Employees("Lucas", "Arteta", "9876543212");
		System.out.println("First name :" + lucas.getFirstName());
		System.out.println("Last name :" + lucas.getLastName());
		System.out.println("SSN: " + lucas.getSSN());
		
		lucas.worker(80);
		
	}

}
