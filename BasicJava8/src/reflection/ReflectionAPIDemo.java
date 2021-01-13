package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPIDemo {

	/**
	 * Reflection API
	 * Mainly used for debugging/testing purpose not mainly for development.
	 * It is used to know behavior, fields of a class and to know whether class file is interface/class etc.
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		Class c = Class.forName("reflection.Test"); //Getting class
		
		Test t = (Test)c.newInstance(); //Creating object
		
		Method m = c.getDeclaredMethod("show", null); //Getting method
		
		m.setAccessible(true); //Making method accessible
		m.invoke(t, null); //In show method //Calling method
		
		System.out.println(c.getSuperclass()); //class java.lang.Object
		System.out.println(c.isInterface()); //false
	}

}

class Test{
	private void show() { //Private method cannot be call from outside class but can be access using Reflection API
		System.out.println("In show method");
	}
}
