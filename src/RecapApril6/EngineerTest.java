package RecapApril6;

public class EngineerTest {

	public static void main(String[] args) {
        
		//IEngineer computerEngineer = new ComputerEngineer(false, false);
		ComputerEngineer computerEngineer = new ComputerEngineer(false, false);
		computerEngineer.backgroundCheck();
		System.out.println(computerEngineer.GPA(3.75));
		computerEngineer.references();
		String [] experiences= {"Verizon","Old Navy","Chase"};
		computerEngineer.experience(experiences);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		
		QAEngineer qaEngineer = new QAEngineer(true, false);
		String[] references ={"Stephanie Corpron", "Ahmet Can Turk", "Cemil Koc","Robert Turk"};
		qaEngineer.listOfReferences(references);
		String []workExperience = {"SiliconeLabs"};
		qaEngineer.experience(workExperience);
		qaEngineer.backgroundCheck();
		System.out.println(qaEngineer.GPA(3.90));
		qaEngineer.work();
		
		//Default method
		qaEngineer.projects();
		//Static method
		IWorking.introStatic();
		qaEngineer.projects();
		qaEngineer.introStatic();
		}
	}


