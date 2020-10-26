package RecapClass ;

public class PracticeMonday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*1- Remove junk character
         String s = "(123)-456-7891";
          Output: 1234567891**/
		
	String s = "(123)-456-7891";
		s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
	
		/*2- Reverse Integer
          int num = 12345;
          Output: 54321**/
		
	 int num = 12345;
	 int reversed = 0;
	 while (num != 0) {
		 reversed=reversed*10 + num%10;
		 num = num / 10;
	 	
		 System.out.println( "My revese num is:" + reversed);
	 
	 }
   /*3- Find duplicate value in Array
       String names[] = {"Java", "JavaScript", "Groovy", "Python", "Java", "Python"};
       
       Output: Java Python**/
	
 	String names[] = {"Java", "JavaScript", "Groovy", "Python", "Java", "Python"};
   for (int i = 0; i < names.length; i++) {
	for (int j = 0; j < names.length; j++) {
     if (names[i].equalsIgnoreCase(names[j])) {
		System.out.println(names[i]);
     }	
	}
   }   
	 }
}
		
	

	
				
	
			
		
	
	
	

