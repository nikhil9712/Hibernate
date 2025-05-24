package StatementCRUD;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class FetchStatement {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","9712");
		System.out.println("connection done");
		
		Statement st=con.createStatement();
		System.out.println("Statement created !!");
		
		ResultSet rs=st.executeQuery("select * from employee");
		/*
		 * 1 Nikhil Developer 23
           2 Kiran Tester 24
           3 Pratik Manager 23 
           4 Aniket SME 24
           5 Sanket Data Analysist 24

		 */
		
		  //ResultSet rs=st.executeQuery("select * from employee where name='Nikhil' or id=2");
		  //1 Nikhil Developer 23
		  //2 Kiran Tester 24
		
		    while (rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String job=rs.getString(3);
			int age=rs.getInt(4);
			
			System.out.println(id+" "+name+" "+job+" "+age);
		}
		
	}
}
