class Cliente {
	String nome;
	public Cliente(String nome) {
		this.nome = nome;
	}

	public boolean equals(Object o) {
		Cliente outro = (Cliente) o;
		return this.nome.equals(outro.nome);
	}
}

class TestaComparacaoEquals {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Mario");
		Cliente c2 = new Cliente("Guilherme");

		Cliente c3 = new Cliente("Guilherme");

		System.out.println(c1 == c2);
		System.out.println(c1 == c1); // apontam para mesma referência
		System.out.println(c2 == c3);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsc1));
		System.out.println(c2.equalsc3)); // o método default equals do object faz praticamente == entre objetos
	}
}