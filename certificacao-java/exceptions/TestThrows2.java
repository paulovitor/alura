class A {
    void m2() {
        System.out.println("e");
        int[][]x = new int[15][20];
        System.out.println("f");
    }
    void m() {
        System.out.println("c");
        m2();
        System.out.println("d");
    }
    public static void main(String[] args) {
        System.out.println("a");
        new A().m();
        System.out.println("b");
        // acefdb
    }
}