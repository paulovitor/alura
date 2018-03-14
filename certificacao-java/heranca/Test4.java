class B { int m(int a) { return 1; } }
class C { int m(double b) { return 2; } }
class A extends B, C{ // não existe herança multipla
    public static void main(String[] args) {
        System.out.println(new C().m(3));
    }
}