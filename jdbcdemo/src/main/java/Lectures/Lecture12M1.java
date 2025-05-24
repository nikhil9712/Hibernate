package Lectures;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
		
		
import java.sql.DriverManager;

public class Lecture12M1 {

	public static void main(String[] args) throws SQLException {
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SagarAcadamy", "root","9712");
        
		 System.out.println("Connection done !!");
		 
		 Statement st=con.createStatement();
		 System.out.println("Statement created");
		 
		ResultSet rs= st.executeQuery("select * from Teacher");
		System.out.println("We got resultset object !!");
		
		while (rs.next()) 
		{
		System.out.println(rs.getFloat(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println("===============");
		}
	}
}
