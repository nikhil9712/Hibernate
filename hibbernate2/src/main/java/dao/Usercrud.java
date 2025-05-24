package dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.Query;

import dto.User;

public class Usercrud {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("Nikhil").createEntityManager();
	}

	public void signUp(User user) {
		EntityManager entityManager = getEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

	}

	public boolean loginUser(String email, String password) {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT user from User user where user.email=? and user.password");

		query.setParameter(1, email);

		try {
			User user = (User) query.getSingleResult();

			if (user.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Invalid credentials !!");
		}
		return false;

	}
	
	public void updatePassword(User user,String email)
	{
		EntityManager entitymanager=getEntityManager();
		EntityTransaction entityTransaction=entitymanager.getTransaction();
		
		Query query=entitymanager.createQuery("SELECT user FROM User user where user.e");
		query.setParameter(1,email);
		
		User dbUser=(User) query.getSingleResult();
		
		entityTransaction.begin();
		user.setId(dbUser.getId());
		user.setName(dbUser.getName());
		user.setEmail(dbUser.getEmail());
		user.setPassword(dbUser.getPassword());
		user.setPhno(dbUser.getPhno());
		entitymanager.merge(user);
		entityTransaction.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
