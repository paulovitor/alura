abstract class B {
    void x() {
        System.out.println(y());
    }
    int y() {
        return 2;
    }
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