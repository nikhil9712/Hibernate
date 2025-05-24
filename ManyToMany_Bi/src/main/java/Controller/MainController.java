package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany_Bi_dto.Course;
import ManyToMany_Bi_dto.Student;

public class MainController {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Tejas");
		s1.setAddress("Washim");
		s1.setPhno(9854621453l);
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Vinod");
		s2.setAddress("surat");
		s2.setPhno(9854654453l);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Mangesh");
		s3.setAddress("Amravati");
		s3.setPhno(8854621453l);
		
		Course c1=new Course();
		c1.setId(1);
		c1.setName("SQl");
		c1.setDuration(2.5);
		c1.setFees(10000);
		
		Course c2=new Course();
		c2.setId(2);
		c2.setName("Java");
		c2.setDuration(1.5);
		c2.setFees(20000);
		
		Course c3=new Course();
		c3.setId(3);
		c3.setName("Manual");
		c3.setDuration(2.0);
		c3.setFees(15000);
		
		List<Student>slist1=new ArrayList<Student>();
		slist1.add(s1);
		slist1.add(s2);
		
		List<Student>slist2=new ArrayList<Student>();
		slist2.add(s1);
		slist2.add(s2);
		slist2.add(s3);
		
		List<Student>slist3=new ArrayList<Student>();
		slist3.add(s1);
		slist3.add(s3);
		
		
		List<Course> clist1=new ArrayList<Course>();
		clist1.add(c1);
		clist1.add(c2);
		clist1.add(c3);
		
		List<Course> clist2=new ArrayList<Course>();
		clist2.add(c1);
		clist2.add(c2);
		
		List<Course> clist3=new ArrayList<Course>();
		clist3.add(c2);
		clist3.add(c3);
		
		s1.setC(clist1);
		s2.setC(clist2);
		s3.setC(clist3);
		
		c1.setS(slist1);
		c2.setS(slist2);
		c3.setS(slist3);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityTransaction.commit();
	}
	
	
}
