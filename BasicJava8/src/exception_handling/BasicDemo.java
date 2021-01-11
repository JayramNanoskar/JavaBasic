package exception_handling;
public class BasicDemo {

	/**
	 * Exception - Checked/Compiled time and Unchecked/Run time
	 * Exception handling- means handling critical statements
	 * using  Try.Catch.Finally.
	 * After handling, execution of program will flow normal way, won't be stop abruptly.
	 */
	public static void main(String[] args) {
		int result = 0;
		/**
		 * One try catch can have multiple catch block(at least one) and/or single finally block
		 * Catch block order must be in ascending order of scope else give compile time error
		 */
		try {
			result = 100/0;
		}
		catch(ArithmeticException ae) { // Narrow scope
			System.out.println(ae);
		}
		catch(Exception e) { // Broader scope 
			System.out.println(e);
		}
		finally {
			System.out.println("Always execute.");
		}
		
		System.out.println("Result : "+result); //0
	}

}
