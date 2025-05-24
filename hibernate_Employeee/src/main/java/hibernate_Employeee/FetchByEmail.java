package hibernate_Employeee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByEmail {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email: ");
		String email=sc.next();
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		

		Query query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.email=?1");
		query.setParameter(1, email);
		Employee employee = (Employee) query.getSingleResult();
		System.out.println(employee);
		
	}
}
