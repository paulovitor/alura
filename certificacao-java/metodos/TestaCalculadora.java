package metodos;

class Calculadora {
	public int soma(String nome, int... numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++)
			soma += numeros[i];
		return soma;
	}
}
class TestaCalculadora {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		System.out.println(c.soma("gui", new int[] {3,5}));
		System.out.println(c.soma("gui", 3,5,10));
		System.out.println(c.soma("gui", 3,5,10,4));
		System.out.println(c.soma("gui", 3,5,10,4,5));
		System.out.println(c.soma("gui", 3));
		System.out.println(c.soma("gui"));
	}
}