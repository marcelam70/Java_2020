package RecapClass;

public class ConstructorConcept3 {
	int x;
	
// Parameterized constructor
	
	public ConstructorConcept3(int y){
		x=y;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConstructorConcept3 cc = new ConstructorConcept3(5);
     System.out.println(cc.x);
	}

}
