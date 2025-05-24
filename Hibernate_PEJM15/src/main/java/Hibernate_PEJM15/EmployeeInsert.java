package Hibernate_PEJM15;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {

	public static void main(String[] args) {
		
		Employee employee =new Employee();
		employee.setId(3);
		employee.setName("Sagar");
		employee.setPass("2123");
		employee.setEmail("Sagar56@gmail.com");
		employee.setPhno(7854689712l);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}
}
