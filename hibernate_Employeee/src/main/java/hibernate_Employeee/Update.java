package hibernate_Employeee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//To Update specific data of an object
		//Employee employee=entityManager.find(Employee.class, 2);
		
		//employee.setEmail("Sarang@123");
		
		//to Update all the details keep the id same and set all new details
		Employee employee=new Employee();
		employee.setId(2);
		employee.setEmail("Akash@123");
		employee.setName("Akash");
		employee.setPhone(7452154878l);
		employee.setPassword("4518");
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
	}
}
