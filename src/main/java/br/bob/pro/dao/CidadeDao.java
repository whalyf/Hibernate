package br.bob.pro.dao;

import javax.persistence.EntityManager;

import br.bob.pro.entidades.Cidade;

public class CidadeDao {

	EntityManager em = new JPAUtil().getEntitManager();

	public void adiciona(Cidade cidade) {
		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();
	}
}
