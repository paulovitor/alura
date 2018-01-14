class TestaDoWhile {
	public static void main(String[] args) {
		int i = 10
		;
		while(i < 10)
			System.out.println(i++);
			System.out.println("oi");

		int j = 10;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);

		int l = 1;
		do
			System.out.println(l++);
			// System.out.println("oi"); // Não compila
		while (l < 10);
	}
}