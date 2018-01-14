class A {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s" + "1";
        System.out.println(s1==s2); // apontam para o mesmo objeto no pool
        System.out.println(s1==("" + s2)); // o resultado de uma string literal com uma variável será um novo objeto
    }
}