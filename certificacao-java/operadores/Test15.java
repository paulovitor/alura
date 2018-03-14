class A {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 131; // Não compila, estouro por causa do limite de bytes
        System.out.println(b1);
    }
}