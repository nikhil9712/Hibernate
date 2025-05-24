package Hibernate_Mocked.controller;

import Hibernate_Mocked.dao.StudentDao;
import Hibernate_Mocked.dto.Student;

public class Controller {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setId(1);
		s.setName("Nimish");
		s.setAge(24);
		s.setLocation("Ner");
		
		StudentDao dao=new StudentDao();
		//dao.insert(s);
		dao.fetch(1);
		System.out.println("Successful");
	
	}
}
