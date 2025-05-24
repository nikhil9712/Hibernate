package Lectures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class may16a {
public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch", "root","9712");
	System.out.println("Connection done !!");
	
	Statement st=con.createStatement();
	System.out.println("Statement created !!");
	
/*	st.execute("create database Batch");
	System.out.println("database created !!");
	
	
	
	st.execute("create table student(id int,name varchar(20))");
	System.out.println("table created !!");
	
	
	st.addBatch("insert into student values(1,'Nikhil')");
	st.addBatch("insert into student values(2,'Sarang')");
	st.addBatch("insert into student values("Hello Everyone"); //wrong syntax still other squaries will excute except wrong Quary !!
	st.addBatch("insert into student values(3,'Harshal')");
	st.addBatch("insert into student values(4,'Gaurav')");
	
	
	st.execute("update student set name='Ramesh' where id=1");
	st.execute("update student set name='Suresh' where id=2");
	st.execute("update student set name='Jayesh' where id=3");
	st.execute("update student set name='Mangesh' where id=4");
	
	
	st.execute("delete from student where id=1");
	st.execute("delete from student where id=2");
	st.execute("delete from student where id=3");
	st.execute("delete from student where id=4"); */
	
	
	
	
	st.executeBatch();
	System.out.println("Batch executed successfully !!");
}
}
