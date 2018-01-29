class B {
    int v = 15;
}
class A2 {
    public static void main(String[] args) {
        B x = new B();
        // pois a atribuição de objetos é feita por cópia da referência
        B y = x;
        y.v++;
        x.v++;
        B z = y;
        z.v--;
        System.out.println(x.v + y.v + z.v);
    }
}