package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Data is an important in any application. It can be stored in any database.
 * Database can be Flat file system, RDBMS, NOSQL, Big data etc.
 * For Java application to RDBMS connectivity mainly 4 JDBC drivers are used.
 */
public class SimpleJDBCDemo {

	/**
	 * Let say we have database 'javadb' and table 'student'
	 * Table have 3 columns as SID, SName, SPlace with relevant data. 
	 */
	public static void main(String[] args) throws SQLException {
	
		/**
		 * Basic steps for JDBC Connectivity
		 * 1. Import the package
		 * 2. a) Load the driver
		 *    b) Register the driver
		 * 3. Establish the connection
		 * 4. Create the statement
		 * 5. Execute the query
		 * 6. Process the result
		 * 7. Close resources
		 */
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		/**
		 * Mainly Database Languages are
		 * 1. DDL(Data Definition Language) - Create, Alter, Drop, Truncate, Rename etc.
		 * 2. DML(Data Manipulation Language) - Select, Insert, Update, Delete etc.
		 * 3. DCL(Data Control Language) - Grant, Revoke etc.
		 * 4. TCL(Transaction Control Language) - Commit, Rollback, Savepoint etc.
		 */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //step 2.b & step 2.a is loading/adding relevant jar/driver
			
			//getConnection() is static method which gives an instance of Connection interface
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "root"); //step 3
			
			/**
			 * Mainly 3 types of statements
			 * 1. Simple statements - for basic 
			 * 2. Prepared statements - for dynamic queries/values
			 * 3. Collable statements - for stored procedure
			 */
			//createStatement() gives an instance of Statement interface
			st = con.createStatement(); //step 4
			
			//executeQuery() gives an instance of ResultSet interface
			rs = st.executeQuery("select * from student"); //step 5
			
			//rs.next() checks if we have row or not and shift the pointer accordingly
			while(rs.next()) { //step 6 
				System.out.println(rs.getInt("SID") +" - "+rs.getString("SName")+ " - "+ rs.getString("SPlace"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			rs.close();
			st.close();
			con.close();
		}
	}

}
