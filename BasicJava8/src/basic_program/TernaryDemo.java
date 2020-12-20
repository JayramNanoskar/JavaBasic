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
		
		Object obj1, obj2;
		obj1 = true? 1: "5";
		obj2 = true? 1: 5.0;
		System.out.println("Object 1: "+obj1); // 1
		System.out.println("Object 2: "+obj2); // 1.0 -because it check
		/**
		 * Ternary operator
		 * checks types also
		 * with same level i.e. All classes extending Number class(Integer and Float) but not with Integer and String
		 * and converts output to type of max size variable(Double here in case of obj2)
		 */

		System.out.println(obj1.getClass().getTypeName()); // java.lang.Integer
		System.out.println(obj2.getClass().getTypeName()); // java.lang.Double
	}

}
