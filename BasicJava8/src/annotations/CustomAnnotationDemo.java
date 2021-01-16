package annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotationDemo {

	/**
	 * Annotation can be on class, interface, method, variable, constructor.
	 * Annotation type are
	 * 1. Marker annotation(with zero fields)
	 * 2. Single value annotation
	 * 3. Multi value annotation
	 */
	public static void main(String[] args) {
		NokiaSeries obj = new NokiaSeries("Fire", 6); //Inside parameterized constructor
		System.out.println(obj.model); //Fire
		/**
		 * Fetching annotation value - using reflection api
		 */
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os()); //Android
		System.out.println(s.version()); //7
	}

}


/**
 * Creating custom annotation
 * Need to declare below metadata annotations also.
 */
@Inherited //Denotes annotation will be available to subclass also
@Documented //denotes annotation will be introducing in document
@Target(value = { ElementType.TYPE }) //denotes whether it will get apply on class level/interface level
@Retention(value = RetentionPolicy.RUNTIME) //denotes it will work till runtime
@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
}


/**
 * Applying custom annotation
 */
@SmartPhone(os = "Android", version = 7)
class NokiaSeries {
	String model;
	int size;
	public NokiaSeries(String model, int size) {
		System.out.println("Inside parameterized constructor");
		this.model = model;
		this.size = size;
	}
	
}
