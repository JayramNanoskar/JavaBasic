package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator Interface
 * It is functional interface with compare method
 * It is used to change the logic of sorting with collection
 */
public class ComparatorDemo {

	public static void main(String[] args) {
		
		/**
		 * We cannot create an object of an interface. So for implementation we can
		 * 1. use instance of external class implementing functional interface 
		 * 2. anonymous inner class/In line implementation for an interface
		 * 3. lambda expression with anonymous inner class/In line implementation for an interface(Saves memory & LOC)
		 */
		List<Integer> vals = new ArrayList<>();
		vals.add(457);
		vals.add(223);
		vals.add(892);
		vals.add(508);
		
		Comparator<Integer> com = new CompImpl();//Comparator implementation using CompImpl class
		Collections.sort(vals, com);//giving implementation/instance of comparator interface
		System.out.println(vals); //[892, 223, 457, 508]
		
		
		List<Integer> al = Arrays.asList(345, 563, 234, 697, 999);
		Comparator<Integer> co = new Comparator<Integer>() {//Comparator implementation using anonymous inner class
			public int compare(Integer o1, Integer o2) {
				return o1 % 10 > o2 % 10 ? 1:-1;
			}
		};
		
		al.sort(co);//giving implementation of comparator interface
		System.out.println(al); //[563, 234, 345, 697, 999]
		
		
		List<Integer> alist = Arrays.asList(756, 652, 879, 765, 491);
		Comparator<Integer> c = (a, b) -> {//Comparator implementation using anonymous inner class with lambda expression
			return a % 10 > b % 10 ? 1:-1; //ternary operator
		};
		
		alist.sort(c);//giving implementation of comparator interface
		System.out.println(alist); //[491, 652, 765, 756, 879]
		
	}

}

//Comparator implementation using another class
class CompImpl implements Comparator<Integer>{

	//logic to sort two numbers by their last digit
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 % 10 > o2 % 10)
			return 1; //swapping
		return -1; //not swapping
	}
	
}
