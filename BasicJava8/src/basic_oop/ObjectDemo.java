package basic_oop;
public class ObjectDemo {
	
	static int a = 10; // class/static variable 
	int b; // instance variable 
	
	public static void main(String[] args) {
		
		int c = 5; // local variable 
		
		System.out.println("Inside main method");
		ObjectDemo od = new ObjectDemo(); // Creating Object/Instance of a class
		
		System.out.println(ObjectDemo.a); //10 -> Calling static variable
		System.out.println(od.b); //0 -> Calling instance variable
		System.out.println(c); //5 -> Calling local variable
		
		System.out.println("------ Using variable arguments -------");
		od.add(3, 7, 9); // 19
		od.add(3, 12, 67, 3); // 85
	}
	
	void add(int ...elements){ // Using Varargs(variable arguments)
		int addition = 0;
		for(int i: elements) {
			addition += i; // Using shorthand operator
		}
		System.out.println("Addition = "+ addition);
	}

}
