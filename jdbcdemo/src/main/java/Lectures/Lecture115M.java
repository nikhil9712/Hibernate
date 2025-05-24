package Lectures;
import java.util.Scanner;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class Lecture115M {
public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SagarAcadamy", "root","9712");
	System.out.println("Connection successful !!");
	
	PreparedStatement ps=con.prepareStatement("select * from teacher where id=?");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id to display input : ");
	int id=sc.nextInt();
	
	ps.setInt(1, id);  //column no and userinput value 
	
	ResultSet rs=ps.executeQuery();  //we are calling with the help of referense var of prepare statement we canm also call with the help of statement interface bcz it is the parent interface of prepare statemnt interface
    
	if (rs.next()) 
	{   
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
	} else 
	{
     System.out.println("404- Not found");
	}
}
	
}
