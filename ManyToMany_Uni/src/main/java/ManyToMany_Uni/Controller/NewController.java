package ManyToMany_Uni.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ManyToMany_Un.dto.Student;

public class NewController {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		EntityManager entityManager2=entityManagerFactory.createEntityManager();
		
		entityManager1.find(Student.class, 1);
		entityManager1.find(Student.class, 1);
		entityManager2.find(Student.class, 1);
	}
}
