package stream;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	/**
	 * The Iterable interface was introduced in JDK 1.5 in package java.lang & List interface since JDK 1.2 in package java.util
	 * But forEach method we can use with List for iteration purpose
	 * Because forEach is default method belong to Iterable interface & 
	 * Collection interface extends Iterable interface & List interface extends Collection interface. So ultimate forEach gets available to List.
	 */
	public static void main(String[] args) {
		
		List<Integer> vals = Arrays.asList(3, 6, 1, 4, 9);
		
		System.out.println("Iterating with Lambda expression");
		vals.forEach((i) -> {System.out.println(i);}); //using Lambda expression
		
		/**
		 * System - class
		 * out - static object of PrintStream class
		 * println - method of PrintStream class
		 */
		System.out.println("Iterating with Method references");
		vals.forEach(System.out :: println); //Method references are special type of lambda expressions
		//In above LOC we are passing method as an parameter. So it's like call by method.
		
		vals.forEach(ForEachDemo :: doubleIt);//Method references with custom function
	}

	public static void doubleIt(int i) {
		System.out.println(i*2);
	}
}
