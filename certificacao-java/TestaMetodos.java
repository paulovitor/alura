class Param {

	String getNumero() {
		if (true) return "true";
		throw new RuntimeException(); // é obrigatório
	}

	String getNumero(int a) {
		if (a > 0) return "maior";
		else if (a < 0) return "menor";
		return "zero"; // tem que retornar ou jogar uma exception
	}

	void primitivo(long a) {
		return;
		// System.out.println("erro");
	}

	void referencia(Object o) {

	}

	void test(final int a, int b) {
		// a = 10; // Erro de compilação
		b = 100;
	}
}

class ClasseComMetodos {

	int getNumero() throws RuntimeException {
		return 5;
	}
}

class TestaMetodos {
	public static void main(String[] args) {
		Param p = new Param();
		int a = 1;

		System.out.println(p.getNumero(46)); // é opcional usar o retorno de um método
		String resultado = p.getNumero(423);
		p.primitivo('Z'); // 'Z' é char
		p.referencia(new Object()); // método void não da pra usar o seu retorno, pois é vazio
		p.referencia("guilherme");
		p.primitivo(a);
		p.test(1, 2);
	}
}