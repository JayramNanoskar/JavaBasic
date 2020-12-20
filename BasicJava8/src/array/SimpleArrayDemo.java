package array;
public class SimpleArrayDemo {

	public static void main(String[] args) {
		/**
		 * 1D Array
		 */
		int vals[] = {7, 1, 23, 16, 9};
		
		System.out.println(vals); // Print object's Hashcode i.e. Internally Parent class(Object class) toString() method gets called.
		
		/**
		 * Iterating using for loop
		 * Keep index record
		 * Can be used for specific iteration
		 */
		for(int i = 0; i < vals.length; i++) {
			System.out.println(vals[i]);
		}
		
		/**
		 * Iterating using enhanced for loop
		 * Doesn't keep index record.
		 * Iterates all values
		 */
		for(int i: vals) {
			System.out.println(i);
		}
		
	}

}
