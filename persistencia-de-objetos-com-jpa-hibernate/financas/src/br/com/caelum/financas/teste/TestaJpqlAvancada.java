package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaJpqlAvancada {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		MovimentacaoDao dao = new MovimentacaoDao(manager);

		Conta conta = manager.find(Conta.class, 2);

		Double resultado = dao.mediaDaContaPeloTipo(conta, TipoMovimentacao.SAIDA);

		System.out.println("Total movimentado ..: R$ " + resultado);

	}
}
