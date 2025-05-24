package Lectures;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class lecture122 {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SagarAcadamy", "root","9712");
		System.out.println("Connection done successsfilly !!");
		
		Statement st=con.createStatement();
		System.out.println("Requirement Carried successfully !!");
		
		/*st.execute("create database SagarAcadamy");
		System.out.println("Acadamy created successfully !!");
		
		
		st.execute("create table Teacher(id int,Tname varchar(20),Subject varchar(10))");
		System.out.println("Table created in SagarAcadamy database !!");
		
		
		st.execute("insert into Teacher values(1,'SagarSir','Java')");
		
		st.execute("insert into Teacher values(2,'KiranSir','WebTech')");
		
		st.execute("insert into Teacher values(3,'PratikSir','Geotech')");
		
		st.execute("insert into Teacher values(4,'LinaMam','SQL')");
		
		st.execute("insert into Teacher values(5,'NikitaMam','AutoCad')");
		
		st.execute("insert into Teacher values(6,'Sonalman','Analytics')");
		
		st.execute("insert into Teacher values(7,'NikitaMam','AutoCad')");
		
		st.execute("insert into Teacher values(8,'jayesh','Hindi')");
		
		st.execute("insert into Teacher values(9,'Vijay','Marathi')");
		
		st.execute("insert into Teacher values(10,'Ramesh','English')");
		
		System.out.println("All data(Rows) inserted successfully !!");
		
		st.execute("update Teacher set Tname='Sarang' where id=8");
		
		st.execute("update Teacher set subject='Survey' where id=8");
		System.out.println("Update Successful !!");
		
		
		st.execute("Delete from teacher where id=10");
		*/
		st.execute("Delete from teacher where id=9");
		System.out.println("Row deleted successfully !!");
		//dynamic input for CRUD operation we use Prepare statement !!
	}
}
