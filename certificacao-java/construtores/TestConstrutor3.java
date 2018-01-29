class B {
    int x = 1;
}
class A extends B {
    static int x = 2;
    public static void main(String[] args) {
        System.out.println(super.x); // Não compila! não pode usar o operador super no contexto static
    }
}