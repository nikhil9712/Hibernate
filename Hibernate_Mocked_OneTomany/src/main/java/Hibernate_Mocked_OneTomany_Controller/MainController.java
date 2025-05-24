package Hibernate_Mocked_OneTomany_Controller;

import java.util.ArrayList;
import java.util.List;

import Hibernate_Mocked_OneTomany_Dao.FatherDao;
import Hibernate_Mocked_OneTomany_Dto.Child;
import Hibernate_Mocked_OneTomany_Dto.Father;

public class MainController {

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.setName("Dholu");
		c1.setAge(20);
		
		Child c2=new Child();
		c2.setName("Bholu");
		c2.setAge(21);
		
		List<Child> childs=new ArrayList<Child>();
		childs.add(c1);
		childs.add(c2);
		
		Father father=new Father();
		father.setName("Kiran");
		father.setPhno(7712625468l);
		father.setChilds(childs);
		
		FatherDao dao=new FatherDao();
		//dao.insertFather(father);
		//dao.fetchPerson(3);
		//dao.fetchAll();
		//dao.updateFather(1, father);
		//dao.updateFatherchilds(1, father);
		dao.deleteFather(1);
		
	}
}
