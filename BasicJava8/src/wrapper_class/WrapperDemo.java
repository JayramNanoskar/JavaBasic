package wrapper_class;

import java.util.ArrayList;

public class WrapperDemo {

	/**
	 * Java is not purely object oriented because of primitive data type used.(int, double, char etc.)
	 * But we can make our code fully object oriented by using wrapper classes instead of primitives.(Integer, Double, Character etc.)
	 * Speed will degrade if we use wrapper classes in loops instead of primitives but still we can use to achieve 100% object oriented structure.
	 * Wrapper classes mainly used in collections/ advanced framework
	 */
	public static void main(String[] args) {
		/**
		 * Boxing - putting primitive value inside an object
		 * AutoBoxing - implicit Boxing
		 */
		
		int i = 5; // Primitive
		Integer m = new Integer(i); // Boxing // Creating wrapper class object
		Integer n = i; // AutoBoxing
		System.out.println(m); //5
		System.out.println(n); //5
		
		/**
		 * UnBoxing - getting primitive value from an object
		 * AutoUnBoxing - implicit UnBoxing
		 */
		
		int a = m.intValue(); //UnBoxing
		int b = m; //AutoUnBoxing
		System.out.println(a); //5
		System.out.println(b); //5
		
		//Wrapper classes in collections
		ArrayList<Integer> vals = new ArrayList<>(); // Here, needs Wrapper classes only
		vals.add(3); //AutoBoxing
		vals.add(6);
		vals.add(4);
		
		System.out.println(vals.get(1)); //AutoUnBoxing //6
	}

}
