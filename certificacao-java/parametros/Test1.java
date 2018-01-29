class A {
    public static void main(String[] args) {
        int i = 150;
        i = ++s(i); // somente variáveis podem ser aplicadas auto increment e decremento
        System.out.println(i);
    }
    static int s(int i) {
        return ++i;
    }
}