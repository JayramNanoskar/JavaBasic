package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * Since JDK 1.8 Java supports Functional Programming(FP)
 * FP says, don't focus on how to do thing, just focus on what to do, remaining part will be handled by stream API.
 */
public class StreamInternalIterationDemo {

	public static void main(String[] args) {
		/**
		 * External iteration & Internal iteration
		 * External iteration are simple for loop, iterator, enhanced for loop.
		 * Internal/In line iteration is for_each loop.
		 */
		List<Integer> vals = Arrays.asList(3, 5, 2, 1, 8);
		System.out.println(vals);
		
		//iterating collection for loop 
		System.out.println("for loop iteration");
		for(int i = 0; i <vals.size(); i++) {
			System.out.println(vals.get(i));
		}
		
		//iterating collection using iterator 
		Iterator<Integer> itr = vals.iterator();
		System.out.println("iterator iteration");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//iterating collection using enhanced for loop
		System.out.println("enhanced for loop iteration");
		for(int val : vals) {
			System.out.println(val);
		}
		
		//iterating collection using for_each loop
		System.out.println("for_each loop iteration");
		vals.forEach((i) -> {System.out.println(i);});
		/**
		 * In above LOC, 'vals' is like producer & forEach method argument is like consumer.
		 * ForEach takes implementation for accept() of Consumer interface.
		 * So providing in line implementation using anonymous inner class with lambda expression.
		 */
	}

}
