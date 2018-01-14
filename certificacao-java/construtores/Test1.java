class A {
    final String n;
    A() {
        a();
        n = "aprendendo";
    }
    void a() {
        System.out.println("testa");
    }
}
class B extends A {
    void a() {
        System.out.println(n.length()); // NullPointerException (Exception em tempo de execução)
    }
    public static void main(String[] args) {
        new B();
    }
}