package ManyToOne_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.boot.spi.InFlightMetadataCollector.EntityTableXref;

import ManyToOne_dto.College;
import ManyToOne_dto.Student;

public class Collegee_dao {

	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    
	public void saveCollege(College c)
	{
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
	}


	public void getCollege(int collegeId) {
		
		System.out.println(entityManager.find(College.class, collegeId));
		
	}
	public void getAllCollege()
	{
		entityTransaction.begin();
		Query q=entityManager.createQuery("SELECT c from College c");
		List l=q.getResultList();
		System.out.println(l);
		entityTransaction.commit();
	}
	 
	public void deleteCollege(int collegeid)
	{
		College dbcollege=entityManager.find(College.class, collegeid);
	 
		Query q=entityManager.createQuery("SELECT s from Student s");
    	List l1=q.getResultList();
    	
    	
		if (dbcollege!=null)
		{
			entityTransaction.begin();
			for (Object object : l1)
	    	{
				Student s=(Student)object;
				if (s.getCollege().equals(dbcollege)) 
				{
					entityManager.remove(s);
				}
			}
			
			entityManager.remove(dbcollege);
			entityTransaction.commit();
			
		} else 
		{
          System.out.println("No college exists with this id !!");
		}
		
	}
	
	
	
	
	
}
