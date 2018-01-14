class TestaStringBufferEBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Caelum");
		sb.append(" - ");
		sb.append("Ensino e Inovação");
		System.out.println(sb);

		// 50 é o tamanho do buffer
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2.toString());

		StringBuilder sb3 = new StringBuilder(sb);
		sb3.append(" e Alura e Casa do Código");
		sb3.append('x');
		sb3.append(sb);
		sb3.append(new Carro());
		System.out.println(sb3.toString());

		StringBuilder sb4 = new StringBuilder("Caelum - Inovação");
		sb4.insert(9, "Ensino e ");
		System.out.println(sb4.toString());

		sb4.delete(6, 15);
		System.out.println(sb4);

		System.out.println(new StringBuffer("guilherme").reverse());

		StringBuffer sb5 = new StringBuffer("Caelum - Ensino e Inovação");
		// substring e subSequence não alterão a String padrão
		System.out.println(sb5.substring(6, 15));
		System.out.println(sb5.subSequence(6, 15));
		System.out.println(sb5);
	}
}