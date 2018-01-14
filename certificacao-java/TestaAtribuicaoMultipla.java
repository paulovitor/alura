class TestaAtribuicaoMultipla {
	public static void main(String[] args) {
		int a = 15, b = 20, c = 30;
		a = (b = c); // o resultado de uma atribuição é o valor a ser atribuído
		a = b = c;
		a = (b = c) + 1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int d = 15, e = 20, f = 30;
		d = (e = f + 5) + 5; // f = 30, portanto e = 35, portanto d = 40
	}
}