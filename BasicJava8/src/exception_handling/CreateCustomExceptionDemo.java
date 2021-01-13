package exception_handling;

import java.util.Scanner;

public class CreateCustomExceptionDemo {

	public static void main(String[] args) {
		
		int internalMark = 10, paperMark = 0, totalMark = 0;
		System.out.println("Please enter your theory paper mark out of 80: ");
		Scanner sc = new Scanner(System.in);
		paperMark = sc.nextInt();
		try {
			totalMark = internalMark + paperMark;
			if(totalMark < 40) {
				System.out.println("You are Failed.");
			}
			else if(totalMark >= 40 && totalMark < 100) {
				System.out.println("You are Passed.");
			}
			else {
				throw new MyException("Please enter proper marks !!"); //Throwing custom exception
			}
		}
		catch(Exception e) { //Catching custom exception
			System.out.println("Something went wrong...");
			System.out.println(e); //exception_handling.MyException: Please enter proper marks !!
		}
	}

}

/**
 * While creating custom exception, class must extend any Exception class
 */
class MyException extends Exception{ //Creating custom exception
	
	public MyException(String msg) {
		super(msg); //Calling Exception class constructor
	}
}
