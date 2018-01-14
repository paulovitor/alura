class TestaLacos2 {
	public static void main(String[] args) {
		int externo = 4;
		externo: for (int i = 1; i < 10; i++) {
			tabuada: System.out.println("tabuada do " + i);
			interno: for (int j = 1; j < 10; j++) { // rótulo desse laço não pode se chamar "externo"
				if (i * j == 25) break externo;
				System.out.println(i + " * " + j + " = " + i * j);		
			}
		}
		
		http: // www.alura.com.br
		for (int i = 0; i < 4; i++) {
			System.out.println("Estou antes do switch");
			mario:
			guilherme: switch(i) {
				case 0:
				case 1:
					System.out.println("Case " + i);
					for (int j = 0; j < 3; j++) {
						System.out.println(j);
						if (j == 1) break mario;
					}
				case 2:
					System.out.println("Legal, " + i);
					continue; // Procura o laço mais próximo!
				case 3:
					System.out.println("Cheguei no 3");
					break;
				default:
					System.out.println("Estranho...");
					break;
			}
			System.out.println("Estou apos o switch");
		}

		System.out.println();

		externo: for (int j = 1; j < 10; j++) {
			if (j == 8)	break;
			if (j == 5) continue;
			System.out.println(j);
		}

		int i = 0;
		while(true) {
			i++;
			if (i == 5) break; // compila, porque esse laço pode ser quebrado
			System.out.println("i = " + i);
		}
		System.out.println("fora do while");
	}
}