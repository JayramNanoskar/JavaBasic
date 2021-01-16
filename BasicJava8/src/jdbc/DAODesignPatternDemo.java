package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * DAO(Data Access Object)
 * It is design pattern which separates the database interaction code into another class.
 * It also separate common connection establishment code.
 */
public class DAODesignPatternDemo {

	public static void main(String[] args) throws SQLException {
		StudentDAO sd = new StudentDAO();
		Connection con = sd.connect();
		System.out.println(con); //com.mysql.cj.jdbc.ConnectionImpl@7a5d012c
		List<Student> s1 = sd.getStudent(con);
		System.out.println("Fetched students : "+s1);
		for(Student s: s1) {
			System.out.println(s.getId()+"-"+s.getName()+"-"+s.getPlace());
		}
		
		String s2 = sd.updateStudent(13, con);
		System.out.println("Updated student : "+s2);
		
		String str1 = sd.deleteStudent(5, con);
		System.out.println("Deleted student status : "+str1);
		
		String str2 = sd.addStudent(con);
		System.out.println("Added student status : "+str2);
	}
	
}

//DAO class
class StudentDAO{

	public List<Student> getStudent(Connection con) throws SQLException {
		Statement st = null;
		ResultSet rs = null;
		st = con.createStatement();
		
		rs = st.executeQuery("select * from student");
		ArrayList<Student> studs= new ArrayList<Student>();
		System.out.println("Fetching students ...");
		while(rs.next()) {
			Student s = new Student();
			s.setId(rs.getInt("SID")); //filling POJO
			s.setName(rs.getString("SName"));
			s.setPlace(rs.getString("SPlace"));
			studs.add(s);
		}
//		StudentDAO.closeConnection(con, st, null, rs);
		return studs; //returning list of POJO
	}


	public static void closeConnection(Connection con, Statement st, PreparedStatement pst, ResultSet rs) throws SQLException {
		System.out.println("Closing Resources...");
		if(con != null) con.close();
		if(st != null) st.close();
		if(pst != null) pst.close();
		if(rs != null) rs.close();
		System.out.println("Resources Closed !!!");
	}


	public Connection connect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

	public String addStudent(Connection con) throws SQLException {
		Statement st = null;
		int rs = 0;
		st = con.createStatement();
		String status = "Unsuccessfully";
		
		rs = st.executeUpdate("insert into student values (14, 'Zara', 'Kolhapur')");
		System.out.println("Adding student ...");
		if(rs > 0) {
			status = "Successfully";
		}
		
		StudentDAO.closeConnection(con, st, null, null);
		return status;
	}

	public String deleteStudent(int id, Connection con) throws SQLException {
		Statement st = null;
		int rs = 0;
		st = con.createStatement();
		String status = "Unsuccessfully";
		
		rs = st.executeUpdate("delete from student where SID = "+id);
		ArrayList<Student> studs= new ArrayList<Student>();
		System.out.println("Deleting student ...");
		if(rs > 0) {
			status = "Successfully";
		}
//		StudentDAO.closeConnection(con, st, null, null);
		return status;
	}

	public String updateStudent(int id, Connection con) throws SQLException {
		Statement st = null;
		int rs = 0;
		st = con.createStatement();
		String status = "Unsuccessfully";
		String newVal = "Nagpur";

		rs = st.executeUpdate("update student set SPlace = '"+newVal+ "' where SID = "+id);

		System.out.println("Updating student ...");
		if(rs > 0) {
			status = "Successfully";
		}
//		StudentDAO.closeConnection(con, st, null, null);
		return status;
	}
	
}

//POJO
class Student{
	int id;
	String name;
	String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
	
}
