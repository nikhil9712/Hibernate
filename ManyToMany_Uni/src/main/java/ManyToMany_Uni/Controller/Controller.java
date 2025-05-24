package ManyToMany_Uni.Controller;

import java.util.ArrayList;
import java.util.List;

import ManyToMany_Un.dto.Course;
import ManyToMany_Un.dto.Student;
import ManyToMany_Uni.dao.Course_Dao;
import ManyToMany_Uni.dao.Student_Dao;

public class Controller {

	public static void main(String[] args) {
		
		Course c1=new Course();
		c1.setName("SQL");
		c1.setFees(15000);
		c1.setDuration(2.5);
		
		Course c2=new Course();
		c2.setName("Java");
		c2.setFees(10000);
		c2.setDuration(6.5);
		
		Course c3=new Course();
		c3.setName("J2EE");
		c3.setFees(15000);
		c3.setDuration(2.5);
		
		Course c4=new Course();
		c4.setName("Web-tech");
		c4.setFees(18000);
		c4.setDuration(1.5);
		
		
		
		Student s1=new Student();
		s1.setName("Nikhil");
		s1.setPhno(9518344523l);
		s1.setAddress("Yavatmal");
		
		
		Student s2=new Student();
		s2.setName("Dhyaneshwar");
		s2.setPhno(8856449715l);
		s2.setAddress("Washim");
		
		
		Student s3=new Student();
		s3.setName("Sagar");
		s3.setPhno(8648795423l);
		s3.setAddress("Nagar");
		
		List<Integer> cids1=new ArrayList<Integer>();
		cids1.add(1);
		cids1.add(2);
		cids1.add(3);
		
		List<Integer> cids2=new ArrayList<Integer>();
		cids2.add(2);
		cids2.add(3);
		
		List<Integer> cids3=new ArrayList<Integer>();
		cids3.add(1);
		cids3.add(2);
		cids3.add(3);
		
		Course_Dao cd=new Course_Dao();
	/*
		cd.saveCourse(c1);
		cd.saveCourse(c2);
		cd.saveCourse(c3);
		cd.saveCourse(c4);
		*/
		
		Student_Dao sd=new Student_Dao();
	/*	
		
		sd.saveStudent(s1, cids1);
		sd.saveStudent(s2, cids2);
		sd.saveStudent(s3, cids3);
		*/
		
	//	cd.fettchAll();
		//sd.displayAllStudent();
		
	  //	cd.fetch(2);
	  //	sd.fetch(1);
		
		//sd.deleteStudent(1);
		
	     cd.deleteCourse(1);
	}
}
