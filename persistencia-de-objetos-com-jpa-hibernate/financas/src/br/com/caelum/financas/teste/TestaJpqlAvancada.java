package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaJpqlAvancada {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta = manager.find(Conta.class, 2);

		String jpql = "select avg(m.valor) from Movimentacao m where m.conta=:pConta "
				+ "and m.tipoMovimentacao=:pTipo";

		TypedQuery<Double> query = manager.createQuery(jpql, Double.class);

		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);

		Double resultado = query.getSingleResult();

		System.out.println("Total movimentado ..: R$ " + resultado);

	}
}
