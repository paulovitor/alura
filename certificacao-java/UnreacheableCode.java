class UnreacheableCode { // código inacessível
	public int metodo() {
		return 5;
		System.out.println("oi"); // não compila, trecho de código nunca será executado
	}

	public int metodo2(int x) {
		if (x > 200) {
			return 10;
		}
		// faltando instrução de return caso x não seja maior que 200 (missing return statement)
	}

	public int metodo3(int x) {
		if (x > 200) {
			return 10;
		}
		throw new RuntimeException(); // agora compila!
	}

	public int metodo4(int x) {
		if (false) {
			return 10;
		}
		throw new RuntimeException(); // compila!
	}
}