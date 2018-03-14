class A {
    public static void main(String[] args) {
        int x[] = new int[0];
        int x[] = new int[] {0,3,5}; // não compila pois tenta redefinir uma variável já definida
        int x[] = {0,3,5}; // não compila pois tenta redefinir uma variável já definida
    }
}