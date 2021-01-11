package exception_handling;

import java.io.IOException;

public class ExceptionPropagationDemo {

	/**
	 * Only Unchecked/Runtime exceptions are propagated by default. 
	 * By default, Checked Exceptions are not forwarded in calling chain (propagated).
	 * Checked/Compile time exceptions need to throw else will give Compile Time Error.
	 */
	
	//UnChecked Exception propagation
	void method3() {
		int result = 12/0;
	}
	void method2() {
		method3();
	}
	
	void method1(){
		try {
		method2();
		System.out.println("UnChecked Exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("OK");
	}
	
	//Checked Exception propagation
	void method6() throws IOException { //Throwing exception to parent
		throw new IOException("IO Exception occured"); //Generating IO Exception
	}

	void method5() throws IOException {
		method6();
	}
	void method4() {
		try {
			method5();
			System.out.println("Checked Exception");
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("OK");
	}
	
	public static void main(String[] args) {
		ExceptionPropagationDemo epd = new ExceptionPropagationDemo();
		epd.method1(); //java.lang.ArithmeticException: / by zero
					   //OK
		epd.method4(); //java.io.IOException: IO Exception occured
					   //OK
	}

}
