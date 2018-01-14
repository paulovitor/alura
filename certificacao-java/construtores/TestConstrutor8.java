class B {
    B() {
    }
    B(String s) {
        this();
    }
}
class A {
    public static void main(String[] args) {
        String s = null;
        B b = new B(s); // ok
    }
}