package RecapApril6;

public interface IWorking {
void work();


default void projects(){
	System.out.println("This is default method..");
}

//default method came after java 8
//it has body in interface
//You can use in child class using override concept
static void introStatic(){
	System.out.println("This is static in interface..");
}
}
