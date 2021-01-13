package file_handling;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 4420200503423455176L;
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
}
