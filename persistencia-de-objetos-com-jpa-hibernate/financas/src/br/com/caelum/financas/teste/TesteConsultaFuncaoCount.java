package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncaoCount {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		Conta conta = manager.find(Conta.class, 2);

		MovimentacaoDao dao = new MovimentacaoDao(manager);

		Long quantidade = dao.contaPelaConta(conta);

		System.out.println("Total de movimentações: " + quantidade);
	}
}
