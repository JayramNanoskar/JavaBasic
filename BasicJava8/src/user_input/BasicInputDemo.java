package user_input;

import java.io.IOException;

public class BasicInputDemo {

	public static void main(String[] args) throws IOException {
		int i;
		String str = "";
		System.out.println("Please Enter String...");
		/**
		 *  Input :
		 * 	Hello everybody
			we all are delighted
			0to be here
		 */
		// System.in - taking input from keyboard/input devices
		while((i = System.in.read()) != 48) { // Storing value prior '0' encounters
			str += (char)i;
		}
		System.out.println("Entered String => "+str);
		/**
		 *  Output:
		 * 	Hello everybody
			we all are delighted
		 */
	}

}

