package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class DadosPagamento {

	private BigDecimal total;

	public DadosPagamento(BigDecimal total) {
		this.total = total;
	}

	public DadosPagamento() {

	}

	public BigDecimal getTotal() {
		return total;
	}

}
