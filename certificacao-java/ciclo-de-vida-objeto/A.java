class B{

}
class A {
    public static void main(String[] args) {
        B b;
        for(int i = 0;i < 10;i++)
            b = new B();
        // não podemos dizer quantos objetos foram coletados
        System.out.println("Finalizando!");
    }
}