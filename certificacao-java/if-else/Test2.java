class B{
    final boolean valor = false;
}
class A {
    public static void main(String[] args) {
        B b = new B();
        if(b.valor = true) { // variável valor não pode ser alterada porque é final
            System.out.println("verdadeiro");
        }
    }
}