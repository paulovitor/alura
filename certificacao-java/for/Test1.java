class A {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("a");
        }
        System.out.println("b"); // não compila! Ésse trecho nunca será executado
    }
}