class TestaWhile {
	public static void main(String[] args) {

		int i = 1;
		//while (i < 10)
		//	System.out.println(i++);

		boolean verdadeiro = true;
		// final boolean verdadeiro = true; // não compila, pois esse valor nunca será mudado
		//while (true)
		//while (false)
		while (verdadeiro)
			System.out.println(i); // erro de compilação quando false, por que nunca será executado
			i++; // erro de compilação. Essa linha nunca será executada, por causa do true explicito
	}
}