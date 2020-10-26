package abstractConcept;

public class TestEmployee {

	public static void main(String[] args) {
       //    Person person = new Person(); will not compile
		Person person = new FTEmplyee();
		person.speak();
		Person person2 = new Contract();
		person2.speak();
		Employee employee = new Contract();
		employee.speak();
		FTEmplyee ftEmplyee = new FTEmplyee();
		ftEmplyee.speak();
		Contract contract = new Contract();
		contract.speak();
		contract.benefits();
		contract.healthInsurance();
		

	}

}
