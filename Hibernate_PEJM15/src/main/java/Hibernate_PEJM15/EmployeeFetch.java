package Hibernate_PEJM15;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
public class EmployeeFetch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction=entityManager.getTransaction();
	    
	    Employee employee=(entityManager.find(Employee.class,1));
	   //prints all the details inside employee
	    System.out.println(employee);
	    
	    //also can access indivisual attributes
	    System.out.println(employee.getName());
	    System.out.println(employee.getId());
	    System.out.println(employee.getPhno());
	    System.out.println(employee.getPass());
	    System.out.println(employee.getEmail());
	}
}
