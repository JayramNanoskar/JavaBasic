package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable Interface
 * It is functional interface having compareTo method
 * It is used to change the logic of sorting with collection
 * For comparing we need two objects like in case of Comparator interface
 * But with Comparable we need only single object, other object will be getting from instance  of that class itself.
 * For sorting, classes need to implement Comparable interface. Even String, Integer also implements the same.
 */
public class ComparableDemo {

	/**
	 * When to use Comparable & Comparator interface
	 * Better to use Comparable when we have custom class(like Employee here)
	 * Better to use Comparator when we have in-built class where we can't change definition. 
	 */
	public static void main(String[] args) {
		List<Employee> emps =  new ArrayList<>();
		emps.add(new Employee(1, 10000));
		emps.add(new Employee(2, 12000));
		emps.add(new Employee(3, 9000));
		emps.add(new Employee(4, 8000));
		System.out.println(emps);
		Collections.sort(emps); //Here sort method doesn't need to take an extra effort to define logic. Employee class will handle it.
		System.out.println(emps);
	}

}


class Employee implements Comparable<Employee>{ //class need to implement Comparable interface
	int empid;
	int empsal;
	
	@Override
	public int compareTo(Employee e) { //logic to sort in descending order
		return this.empsal > e.empsal ? -1:this.empsal < e.empsal ? 1:0;
	}

	public Employee(int empid, int empsal) {
		super();
		this.empid = empid;
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empsal=" + empsal + "]";
	}
	
}
