package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionBasicDemo {

	public static void main(String[] args) {
		/*
		 * Using simple Object array we can have different type of data together but of fixed size and even memory can be waste.
		 * So to have Dynamic size of data, we can use collection API from java.util package.
		 * They are grow-able in size.
		 * Collections is class & Collection is an interface.
		 */
		Object[] values = new Object[4];
		values[0] = "john";
		values[1] = 90.8;
		values[2] = 1000;
		/**
		 * Output for below LOC:
		 * john
		 * 90.8
		 * 1000
		 * null
		 */
		for(Object v : values) {
			System.out.println(v);
		}
		
		//Using collection API
		Collection<Integer> vals = new ArrayList<Integer>(); //Using Collection interface
		vals.add(94);
		vals.add(78);
		vals.add(38);
		vals.add(42);
		System.out.println("Max is = "+Collections.max(vals)); //Using Collections class
		
		//Iterating using iterator
		Iterator<Integer> itr = vals.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Iterating using enhanced-for loop
		for(int v : vals) { //Happening AutoUnBoxing
			System.out.println(v);
		}
	}

}
