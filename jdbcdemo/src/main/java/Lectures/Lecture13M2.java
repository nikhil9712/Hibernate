package Lectures;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
public class Lecture13M2 {
public static void main(String[] args) throws SQLException 
{
	
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/voters", "root","9712");
     System.out.println("Connection successful");
     
     Statement st=con.createStatement();
     System.out.println("Statement created !!");
     
    /* st.execute("create database voters");
     System.out.println("database created");
     
     st.execute("create table olders(id int,name varchar(20),age int)");
     System.out.println("Table created");
     
     st.execute("insert into olders values(1,'Ajay',60)");
     st.execute("insert into olders values(2,'Vijay',65)");
     st.execute("insert into olders values(3,'Ramesh',70)");
     st.execute("insert into olders values(4,'Suresh',75)");
     st.execute("insert into olders values(5,'Mangesh',80)");
     
     System.out.println("voter added in the table");*/
    
     ResultSet rs=st.executeQuery("select * from olders");
     
     while(rs.next())
     {
    	System.out.println(rs.getInt(1));
    	System.out.println(rs.getString(2));
    	System.out.println(rs.getString(3));
    	System.out.println("============");
     }
     
     st.execute("delete from olders where id=5");
     
     st.execute("update olders set name='kiran' where name='ramesh'");
     
     
    		 
}
}
