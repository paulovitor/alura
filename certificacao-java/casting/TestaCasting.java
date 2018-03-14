package casting;
interface Automatico {}
class Veiculo {}
class Moto extends Veiculo {}
class Carro extends Veiculo {}
class CarroAutomatico extends Carro implements Automatico {}

abstract class CarroRodavel extends Carro implements Runnable {}

class TestaCasting {
	public static void main(String[] args) {
		CarroAutomatico ca = new CarroAutomatico();
		Carro c2 = ca;

		boolean tipoAutomatico = c2 instanceof Automatico;
		// boolean tipoAutomatico = !c2 instanceof Automatico; não compila
		System.out.println(tipoAutomatico);

		Automatico a = ca;
		Automatico a2 = (Automatico) c2; // classes filhas de carro podem implementar de Automatico

		Moto m2 = new Moto();
		// Automatico a3 = (Automatico) m2; ClassCastingException

		// Automatico a4 = (Automatico) new Veiculo(); ClassCastingException

		String guilherme = (String) "guilherme"; // Casting opcional
		String nome = (String) guilherme;
		Object nome2 = (String) guilherme;
		Object nome3 = (Object) guilherme;

		Veiculo v = new Carro();
		// Moto m = v; não compila!
		// Está tentando fazer o casting para Moto em uma referência de Carro
		// Moto m = (Moto) v; // Erro de execução! ClassCastingException

		Carro c = new Carro();
		// Moto m2 = (Moto) c; Não compila!

		Runnable r = (Runnable) c;

		Object[] objetos = new Object[100];
		String s = "certificacao";
		objetos[0] = s;

		String recuperada = (String) objetos[0];
	}
}