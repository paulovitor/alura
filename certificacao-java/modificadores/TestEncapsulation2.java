class B{
    private int b;
    public int getB() { return b; }
    public void setB(int b) { this.b= b; }
}
class A {
    public static void main(String[] args) {
        B b = new B();
        b.setB(5);
        System.out.println(b.getB()); // 5
    }
}