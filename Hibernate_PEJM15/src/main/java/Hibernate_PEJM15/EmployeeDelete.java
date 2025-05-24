package Hibernate_PEJM15;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
public class EmployeeDelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	
		
		/* To Insert
		 * Employee employee=new Employee();
		 * using object of new keyword
		 * entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		 */
		
		/*To Update
		 * Employee employee=new Employee();
		 * using object of new keyword 
		 * entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		 */
		
		//To Delete
		
		Employee employee=(entityManager.find(Employee.class, 3));
		//By this all the details of passed id (primary key)
		//is stored in the object reference 
		
		
		if (employee!=null) 
		{
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		} else
		{
          System.out.println("id not present !!");
		}
		
		
		
	}
}
