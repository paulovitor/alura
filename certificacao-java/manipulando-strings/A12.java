class A12 {
    public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("guilherme");
      // Como a posição começa em 0, o resultado das letras e são 5 e 8, totalizando 13
      System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
      // Os dois métodos retornam -1 quando não encontram nada
      System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
    }
}