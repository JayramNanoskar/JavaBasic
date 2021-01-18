package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set interface supports only unique values, ignores duplicate.
 */
public class HashSetDemo {

	/**
	 * HashSet - Set interface implementation
	 * It doesn't guarantees sequential output because internally it uses HashMap i.e.Hashing/HashCode.
	 * It uses algorithm by which nearest value will get fetch first from heap memory.
	 */
	public static void main(String[] args) {
		Set<Integer> vals = new HashSet<>();
		vals.add(45);
		vals.add(87);
		vals.add(45);
		vals.add(71);
		vals.add(93);
		
		for(int v : vals) {
			System.out.println(v); //87 71 45 93
		}
		
		//TreeSet sorts data in ascending order by default.Internally it uses TreeMap.
		Set<Integer> values = new TreeSet<>();
		values.add(45);
		values.add(87);
		values.add(45);
		values.add(71);
		values.add(93);
		
		for(int v : values) {
			System.out.println(v); //45 71 87 93
		}
		
		//LinkedHashSet maintains insertion order. Internally it uses LinkedHashMap.
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(45);
		lhs.add(87);
		lhs.add(45);
		lhs.add(71);
		lhs.add(93);

		for(int l: lhs) {
			System.out.println(l); //45, 87, 71, 93
		}
	}

}
