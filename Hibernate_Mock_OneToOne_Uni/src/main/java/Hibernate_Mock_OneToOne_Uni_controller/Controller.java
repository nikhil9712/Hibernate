package Hibernate_Mock_OneToOne_Uni_controller;

import Hibernate_Mock_OneToOne_Uni.dao.PersonDao;
import Hibernate_Mock_OneToOne_Uni_dto.Adharcard;
import Hibernate_Mock_OneToOne_Uni_dto.Person;

public class Controller {

	public static void main(String[] args) {
		
		Adharcard adharcard=new Adharcard();
		adharcard.setName("Pratik Gulhane");
		adharcard.setAge(24);
		adharcard.setAddress("Pune");
		
		Person person=new Person();
		person.setName("Pratik Gulhane");
		person.setEmail("Pratikgulhane@gmail.com");
		person.setAdharcard(adharcard);
		
		PersonDao dao=new PersonDao();
		//dao.insertPerson(person);
		//dao.fetch(1);
		//dao.fetchAll();
		//dao.updatePerson(1, person);
		dao.deletePerson(1);
	}
}
