class B{
    private int b;
    public int getB() { return b; }
    public void setB(int b) { b= b; } // não faz atribuição há variável membro (existe shadowing aqui no setter)
}
class A {
    public static void main(String[] args) {
        B b = new B();
        b.setB(5);
        System.out.println(b.getB()); // 0
    }
}