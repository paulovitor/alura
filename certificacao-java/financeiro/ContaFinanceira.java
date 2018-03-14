package financeiro;
import modelo.*;
public class ContaFinanceira extends Conta {
	void fecha() { // não está sobrescrevendo o método fecha da classe pai (visibilidade default)
		System.out.println("financeira");
	}
	protected void liga() {
		System.out.println("financeira");
	}
}