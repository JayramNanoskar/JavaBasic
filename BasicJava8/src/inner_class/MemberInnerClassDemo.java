package inner_class;

/**
 * Inner Classes mainly of 3 type
 * 1. Member inner class
 * 2. Static inner class
 * 3. Anonymous inner class
 */

/**
 * After compilation of file, 3 .class files get generate for below LOC
 * A$B.class //means B belong to A
 * A.class 
 * MemberInnerClassDemo.class
 */
public class MemberInnerClassDemo {

	public static void main(String[] args) {
		A obj = new A();
		
		//accessing member variable below
		System.out.println(obj.i); //9
		obj.i = 5;
		System.out.println(obj.i); //5
		
		//accessing member class/member inner class below
		A.B obj1 = obj.new B();
		System.out.println(obj1.j); //0
		obj1.j = 8;
		System.out.println(obj1.j); //8
	}

}

class A{
	int i = 9; //member variable
	class B{ //member class - requires object to call
		int j; //member variable for B
	}
}
