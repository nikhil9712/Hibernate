package com.learning.hibernate.HibernatePractise.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Configuration
public class MainClass {

	@PersistenceContext
	private EntityManager entityManagerProxy;

	@Autowired
	ClassA classA;
	
	/*
	 * The proxy is the key card reader at the door (same for all guests).
	 * 
	 * Each guest (i.e., request/thread/transaction) uses the same reader, but the
	 * reader gives access to different rooms.
	 */

	@Bean
	public String hello() {
		inspectEntityManager();
		inspectInAnotherTransaction();
		return classA.isEntitymanagerSame();
	}

	@Transactional
	public void inspectEntityManager() {
		System.out.println("Proxy Class: " + entityManagerProxy.getClass());
		System.out.println("Hashcode of proxy: " + entityManagerProxy.hashCode());

		// Accessing the actual delegate behind the proxy
		EntityManager actualEntityManager = entityManagerProxy.unwrap(EntityManager.class);
		System.out.println("Actual EntityManager class: " + actualEntityManager.getClass());
		System.out.println("Hashcode of actual: " + actualEntityManager.hashCode());
	}

	@Transactional
	public void inspectInAnotherTransaction() {
		EntityManager actualEntityManager = entityManagerProxy.unwrap(EntityManager.class);
		System.out.println("Different Tx - Actual EntityManager class: " + actualEntityManager.getClass());
		System.out.println("Hashcode in different transaction: " + actualEntityManager.hashCode());
	}

}
