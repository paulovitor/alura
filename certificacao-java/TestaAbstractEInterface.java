interface A {
	int x = 10;
	final static public int y = 20;
}
class GuiA implements A {

} 	
interface B extends A {}
interface C extends B, A {}
// interface D implements A {}
abstract class SemMetodo {
	
}
abstract class ComMetodoAbstrato {
	abstract void executa();
	void liga() {}
	void desliga() {}
}
interface Veiculo {
	abstract void liga();
}
class Carro implements Veiculo, Runnable {
	public void liga() {

	}
	public void run() {

	}
}
abstract class Moto implements Veiculo {}
abstract class CarroAutomatico extends Carro {
	public abstract void liga();
}
class CarroAutomaticoBonito extends CarroAutomatico {
	public void liga() {

	}
}
class TestaAbstractEInterface {
	public static void main(String... args) {
		System.out.println(new GuiA().x);
		System.out.println(A.x);
		System.out.println(B.x);
		// A.x = 20; não pode alterar (é final)
		Carro c = new Carro();

	}
}