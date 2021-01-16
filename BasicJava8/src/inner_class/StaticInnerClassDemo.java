package inner_class;

/**
 * After compilation of file, 3 .class files get generate for below LOC
 * C$D.class
 * C.class
 * StaticInnerClassDemo.class
 */
public class StaticInnerClassDemo {

	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.i); //0
		obj.i = 10;
		System.out.println(obj.i); //10
		
		System.out.println(obj.k); //0
		System.out.println(C.k); //0

		C.D obj1 = new C.D();	
		System.out.println(obj1.j); //0
		obj1.j = 34;
		System.out.println(obj1.j); //34
		
	}

}

class C{
	int i; //member variable
	static int k; //static member variable
	static class D{ //static member class - not requires object to call 
		int j; //member variable for D
	}
}
