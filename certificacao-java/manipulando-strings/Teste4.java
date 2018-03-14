// String é imutável (depois de inicializado o valor não é alterado)
String s = "Caelum";
    s.concat(" - Ensino e Inovação");
    System.out.println(s);

// StringBuffer é mutável
StringBuffer s = new StringBuffer("Caelum");
    s.append(" - Ensino e Inovação");
    System.out.println(s);