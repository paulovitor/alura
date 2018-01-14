package metodos;

class TestaPessoa {
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Guilherme"
					,
						15);

		String nome = p.getNome();
		System.out.println(nome);

		System.out.println(p.getNome());
		p.getNome();
	}
}