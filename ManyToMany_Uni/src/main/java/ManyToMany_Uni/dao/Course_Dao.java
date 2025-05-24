package ManyToMany_Uni.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToMany_Un.dto.Course;
import ManyToMany_Un.dto.Student;

public class Course_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveCourse(Course c) {
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
	}

	public void fettchAll() {
		entityTransaction.begin();
		Query q = entityManager.createQuery("SELECT c from Course c");
		List<Course> course = q.getResultList();
		System.out.println(course);
		entityTransaction.commit();

	}

	public void fetch(int courseid) {
		Course c = entityManager.find(Course.class, courseid);

		if (c != null) {
			entityTransaction.begin();
			System.out.println(c);
			entityTransaction.commit();
		} else {
			System.out.println("No course is available with this course id ");
		}

	}

	public void deleteCourse(int courseid) {
		Course course1 = entityManager.find(Course.class, courseid);

		entityTransaction.begin();
		Query query = entityManager.createQuery("SELECT s from Student s");
		List<Student> l1 = query.getResultList();

		for (Student student : l1) {
			List<Course> l2 = student.getCourses();
			for (Course course2 : l2) {
				if (course1.getId() == course2.getId()) {
					entityManager.remove(student);
				}
			}

		}
		entityManager.remove(course1);
		entityTransaction.commit();

	}
}
