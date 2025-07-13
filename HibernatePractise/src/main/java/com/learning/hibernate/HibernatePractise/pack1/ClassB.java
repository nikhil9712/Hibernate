package com.learning.hibernate.HibernatePractise.pack1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
@Component
public class ClassB {

	@Autowired
	EntityManager entityManager;

	public String isEntitymanagerSame(EntityManager entityManager2) {

		if (entityManager2 == entityManager) {
			System.err.println("These Are the Same entity managers");
			return "These Are the Same entity managers";
		} else {
			System.err.println("These Are the Different entity managers");
			return "These Are the Different entity managers";
		}
	}

}
