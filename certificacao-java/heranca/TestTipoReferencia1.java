class D extends C {
    void x() { System.out.println(1); }
}
class C extends B {
    void x() { System.out.println(2); }
}
class B {
    void x() { System.out.println(3); }
    void y(B b) {
        b.x();
    }
    void y(C b) {
        c.x(); // variável c não existe nesse bloco
    }
    void y(D b) {
        d.x(); // variável d não existe nesse bloco
    }
}
class A {
    public static void main(String[] args) {
        new B().y(new C());
    }
}