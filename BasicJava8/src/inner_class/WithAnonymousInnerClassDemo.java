package inner_class;

/**
 * After compilation of file, 3 .class files get generate for below LOC
 * Mobile.class
 * WithAnonymousInnerClassDemo$1.class
 * WithAnonymousInnerClassDemo.class
 */
public class WithAnonymousInnerClassDemo {

	/**
	 * Here we do not need default implementation so instead creating another separate class we are just creating anonymous inner class.
	 */
	public static void main(String[] args) {
		Mobile m = new Mobile() { //Reference can be of type class or an interface
			public void show() {
				System.out.println("Call, SMS, Camera");
			}
		};
		
		m.show(); //Call, SMS, Camera
	}

}

class Mobile{
	public void show() {
		System.out.println("Call");
	}
	
	public void info() {
		System.out.println("This is Gadget");
	}
}
