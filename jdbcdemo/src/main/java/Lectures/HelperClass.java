package Lectures;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class HelperClass {

public static Connection getConnection () throws SQLException
{
   	return DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch", "root","9712");
}

}
