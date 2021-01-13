package file_handling;

import java.io.Serializable;
import java.util.List;

public class College implements Serializable{

	private static final long serialVersionUID = -5343716923855892557L;
	private List<Student> students;
	
	
	public College() {
		super();
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Collage [students=" + students + "]";
	}

	

	


}
