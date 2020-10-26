package RecapClassA20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		//List interface  store list of objects
		//duplicate are allowed
		//object remain in order
		//Elements are indexed via integer
		//Checking for particular item in list is slow
		//index is fast
		
		//ArrayList
		//Is implemented as a re-sizable array
		//as more elements are added to arraylist its size is increased dynamically
		//It's elements can be accessed directly by using the get and set methods ( storing and accessing)
		//is un-synchronized
		
		//List<String> values = new ArrayList<String>();
		
		//LinkedList
		//Is faster in add and remove methods(manipulation) and slower in get methods
		//it is used doubly linked list to store elements (uni-directional,bi-directional,circular-directional
	//	List<String> values = new LinkedList<String>();
		
		//Vector
		//Is synchronized (all legacy classes are synchronized)
		//It uses more memory (double the size of array)
		//Legacy class
		
		
		List<String> values = new Vector<String>();
		values.add("Lucas");
		values.add("Mathew");
		values.add("Johan");
		values.add("Jake");
		values.add("Jake");
		for(String value: values){
			System.out.println(value);
		}

	}

}


















