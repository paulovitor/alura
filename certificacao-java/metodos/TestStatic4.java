class B{
    static void x() {
        System.out.println("x");
    }
    static void y() {
        System.out.println("y");
    }
}
class A extends B {
    public static void main(String[] args) {
        this.x(); // Não compila, não se pode usar o this num contexto estático
        A.y();
    }
}