package StatementCRUD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateUpdateDeleteStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","9712");
        System.out.println("Connection done");
        
        Statement st=con.createStatement();
        System.out.println("Statement created !!");
        
      /*  st.execute("create database Company");
        
          st.execute("create table Employee(id int,name varchar(20),job varchar(20),age int)");
        
          st.execute("insert into Employee values(1,'Nikhil','Developer',23)");
        
          st.execute("insert into Employee values(2,'Kiran','Tester',24)");
        
          st.execute("insert into Employee values(3,'Sanket','Data Analysist',24)");
          
          st.execute("insert into Employee values(4,'Pratik','Manager',23)");
          
          
          st.execute("update employee set name='Prajwal' where id=3");
         
          st.execute("delete from employee where id=3");*/
        
          st.execute("update employee set id=5 where name='Sanket'");
        
          System.out.println("Successful");
        
        
                 
	}
}
