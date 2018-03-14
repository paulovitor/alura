package capitulo5;

public class ContaDeEstudante implements Conta {

	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		this.manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return this.milhas;
	}

	public void rende() {
		this.manipulador.rende(0.5);
	}

	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
