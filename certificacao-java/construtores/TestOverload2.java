class B() { B(A a) {} B() {} } // parenteses inapropriados
class C() { C(B b) {} C() {} } // parenteses inapropriados
class A {
    public static void main(String[] args) {
        new A(); new B(); new C();
    }
}