class B { 
    private String s;
    protected B() {}
    static A B(String s) {
        return new A(s);
    }
}
class A extends B {
    A(String s) {
        this.s = s; // A não tem acesso a variável s na classe B
    }
    public static void main(String[] args) {
        B b = A.B("t");
        System.out.println(b.s);
    }
}