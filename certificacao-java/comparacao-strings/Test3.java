class A {
    public static void main(String[] args) {
            String s1 = "s1";
            String s2 = s1.substring(0, 2); // retorna a uma referência existente, pois o método substring não altero o conteúdo da string
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
    }
}