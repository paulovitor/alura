class A {
    public static void main(String[] args) {
        int a = 10;
        while(a>100) a++; // nunca entra no loop, mas compila, pois a variável não é final
        System.out.println(a); // 10
    }
}