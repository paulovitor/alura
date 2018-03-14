class B{

}
class A2 {
    public static void main(String[] args) {
        B b = new B();
        for(int i = 0;i < 10;i++)
            b = new B();
        // Somente 10 objetos podem ser garbage coletados pois o último continua referenciado pela variável b
        System.out.println("Finalizando!");
    }
}