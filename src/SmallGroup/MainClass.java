package SmallGroup;

public class MainClass {
	void method1(Person person){
		System.out.println(person.age);
		System.out.println(person.name);
	}

	public static void main(String[] args) {
		Person object1,object2;
		object1 = new Person();
		object2 = new Person();
		object1.age= 5;
		object1.name= "Jake";
		
		object2.age= 7;
		object2.name= "Dylan";
		
		MainClass mainClass = new MainClass();
		mainClass.method1(object1);
		mainClass.method1(object2);

	}

}
