package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Intermediate(Lazy Evaluation) Operations - filter(), map() etc. returns stream(like java.util.stream.ReferencePipeline$Head@6d06d69c)
 * Terminal(Eager evaluation) Operations - forEach(), findFirst(), reduce() etc. does not returns stream.
 */
public class Stream_FilterReduceFunctionDemo {

	/**
	 * Passing instance of Functional interface, has many way to do it
	 * 1. By creating new class which implements required Functional interface & passing instance of that newly created class.
	 * 2. By creating anonymous inner class/in line implementation for required Functional interface.
	 * 3. By creating lambda expression [It is most effective as it saves memory(.class file won't be created) & LOC.]
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(3, 6, 8, 15, 5);
		
		int result = 0;
		for(int v : values) { //logic for sum of numbers divisible by 5
			if(v%5 == 0)
				result += v;
		}
		System.out.println(result); //20
		
		System.out.println("Using stream API");
		System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0, (c,e) -> c+e)); //20
		System.out.println(values.stream().filter(i -> i%5 == 0)); //java.util.stream.ReferencePipeline$2@53d8d10a
		System.out.println(values.parallelStream()); //java.util.stream.ReferencePipeline$Head@e9e54c2 - here using parallelStream means multiple core get used.

		
		Predicate<Integer> p = new Predicate<Integer>() {//giving in line implementation(using anonymous inner class) for Predicate interface
			@Override
			public boolean test(Integer t) {
				return t % 5 == 0;
			}
		};

		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		
		/**
		 * Using anonymous inner class/inline implementation
		 */
		Stream<Integer> s = values.stream();
		Stream<Integer> s1 = s.filter(p);//passing instance(implementation) of Predicate interface 
		Integer r = s1.reduce(0, b);//passing instance(implementation) of BinaryOperator interface 
		System.out.println(r); //20
		
		
		/**
		 * Using new external class implementation
		 */
		Stream<Integer> s2 = values.stream();
		Stream<Integer> s3 = s2.filter(new Pimpl()); //passing anonymous object means without creating actual reference
		Integer r1 = s3.reduce(0, new Bimp());
		System.out.println(r1); //20
		
		
		/**
		 * Using lambda expression
		 */
		System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0, (c,e) -> c+e)); //20
		System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0, (c,e) -> Integer.sum(c, e))); //20 //using static method sum() of Integer class
		System.out.println(values.stream().filter(i -> i%5 == 0).reduce(0, Integer :: sum)); //20 //using method reference with static method sum() of Integer class
		//Among all above 3 LOC, reduce(0, (c,e) -> c+e) is most efficient.
	}

}

class Pimpl implements Predicate<Integer>{//giving external implementation(using another class) for Predicate interface

	@Override
	public boolean test(Integer t) {
		return t%5 == 0;
	}
	
}

class Bimp implements BinaryOperator<Integer>{//giving external implementation(using another class) for BinaryOperator interface

	@Override
	public Integer apply(Integer t, Integer u) {
		return t+u;
	}
	
}
