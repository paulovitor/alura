class B {
    B() {
    }
    B(String s) {
        this();
    }
}
class A {
    public static void main(String[] args) {
        B b = new B(); // ok
    }
}