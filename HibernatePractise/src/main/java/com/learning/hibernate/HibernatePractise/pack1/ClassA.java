package com.learning.hibernate.HibernatePractise.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;

@Component
public class ClassA {

	@Autowired
	EntityManager entityManager;
	
	@Autowired
	ClassB classB;
	
	public String isEntitymanagerSame() {
		return classB.isEntitymanagerSame(entityManager);
	}
	
	/*
	 * Case A 

if I Call Method A and which is @Transactional
and inside Method B is called 
Method B is from Same class 
and also annotated as @Transactional

then spring consideres method A And method B
in same @Transactional

Case B

if I Call Method A and which is @Transactional
and inside Method B is called 
Method b is from Another class 
and also annotated as @Transactional

then also spring consideres method A and method B 
in same @Transactional

because spring uses default propagation as
@Transactional(propagation = Propagation.REQUIRED)

Case C 


if I Call Method A and which is @Transactional
and inside Method B is called 
Method b is from Another class 
and also annotated as @Transactional
But Method B is intentionally annotated as
@Transactional(propagation = Propagation.NEW)

Then Method A opens a transaction
executes code and calls Method b 
and method B also opens a new transaction
 






	 * 
	 * */
}
