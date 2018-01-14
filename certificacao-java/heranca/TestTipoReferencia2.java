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
    void y(C c) {
        c.x();
    }
    void y(D d) {
        d.x();
    }
}
class A {
    public static void main(String[] args) {
        new B().y(new C()); // 2
    }
}