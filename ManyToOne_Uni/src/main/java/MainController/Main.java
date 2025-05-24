package MainController;

import ManyToOne_dao.Collegee_dao;
import ManyToOne_dao.Student_Dao;
import ManyToOne_dto.College;
import ManyToOne_dto.Student;

public class Main {

	
	public static void main(String[] args) {
		
		College college=new College();
		
		college.setName("bapurao");
		college.setLocation("Wardha");
		college.setFees(69000l);
		
		Student student=new Student();
		
		student.setName("Dinesh");
		student.setPhoneno(6487594523l);
		student.setAddress("nshik");
		student.setCollege(college);
		
		Collegee_dao cd=new Collegee_dao();
		//cd.saveCollege(college);  //to  save student by passing college object 
		
		int id=college.getId();
		//System.out.println(id);
		Student_Dao sd=new Student_Dao();
		//sd.saveStudent(student,1);//to save college by passing college id and alloting a college with a college id
		
		//cd.getCollege(college.getId()); //getting a particular of college with the help of college id
		//sd.getStudent(1);  //getting a particular of student with the help of student id
		//cd.getAllCollege(); //getting all the college list
		//sd.getAllStudents(); //getting all the student list by Query and JPQL
	
		
		
		//sd.deleteStudent(5);  //directly student of that id is deleted college deletion is not necessary
		//sd.deleteStudentWithMappedCollege(4); //it will work only when college of student is not mapped with any other student
	
		//cd.deleteCollege(5);
	}
}
