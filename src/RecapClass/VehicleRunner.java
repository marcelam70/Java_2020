package RecapClass;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.theftSafety();
		bmw.engine();
		System.out.println(bmw.personNum());
		System.out.println(bmw.refuel());
		
		System.out.println("**************");
		Car car = new Car();
		car.start();
		car.stop();
		System.out.println(car.refuel());
		car.engine();

	}

}
