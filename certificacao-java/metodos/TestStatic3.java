class B {
    void y() {
        this.z();
    }
    static void z() {
        System.out.println("z");
    }
}
class A {
    public static void main(String[] args) {
        new A().x(); // z
    }
    static void x() {
        new B().y();
    }
}