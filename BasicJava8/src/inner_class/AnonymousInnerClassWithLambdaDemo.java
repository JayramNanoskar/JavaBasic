package inner_class;

/**
 * After compilation of file, 2 .class files get generate for below LOC
 * CellPhone.class
 * AnonymousInnerClassWithLambdaDemo.class
 */
 
public class AnonymousInnerClassWithLambdaDemo {

	/**
	 * By using lambda expression
	 * For anonymous inner class there won't be any .class file so memory saves,
	 * LOC saves by removing boilerplate code.
	 * Lambda expressions only works with Functional interface(having Single Abstract Method)
	 */
	public static void main(String[] args) {
		CellPhone cp = () -> {
				System.out.println("Call, SMS, Camera");
		};
		
		cp.show(); //Call, SMS, Camera
	}

}

//Functional interface
interface CellPhone{
	void show();
}
