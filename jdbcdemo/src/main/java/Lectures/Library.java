package Lectures;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Library {

	public static void main(String[] args) throws SQLException 
	{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sagaracadamy", "root","9712");
		System.out.println("Connection done successfully !!");
		
        PreparedStatement st=con.prepareStatement("insert into teacher values(?,?,?)");
        
        
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter id: ");
       int ip1=sc.nextInt();
    		   
       System.out.println("Enter name: ");
       String ip2=sc.next();
       
       System.out.println("Enter subject: ");
       String ip3=sc.next();
       
       st.setInt(1, ip1);
       st.setString(2, ip2);
       st.setString(3, ip3);
        
       st.execute();
       System.out.println("All operation successful !!");
        
		
		
	}
}
