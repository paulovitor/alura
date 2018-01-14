class B { B(A a) {new C(); } B() { new C(this);} }
class C { C(B b) {new B(new A());} C() {new B();} }
class A {
    public static void main(String[] args) {
        new C(new B(new A())); // O código compila e joga exception ao entrar em loop infinito
    }
}