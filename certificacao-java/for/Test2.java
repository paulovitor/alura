class A {
    public static void main(String[] args) {
        for(;false;) {
            System.out.println("a"); // Não compila! Trecho nunca será executado
            break;
        }
        System.out.println("b");
    }
}