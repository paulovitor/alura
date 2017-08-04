package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Movimentacao movimentacao = manager.find(Movimentacao.class, 2);

		System.out.println("Titular da conta: " + movimentacao.getConta().getTitular());

		Query query = manager.createQuery("select distinct c from Conta c left join fetch c.movimentacoes");
//		Query query = manager.createQuery("select c from Conta c");

		List<Conta> contas = query.getResultList();

		for (Conta conta : contas) {
			System.out.println("Número de movimentações ...: " + conta.getMovimentacoes().size());
		}
	}
}
