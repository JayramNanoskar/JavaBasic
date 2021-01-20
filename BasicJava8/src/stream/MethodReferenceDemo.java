package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {

	/**
	 * Method references are special type of lambda expressions.
	 */
	public static void main(String[] args) {
		
		List<Integer> vals = Arrays.asList(3, 6, 1, 4, 9);
		MethodReferenceDemo mr = new MethodReferenceDemo();
		
		vals.forEach(System.out :: println); //using method reference

		System.out.println("Using lambda expression");
		vals.forEach((i) -> {squareIt(i);}); //using lambda expression(like arrow function in JS)
		vals.forEach((i) -> {mr.doubleIt(i);}); //using lambda expression(like arrow function in JS)
		
		System.out.println("Using method reference");
		vals.forEach(MethodReferenceDemo :: squareIt); //using method reference with static custom method
		vals.forEach(mr :: doubleIt); //using method reference with non-static custom method
	}

	public static void squareIt(int i) {
		System.out.println(i*i);
	}
	
	public void doubleIt(int i) {
		System.out.println(i*2);
	}
}
