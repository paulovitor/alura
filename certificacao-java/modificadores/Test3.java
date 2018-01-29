class A {
    private public int a(int b) { // somente um modificador de acesso é permitido
        return b(b)-1;
    }
    private static int b(int b) {
        return b-1;
    }
    public static void main(String[] args) {
        System.out.println(new A().a(5));
    }
}