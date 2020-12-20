package basic_program;
public class AsciiDemo {

	public static void main(String[] args) {
		
		/**
		 * Printing ASCII characters
		 * ASCII is a computer code which uses 128(0 to 127) different encoding combinations of a group of seven bits (2^7 = 128)
		 * to represent, characters A to Z, both upper and lower case. special characters, < . ? : etc
		 */
		for(int i = 0; i <= 127; i ++) {
			System.out.printf("%d : %c", i, i);
			System.out.println();
		}
	}

}
