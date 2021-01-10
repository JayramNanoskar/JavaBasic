package user_input;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/**
		 * Scanner provides multiple methods. So, avoids conversion required like in BufferedReader
		 * Internally, advanced classes like Scanner and BufferedReader uses System.in.read() only
		 */
		
		// next() - reads the input only till the space
		// nextLine() - reads input till the end of line \n 
		
		System.out.println("Plase enter string..."); //Hello, you are welcome.
		String str1 = sc.next();
		String str2 = sc.nextLine();
		System.out.println("Entered string1 => "+str1); //Hello,
		System.out.println("Entered string2 => "+str2); //you are welcome
		
		System.out.println("Plase enter string..."); //Hello, you are welcome. //Ok
		String str3 = sc.nextLine();
		String str4 = sc.next();
		System.out.println("Entered string3 => "+str3); //Hello, you are welcome.
		System.out.println("Entered string4 => "+str4); //Ok
		
		System.out.println("Plase enter number...");//34
		int num = sc.nextInt();
		System.out.println("Entered number =>"+num); //34
		sc.close(); //Closing resource
	}

}

