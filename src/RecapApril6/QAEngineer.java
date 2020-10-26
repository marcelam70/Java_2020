package RecapApril6;

public class QAEngineer implements IEngineer,IWorking{

	private boolean reference;
	private boolean backgroundCheck;
	
	
	//Constructor
	public QAEngineer(boolean reference, boolean backgroundCheck) {
		super();
		this.reference = reference;
		this.backgroundCheck = backgroundCheck;
		
	}
	
	
	
	
	
	@Override
	public void work() {
		System.out.println("QA Engineer is working....");
		
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
		
		return "GPA score is : " + gpa;
	}

	@Override
	public void experience(String[] array) {
		if (array.length==0) {
			System.out.println("Candidate does not have any experience");
			
		}else{
			System.out.println("As a QA Engineer I worked those companies:");
			for(int i = 0;i <array.length;i++){
				System.out.println(array[i]);
			}
		} 
		
	}


public void listOfReferences(String[] array){
	if (array.length==0) {
		System.out.println("Candidate does not have any reference");
		
	}else{
		System.out.println("Candidate reference lis:");
		for(int i = 0;i <array.length;i++){
			System.out.println(array[i]);
}
	}		
}	

public void introStatic(){
	System.out.println("This is a chil static");
}	
public void projects(){
	System.out.println("This is default in child");
	
	
	
	
}
}
		
		
		