class A {
    void m2() throws java.io.FileNotFoundException {
        System.out.println("e");
        new java.io.FileInputStream("a.txt");
        System.out.println("f");
    }
    void m() throws java.io.IOException {
        System.out.println("c");
        m2();
        System.out.println("d");
    }
    public static void main(String[] args) 
                throws java.io.FileNotFoundException { // O código não compila pois o método main deve tratar ou jogar java.io.IOException
        System.out.println("a");
        new A().m();
        System.out.println("b");
    }
}