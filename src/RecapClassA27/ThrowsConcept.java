package RecapClassA27;

public class ThrowsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Throws is a method to handling exceptions
		
		for(int i = 5; i<100;i+=10){
			
				Thread.sleep(2000);
			
			
			System.out.println("you are done: " + i);
		}

	}

}
