package hibernate_Employeee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setId(3);
		employee.setName("Pratik");
		employee.setEmail("Pratik@123");
		employee.setPassword("6455");
		employee.setPhone(7755621456l);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
				
	}
}
