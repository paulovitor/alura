class B{
    private int b;
    public int getB() { return b; }
    public void setB(int b) { this.b= b; }
}
class A {
    public static void main(String[] args) {
        new B().setB(5);
        System.out.println(new B().getB()); // 0
    }
}