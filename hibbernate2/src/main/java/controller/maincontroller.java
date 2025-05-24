package controller;

import java.util.Scanner;

import dao.Usercrud;
import dto.User;

public class maincontroller {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user=new User();
		Usercrud userCrud=new Usercrud();
		System.out.println("Enter the choice: ");
		System.out.println("Enter 1 for signUp \n2 for login");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the id: ");
			user.setId(sc.nextInt());
			System.out.println("Enter the name: ");
			user.setName(sc.next());
			System.out.println("Enter the email: ");
			user.setEmail(sc.next());
			System.out.println("Enter the password: ");
			user.setPassword(sc.next());
			System.out.println("Enter the phone: ");
			user.setPhno(sc.nextLong());
			
			
			userCrud.signUp(user);
		}
		case 2:
		{
			System.out.println("Ent4er password: ");
			user.setEmail(sc.next());
			System.out.println("Enter the password: ");
			user.setPassword(sc.next());
			userCrud.loginUser("nikhil@123","9712");
		}
	  }
	}
	
	
}
