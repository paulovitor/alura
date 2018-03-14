class A {
	public void metodo() {
		System.out.println("a");
		// this.metodo2(); // erro de execução! procura o metodo2 no objeto (entra em loop)
	}
	public void metodo2() {
		System.out.println("metodo do pai");
	}
}
class B extends A {
	public void metodo() {
		System.out.println("b");
		super.metodo();
	}
	public void metodo2() {
		System.out.println("c");
		metodo();
		super.metodo();
	}
	public static void main(String[] args) {
		new B().metodo2();
	}
}
// interface A {
// 	void x();
// }
// class B implements A {
// 	public void x() {

// 	}
// }
class Veiculo {
	void liga() throws java.io.IOException {
		System.out.println("O veículo está sendo ligado!");
	}
}
class Helicoptero extends Veiculo {
	protected void liga() throws java.io.FileNotFoundException {
		System.out.println("Ligando o helicoptero");	
	}
}
abstract class Droid extends Veiculo {
	abstract void liga();
}
class HexaDroid extends Droid {
	public void liga() {
		System.out.println("hexa");
	}
}
class FabricaDeVeiculo {
	Veiculo fabrica() {
		return new Veiculo();
	}
}
class FabricaDeHexaDroid extends FabricaDeVeiculo {
	HexaDroid fabrica() {
		return new HexaDroid();
	}
}
class TestaReescrita {
	static void metodo(Veiculo v) throws java.io.IOException {
		v.liga();
	}
	public static void main(String[] args) throws java.io.IOException {
		Veiculo h1 = new Helicoptero();
		h1.liga();

		metodo(new FabricaDeHexaDroid().fabrica());
		metodo(new Veiculo());
		metodo(new Helicoptero());
	}
}