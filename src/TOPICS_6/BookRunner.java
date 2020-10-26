package TOPICS_6;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BarnesNoble bNoble = new BarnesNoble("Clifton Branch", 7000);
		bNoble.workHours("9am", "9pm");
		System.out.println(bNoble.numOfEmployee(13));
		

	}

}
