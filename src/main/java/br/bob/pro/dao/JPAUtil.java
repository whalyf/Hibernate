package br.bob.pro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("correiosPU");
	
	public EntityManager getEntitManager(){
		return entityManagerFactory.createEntityManager();
	}

}