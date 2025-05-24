package PrepareStatementCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateUpdateDeletePrepareStatement {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","9712");
		System.out.println("connection done");
		
	/*	PreparedStatement ps=con.prepareStatement("create table Employee2(id int,name varchar(20),job varchar(20),age int)");
		System.out.println("PrepareStatement done");
		
		ps.execute();
		*/
		
		/*Insert Query
		 * 
		 * PreparedStatement ps=con.prepareStatement("insert into Employee2 values(?,?,?,?)");
		
		for (int i = 0; i < 3; i++) {
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id: ");
			int id=sc.nextInt();
			System.out.println("enter name: ");
			String name=sc.next();
			System.out.println("enter job: ");
			String job=sc.next();
			System.out.println("enter age: ");
			int age=sc.nextInt();
			
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setString(3, job);
			ps.setInt(4,age);
			
			ps.execute();
			System.out.println("successful");
		}*/
		
		/*  Update Quary
		 * PreparedStatement ps=con.prepareStatement("update Employee2 set name=? where id=?");
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter name: ");
		String name=sc.next();
		
		System.out.println("Enter id: ");
		int id =sc.nextInt();
		
		ps.setInt(2, id);
		ps.setString(1,name);
		
		ps.execute();
		System.out.println("successful");
		*/
		
		for (int i = 1; i <=3; i++) {
			PreparedStatement ps=con.prepareStatement("delete from Employee2 where id=?");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			
			ps.setInt(1, id);
			ps.execute();
			System.out.println("successful");
		}
		System.out.println("All executed !!");
		
		
		
		
		
	}
}
