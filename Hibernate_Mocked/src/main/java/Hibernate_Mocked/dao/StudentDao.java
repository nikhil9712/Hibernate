package Hibernate_Mocked.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Hibernate_Mocked.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insert(Student s)
	{
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
	}
	public void fetch(int sid)
	{
		Student s=entityManager.find(Student.class, sid);
		System.out.println(s);
	}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("SELECT s FROM Student s");
		List<Student> list=query.getResultList();
		for (Student s : list) {
			System.out.println(s);
		}
	}
	public void delete(int id)
	{
		Student s=entityManager.find(Student.class, id);
		if (s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
		} else {
             System.out.println("Student with the given id"+id+" not exists");
		}
	}
	public void update(int id,Student uStudent)
	{
		Student dbstudent=entityManager.find(Student.class, id);
		if (dbstudent!=null) {
			uStudent.setId(dbstudent.getId());
			entityTransaction.begin();
			entityManager.merge(uStudent);
			entityTransaction.commit();
		} else {
         System.out.println("Student with id "+id +"does not exists");
		}
	}
}
