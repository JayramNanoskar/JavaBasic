package oop;
public class AbstractionDemoInterface implements MyShow {

	/**
	 * Interface cannot have constructor. For instantiation need to have constructor.
	 * So interface  cannot be instantiated but we can create reference
	 * Interface provides tight coupling
	 * Interface addresses Diamond problem(i.e. Resolve ambiguity)
	 * Interface used to act as to support multiple inheritance functionality
	 * Interface has every method public abstract
	 * Interface Types
	 * 1. Marker Interface -> without any method
	 * 2. SAM(Single Abstract Method) Interface -> Functional interface since JDK 1.8
	 * 3. Normal Interface
	 */
	public static void main(String[] args) {
		AbstractionDemoInterface abi = new AbstractionDemoInterface();
		abi.show();
	}

	public void show() {
		System.out.println("Inside show");
	}

}

interface MyShow{
	void show();
}