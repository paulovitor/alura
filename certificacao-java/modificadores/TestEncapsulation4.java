class B{
    int b;
    public void setB(int b) { b= b; }
}
class A {
    public static void main(String[] args) {
        B b = new B();
        b.setB(5);
        System.out.println(b.b); // 0
    }
}