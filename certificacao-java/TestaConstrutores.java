class A {

	int i = 15;
	String nome;
	String sobrenome = "Silveira";
	int tamanho = tamanhoDoNome();

	A() {
		// new A(); // loop infinito
	}

	A(String nome) {
		imprimeNome();
		this.nome = nome;
		System.out.println(i);
	}

	private void imprimeNome() {
		System.out.println(nome);
	}

	int tamanhoDoNome() {
		// return nome.length(); // NullPointerException (nome ainda não foi inicializada)
		return sobrenome.length();
	}
}
class B extends A {
	B(String s) {
		super(s);
	}
	void imprimeNome() {
		System.out.println(nome.length()); // NullPointerException
	}
}
class c {
	c() {
		System.out.println("c");
	}
}
class TestaConstrutores {
	public static void main(String... args) {
		A a = new A();
		A b = new A("guilherme");
		// System.out.println(b.i);
		B c = new B("guilherme");

		new c();
	}
}