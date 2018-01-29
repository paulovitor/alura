package modelo;
import financeiro.*;
public class TestaContaHeranca {
	public static void main(String[] args) {
		Conta c = new ContaFinanceira();
		c.fecha();
		c.liga();

		// ContaFinanceira c = new ContaFinanceira(); // não compila! não temos visibilidade
	}
}