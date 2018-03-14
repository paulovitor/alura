class Veiculo {
	double velocidade = 30;
}
class Carro extends Veiculo {
	double velocidade = super.velocidade;
	double velocidadeDoCarro() {
		return this.velocidade;
	}
	double velocidadeDoVeiculo() {
		return super.velocidade;
	}
}
class Mae {
	long numeroGrande;
	long segundoNumeroGrande;
	Mae() {
		System.out.println("padrao");
	}
	Mae(String s) {
		System.out.println("mae");
	}
	Mae(int i) {}
}
class Filha extends Mae {
	long segundoNumeroGrande;
	Filha(int i) {
		this("numero: " + i);

		numeroGrande = 22;
		this.numeroGrande = 33;
		super.numeroGrande = 44;

		segundoNumeroGrande = 22;
		this.segundoNumeroGrande = 33;
		super.segundoNumeroGrande = 44;

		this.s = "guilherme"; // this é opcional para acessar a variável membro
		System.out.println("fim do construtor com numero");
	}
	String s;
	Filha(String s) {
		super(s);
		this.s = s; // this é obrigatório para acessar a variável membro
		// new Filha("loop infinito"); StackOverflow
		System.out.println(s);
	}
}
class TestaConstrutores3 {
	private static String s;
	public static void main(String[] args) {
		// this.s = "guilherme"; não compila (contexto static)
		new Filha(567);

		Carro c = new Carro();
		((Veiculo)c).velocidade = 50;
		System.out.println("carro: " + c.velocidadeDoCarro());
		System.out.println("veiculo: " + c.velocidadeDoVeiculo());
	}
}