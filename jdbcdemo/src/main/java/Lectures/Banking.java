package Lectures;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Banking {
 static double balance=0;
 static int pin=6445;
 static int accno=1234;
 
 public static void main(String[] args) throws SQLException 
 {
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch", "root","9712");
 
	Statement st=con.createStatement();
	
//	st.execute("create table Account(id int,name varchar(20),accountno int,pin int,balance int)");
//	System.out.println("Table created !");
//	
//st.execute("insert into Account values(1,'Nikhil',1234,6445,0)");
	 st.execute("insert into Account values(1,'Ajay',5678,6445,0)");
	 System.out.println("values Added");
}
 
 
 public static void Deposite(int Pin,int Accno,int Amount)
 {
	 if (pin==Pin && Accno==accno )
	 {
		 balance+=Amount;
		System.out.println("Balance is Added Current balance is: "+balance);
	}
	 else
	 {
		 System.out.println("Invalid Credentials !!");
	 }
 }
 
 public static void Withdraw(int Pin,int Accno,int Amount)
 {
	 if (Pin==pin && Accno==accno)
	 {
			if (balance-Amount>0) 
		   	{
				balance-=Amount;
				System.out.println("Balance is Withdrawn Current balance is: "+balance);
			} else 
			{
	          System.out.println("Insufficient balance !!");
			}
	} else
	{
      System.out.println("Invalid Credentials !!");
	}
 }
}
