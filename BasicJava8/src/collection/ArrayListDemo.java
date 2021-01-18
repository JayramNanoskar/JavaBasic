package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * List interface extends Collection interface and has an extra features than Collection interface.
 * List interface has many class implementation like ArrayList, Vector, LinkedList.  
 */
public class ArrayListDemo {

	/*
	 * ArrayList has initial capacity 10 and increases by 50%(to approximate 15), so on.
	 */
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(99);
		values.add(56);
		values.add(38);
		values.add(11);
		
		Collections.sort(values); //using sort method of Collections class
		System.out.println(values); //11, 38, 56, 99

		//iterating ArrayList using enhanced for loop
		for(int i: values) {
			System.out.println(i);
		}
		
		//iterating ArrayList using for_each loop
		values.forEach(i -> System.out.println(i)); //Iterating using for_each with lambda expression(same as Arrow function in JS)
		
		
		/**
		 * LinkedList does not allocate memory to the items before the items are added to the list.
		 * So LinkedList does not have 'capacity'.
		 */
		LinkedList<String> llst = new LinkedList<>();
		llst.add("A");
		llst.add("B");
		llst.add("C");
		llst.add("D");
		llst.add("E");
		
		System.out.println(llst); //[A, B, C, D, E]
		llst.remove(3);
		llst.addFirst("Z");
		llst.add(3, "x");
		System.out.println(llst); //[Z, A, B, x, C, E]
		System.out.println(llst.size()); //6
	}

	/**
	 * ArrayList VS Vector
	 * Theoretically, Vector are thread safe(methods are synchronized). So they are slow but ArrayList not thread safe, they are fast.
	 * Vector increases size by 100% but ArrayList by 50%. So, not wastage of memory in ArrayList. 
	 */
	
	/**
	 * ArrayList VS LinkedList
	 * ArrayList follows concept of Dynamic array and LinkedList follows concept of Double LinkedList.
	 * O(...) i.e. Big O notation denotes time complexity. Adding/Removing an element in ArrayList is time consuming because need to shift all the elements with index.
	 * It is better to use LinkedList while adding/removing an elements in between(only those 2 nodes will shift the references).
	 * LinkedList is not preferable while accessing an elements. Element access is easy in ArrayList because of index.
	 */
}
