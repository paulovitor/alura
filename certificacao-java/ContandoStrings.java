public class ContandoStrings {
	public static void main(String[] args) {
		// quantas Strings foram criadas?

		String h = new String("hello "); // 2 objetos (cria na memória e no pool)
		String h1 = "hello "; // 0 (já existe no pool)
		String w = "world"; // 1

		System.out.println("hello "); // 0
		System.out.println(h1 + "world"); // 1 (não irá pro pool porque na concatenação existe uma variável)
		System.out.println("Hello " == h1); // 1 (é colocado no pool por ser uma string literal - Case sensitive)


		// duvidas
		//char teste = 'oi';
		//System.out.println(teste);
	}
}