class TestaTernario {
	static public void main(String[] args) {
		int i = 5;
		int resultado = (i == 5) ? 100 : 0;
		System.out.println(resultado);
		// int resultado2 = i == 5 ? "100" : 0; não compila, pois o tipo do ternário não é compatível com a variável que irá receber o resultado
		Object resultado3 = i == 5 ? "100" : 0;
		double resultado4 = i == 5 ? 100 : 0d;
		System.out.println(i == 5 ? "100" : 0);
	}
}