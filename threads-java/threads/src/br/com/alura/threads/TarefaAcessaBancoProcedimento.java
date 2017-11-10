package br.com.alura.threads;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (pool) {
//		synchronized (tx) { deadlock
			System.out.println("Peguei a chave da tx");
			tx.begin();

			synchronized (tx) {
//			synchronized (pool) { deadlock
				System.out.println("Peguei a chave do pool");
				pool.getConnection();
			}
		}
	}
}
