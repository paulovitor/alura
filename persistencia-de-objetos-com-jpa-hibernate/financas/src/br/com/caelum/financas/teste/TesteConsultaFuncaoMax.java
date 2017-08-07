package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncaoMax {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		Conta conta = new Conta();
		conta.setId(1);
		
		MovimentacaoDao dao = new MovimentacaoDao(manager);

		BigDecimal result = dao.maximoPelaConta(conta);

		System.out.println("Máximo movimentado ..: R$ " + result);
	}
}
