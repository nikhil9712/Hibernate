package PrepareStatementCRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
public class ReadPreparedStatement {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","9712");
		System.out.println("connection done");
		    
		for (int i = 0; i < 2; i++) {
			PreparedStatement ps=con.prepareStatement("select * from employee2 where id=?");
			
			
			System.out.println("Enter id: ");
			ps.setInt(1, sc.nextInt());
			
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				int id=rs.getInt(1);  //columnIndex
				String name=rs.getString(2);
				String job=rs.getString(3);
				int age=rs.getInt(4);
				
				System.out.println(id+" "+name+" "+job+" "+age);

			    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
			 
		}
		
	}
}
