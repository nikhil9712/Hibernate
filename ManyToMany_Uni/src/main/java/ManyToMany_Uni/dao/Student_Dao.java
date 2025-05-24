package ManyToMany_Uni.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToMany_Un.dto.Course;
import ManyToMany_Un.dto.Student;

public class Student_Dao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveStudent(Student s,List<Integer> integers)
	{
		
		List<Course> courses=new ArrayList<Course>();
		
		for (Integer integer : integers) {
			Course course=entityManager.find(Course.class, integer);
			courses.add(course);
		}
		s.setCourses(courses);
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
	}
	
	public void displayAllStudent()
	{
		entityTransaction.begin();
		Query q=entityManager.createQuery("SELECT s from Student s");
		List<Student> l1=q.getResultList();
		System.out.println(l1);
		entityTransaction.commit();
	}

	public void fetch(int studentid) {
		Student s=entityManager.find(Student.class, studentid);
		
		if (s!=null) {
			entityTransaction.begin();
			System.out.println(s);
			entityTransaction.commit();
		} else {
			
          System.out.println("No student found with this id !!");
		}
		
	}

	public void deleteStudent(int studentid) {
		
		Student s=entityManager.find(Student.class, studentid);
		if (s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
		} else {
			
          System.out.println("No student found with this id !!");
		}
	}
	
}
