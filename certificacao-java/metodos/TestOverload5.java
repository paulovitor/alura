class B{}
class C{}
class D extends B{}
class A {
	// No caso de sobrecarga com tipos que possuem polimorfismo, como em Object ou String, o compilador sempre invoca o método com o tipo mais específico (menos genérico)
    int a(D d) { return 1; } // o método a não é estático
    static int a(C c) { return 2; }
    static int a(B b) { return 3; }
    static int a(A a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new D()));
    }
}