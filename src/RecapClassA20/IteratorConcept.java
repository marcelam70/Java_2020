package RecapClassA20;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();//this is nor generic, not specific any value
		for (int i = 0; i<10;i++) 
			al.add(i);
		System.out.println(al);
		
		// at beginning itr will point to index just before the first element in al
		Iterator itr = al.iterator();
		//checking the next element availability
		while(itr.hasNext()){
			
			//moving cursor to next element
			int i = (Integer)itr.next();
			
			//getting elements one by one
			System.out.print(i + " ");
			
			//Remove odd elements 135
			if(i%2 !=0)
				itr.remove();
			
		}
		System.out.println();
		System.out.println(al);
			
		}

	}


