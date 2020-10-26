package RecapClassA27;

import java.util.LinkedList;
import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		// We can not create instance of a Queue as it is an interface
		// We can create instance of LinkedList or PriorityQueue and assign it to Queue
		//FIFO (First in first out)
		
		Queue<String> q = new LinkedList<String>() ;
		
		//Add
		q.add("Marco");
		q.add("Jorge");
		q.add("Dylan");
		q.add("Jake");
		q.add("Lucas");
		
		System.out.println("Elements in Queue: " + q);
		
		//remove method
		System.out.println("Removed elements:" + q.remove());
		
		//this return the head of the Queue
		System.out.println("Head of elements:" + q.element());
		
		//Poll method()--this removes and returns the head of the Queue---null
		System.out.println("Poll:" + q.poll());
		
		System.out.println("peek:" + q.peek());
		
		System.out.println("Elements in Queue: " + q);
		
		
		

	}

}







