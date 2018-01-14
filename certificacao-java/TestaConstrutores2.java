class Livro {
	Livro() {
		// this(123); // erro de compilação (loop infinito)
		System.out.println("sem argumentos");
	}
	Livro(String... s) {
		System.out.println("strings");
	}
	Livro(int i) {
		this(valor());
		// new Livro(456); // erro em tempo de execução (loop infinito)
		System.out.println("com int");
	}
	static String valor() {
		return "xpto";
	}
}
class TestaConstrutores2 {
	public static void main(String... args) {
		// Livro l = new Livro(); // pega o mais especificos
		Livro l = new Livro(234);
	}
}