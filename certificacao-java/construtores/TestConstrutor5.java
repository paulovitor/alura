class B {
    void B() {
    }
    void B(String s) {
        this();
        this(s); // O código não compila, não podemos chamar um construtor de dentro de um método
    }
}
class A {
    public static void main(String[] args) {
        B b = new B();
    }
}