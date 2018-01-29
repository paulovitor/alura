class B { private B() {} static B B(String s) 
          { return new B(); } }
class A {
    public static void main(String[] args) {
        B b = B.B("t");
    }
}