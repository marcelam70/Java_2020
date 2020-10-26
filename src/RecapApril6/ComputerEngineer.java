package RecapApril6;

public class ComputerEngineer implements IEngineer {
private boolean reference;
private boolean backgroundCheck;

//Constructor
public ComputerEngineer(boolean reference, boolean backgroundCheck) {
	super();
	this.reference = reference;
	this.backgroundCheck = backgroundCheck;
	
}
	@Override
	public void references() {
		if (reference) {
			System.out.println("He/her references were received.....");
			
		}else{
			System.out.println("His/her references were not received......");
		}
		
	}

	@Override
	public void backgroundCheck() {
		if (backgroundCheck) {
			System.out.println("He/she has a criminal background");
		}else{
			System.out.println("He/she does not have a criminal background");
		}
	
		
	}

	@Override
	public String GPA(double gpa) {
	
		return "GPA is : " + gpa;
	}

	@Override
	public void experience(String[] array) {
		if (array.length==0) {
			System.out.println("Candidate does not have any experience");
			
		}else{
			System.out.println("As a computer engineer I worked those companies:");
			for(int i = 0;i <array.length;i++){
				System.out.println(array[i]);
			}
		}
		
		
	}

}
