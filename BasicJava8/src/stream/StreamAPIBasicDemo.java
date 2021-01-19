package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream API since Java 8 (java.util.stream)
 * Stream API consists of classes, interfaces and enum to supports functional-style operations on streams of elements.
 * Stream are designed like once value has been used, again you cannot reuse it.
 */
public class StreamAPIBasicDemo {

	/**
	 * Mainly types of stream - ParallelStream, Stream 
	 * For ParallelStream - we can use parallelStream()
	 * For Stream - we can use Stream()
	 */
	public static void main(String[] args) {
		/**
		 * Streams are not designed to preserved. It is just to process data.
		 * On other hand List can be preserved(reuse) as below.
		 * Stream API has lots of methods to process data.
		 * Stream Operations are mainly of type - Intermediate(Lazy Evaluation) Operations and Terminal(Eager evaluation) Operations
		 * Intermediate Operations - filter(), map() etc.
		 * Terminal Operations - forEach(), findFirst(), reduce() etc.
		 */
		List<Integer> values = Arrays.asList(2, 3, 6, 7, 1);
		System.out.println(values);
		
		
		//generating stream
		System.out.println("Sequential stream");
		Stream<Integer> s = values.stream();
		Stream<Integer> s1 = s;
		System.out.println(s); //java.util.stream.ReferencePipeline$Head@6d06d69c
		System.out.println(s1); //java.util.stream.ReferencePipeline$Head@6d06d69c
		System.out.println(s); //java.util.stream.ReferencePipeline$Head@6d06d69c
		
		/**
		 * Here below two lines, gets execute separate successfully but both together will fail as 'stream once used then cannot reuse' concept.
		 * s.forEach(System.out :: println); & s1.forEach(System.out :: println);
		 */
		s.forEach(System.out :: println); //using method reference
//		s1.forEach(System.out :: println); //using method reference
		
//		s.forEach(System.out :: println); // java.lang.IllegalStateException: stream has already been operated upon or closed
		
		
		/**
		 * Parallel Stream VS Sequential Stream
		 * Parallel Stream uses multiple core(i.e. threads) of computer but Sequential Stream uses single core.
		 * Parallel Stream performance is high related to Sequential Stream.
		 * Parallel Stream doesn’t care about the order but with Sequential Stream Order is maintained.
		 * 
		 */
		
		//generating parallel stream
		System.out.println("Parallel stream");
		Stream<Integer> st = values.parallelStream();
		System.out.println(st); //java.util.stream.ReferencePipeline$Head@3e3abc88
		st.forEach(System.out :: println); //with parallel stream, order is not maintained.
		
		System.out.println("Parallel stream to be ordered");
		values.parallelStream().forEachOrdered(System.out :: println);//using forEachOrdered() to maintained order
	}

}
