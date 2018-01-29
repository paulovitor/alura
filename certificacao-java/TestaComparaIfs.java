class TestaComparaIfs {
	public static void main(String[] args) {
		boolean autentico = true;

		if (autentico) {
			System.out.println("Ok");
		} else {
			System.out.println("Não autorizado");
		}

		if (1 < 2) {
			System.out.println("Ok");
		}

		boolean valor = true;

		if (valor == false) {
			System.out.println("false");
		}

		if (valor){
			System.out.println("valor");
		}

		int a = 0, b = 3;

		// if (a = b) { Não compila porque o retorno é int
		if (valor = false) {
			System.out.println("false");
		}

		boolean v = true;
		if (v)
			System.out.println("false"); // precisa de algum trecho de código para compilar
		//else (aqui não pode)
			//System.out.println("false");
			// precisa ser o último
		else if (valor)
			System.out.println("false");
		else // precisa ser o último
			System.out.println("false");

		if (autentico)
			System.out.println("autentico");
		else
			System.out.println("falhou");
			System.out.println("tente novamente");

		int valor2 = 100;
		if (valor2 > 200)
		if (valor2 < 400)
		if (valor2 > 300)
			System.out.println("a");
		else
			System.out.println("b");
		else
			System.out.println("c");
	}
}