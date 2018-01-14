class B{
    static int bs=0;
    final int b = ++bs;
    private B() {}
    static B b() { return new B(); }
}
class A {
    public static void main(String[] args) {
        System.out.println(B.b().b); // 1
    }
}