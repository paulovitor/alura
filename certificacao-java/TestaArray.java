public class TestaArray {
	public static void main(String[] args) {
		int[] i1 = new int[0];

		int[] idades = new int[10];

		idades[0] = 10;

		System.out.println(idades[0]);
		System.out.println(idades.length);

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

		for (int idade : idades) {
			System.out.println(idade);
		}

		double pesos[];

		long []numeros;

		long[]tamanhos;

		int[] idades2 = new int[] {0,2,4,6,8}; // já inicializado com valores
		int idades3[] = {0,2,4,6,8}; // só funciona se inicializar e declarar em uma única linha

		// numeros = {0,2}; // não funciona
		numeros = new long[] {0,2}; // só funciona com o new explicito

	}
}