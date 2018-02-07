package capitulo5;

public class ContaDeEstudante extends ContaComum {

	public void rende() {
		throw new ContaNaoRendeException();
	}

	class ContaNaoRendeException extends RuntimeException {

		private static final long serialVersionUID = 1L;

	}
}
