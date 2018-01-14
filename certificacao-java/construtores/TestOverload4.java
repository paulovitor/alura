class B { B(A a) {} B() {} }
class C { C(B b) {} C() {} }
class A {
    public static void main(String[] args) {
        new C(new B(new A()));
    }
}