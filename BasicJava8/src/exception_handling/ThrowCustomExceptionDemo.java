package exception_handling;

import java.util.Scanner;

public class ThrowCustomExceptionDemo {

	public static void main(String[] args) {
		
		int internalMark = 10, paperMark = 0, totalMark = 0;
		System.out.println("Please enter your theory paper mark out of 80 : ");//25
		Scanner sc = new Scanner(System.in);
		paperMark = sc.nextInt();
		try {
			totalMark = internalMark + paperMark;
			if(totalMark < 40) {
				/**
				 * Even though here, it is not ArithmeticException, we are generating it as a customize way
				 * and passing desired exception message.
				 */
				throw new ArithmeticException("Passing marks must be atleast 40");
			}
		}
		catch(ArithmeticException ae) {
			System.out.println(ae); //java.lang.ArithmeticException: Passing marks must be atleast 40
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done.");
		}
	}

}
