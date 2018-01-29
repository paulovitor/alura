class TestaStrings {
	public static void main(String[] args) {
		String texto = "Pretendo fazer a prova de certificação de Java";
		System.out.println(texto.indexOf("Pretendo"));
		System.out.println(texto.indexOf("e")); // vai devolver a primeira posição do caracter na string
		System.out.println(texto.indexOf("Pretendia")); // não existe essa palavra então devolve -1
		System.out.println(texto.indexOf("tendo"));
		System.out.println(texto.indexOf("a"));
		System.out.println(texto.lastIndexOf("a")); // devolve a última posição do caracter na string
		System.out.println(texto.lastIndexOf("Pretendo"));
		System.out.println(texto.lastIndexOf("Pretendia"));
		System.out.println(texto.indexOf("e", 7)); // procura a letra e apartir da posição 7
		System.out.println(texto.lastIndexOf("a", 44)); // procura a letra a apartir da posição 44 na ordem contrária

		System.out.println(texto.startsWith("Pretendia"));
		System.out.println(texto.startsWith("Pretendo"));

		System.out.println(texto.endsWith("Java"));
		System.out.println(texto.endsWith("C#"));

		System.out.println("Java".equals("java"));
		System.out.println("Java".equalsIgnoreCase("java"));

		System.out.println("Certificado".compareTo("Arnaldo")); // 2: C de Certificado vem depois de A de Arnaldo
		System.out.println("Certificado".compareTo("Certificado")); // 0
		System.out.println("Certificado".compareTo("Grécia")); // -4: C de Certificado vem antes do G de Grécia
		System.out.println("Certificado".compareTo("certificado")); // -32: C maiúsculo de Certificado vem antes de c minúsculo de certificação
		System.out.println("Certificado".compareToIgnoreCase("certificado")); // 0
		System.out.println("Certificado".compareTo("arnaldo")); // -30: C de Certificado vem antes de a de arnaldo



		String java = "Java";
		System.out.println(java.substring(1)); // começa do caracter 1 é pega tudo o que está a frente
		System.out.println(java.substring(0, 3)); // ele não pega a posição 3 e sim para na posição 3
		// System.out.println(java.substring(0, 5)); // StringIndexOutOfBoundsException

		String parseado = "   Quero tirar um certificado oficial de Java!".toUpperCase().trim();
		System.out.println(parseado);

		String s = "caelum";
		s = s.toUpperCase();
		System.out.println(s);

		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));

		// System.out.println(s.charAt(-1)); // lança uma StringIndexOutOfBoundsException pois a posição é inválida

		System.out.println(s.length());
		System.out.println("".isEmpty());
		System.out.println("guilherme".isEmpty());
		System.out.println("  ".isEmpty());

		System.out.println("   joão   ".trim());

		System.out.println(s.replace("A", "E"));
		System.out.println(s.replace("CAE", "ALU"));

		String nomeDireto = "Java";
		String nomeIndireto = new String("Java");

		char[] nome = new char[] {'J','a','v','a'};
		String nome1 = new String(nome);

		StringBuilder sb1 = new StringBuilder("Java");
		String nome2 = new String(sb1);

		String nomeNulo = null;

		// System.out.println(nomeNulo); // lança um NullPointerException

		String nomeDaProva = "Certificação" + " " + "Java";
		String nomeDaProvaComNulo = nomeDaProva + " " + nomeNulo;

		System.out.println(nomeDaProva);
		System.out.println(nomeDaProvaComNulo);

		System.out.println("Certificação " + 1500);
		System.out.println(1500 + "Certificação");

		System.out.println(15 + (0 + (00 + "Certificação")));

		// primeiro a soma depois a concatenação
		System.out.println(1 + 500 + "Certificação");
	}
}