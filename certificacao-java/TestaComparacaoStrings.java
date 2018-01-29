public class TestaComparacaoStrings {
	public static void main(String[] args) {
		String nome1 = new String("Mario");
		String nome2 = new String("Mario");

		System.out.println(nome1 == nome2); // verifica se as variáveis apontam para mesma referência de objeto

		String nome3 = "Mario"; // literal de String
		String nome4 = "Mario"; // o java guarda strings com mesmo conteúdo em um pool, para reaproveita-los
		String nome5 = new String("Mario");

		System.out.println(nome3 == nome4);
		System.out.println(nome4 == nome5);
		System.out.println(nome4.equals(nome5)); // possuem o mesmo conteũdo, mesmo estando em posições de mémoria diferentes
	}
}