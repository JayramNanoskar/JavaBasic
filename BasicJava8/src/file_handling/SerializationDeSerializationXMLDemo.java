package file_handling;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationDeSerializationXMLDemo {

	
	public static void main(String[] args) throws FileNotFoundException {
		doXMLSerialization();
		doXMLDeSerialization();
	}

	// Serialization using XMLEncoder
	private static void doXMLSerialization() throws FileNotFoundException {
		
		System.out.println("Inside");
		Student s1 =  new Student();
		s1.setRollno(10);
		s1.setName("Ajay");
		Student s2 =  new Student();
		s2.setRollno(20);
		s2.setName("Vijay");
		
		ArrayList<Student> studs = new ArrayList<>();
		studs.add(s1);
		studs.add(s2);
		College c = new College();
		c.setStudents(studs);
		try{
			//Creates file if not exist
			XMLEncoder xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("E:\\Document\\XMLSerializationDemo.xml")));
			xe.writeObject(c);
			System.out.println("Written successful !!");
			xe.close(); //Closing resource
		}
		catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			System.out.println(e);
		}
	}

	// DeSerialization using XMLDecoder
	private static void doXMLDeSerialization() {
		try{
			XMLDecoder xe = new XMLDecoder(new BufferedInputStream(new FileInputStream("E:\\Document\\XMLSerializationDemo.xml")));
			College c = (College)xe.readObject();
			System.out.println("Read successful !! "+ c);
			List<Student> studs = c.getStudents();
			
			for(Student s:studs){
				System.out.println(s);
			}
		}
		catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
