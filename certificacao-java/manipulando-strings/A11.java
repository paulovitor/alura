class A11 {
    public static void main(String[] args) {
        String s = "guilherme";
        // o lado esquerdo de uma atribuição deve ser sempre uma variável e não uma chamada a um método
        s.substring(0,2) = "gua";
        System.out.println(s);
    }
}