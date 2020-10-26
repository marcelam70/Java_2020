package RecapClassA20;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorConcept {

	public static void main(String[] args) {
	    
		ArrayList<String> list = new ArrayList<>();
		list.add("Marcela");
		list.add("Jorge");
		list.add("Marco");
		list.add("Dylan");
		list.add("Jake");
		
		//ListIterator to traverse the list
		ListIterator iterator = list.listIterator(); //bidireccional
		
		//Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direccion");
		while(iterator.hasNext())
			System.out.print(iterator.next()+ " ");
		
		System.out.println();
		//Traversing the list backward direction
		System.out.println("Displaying list elements in backward direction");
		while(iterator.hasPrevious())
			System.out.print(iterator.previous() + " ");

	}

}
