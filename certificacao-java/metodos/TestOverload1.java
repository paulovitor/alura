class A {
    public static void main(String[] args) {
        int x = b(15);
        System.out.println(x);
        System.out.println(15);
        System.out.println(15.0);
    }
    // não há sobrecarga de método ao alterar só o retorno
    static int b(int i) { return i; } 
    static double b(int i) { return i; } 
}