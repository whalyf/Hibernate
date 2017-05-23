package br.bob.pro.dao;

import javax.persistence.EntityManager;

import br.bob.pro.entidades.Estado;

public class EstadoDao {

	EntityManager em = new JPAUtil().getEntitManager();

	public void adiciona(Estado estado) {
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
	}
}
