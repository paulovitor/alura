class A {
    public static void main(String[] args) {
        String nome;
        try {
            nome.toLowerCase(); // O código não compila pois a variável local nunca foi inicializada
            System.out.println("a");
        } catch(NullPointerException ex) {
            System.out.println("b");
        }
        System.out.println("c");
    }
}