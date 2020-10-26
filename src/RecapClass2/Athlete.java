package RecapClass2;

public class Athlete {
	
	String name;
	int age;
	public Athlete() {
		// TODO Auto-generated constructor stub
	}
public Athlete( String name, int age){
	this.name = name;
	this.age = age;
	
}
//methods
public void game(){
	System.out.println( "Athlete is playing......");
}
public void run(){
	System.out.println("Athlete is running.....");
}
}
