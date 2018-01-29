abstract class B {
    void x() {
        System.out.println(y());
    }
    final int y() {
        return 2;
    }
}
abstract class C extends B {
    int y() { // não compila! o método y é final (não pode sobrescreve-lo)
        return 3;
    }
}
class D extends C {
    int y() { return 1; }
}
class A {
    public static void main(String[] args) {
        D d  = (D) (C) new D();
        d.x();
    }
}