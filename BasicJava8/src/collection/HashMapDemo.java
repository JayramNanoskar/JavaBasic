package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map interface supports key-value pairing data.
 */
public class HashMapDemo {

	/**
	 * HashMap - implementation of Map interface
	 * It is like Set of keys and List of values.
	 * HashMap has default capacity 16 elements and default load factor 0.75
	 * Load Factor is a measure, which decides when exactly to increase the HashMap capacity.
	 * For example As soon as 13th(75% = 12th) element(key-value pair) comes into HashMap, it increases its size to 32(get doubled).
	 */
	public static void main(String[] args) {
		/**
		 * HashMap doesn't give sequential output. It gives arbitrary(any ordering) output as it uses HashCode internally.
		 * LinkedHashMap gives sequential output.
		 * TreeMap gives sorted output in ascending order.
		 */
		
		/**
		 * HashMap VS HashTable
		 * HashMap came in JDK 1.2 & HashTable are there since JDK 1.0
		 * HashMap is non-synchronized & so not Thread-safe but HashTable is synchronized & Thread-safe.
		 * HashMap is fast but HashTable is slow.
		 * HashMap works with single thread but HashTable works with multiple threads.
		 * HashMap allows null key but HashTable don't allow any null key.
		 */
		Map<String, String> m = new HashMap<>();
		
		m.put("Name", "Vijay");
		m.put("CEO", "Jenifer");
		m.put("Actor", "Akshay");
		m.put("Actor", "Sunil");
		System.out.println(m.size()); //3
		
		
		Set<String> keys = m.keySet(); //getting all keys using Set
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key+" "+m.get(key));
		}
		
		
		Set<Map.Entry<String, String>> vals= m.entrySet(); //getting all entries //Entry is sub(nested) interface of Map
		System.out.println(vals); //[Actor=Sunil, CEO=Jenifer, Name=Vijay]
		
		for(Map.Entry<String, String> v: vals) {
			System.out.println(v);
		}
		
		
		Hashtable<String, String> ht= new Hashtable<>();
		ht.put("Name", "Vijay");
		ht.put("CEO", "Jenifer");
		ht.put("Actor", "Akshay");
		ht.put("Actor", "Sunil");
//		ht.put(null, "Sunil"); //java.lang.NullPointerException
		System.out.println(ht); //{Actor=Sunil, Name=Vijay, CEO=Jenifer}
	}

}
