public class TestaArrayMulti {
	public static void main(String[] args) {

		// as dimensões podem ser definidas do lado 
		// esquerdo ou direito da variável.
		int[][] tabela;

		int[][] cubo[];

		int [][] hipercube[][];

		tabela = new int[10][5];
		cubo = new int[10][][]; // você pode inicializar somente uma dimensão do array

		// cubo = new int[10]; // Não compila! Array precisa ser inicializado de acordo com dimensões

		int[][] teste = new int [][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(teste.length);

		int[][] estranho = new int[2][];
		estranho[0] = new int[20];
		estranho[1] = new int[10]; // os arrays internos não precisam ter o mesmo tamanho

		for (int i = 0; i < estranho.length; i++) {
			System.out.println(estranho[i].length);
		}
	}
}