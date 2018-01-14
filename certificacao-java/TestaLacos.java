class TestaLacos {
	public static void main(String[] args) {
		int[   ] array1 = new int[10 ];
		int[] array2 = new int[10]; 
		for (int i = 0; i < 10; i+=2) { // quando sei a inicialização, condição e atualização do contador
			array1[i] = i;
		}

		for(int i : array1) { // quando quero somente percorrer um array
			i = 0;
		}

		int j = 20;
		while (j < 10) { // quando sei somente a condição
			System.out.println("while " + j);
		}

		do { // quero executar algo antes da condição
			System.out.println("do...while " + j);
		} while (j < 20);
	}
}