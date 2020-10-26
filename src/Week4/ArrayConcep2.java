package Week4;

public class ArrayConcep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentsNames [] = new String[5];
		studentsNames [0] = "Sonam";
		studentsNames[1] = "Fatih";
		studentsNames[2] = "Arnold";
		studentsNames[3] = "Lynda";
		studentsNames[4] = "Hamza";
		
		for (int sn= 0; sn < studentsNames.length; sn++) {
			//System.out.println(studentsNames[sn]);
		if (studentsNames[sn].equals("Sonam")) {
			System.out.println(studentsNames[sn] + "is a doctor");
			
		}else if (studentsNames[sn].equals("Fatih")){
			System.out.println(studentsNames[sn] + "is a manager");
		}else if (studentsNames[sn].equals("Arnold")){
			System.out.println(studentsNames[sn] + "is a QA Engineer");
					
		}else if (studentsNames[sn].equals("Lynda")){
			System.out.println(studentsNames[sn] + "is a Scrum maste");
		}else if (studentsNames[sn].equals("Hamza")){
			System.out.println(studentsNames[sn] + "is a BA");
		}else{
			System.out.println("No studen is defined...");
		}
		}
	}
}

