package basic_program;
public class StatementDemo {

	public static void main(String[] args) {
		/**
		 * Find first pair whose sum is even
		 */
		int arr[] = {12, 45, 73, 24, 91, 66};
		
		outerloop : 
			for(int i = 0; i < 5; i ++) {
			innerloop : 
				for(int j = i+1; j < 5; j ++) {
				if((arr[i] + arr[j]) % 2 == 0) {
					System.out.println(arr[i]+" + "+arr[j]+ " = " +(arr[i] + arr[j]));
					break outerloop; // Using Labeled break here. Unlabeled 'break;'- breaks immediate loop only(single loop)
				}
			}
		}
		
		
		if(System.out.printf("Hi") == System.out.printf("Welcome")) {System.out.println(" Printing ");} // HiWelcome Printing- Here printf return PrintStream. Thus PrintStream == PrintStream satisfies if condition
		
		if(System.out.printf(getString()) == System.out.printf(getAnotherString())) {System.out.println(" Printing ");} // firstsecond Printing
		
		/**
		 * Print without using semicolon
		 */
		if(System.out.printf("Hello") != null) {}
					
	}
	
		static String getString() {return "first";};
		static String getAnotherString() {return "second";};
}
