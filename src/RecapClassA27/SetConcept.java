package RecapClassA27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		//Only store unique values
		//Not allowed duplicates
		//Very fast to check if particular object is exists
		//order not important
		//HashSet, LinkedHasSet, TreeSet
		
		
	//	Set<String> set1 = new HashSet<String>();
	//	HashSet<String> set1 = new HashSet<String>();
		
		//Elements remain in order they were added
	//	Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet provide natural order alphabetic order
		//It is sorted in natural order
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("dog");
		set1.add("pet");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		set1.add("mouse");
		
		System.out.println(set1);
		
		for(String value : set1){// we ca used for each loop for print
			System.out.print(value + " ");
			
		}
		

	}

}
