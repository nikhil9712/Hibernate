package Hibernate_PEJM15;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EmployeeUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerfactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerfactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee= new Employee();
		
		employee.setId(3); //Id is used as a primary key we have mentioned in blueprint 
		employee.setName("Sanket");// as  entity in blueprint
		employee.setEmail("Sanket@123");
		//we have to pass all the attributes else the remaining is considered as Null
		employee.setPass("5856");
		employee.setPhno(8754698742l);
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
		
	}
}
