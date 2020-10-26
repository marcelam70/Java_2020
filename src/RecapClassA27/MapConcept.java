package RecapClassA27;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		//Key and values pairs
		//Like lookup table 
		//Retrieving a value by key is very fast
		//Iterating over map values is very slow
		
		//HashMap
		//LinkedHasMap
		//TreMap
		//HashTable
		
		//Keys are not in any particular order
		//Map<Integer,String> values = new HashMap<Integer,String>();
		
	//Keys remain in order added
		//Map<Integer,String> values = new LinkedHashMap<Integer,String>();
		
	//Keys sorted in natural	
	//	Map<Integer,String> values = new TreeMap<Integer,String>();
		
  //Order is not predictable 
		Map<Integer,String> values = new Hashtable<Integer,String>();
		
		
		values.put(20, "Johan");
		values.put(24, "Marco");
		values.put(7, "Dylan");
		values.put(5, "Jake");
		values.put(1, "Lucas");
		//values.put(26, "Marco");
		
		for(Integer key : values.keySet()){
			String value = values.get(key);
			System.out.println(key + " : " + value);
		}

	}

}









