package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {

	private long id;
	private String nome;
	private int anoDeInicio;

	public Projeto(long id, String nome, int anoDeInicio) {
		this.id = id;
		this.nome = nome;
		this.anoDeInicio = anoDeInicio;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getNome() {
		return nome;
	}

	public String toXML() {
		return new XStream().toXML(this);
	}

}
