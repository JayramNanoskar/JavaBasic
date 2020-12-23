package miscellaneous;

import java.util.Random;
import static java.lang.System.out; // Using static import to avoid writing System word every time while printing

public class RandomValue {

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(50); // Providing range for random values 
		
		/**
		 * java.lang is default package in java
		 * So Need to import it explicitly
		 * But with static import, we can avoid writing System as
		 * to just out.println(a) to print
		 */
		out.println("Random Value = "+a);
		
		/**
		 * To get just declaration/structure(not exact code) of .class file, javap command can be used inside command prompt as
		 * javap RandomValue or javap java.lang.Object
		 */
	}

}
