class B { 
    protected String s = "a";
    protected B() {}
    static A B(String s) {
        return new A(s);
    }
}
class A extends B {
    A(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        A b = A.B("t");
        System.out.println(b.s); // t
    }
}