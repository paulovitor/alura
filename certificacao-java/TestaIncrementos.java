class TestaIncrementos {
	public static void main(String[] args) {
		int a = 10;
		a += ++a + a + ++a;
		// a = a ++a + a + ++a;
		// a = 10 ++a + a + ++a;
		// a = 10 + 11 + a + ++a;
		// a = 10 + 11 + 11 + ++a;
		// a = 10 + 11 + 11 + 12;
		// a = 44;
		System.out.println(a);

		int i = 5;
		System.out.println(i--); // primeiro mostra o valor de i e depois decrementa

		int j = 5;
		System.out.println(++j); // primeiro incrementa j e depois mostra valor

		i += 2; // soma + 2
		System.out.println(i);

		i -= 2;
		System.out.println(i);

		i *= 5;
		System.out.println(i);

		i /= 10;
		System.out.println(i);

		i *= 100;
		i %= 3;
		System.out.println(i);

		System.out.println(i+=3); // atribuição também traz um retorno

		byte b = 10;
		b += 3;
		// b = b + 3; // não compila por que o valor 3 é int

		b += 200; // passou o tamanho de byte (estourou), mas o compilador roda o valor para -43
		System.out.println(b);

		int e = 0;
		int d = (e++ * e + e++);
		System.out.println(d);
		System.out.println(e);

		// d = (0 * e + e++); // e vale 1 (0 (mantém o valor anterior e executa pós incremento) * e + e++)
		// d = (0 * 1 + e++); // e vale 1 (0 * 1 (foi feito o incremento na expressão anterior) + e++)
		// d = (0 * 1 + 1); // e vale 2 (0 * 1 + 1 (mantém o valor anterior e executa pós incremento))
		// d = 1; // e vale 2 (resultado da operação (0 * 1 + 1))
	}
}