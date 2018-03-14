package forma.outra;

import forma.Forma;

class Triangulo extends Forma {
	public void imprime() {
		System.out.println("Lado = " + this.lado);
		// System.out.println("Lado = " + ((Forma)this).lado); // Não compila (a referência é do tipo mais generico)
	}
	public void imprime2() {
		// System.out.println(this.getPerimetro());
	}
}