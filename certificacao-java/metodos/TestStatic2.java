class A {
    public static void main(String[] args) {
        x(); // x y
    }
    static void x() {
        System.out.println("x");
        y();
    }
    static void y() {
        System.out.println("y");
    }
}