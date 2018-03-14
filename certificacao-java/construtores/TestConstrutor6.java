class B {
    B() {
    }
    B(String s) {
        this();
        this(s); // Não compila pois tentamos invocar dois this
    }
}
class A {
    public static void main(String[] args) {
        B b = new B();
    }
}