package ManyToOne_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ManyToOne_dto.College;
import ManyToOne_dto.Student;

public class Student_Dao {

	

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    public void saveStudent(Student student,int cid)
    {
    	entityTransaction.begin();
    	College college=entityManager.find(College.class, cid);
    	student.setCollege(college);
    	entityManager.persist(student);
    	entityTransaction.commit();
    }

	public void getStudent(int studentId) {
		
		Student s=entityManager.find(Student.class,studentId);
		System.out.println(s);
		
	}
	public void getAllStudents()
    {
    	entityTransaction.begin();
    	Query q=entityManager.createQuery("SELECT s from Student s");
    	List l1=q.getResultList();
    	System.out.println(l1);
    	entityTransaction.commit();
    }
	public void deleteStudent(int studentId)
	{
		entityTransaction.begin();
		Student s=entityManager.find(Student.class, studentId);
		entityManager.remove(s);
		entityTransaction.commit();
	}
	/*public void deleteStudentWithMappedCollege(int studentId)
	{
		entityTransaction.begin();
		Student s=entityManager.find(Student.class, studentId);
		int collegeid=s.getId();
		College c=entityManager.find(College.class, collegeid);
		entityManager.remove(c);
		entityManager.remove(s);
		entityTransaction.commit();
	}
   */
}
