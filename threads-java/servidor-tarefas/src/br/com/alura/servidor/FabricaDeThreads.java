package br.com.alura.servidor;

import java.util.concurrent.ThreadFactory;

public class FabricaDeThreads implements ThreadFactory {

	private static int numero = 1;

	@Override
	public Thread newThread(Runnable r) {

		Thread thread = new Thread(r, "Thread Servidor Tarefas " + numero);

		numero++;

		thread.setUncaughtExceptionHandler(new TratadorDeExcecao());
		// Obs: Uma thread daemon é uma thread de "serviço" que será automaticamente terminada quando não houver mais nenhuma outra thread principal rodando dentro da JVM.
		thread.setDaemon(true);

		return thread;
	}
}
