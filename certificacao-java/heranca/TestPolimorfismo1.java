class B {
    void x() throws IOException { // faltou o java.io
        System.out.println("c");
    }
}
class C extends B {
    void x() throws FileNotFoundException { // faltou o java.io
        System.out.println("b");
    }
}
class A {
    public static void main(String[] args) {
        new C().x();
    }
}