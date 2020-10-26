package RecapClass;

public class BMW extends Car {// child class----- sub class
	
	public BMW(){
		System.out.println("BMW constructor");
		super.start();
	}
	
	@Override
	public void start(){
		System.out.println("Car____BMW start");
		System.out.println("Car ------start method");
}
	public void theftSafety(){
		System.out.println("BMW___ theftsafety");
	}
	
	
	public int personNum() {
		int i = 5;
		return i;
		
		
	}
}