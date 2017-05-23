package br.bob.pro.dao;

import javax.persistence.EntityManager;

import br.bob.pro.entidades.Endereco;

public class EnderecoDao {

	EntityManager em = new JPAUtil().getEntitManager();

	public void adiciona(Endereco endereco) {
		em.getTransaction().begin();
		em.persist(endereco);
		em.getTransaction().commit();
	}
}
