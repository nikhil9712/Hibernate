package Lectures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Connections 
{
 public static void main(String[] args) throws SQLException  {
	
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root","9712");
	 System.out.println("connection Established successfully");
	 
	Statement st=con.createStatement(); //create statement inside the connection interface !!
	System.out.println("statement created successfully !!");
	//we create statement to send our requirement to the database
	//we used create statement query in mysql workbench t create table in database we can do the same work without
	//using mysql workbench by .....
	//
	
	
	   
	/* 3.Create Statement
	 *  Note 2: we create statement to carry our requirement to the database
	 * In jdbc create statement isi meant to create the object of statement interface.since,
	 * statement is an interface programmer can not create object of its ....then we take help of createStatement() method 
	 * of connection interface...
	 * 
	 * Syntax: 
	 *    Statement st=con.createStatement();
	 *    
	 *    create statemnt os used to get the object which is used to create statement !!
	 *   
	 *    4. Execute statement
	 *    
	 *     statement interface 
	 *      The process of carrying sql statement to the database ansd executing those statement is called as 
	 *         execute statement....
	 *      we have three methods
	 *     1. execute()  ==>boolean (insert,update,delete) 
	 *     2.execute update()==>int  (insert,update,delete)
	 *     3.execute Query();==>resultset (Fetch)
	 *     
	 *     1.execute==>wew execute method to send the requirement to send our requirements(sql statements)
	 *     to the database and to execute them...
	 *     
	 *     execute() method carry our requirements (sql statements) to the database and executes those statements
	 *     ==>the return type of execute() method is booelan
	 *     
	 *     it return true in select quary and return false in  other(insert ,update ,delete) query !!6
	 *        
	 
	 *     
	 *     
	 *     
	 
	 */
//	
//	st.execute("create database School");
//	System.out.println("School created");
//	
//	
//	st.execute("create database college");
//	System.out.println("college created ");
//
//	st.execute("create database Qspider");
//	System.out.println("Qspider created");
//	
//	boolean b=st.execute("create database Jspider");
//	System.out.println("Jspider created");
	
	
	st.execute("create table student(id int,name varchar(20),age int)");
	
}
}
