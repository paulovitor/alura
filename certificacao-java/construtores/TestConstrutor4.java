class B {
    int x = 1;
}
class A extends B {
    static int x = 2;
    public static void main(String[] args) {
        System.out.println(new A().super.x); // O código não compila: não faz sentido acessar o super de outro objeto que não seja ele mesmo
    }
}