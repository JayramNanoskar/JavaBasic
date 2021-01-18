package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithCustomTypeDemo {

	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1, 45));
		studs.add(new Student(2, 85));
		studs.add(new Student(3, 65));
		studs.add(new Student(4, 54));
		
		System.out.println(studs);
		Comparator<Student> comp =  new Comparator<Student>() {//Comparator implementation using anonymous inner class with custom type(Student)
			public int compare(Student s1, Student s2) { //sorting student according to marks in descending order
				return s1.getMarks() > s2.getMarks() ? -1: s1.getMarks() < s2.getMarks() ? 1:0;
			}
		};
		Collections.sort(studs, comp);//giving implementation of comparator interface
		System.out.println(studs);
		
		Collections.sort(studs, new Comparator<Student>() {//Comparator implementation using anonymous inner class & passing it as anonymous object(without creating reference)
			public int compare(Student s1, Student s2) { //sorting student according to marks in ascending order
				return s1.getMarks() > s2.getMarks() ? 1: s1.getMarks() < s2.getMarks() ? -1:0;
			}
		});
		System.out.println(studs);
		
	}

}

//Custom class
class Student{
	int rollno;
	int marks;
	public Student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
}
