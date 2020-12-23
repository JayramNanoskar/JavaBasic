package basic_oop;
public class ConstructorDemo{
	int a;
	static int b;
	int c;
	
	ConstructorDemo(int x, int y){
		a = x;
		b = y;
	}
	
	public static void main(String[] args) {
		int a = 0;
		System.out.println("---- Constructor ----");
		ConstructorDemo cd = new ConstructorDemo(6, 9); // Calling parameterized constructor
		System.out.println(a); // 0-> Printing local variable, need to initialize at the time of declaration
		System.out.println(cd.a); // 6-> Printing instance variable, setting value from parameterized constructor
		System.out.println(b); // 9-> Printing class variable, setting value from parameterized constructor
		System.out.println(cd.c);// 0-> Printing instance variable, setting value from default constructor(we can override default constructor)
	}

}
