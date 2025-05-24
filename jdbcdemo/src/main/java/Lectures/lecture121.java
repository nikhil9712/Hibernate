package Lectures;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class lecture121 {
public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root","9712"); //here we mention the database name
	System.out.println("Connection successful !!");                                                    // as college so the actions will be done
	
	Statement st=con.createStatement();                                                                //in college database
	System.out.println("Statement created successfully !!");
	
//	st.execute("insert into student values(1,'Nikhil',10)");
//
//	st.execute("insert into student values(2,'Sagar',2000)");  //we mention the name of table here as student
//	
//	st.execute("insert into student values(3,'ajay',30)");
//	System.out.println("values inserted successfully !!");
}
}
