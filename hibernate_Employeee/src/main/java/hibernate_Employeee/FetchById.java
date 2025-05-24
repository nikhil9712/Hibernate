package hibernate_Employeee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//No need of Entitytransaction for fetching the object
		
		Employee e1=entityManager.find(Employee.class, 2);
		System.out.println(e1);
	}
	

}
