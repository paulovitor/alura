class Carro {
	
	String modelo;
	int ano;

	public Carro() {
		ano = 2014;
	}

	public void reseta() {
		// this. é opcional porque não tem nenhuma outra variável com o nome ano
		ano = 2014;
	}

	public String getDadosDeImpressao() {
		return modelo + "::" + ano;
	}

	public void setModelo(String modelo) {
		// precisa do this. porque temos uma variável local com mesmo nome do atributo
		this.modelo = modelo;
	}
}