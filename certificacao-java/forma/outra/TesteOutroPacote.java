package forma.outra;

import forma.Quadrado; // erro aqui também

class TesteOutroPacote {
	public static void main(String[] args) {
		Quadrado f = new Quadrado(); // aparece 2 erros na mesma linha
		// f.lado = 5.5;
		f.getArea();
	}
}