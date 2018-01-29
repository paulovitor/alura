class Moto {

	public static int getTotalDeMotos() {
		return Moto.totalDeMotos;
	}

	// já foi declarado um método com esse nome
	// public int getTotalDeMotos() {
	// 	return 1;
	// }

	// declara as variáves static com valor padrão
	static int b = getMetodo(); // inicializa as variáveis
	public static int getMetodo() {
		return a;
	}
	static int a = 15;

	public static final int PADRAO_TOTAL_DE_MOTOS = 8;
	public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;
}
class MotocicletaDupla extends Moto {
	// não pode ter um método membro e static com mesmo nome, mesmo sendo subclasse
	public static int getTotalDeMotos() {
		return -500000;
	}
}
class TestaStatic {
	public static void main(String[] args) {
		//Moto.totalDeMotos = 15;
		System.out.println(Moto.b);
		System.out.println(Moto.a);
		System.out.println(Moto.getTotalDeMotos());
		System.out.println(MotocicletaDupla.getTotalDeMotos()); // métodos totalmente diferentes (não há herança)

		Moto m = new MotocicletaDupla();
		System.out.println(m.getTotalDeMotos()); // posso acessar um método static através da instância
	}
}