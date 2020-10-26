package RecapClass2;

public class Silicone {
	public static void main(String[] args) {
		
	
	
	SiliconeAccount acc = new SiliconeAccount();
	acc.setEmail("account1@sample.com");
	acc.setFirstName("Marcela");
	acc.setPassword("marcelam70");
	
	System.out.println("Email: "+ acc.getEmail());
	System.out.println("First Name: "+ acc.getFirstName());
	System.out.println("Password: "+ acc.getPassword());
	
	System.out.println(acc.getAccountInfo());
	
	SiliconeAccount account2 = new SiliconeAccount();
	account2.setAccountInfo("ilhan@sample.com", "ilhan", "test123");
	System.out.println(account2.getAccountInfo());


	}	
	
	
}	

