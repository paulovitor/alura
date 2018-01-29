public class TestaComparacaoStrings2 {
	
	static String j = "a";

	public static void main(String[] args) {
		String a = "a";
		String x = a + "b";
		System.out.println(x == "ab");

		String ab = "a" + "b";
		System.out.println(ab == "ab");

		String texto = "um texto qualquer";
		String txt = texto.substring(3, 8); // texto
		System.out.println(txt == "texto");

		System.out.println(texto.toLowerCase() == texto);
		System.out.println(texto.toString() == texto);

		System.out.println(j == a);
	}
}