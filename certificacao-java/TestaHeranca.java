class Guilherme {

}
class Mae {

}
class Filha extends Mae {

}
class Neta extends Filha {

}
class Avenida extends modelo.Endereco {

}
class X {
	int x;
	void y() {
		System.out.println("Invocando y em um objeto");
	}
}
class Y extends X {
	public void y() { // precisa ter um modificador de acesso menos restritivo

	}
}
class W {
	public static void metodo() {
		System.out.println("Invocando o metodo estatico que foi definido em w");
	}
	public static void metodo2() {
		System.out.println("Invocando o metodo2 estatico que foi definido em w");
	}
	// abstact static void x();
}
class Z extends W {
	public static void metodo() {
		// super.metodo(); não compila! super é um operador não estatico
		// this.metodo2(); não compila! this é um operador não estatico
		System.out.println("Invocando o metodo estatico que foi definido em z");
	}
	// public static int metodo2() {
	// 	System.out.println("Invocando o metodo2 estatico que foi definido em z");
	// 	return 1;
	// }
}
class Gato {
	String corDosOlhos;
	public String toString() {
		return "[Gato " + corDosOlhos + "]";
	}
}
class TestaHeranca {
	public static void main(String[] args) {
		Gato g = new Gato();
		g.corDosOlhos = "mel";
		System.out.println("Estou com um " + g);

		Y y = new Y();
		y.x = 15;
		y.y();

		W.metodo();
		Z.metodo();

		Z z = new Z();
		z.metodo(); // invoca com base na referência
		z.metodo2();

		W w = new Z();
		w.metodo(); // métodos estaticos o binding é feito em tempo de compilação
		w.metodo2();
	}
}