class B { B() { this(1); } B(int i) { this(); } } // loop infinito
class A {
    public static void main(String[] args) {
        new B();
    }
}