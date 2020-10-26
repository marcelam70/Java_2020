package RecapClassA20;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationConcept {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		for(int i = 0; i <10; i++)
			vector.addElement(i);
		System.out.println(vector);
		
		//at beginning cursor will point to just before the first element in  vector
		Enumeration enumeration = vector.elements();
		
		//Checking the next element availability
		while (enumeration.hasMoreElements()) {
			
			//moving cursor to next element
			int i = (Integer)enumeration.nextElement();
			System.out.print(i+ " ");
			
		}

	}

}
