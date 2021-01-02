package oop;
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student student = new Student();
		
		/**
		 * Setting values of private variables
		 */
		student.setName("Vijay");
		student.setRollNo(10);
		student.setAge(25);
		
		/**
		 * The field Student.name is not visible - Compilation error (below line)
		 * Direct access of private variable is not possible due to encapsulation as below line of code
		 * need to have public methods to access them
		 */
		//student.name;
		
		/**
		 * Getting values of private variables
		 */
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		student.getAge();
		
	}

}

//POJO
class Student{
	
	//Private variables declared
	//these can be accessed by public methods of class
	private String name;
	private int rollNo;
	private int age;
	
	//public method to access private variable
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
