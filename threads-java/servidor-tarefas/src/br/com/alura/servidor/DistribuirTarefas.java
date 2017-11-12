package br.com.alura.servidor;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class DistribuirTarefas implements Runnable {

	private ExecutorService threadPool;
	private BlockingQueue<String> filaComandos;
	private Socket socket;
	private ServidorTarefas servidorTarefas;

	public DistribuirTarefas(ExecutorService threadPool, BlockingQueue<String> filaComandos, Socket socket, ServidorTarefas servidorTarefas) {
		this.threadPool = threadPool;
		this.filaComandos = filaComandos;
		this.socket = socket;
		this.servidorTarefas = servidorTarefas;
	}

	@Override
	public void run() {
		try {
			System.out.println("Distribuindo as tarefas para o cliente " + socket);
			Scanner entradaCliente = new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());

			while (entradaCliente.hasNextLine()) {
				String comando = entradaCliente.nextLine();
				System.out.println("Comando recebido " + comando);

				switch (comando) {
					case "c1": {
						threadPool.execute(new ComandoC1(saidaCliente));
						break;
					}
					case "c2": {
						saidaCliente.println("Confirmação do comando c2");
	
						ComandoC2ChamaWs c2WS = new ComandoC2ChamaWs(saidaCliente);
						ComandoC2AcessaBanco c2Banco = new ComandoC2AcessaBanco(saidaCliente);
	
						Future<String> futureWS = threadPool.submit(c2WS);
						Future<String> futureBanco = threadPool.submit(c2Banco);
	
						threadPool.submit(new JuntaResultadosFutureWSFutureBanco(futureWS, futureBanco, saidaCliente));
	
						break;
					}
					case "c3" : {
					    this.filaComandos.put(comando); //lembrando, bloqueia se tiver cheia
					    saidaCliente.println("Comando c3 adicionado na fila");
				        break;
					}
					case "fim": {
						saidaCliente.println("Desligando o servidor");
						servidorTarefas.parar();
						return;
					}
					default: {
						saidaCliente.println("Comando não encontrado");
					}
				}

				System.out.println(comando);
			}

			saidaCliente.close();
			entradaCliente.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
