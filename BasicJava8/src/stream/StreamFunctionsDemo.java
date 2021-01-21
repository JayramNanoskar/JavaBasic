package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Intermediate(Lazy Evaluation) Operations - filter(), map() etc. returns stream(like java.util.stream.ReferencePipeline$Head@6d06d69c)
 * Terminal(Eager evaluation) Operations - forEach(), findFirst(), reduce() etc. does not returns stream.
 */
public class StreamFunctionsDemo {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(12, 34, 35, 65, 98);
		int result = 0;
		
		for(int i : values){ //logic to find first element divisible by 5 and return it multiplying by 2
			if(i % 5 == 0)
			{
				result = i*2;
				break;
			}
		}
		
		System.out.println(result); //70
		
		
		//convenient way to write functions, one below another for better readability
		System.out.println(values.stream()  
								 .filter(i -> i%5 == 0) //using lambda function
								 .map(i -> i*2)
								 .findFirst()
								 .orElse(0)); //70
		
		/**
		 * As we know filter, map method does lazy evaluation.
		 * So As soon as they get first matching element they forward that result further while keep continuing work on another elements.
		 * and findFirst method does eager evaluation allows the stream to short-circuit.
		 */
		System.out.println(values.stream() 
							     .filter(StreamFunctionsDemo :: isDivisible) //using method reference 
							     .map(new StreamFunctionsDemo() ::mapDouble) 
							     .findFirst()); //Optional[70] //if not any match then it will show as 'Optional.empty'//So helps to reduce bug in code
						
		System.out.println(values.stream() 
							     .filter(StreamFunctionsDemo :: isDivisible) //using method reference
							     .map(new StreamFunctionsDemo() ::mapDouble)
							     .findFirst()
							     .orElse(0)); //70 //if not any match then it will show as 0'
		/**
		 * For immediate above LOC output would be
		 * In isDivisible 12
		 * In isDivisible 34
		 * In isDivisible 35
		 * In mapDouble 35
		 * 70
		 * As soon as filter() gets first match it forward it to map()
		 * So in Functional Programming(FP), one functions result get pass to next function and so on.
		 * Hence stream API is fast, efficient because of lazy evaluation.
		 */
	}
	
	public static boolean isDivisible(int i) {
		System.out.println("In isDivisible "+ i);
		return i%5 == 0;
	}

	public int mapDouble(int i) {
		System.out.println("In mapDouble "+ i);
		return i*2;
	}
	
}
