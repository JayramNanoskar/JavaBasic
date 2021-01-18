package collection;

import java.util.Vector;

/**
 * Vector are mostly similar to ArrayList.
 * They are Dynamic array where we can increase size of an array.
 * Default capacity is 10 element. If size exceeds 10 then capacity gets doubled to approximate 20(by 100%)
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(25);
		v.add(5);
		v.add(19);
		v.add(8);
		
		System.out.println(v.capacity()); //10
		
		v.remove(2);
		
		System.out.println(v.size()); //3
		
		//iterating Vector using enhanced for loop
		for(int i : v) {
			System.out.println(i); //25 5 8
		}
	}

}
