package oop;
public class AbstractionDemoAbstractClass {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		Iphone ip = new Iphone();
		show(ip); //2GB, IOS 9.4
		show(sam); //2GB, Lolipop
	}

	public static void show(Phone phone) { //Reference of parent can accept object of an child
		phone.showConfig();
	}
}

/**
 * Abstract class has at least one abstract method and any number of(0-N) non-abstract(concrete) methods
 * Cannot create object of an abstract class only concrete class object can be created(i.e. Need to have a constructor for instantiation) 
 * Abstract method can be declared not defined, class implementing that abstract class have to provide implementation
 */
abstract class Phone{
	public abstract void showConfig();
}

class Samsung extends Phone{

	public void showConfig() {
		System.out.println("2GB, Lolipop");
	}
	
}

class Iphone extends Phone{
	
	public void showConfig() {
		System.out.println("2GB, IOS 9.4");
	}
}