package General;
import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
public class Fetch {

	public static void main(String[] args) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch", "root","9712");
		System.out.println("Connection Done !!");
		
		Statement st=con.createStatement();
		System.out.println("Statement created !!");
		
		ResultSet rs=st.executeQuery("select * from Account");
		
	}
}
