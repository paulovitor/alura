package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
public class TesteBuscaConta {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, 1);

		em.getTransaction().commit();
		em.close();
	}
}
