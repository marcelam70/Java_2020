package RecapClassA27;

public class ThrowConcept {
	void ckeckAge(int age){
		if(age<18)
			throw new ArithmeticException("not elegible for voting");
		else
			System.out.println("Elegible for voting");
	}

	public static void main(String[] args) {
		ThrowConcept tr = new ThrowConcept();
		tr.ckeckAge(21);
		
		System.out.println("end of the program");
		
	
		

	}

}
