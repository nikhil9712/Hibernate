package hibernate_Employeee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//EntityTransaction entityTransaction=entityManager.getTransaction();
		//In fetch and fetch all we dont need EntityTransaction
		
		Query query=entityManager.createQuery("SELECT e FROM Employee e");
		List<Employee> employees=query.getResultList();
		
		System.out.println(employees);
		
		
	}
}
