package annotations;

import java.util.ArrayList;

public class AnnotationBasicDemo {

	/**
	 * Annotation-
	 * It is an interface belongs to java.lang package
	 * Used in configuration like we do with xml. Mostly used in advanced framework like Hibernate, Spring etc.
	 * Nowadays annotation preferred over other type of configuration because it shows the error/mistake compile time, also let the developer understand others code easily.
	 */
	public static void main(String[] args) {
		B obj = new B();
		obj.show(); //In B
		obj.display(); //Old method
	}

}

class A{
	public void show() {
		System.out.println("In A");
	}
}

class B extends A{
	
	@Deprecated //Denotes current method is not in use much
	public void display() {
		System.out.println("Old method");
	}
	
	@SuppressWarnings("rawtypes") //Ignores warning
	@Override //Denotes current method is overrode from parent class
	public void show() {
		@SuppressWarnings("unused")
		ArrayList obj = new ArrayList<>();
		System.out.println("In B");
	}
}

@FunctionalInterface //Denotes interface will have Single Abstract Method(SAM) 
interface Xyz{
	void print();
}
