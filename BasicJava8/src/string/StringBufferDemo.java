package string;
public class StringBufferDemo {

	/**
	 * Strings are immutable because
	 * Once we assign value to string variable and if we try to change, it will not replace old object instead 
	 * it will create new object
	 * In case if we want to change same object we can use StringBuffer /StringBuilder to make string mutable 
	 */
	public static void main(String[] args) {
		/**
		 * StringBuffer is
		 * Thread safe, synchronized
		 * Better to use in case application is going to use multiple threads
		 */
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(", you");
		sbf.append(" are");
		sbf.append(" welcome.");
		
		System.out.println(sbf); //Here, while printing an object - sbf.toString() get called if present else parent class toString() get called
								 //Hello, you are welcome.
	}

}
