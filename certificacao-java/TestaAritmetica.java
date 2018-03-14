class TestaAritmetica {
	public static void main(String[] args) {
		int dois = 2;
		int dez = 10;

		int doze = dez + dois;
		int oito = dez - dois;
		int vite = dez * dois;
		int cinco = dez / dois;
		int restoDaDivisaoDeCincoPorDois = 5 % 2;
		float restoComFloat = 5.0f % 2;
		System.out.println(restoComFloat);

		long nove = 4l + 5;

		byte quatro = 4;
		byte tres = 3;
		int sete = quatro + tres;
		// byte sete = quatro + tres; // não compila porque o mínimo de uma operação é um int

		// int divisao1 = 5 / 0; erro de execução
		double divisao2 = 5 / 0.0;
		double positivoInfinito = 5.0 / 0;
		double negativoInfinito = -5.0 / 0;
		System.out.println(positivoInfinito);
		System.out.println(negativoInfinito);
		System.out.println((dois + 0.0) / 0);
		System.out.println(positivoInfinito + negativoInfinito); // NaN (Not a Number)

		char c = 68;
		char c2 = 65;
        //char c3 = c - c2;
        //System.out.println(c3);
	}
}