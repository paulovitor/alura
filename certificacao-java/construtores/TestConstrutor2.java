class B {
    int x = 1;
}
class A extends B {
    static int x = 2;
    public static void main(String[] args) {
        System.out.println(this.x); // Não compila! não pode usar o operador this no contexto static
    }
}