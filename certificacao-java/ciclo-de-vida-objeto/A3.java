class B{

}
class A3 {
    public static void main(String[] args) {
        B[] bs = new B[100];
        // O código compila, mas como não chamamos nenhum construtor
        // B é um array
        System.out.println("Finalizando!");
    }
}