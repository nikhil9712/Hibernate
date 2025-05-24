package Hibernate_PEJM15;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
public class FetchAll {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    
	//    Query q= entityManager.createQuery("SELECT e from Employee e");
	    
	  //  List
	    

  }

}