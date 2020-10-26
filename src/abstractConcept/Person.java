package abstractConcept;

public abstract class Person {
	//abstract class cannot be final and private
	//Abstract class must have at least one abstract method
	//Abstract class can inherit another abstract class
	// Abstract class cannot be instantiated directly
	
	
	public abstract void speak();  //abstract method
	
	
	public void healthInsurance(){
		System.out.println("If the positiion is fulltime, you have health insurance, if not no ins.");
	}
	

}
