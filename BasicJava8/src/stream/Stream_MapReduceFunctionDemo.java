package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream_MapReduceFunctionDemo {

	public static void main(String[] args) {
		/**
		 * Intermediate(Lazy Evaluation) Operations - filter(), map() etc. returns stream(like java.util.stream.ReferencePipeline$Head@6d06d69c)
		 * Terminal(Eager evaluation) Operations - forEach(), findFirst(), reduce() etc. does not returns stream.
		 */
		List<Integer> vals = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int result = 0;
		for(int i : vals) { //logic for sum of each numbers after multiply by 2
			result += i*2;
		}
		System.out.println(result); //42
		/*
		 * Above LOC is achieving mutation means value of result is changing continuously. So it's difficult to achieve concurrency.
		 * Hence to make system work fast, to reduce mutation, to achieve concurrency we can use stream API as below.
		 */
		System.out.println("Using stream API");
		
		/**
		 * Passing instance of Functional interface, has many way to do it
		 * 1. By creating new class which implements required Functional interface & passing instance of that newly created class.
		 * 2. By creating anonymous inner class/inline implementation for required Functional interface.
		 * 3. By creating lambda expression [It is most effective as it saves memory(.class file won't be created) & LOC.]
		 */
		
		//stream() is default method in collection interface.
		System.out.println(vals.stream()); //java.util.stream.ReferencePipeline$Head@6d06d69c
		
		System.out.println(vals.stream().map(i -> i*2).reduce(0, (c,e) -> c+e)); //42
		System.out.println(vals.stream().map(i -> i*2)); //java.util.stream.ReferencePipeline$3@53d8d10a
		
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() { //giving in line implementation(using anonymous inner class) for Function interface
			public Integer apply(Integer i) { //accepting Integer input & returning Integer output
				return i*2;
			}

		};
		
		
		Function<Integer, Integer> f1 = new Fimpl();
		
		Stream<Integer> s = numbers.stream(); //Returns a sequential Stream
	
		Stream<Integer> s1 = s.map(f); //passing instance(implementation) of Function interface 
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() { //giving in line implementation(using anonymous inner class) for BinaryOperator interface

			public Integer apply(Integer a, Integer b) {
				return a+b;
			}
		};
		
		BinaryOperator<Integer> b1 = new Bimpl();
		
		Stream<Integer> s2 = s1;
		
		System.out.println(s1); //java.util.stream.ReferencePipeline$3@e9e54c2
		System.out.println(s2); //java.util.stream.ReferencePipeline$3@e9e54c2
		
		Integer r = (Integer) s1.reduce(0, b); //passing BinaryOperator interface instance(implementation here)
//		Integer r1 = (Integer) s2.reduce(0, b1);// java.lang.IllegalStateException: stream has already been operated upon or closed -> because stream s1 & s2 are same and stream once used, cannot reuse.
		
		System.out.println(r); //42
	}

}


class Fimpl implements Function<Integer, Integer>{ //giving external implementation(using another class) for Function interface

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}
}

class Bimpl implements BinaryOperator<Integer>{ //giving external implementation(using another class) for BinaryOperator interface
	@Override
	public Integer apply(Integer a, Integer b) {
		return a+b;
	}
}
