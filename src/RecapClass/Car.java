package RecapClass;

public class Car extends Vehicle {//super class parent class
	//constructor
	public Car(){
		System.out.println("Car-------aconst parent");
		
		//vehicle----> Car -----BMW ---->Honda 
	}
public void start(){
	System.out.println("Car ------start method");
}
public void stop(){
	System.out.println("Car------stop");
}
public String refuel(){
	return("Car-------refuel teturn type");
}
}
