package br.com.alura.servidor;

import java.util.concurrent.BlockingQueue;

public class TarefaConsumir implements Runnable {

	private BlockingQueue<String> filaComandos;

	public TarefaConsumir(BlockingQueue<String> filaComandos) {
		this.filaComandos = filaComandos;
	}

	@Override
	public void run() {
		try {
//			BlockingQueue<Comando> comandos = new PriorityBlockingQueue<>();
//
//			comandos.put(new Comando("ADD", 5, "curso=threads2&dataCriacao=12/06/2016&nivel=avancada"));
//			comandos.put(new Comando("UPDATE", 3, "curso=threads2&dataCriacao=13/06/2016")); 
//			comandos.put(new Comando("REMOVE", 1, "id=3"));
//			comandos.put(new Comando("GET", 2, "id=4"));
			
			String comando = null;

			while ((comando = filaComandos.take()) != null) {
				System.out.println("Consumindo comando " + comando + ", " + Thread.currentThread().getName());
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
