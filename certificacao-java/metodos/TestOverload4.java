class B{}
class C{}
class D extends B{}
class A {
	// os métodos não são estáticos
    int a(D d) { return 1; }
    int a(C c) { return 2; }
    int a(B b) { return 3; }
    int a(A a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new D()));
    }
}