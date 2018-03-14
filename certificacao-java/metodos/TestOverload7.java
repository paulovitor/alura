class B{}
class C{}
class D extends B{}
class A {
    static int a(D d, B b) { return 1; } 
    static int a(C c, C c) { return 2; } // mesmo nome de parâmetros
    static int a(B b, B b) { return 3; } // mesmo nome de parâmetros
    static int a(A a, A a) { return 4; } // mesmo nome de parâmetros
    public static void main(String[] args) {
        System.out.println(a(new D(), new D()));
    }
}