package oop;
public class DiamondProblemDemo extends A implements I, J{ //Firstly we need to extends class then we can implement interfaces, reverse in not allowed(In case of using both type of inheritance)

	public static void main(String[] args) {
		DiamondProblemDemo dpd = new DiamondProblemDemo();
		dpd.show(); //Show in main class - prior extending class A
					//Show in A - after extending class A and without show() in DiamondProblemDemo class
		/**
		 * Class normal method will have high priority than interface default methods[3rd rule in Java]
		 */
	}

	/**
	 * Multiple inheritance is not supported(Because of Diamond problem- using extending classes has ambiguity to call common methods) 
	 * So we can achieved same functionality using interfaces
	 * If more than one interface has same method implementation then child class must give another implementation for that method
	 */
	public void show(){
		System.out.println("Show in main class");
	}
}

interface I{
	default void show(){
		System.out.println("Show in I");
	}
}

interface J{
	default void show(){
		System.out.println("Show in J");
	}
}

class A{
	public void show(){
		System.out.println("Show in A");
	}
}
