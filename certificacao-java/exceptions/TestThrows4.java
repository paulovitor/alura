class A {
    void m2() {
        System.out.println("e");
        new java.io.FileInputStream("a.txt"); // O código não compila pois o método m2 deve tratar ou jogar java.io.FileNotFoundException
        System.out.println("f");
    }
    void m() {
        System.out.println("c");
        m2();
        System.out.println("d");
    }
    public static void main(String[] args) {
        System.out.println("a");
        new A().m();
        System.out.println("b");
    }
}