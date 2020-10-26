package SmallGroup;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Group1 {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(5);
		numbers.add(4);
		numbers.add(2);
		numbers.add(5);
		System.out.println(numbers);
		// What is the sum of the elements in numbers set
		//Solution1
		Iterator<Integer> iterator = numbers.iterator();
		int sum =0;
		while (iterator.hasNext()) {
			sum = sum + iterator.next();
			
			
		}
		System.out.println(sum);
		
		//Solution2
		Iterator<Integer> iterator1 = numbers.iterator();
		int sum1=0;
		for (int i = 0; i < numbers.size(); i++) {
			if(iterator1.hasNext()){
				sum1 = sum1 + iterator1.next();
			}
		
		}
		System.out.println(sum1);
		{
			
		}

	}

}
