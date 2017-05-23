package br.bob.pro.dao;

import javax.persistence.EntityManager;

import br.bob.pro.entidades.Bairro;

public class BairroDao {

	EntityManager em = new JPAUtil().getEntitManager();

	public void adiciona(Bairro bairro) {
		em.getTransaction().begin();
		em.persist(bairro);
		em.getTransaction().commit();
	}
}
