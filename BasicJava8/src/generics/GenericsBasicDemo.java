package generics;

import java.util.ArrayList;

public class GenericsBasicDemo {

	/**
	 * Generics -
	 * It achieves type safety.
	 * Type of variable we get to know at compile time only not at runtime.
	 * It is better to handle the error at compile time rather than at runtime.
	 * While working with generics we need to use wrapper classes not primitives.
	 * eg. public interface List<E> extends Collection<E> {...}
	 * Above 'E' is type of Element it can accept.
	 */
	
	public static void main(String[] args) {

		/**
		 * Using Custom Generics
		 */	
		Container<Integer> i = new Container<Integer>();
		i.value = 8;
		i.show(); //java.lang.Integer
		
		Container<String> s = new Container<String>();
		s.value = "Hello";
		s.show(); //java.lang.String

		Container<Double> d = new Container<Double>();
		d.value = 7.8;
		d.show(); //java.lang.Double
		System.out.println("---------------------------------");
		
		Box<Integer> bi = new Box<>(); //takes all classes which extends Number class
		bi.value = 5;
		bi.show(); //java.lang.Integer
		
		Box<Float> bf = new Box<>();
		bf.value = 5.8f;
		bf.show(); //java.lang.Float
		System.out.println("---------------------------------");
		
		Package<Number> p1 = new Package<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(56);
		al1.add(69);
		al1.add(42);
//		al1.add("C"); //Compile error
		p1.print(al1); //[56, 69, 42]
		System.out.println("---------------------------------");
		
		Package<Integer> p2 = new Package<>();
		ArrayList<Number> al2 = new ArrayList<>();
		al2.add(56);
		al2.add(69);
		al2.add(42);
//		al2.add("R"); //Compile error
		p2.log(al2); //[56, 69, 42]
		System.out.println("---------------------------------");
	}

}

/**
 * Creating Custom Generics
 */
class Container<T>{ //'T' would be class/type.
	
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}


class Box<T extends Number>{
	
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}


class Package<T extends Number>{
	
	T value;
	
	public void print(ArrayList<? extends T> al) { // ? means raw/any type
		System.out.println(al);
	}
	
	public void log(ArrayList<? super T> al) {
		System.out.println(al);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
