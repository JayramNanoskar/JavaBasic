package basic_program;

// Using Javadoc style comments below (i.e. different than single and multi line comments)
/**
 * 
 * @author Jayram Subhash Nanoskar
 * 
 */
public class TernaryDemo {

	public static void main(String[] args) {
		int i = 21;
		int j = 11;
		/**
		 * Identifying even number/s
		 */
		
		System.out.println(":: Even number decider among "+i+ " and " +j+ "::");
		
		if(i%2 == 0 && j%2 == 0)
			System.out.printf("Both %d and %d are even", i, j); // Using printf function to print variables with specified format
		else if(i%2 == 0)
			System.out.println(i +"is even");
		else if(j%2 == 0)
			System.out.println(j +"is even");
		else
			System.out.println("Both "+i+" and "+j+" are not even");
	}

}
