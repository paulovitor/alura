import java.util.*;
class BlocoEstatico {
	static {
		String s = null;
		s.length(); // está no contexto static de inicialização, por isso não deu um NullPointerException
	}
}
class NovaConta {
	double saldo = 100;
	public void saca(double valor) {
		if (saldo < valor) {
			throw new IllegalArgumentException();
		}
		saldo -= valor;
	}
}
class Tarefa {
	boolean rodando = false;
	void start() {
		if (rodando) {
			throw new IllegalStateException();
		}
		rodando = true;
	}
	void stop() {
		rodando = false;
	}
}
class TestaExceptions4 {
	public static void main(String[] args) {
		int [] x = new int[56];
		// x[56] = 13; // java.lang.ArrayIndexOutOfBoundsException

		ArrayList<String> lista = new ArrayList<>();
		lista.add("guilherme");
		lista.add("carlos");

		// lista.get(2); // java.lang.IndexOutOfBoundsException

		String s = null;
		// String s; // não compila, pois variável local não foi inicializada
		// s.length(); // java.lang.NullPointerException

		Object o = "guilherme";
		// Date data = (Date) o; // java.lang.ClassCastException

		String numero1 = "1a";
		// int um = Integer.parseInt(numero1); // java.lang.NumberFormatException

		// new NovaConta().saca(300); // java.lang.IllegalArgumentException

		Tarefa t = new Tarefa();
		t.start();
		// t.start(); // java.lang.IllegalStateException

		// new BlocoEstatico(); // java.lang.ExceptionInInitializerError

		// rm BlocoEstatico.class
		// java TestaException4 // java.lang.NoClassDefFoundError

		// new TestaExceptions4().metodo(); // java.lang.StackOverflowError

		boolean sempre = true;
		ArrayList<String> strings = new ArrayList<String>();
		String inicial = "guilherme";
		while(sempre) {
			inicial += "guilherme";
			// strings.add(inicial); // java.lang.OutOfMemoryError	
		}
	}
	void metodo() {
		metodo();
	}
}