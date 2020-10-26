package RecapClass;

public class OverloadingConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		main(3);
		main("Marcela");

	}

	
	public static void main(int i){
		System.out.println(i);
	}
	public static void main(String name){
		System.out.println(name);
	}
}
