package br.com.alura.threads;

import java.io.FileReader;
import java.util.Properties;

public class Principal {

	public static void main(String[] args) {
		Properties properties = new Properties();
		Thread thread = new Thread(new LeitorPropriedades(properties, "arquivo1.txt"));
		thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
		thread.start();
	}
}

class LeitorPropriedades implements Runnable {

	private Properties propriedades;
	private String nomeArquivo;

	public LeitorPropriedades(Properties propriedades, String nomeArquivo) {
		this.propriedades = propriedades;
		this.nomeArquivo = nomeArquivo;
	}

	public void run() {
		try {
			this.propriedades.load(new FileReader(nomeArquivo));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}