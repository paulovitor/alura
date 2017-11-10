package br.com.alura.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorTarefas {

	public static void main(String[] args) throws Exception {
		System.out.println("---- Iniciando Servidor ----");
		ServerSocket servidor = new ServerSocket(12345);
//		ExecutorService poolDeThreads = Executors.newFixedThreadPool(2);
//		ScheduledExecutorService pool = Executors.newScheduledThreadPool(4);
		ExecutorService poolDeThreads = Executors.newCachedThreadPool();

		while (true) {
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta " + socket.getPort());
			
			DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
			poolDeThreads.execute(distribuirTarefas);
//			pool.scheduleAtFixedRate(tarefa, 0, 60, TimeUnit.MINUTES); //executamos uma tarefa a cada 60 minutos
			
//			System.out.println("Todas as Threads");
//			Set<Thread> todasAsThreads = Thread.getAllStackTraces().keySet();
//			for (Thread thread : todasAsThreads) {
//			    System.out.println(thread.getName());
//			}
			
//			System.out.println("Todos os CPUs");
//			Runtime runtime = Runtime.getRuntime();
//			int qtdProcessadores = runtime.availableProcessors();
//			System.out.println("Qtd de processadores: " + qtdProcessadores);
		}
	}
}
