class TestaOperadoresLogicos {
	public static void main(String[] args) {
		System.out.println(1 == 1 & 1 > 2);
		System.out.println(1 != 1 && 1 > 2); // se a 1 operação der false não executa a 2 operação
		System.out.println(1 == 1 | 1 > 2); // mesmo a 1 operação sendo true o java executa a 2 operação
		System.out.println(1 == 1 ^ 1 > 2);
		System.out.println(!(1 == 1));

		System.out.println(1 == 1 && metodo("primeiro"));
		System.out.println(1 != 1 && metodo("segundo"));
		System.out.println(1 == 1 || metodo("terceiro"));
		System.out.println(1 != 1 & metodo("quarto"));
	}

	public static boolean metodo(String msg) {
		System.out.println(msg);
		return true;
	}
}