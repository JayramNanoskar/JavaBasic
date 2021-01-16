package inner_class;

/*
 * Code below, we are creating SmartPhone class just to override method of base class.
 * Instead we can use Anonymous inner class
 */
public class WithoutAnonymousInnerClassDemo {

	public static void main(String[] args) {
		Phone obj = new SmartPhone(); //creating child object and assigning to parent reference
		obj.show(); //Call, SMS, Camera //child method will get called
	}

}

class Phone{
	public void show() {
		System.out.println("Call");
 }
}

class SmartPhone extends Phone{ //Inheritance
	public void show() { //Polymorphism - method overriding of base class
		System.out.println("Call, SMS, Camera");
	}
}
