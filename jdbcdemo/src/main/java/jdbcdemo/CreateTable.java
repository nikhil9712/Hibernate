package jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran","root","9712");
		System.out.println("connection done");
		
		Statement st=con.createStatement();
		System.out.println("statement created");
		
		
		
	//	st.execute("create database Kiran");
	//	System.out.println("Database created !!");
		
	//	st.execute("create table rommies(id int,name varchar(20),age int)");
	//	System.out.println("table created !!");
		
	//	System.out.println(st.execute("insert into rommies values(200,'kiran',24)"));
	//	System.out.println("value Inserted !!");
		
	//	st.execute("update rommies set id=500 where id=200");
	//	System.out.println("value updated !!");
		
	//	st.execute("delete from rommies where id=500");
	//	System.out.println("row deleted !!");
		
	//	System.out.println(st.execute("delete from rommies where id=100"));
		//	System.out.println("row deleted !!");.
		
	//	boolean ans=st.execute("insert into rommies values(500,'kiran',24)");
		//System.out.println(ans);
		
		int a=st.executeUpdate("insert into rommies values(5000,'kiran',24)");
		System.out.println("value insertde ");
		System.out.println(a);
	}
	
}























