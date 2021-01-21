package stream;
public class LambdaMethodReferenceUseCaseDemo {

	/**
	 * Use case
	 * input - any string  
	 * output - upper/lower case string based on length of string
	 */
	public static void main(String[] args) {
		
		String s = "Vatan";
		MyPrinter mp = new MyPrinter();
		
		/**
		 * Parser interface implementation using lambda expression
		 */
		mp.print(s, p -> StringParser.convert(p)); //passing input string and parser 
		
		
		/**
		 * Parser interface implementation using anonymous inner class
		 */
		Parser prsr = new Parser() { //anonymous inner class implementation
			@Override
			public String parse(String str) {
				return StringParser.convert(str); //calling convert function through implementation
			}
		};
		mp.print(s, prsr); //passing input string and parser implementation object
		
		
		/**
		 * Parser interface implementation using method reference
		 */
		mp.print(s, StringParser :: convert); //passing class name when method is static

		StringParser spar = new StringParser();
//		mp.print(s, spar :: convert); //we need to passing object when method is non-static
	}
}


/**
 * Giving implementation interface preferred over class because
 * class implementation becomes static and interface implementation we can change when needed.
 */
interface Parser{ //functional interface
	public String parse(String str); 
}


class StringParser{ //logic converting input to upper/lower case
	public static String convert(String s) {
		if(s.length() <= 3) {
			s = s.toUpperCase();
		}
		else {
			s = s.toLowerCase();
		}
		return s;
	}
}


class MyPrinter{
	public void print(String str, Parser p) { //taking implementation
		str = p.parse(str); //calling implementation - calling StringParser.convert() using parser implementation object
		System.out.println(str); //vatan
	}
}
