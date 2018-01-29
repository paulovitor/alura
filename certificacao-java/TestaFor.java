import java.util.ArrayList;

public class TestaFor {
	public static void main(String[] args) {
		// int i = 1; // declaração e inicialização de uma variável
		// while (i < 10) { // condição de parada
		// 	System.out.println(i);
		// 	i++; // incremento
		// }

		// for (int i = 1; i <= 10; i++) { // 3 partes de um laço dividido em ponto e virgula
		// 	System.out.println(i);
		// }

		// for (int i = 1; i > 10; i++) { // pegadinha, nunca executa, pois a condição não confere
		// 	System.out.println(i);
		// }

		// int j = 1;
		// for (int i = 1; j <= 10; i++) { // pegadinha, loop infinito
		// 	System.out.println(i);
		// }

		// for (; ; ) { // sem condição, será sempre true
		// 	System.out.println(i);
		// }
		// int j = 2; // erro de compilação, esse código nunca será executado

		int i;
		long j;
		// 3 partes de um laço dividido em ponto e virgula
		for (i = 1, j = 10; i <= 10; i++, j--, System.out.println("oi")) { // a última instrução precisa ser expressão que executa algo
			System.out.println(i + " " + j);
		}

		// long j;
		// for (int i = 1, j = 10; i <= 10; i++, j--) { // não pode declarar um variável fora e outra dentro do for
		// 	System.out.println(i + " " + j);
		// }

		for (int k = 1; k <= 10; System.out.println(k), k = k + 2) {}
			;
		; // posso ter ponto e vírgula soltos no código

		// for (;;) // precisa das chaves

		// for (;;); // funciona, loop infinito sem mostrar nada
		
		// for (int i = 1, int j = 10; i <= 10; i++) { // não pode redefinir o tipo da variável
		// 	System.out.println(i + " " + j);
		// }

		int [] numeros = {1,2,3,4,5,6};
		// for (int numero : numeros); // ok
		for (int numero : numeros) { // declaração da variável e o array que será percorrido
			System.out.println(numero);
		}

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("guilherme");
		nomes.add("mario");

		for (String nome : nomes) {
			System.out.println(nome);
			nome = null; // não muda o elemento no array, só muda o valor da variável local

			// nomes.remove(nome); // evitar isso na prática
		}
		System.out.println(nomes);
	}
}