class A {
    private static int a(int b) {
        return b(b)-1;
    }
    private static int b(int b) {
        return b-1;
    }
    public static void main(String[] args) {
        System.out.println(new A().a(5)); // 3
    }
}