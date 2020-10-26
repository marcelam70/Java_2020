package SmallGroup;


abstract class SuperClass{
	int x =50;
	void method(){System.out.println("Superclass");}
	void method1(){System.out.println("Superclass1");}
}
public class Wednesday8  extends SuperClass{
	int x=100;
	void method3(){System.out.println("Subclass");}
	public static void main(String[] args) {
	
		// How can we use int x in the superclass?
		//First we can create an object for Wednesday8
		//Second upcasting
		
		Wednesday8 object1 = new Wednesday8();
		System.out.println(object1.x);
		
		//upcasting: Superclass (or interface) identifier = new Subclass();
		SuperClass object2 = new Wednesday8();
		System.out.println(object2.x);
		
		object2.method(); //Output: Subclass
		System.out.println(object2.x);//output:50
		object2.method1(); // output : Superclass1
		System.out.println(object1.x); //output : 100
		object1.method1();

	}

}
