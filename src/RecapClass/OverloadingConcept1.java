package RecapClass;

public class OverloadingConcept1 {
	
     // Overloading is same method name and different parameters
	//yes
	
	public void login (){
		System.out.println("0 param login method...");
	}
	
	public void login(String username){
		System.out.println("Username :" + username);
		
	}
	public void login(String email, String password, String role){
		System.out.println("3 params login method");
	}
	public static void main(String[] args) {
		OverloadingConcept1 oc = new OverloadingConcept1();
		oc.login();
		oc.login("Marcela");
		oc.login("marcelam70@yahoo.es","2345red", "user");
	}
}
