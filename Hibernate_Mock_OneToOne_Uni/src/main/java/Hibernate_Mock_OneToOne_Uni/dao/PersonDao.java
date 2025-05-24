package Hibernate_Mock_OneToOne_Uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Hibernate_Mock_OneToOne_Uni_dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insertPerson(Person p) {
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	public void fetch(int id)
	{
	  Person dbPerson=entityManager.find(Person.class, id);
	  if (dbPerson!=null) {
		System.out.println(dbPerson);
	} else {
        System.out.println("Person with id "+id+"not exists");
	}
	  
	}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("SELECT p FROM Person p");
		List<Person> list=query.getResultList();
		System.out.println(list);
	}
	public void deletePerson(int id)
	{
	   Person dbperson=entityManager.find(Person.class, id)	;
	   if (dbperson!=null) {
		entityTransaction.begin();
		entityManager.remove(dbperson);
		entityTransaction.commit();
	} else {
		System.out.println("Person with id "+id+"not exists");
	}
	}

	public void updatePerson(int id,Person p)
	{
	   Person dbperson=entityManager.find(Person.class, id)	;
	   if (dbperson!=null) {
		p.setId(dbperson.getId());
		p.getAdharcard().setAdharno(dbperson.getAdharcard().getAdharno());;
		entityTransaction.begin();
		entityManager.merge(p);
		entityTransaction.commit();
	} else {
		System.out.println("Person with id "+id+"not exists");
	}
	}

}
