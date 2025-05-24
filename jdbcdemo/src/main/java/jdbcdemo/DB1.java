 package jdbcdemo;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DB1 {
	
public static void main(String[] args) throws SQLException 
{
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tournaments","root","9712");
   System.out.println("Connection done !!");
   
   Statement st=con.createStatement();
   System.out.println("statement created");
   
 /*  st.execute("create database Tournaments");
   System.out.println("Database created");
   */
   
 /*  st.execute("create table ipl(id int,name varchar(20),age int)");
   st.execute("create table apl(id int,name varchar(20),rank int)");
   System.out.println("Table created");
   */
   
  // st.execute("insert into ipl values(1,'GT',20)");
  // st.execute("insert into ipl values(2,'CSK',18)");
  // st.execute("insert into ipl values(3,'MI',16)");
  // st.execute("insert into ipl values(4,'LSG',16)");
  // st.execute("insert into ipl values(4,'RR',16)");
  // st.execute("update ipl set id=5 where name='RR'");
  // st.execute("delete from ipl where name='RR'");
  // System.out.println("value Inserted");
   
   ResultSet rs=st.executeQuery("select * from ipl");
  // System.out.println("Object of result set created !!");
    
  while (rs.next()) {
	  System.out.print(rs.getInt(1)+"    ");
	  System.out.print(rs.getString(2)+"    ");
	  System.out.print(rs.getInt(3)+"    ");
	  System.out.println();
	
}
   
   
}
}
