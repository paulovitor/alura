class B extends C{}
class D {
    int x;
}
class C {
    int x;
    public boolean equals(Object c) {
        return c.x==x;
    }
}
class A {
    public static void main(String[] args) {
        C a = new C();
        C b = new D(); // Não compila
        a.x = 1;
        b.x = 1;
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}