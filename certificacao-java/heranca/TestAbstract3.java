abstract class B {
    void x() {
        System.out.println(y());
    }
    abstract int y();
}
abstract class C extends B {
    abstract int y();
}
class D extends C {
    int y() { return 1; }
}
class A {
    public static void main(String[] args) {
        D d  = (D) (C) new D();
        d.x(); // 1
    }
}