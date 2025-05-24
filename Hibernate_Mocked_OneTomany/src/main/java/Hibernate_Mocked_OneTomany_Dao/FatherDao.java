package Hibernate_Mocked_OneTomany_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Hibernate_Mocked_OneTomany_Dto.Child;
import Hibernate_Mocked_OneTomany_Dto.Father;

public class FatherDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nikhil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertFather(Father p)
	{
		entityTransaction.begin();
		entityManager.persist(p);
		entityTransaction.commit();
	}
	public void fetchPerson(int pid)
	{
		Father f=entityManager.find(Father.class, pid);	
		if (f!=null) {
			System.out.println(f);
		} else {
           System.out.println("Father with given id "+pid+" does not exists");
		}
	}
	public void fetchAll()
	{
		Query query=entityManager.createQuery("SELECT f FROM Father f");
		List<Father> fathers=query.getResultList();
		System.out.println(fathers);
	}
	public void deleteFather(int fid)
	{
		Father father=entityManager.find(Father.class, fid);
		if (father!=null) {
			entityTransaction.begin();
			entityManager.remove(father);
			entityTransaction.commit();
		} else {
           System.out.println("Father with given id "+fid+"does not exists");
		}
	}
	public void updateFather(int fid,Father ufather)
	{
		Father dbfather=entityManager.find(Father.class,fid );
		ufather.setId(dbfather.getId());
		ufather.setChilds(dbfather.getChilds());
		
		entityTransaction.begin();
		entityManager.merge(ufather);
		entityTransaction.commit();
		
	}
	public void updateFatherchilds(int fid,Father ufather)
	{

		Father dbfather=entityManager.find(Father.class,fid );
		ufather.setId(dbfather.getId());
		//not set the childs so updated will remain as provided 
		List<Child> childs=ufather.getChilds();
		
		entityTransaction.begin();
//		for (Child child : childs) {
//			entityManager.merge(child);
//		} due to cascade
		entityManager.merge(ufather);
		entityTransaction.commit();
	}
}
