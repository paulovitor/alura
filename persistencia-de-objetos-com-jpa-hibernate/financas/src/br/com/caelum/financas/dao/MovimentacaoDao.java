package br.com.caelum.financas.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;

public class MovimentacaoDao {

	private EntityManager manager;

	public MovimentacaoDao(EntityManager manager) {
		this.manager = manager;
	}

	public Double mediaDaContaPeloTipo(Conta conta, TipoMovimentacao tipo) {

		TypedQuery<Double> query = manager.createQuery(
				"select avg(m.valor) from Movimentacao m where m.conta=:pConta " + " and m.tipoMovimentacao = :pTipo",
				Double.class);

		query.setParameter("pConta", conta);
		query.setParameter("pTipo", tipo);

		return query.getSingleResult();
	}

	public List<Movimentacao> buscaPelaContaETipo(Conta conta, TipoMovimentacao tipo) {

		TypedQuery<Movimentacao> query = manager.createQuery("select m from Movimentacao m where m.conta = :pConta "
				+ "and m.tipoMovimentacao = :pTipo " + "order by m.valor desc", Movimentacao.class);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", tipo);

		return query.getResultList();
	}

	public Long contaPelaConta(Conta conta) {

		TypedQuery<Long> query = manager.createQuery("select count(m) from Movimentacao m where m.conta = :pConta",
				Long.class);
		query.setParameter("pConta", conta);
		return query.getSingleResult();
	}

	public BigDecimal maximoPelaConta(Conta conta) {

		TypedQuery<BigDecimal> query = manager
				.createQuery("select max(m.valor) from Movimentacao m where m.conta = :pConta", BigDecimal.class);
		query.setParameter("pConta", conta);

		return query.getSingleResult();
	}

	public BigDecimal contaPelaContaETipo(Conta conta, TipoMovimentacao tipo) {

		String jpql = "select sum(m.valor) from Movimentacao m where m.conta=:pConta "
				+ "and m.tipoMovimentacao=:pTipo";

		TypedQuery<BigDecimal> query = manager.createQuery(jpql, BigDecimal.class);

		query.setParameter("pConta", conta);
		query.setParameter("pTipo", tipo);

		return query.getSingleResult();
	}
}
